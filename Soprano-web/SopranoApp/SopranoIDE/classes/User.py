class User():
    def __init__(self, email, username, password):
        self.email = email
        self.username = username
        self.password = password

    def is_valid(self):
        return True
    
    def log_in(self):
        return True