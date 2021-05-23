<!DOCTYPE html>
<html>
    <body>
        <h3>NOVO ALUNO</h3>
        <form action="{{ route('alunos.store') }}" method="post">
        @csrf
        <br>Nome: <input type='text' name="nome"></br>
        <br>Idade: <input type='text' name="idade"></br>
        <br>Curso: <input type='text' name="curso"></br>
        <br>Email: <input type='text' name="email"></br>

        <input type='submit' value="Salvar">
        
        <a href = "{{ route('alunos.store') }}">Voltar</a>


        </form>

    </body>

</html>