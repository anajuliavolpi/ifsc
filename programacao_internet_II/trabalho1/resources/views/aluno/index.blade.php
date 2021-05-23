<html>
<body>
    <h3>Alunos</h3>
    <a href = "{{ route('alunos.create') }}">NOVO ALUNO</a>

    <ul>
        @foreach ($alunos as $aluno)
        <li>
            {{ $aluno['id'] }}  |  {{ $aluno['nome'] }}  |  
            <a href = "{{ route('alunos.edit', $aluno['id']) }}">Editar  |  </a>
            <a href = "{{ route('alunos.show', $aluno['id']) }}">Mostrar</a>
            <form action="{{ route('alunos.destroy', $aluno['id']) }}" method="POST">
            @csrf 
            @method('DELETE')
            <input type="submit" value="Apagar">
            </form>
        </li>
        @endforeach 
    </ul>
</body>
</html>