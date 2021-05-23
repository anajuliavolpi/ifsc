<!DOCTYPE html>
<html>
    <body>
        <h3>ATUALIZAR ALUNO</h3>
        <form action="{{ route('alunos.update', $aluno['id']) }}" method="post">
        @csrf
        @method('PUT')
        <br>Nome: <input type='text' name="nome" value="{{ $aluno['nome'] }}"></br>
        <br>Idade: <input type='text' name="idade" value="{{ $aluno['idade'] }}"></br>
        <br>Curso: <input type='text' name="curso" value="{{ $aluno['curso'] }}"></br>
        <br>Email: <input type='text' name="email" value="{{ $aluno['email'] }}"></br>
        <input type='submit' value="Salvar">
        


        </form>

        <a href = "{{ route('alunos.index') }}">Voltar</a>
    </body>

</html>