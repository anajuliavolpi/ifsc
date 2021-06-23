<!DOCTYPE html>
<html>
    <body>
        <h3>OPERAÇÕES</h3>
        <form action="{{ route('operacoes.store') }}" method="post">
            @csrf
            <br>Valor 1: <input type='int' name="valor1"></br>
            <br>valor 2: <input type='int' name="valor2"></br>

            <input type='submit' value="Realizar Operações">        
        </form>
    </body>
</html>