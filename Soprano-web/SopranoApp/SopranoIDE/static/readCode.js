document.addEventListener('keydown', function(event) {
    if (event.key === 'F9' || event.keyCode === 120) {
        event.preventDefault(); // Previene la acción por defecto (recargar la página)
        // Aquí puedes agregar más código para manejar el evento
        runCode()
    }
});

function ProgressBar() {
    var percent = 0;
    var timerId = setInterval(function() {
        // Incrementa la barra de progreso
        percent += 1;
        $('.progress').attr('display','block')
        $('.progress-bar').css('width', percent + '%');
        $('.progress-bar').attr('aria-valuenow', percent);
        $('.progress-bar').text(percent + '%');
        // Completa
        if (percent == 100) {
            clearInterval(timerId);
            $('.information').show();
        }
    }, 100);
};
  
