<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EJERCICIO 01</title>
</head>
    <body>
        <center>
        <h1>EJERCICIO 01</h1>
        <h4>Escriba una función que reciba el número de día de la fecha actual new Date()
        -https://wvrw.w3schools.com/jsref/jsref obj date. asp y devuelva el texto del día de la
        semana correspondientes. Por ejemplo si recibe e, devolvería "Domingo" .</h4>

        <p id="VerificarHoy"></p>
        <p id="diaDelasemana"></p>

        <script>
            const d = new Date();
            document.getElementById("VerificarHoy").innerHTML = "VERIFICAMOS LA FECHA DE HOY DIA: "+d;
            
            const diasDelaSemana = ["Domingo" , "Lunes" , "Martes" , "Miercoles" , "Jueves" , "Viernes" , "Sabado"] ;
            const hoy = new Date();
            const diadelaSemana = hoy.getDay() ;
            const elementoDiaDeLaSemana = document.getElementById( "diaDelasemana" ) ;
            elementoDiaDeLaSemana.textContent = "HOY DIA ES: "+diasDelaSemana[diadelaSemana] ;
        </script>

        </center>
    </body>
</html>
