<!DOCTYPE html>
<html>
    <body>
        <h3>DADOS DO ALUNO</h3>
        <p>ID: {{ $aluno['id'] }} </p>
        <p>Nome: {{ $aluno['nome'] }} </p>
        <p>Idade: {{ $aluno['idade'] }} </p>
        <p>Curso: {{ $aluno['curso'] }} </p>
        <p>Email: {{ $aluno['email'] }} </p>
        <br>

        <a href = "{{ route('alunos.index') }}">Voltar</a>
    
    </body>
</html>