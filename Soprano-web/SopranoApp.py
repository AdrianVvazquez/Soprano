import os
from dotenv import load_dotenv
from flask import Flask, render_template, redirect, url_for, request, session
from classes.User import User
load_dotenv()

app = Flask(__name__)
app.secret_key = os.getenv("SECRET_KEY")

@app.route('/login', methods=['POST', 'GET'])
def login():
    error = None
    if request.method == 'POST':
        if valid_login(request.form['email'],
                       request.form['username'],
                       request.form['password']):
            return redirect(url_for('hello'))
        else:
            error = 'Invalid email/password'
            return render_template('login.html', error=error)
    # GET method or the credentials were invalid
    return render_template('login.html', error=error)

@app.route('/logout')
def logout():
    # remove the username from the session if it's there
    session.pop('username', None)
    return redirect(url_for('index'))

@app.route('/registrarse', methods=['POST', 'GET'])
def registrarse():
    if request.method == 'POST':
        return redirect(url_for('login'))
    return render_template("registrarse.html")

@app.route('/')
def index():
    if 'username' in session:
        return render_template("index.html")
    return 'You are not logged in'

@app.route('/hello')
def hello():
    return render_template('hello.html', name=session['username'])

def valid_login(email, username, password):
    user = User(email,username,password)
    session['username'] = user.username
    return user.is_valid()



if __name__ == "__main__":
    app.run(debug=True)