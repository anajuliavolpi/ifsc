<!DOCTYPE html>
<html>
    <body>
        <h3>ATUALIZAR ALUNO</h3>
        <form action="{{ route('alunos.update', $aluno['id']) }}" method="post">
        @csrf
        @method('PUT')
        <input type='text' name="nome" value="{{ $aluno['nome'] }}"></br>
       

        <input type='submit' value="Salvar">
        
        <a href = "{{ route('alunos.index') }}">Voltar</a>


        </form>

    </body>

</html>