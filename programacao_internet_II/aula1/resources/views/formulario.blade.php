<!DOCTYPE html>
<html>
    <body>
        <form method="post">
        @csrf
        <br>Nome: <input type='text' name="nome"></br>
        <br>Idade: <input type='text' idade="idade"></br>
        <br>Curso: <input type='text' name="curso"></br>
        <br>Email: <input type='text' email="email"></br>

        <input type='submit' value="Enviar">
        


        <!-- </form> -->

    <h1>Dados da view Formulario</h1>
    <label>Nome: {{ $nome }}</label></br>
    <label>Curso: {{ $curso }}</label></br>

    </body>

</html>