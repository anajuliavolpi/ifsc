<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #204060;
  padding: 10px;
  text-align: center;
  font-size: 20px;
  color: white;
  width:50%;
  margin-left: auto; 
  margin-right: auto;
}

table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
table.center {
  margin-left: auto; 
  margin-right: auto;
}

td, th {
  border: 1px solid #d9e6f2;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #d9e6f2;
}
</style>

<html>
<body>
    <header>
    <h2>ALUNOS</h2>
    </header> 
    <table  class="center" style="width:50%">
   
    
        @foreach ($alunos as $aluno)
            <tr>
                <td>
                    <tr>  
                        <td style="text-align:center">{{ $aluno['nome'] }}</td>
                        <td style="text-align:center"><a href = "{{ route('alunos.edit', $aluno['id']) }}"><button type="button" >Editar Aluno</button></a></td>
                        <td style="text-align:center"><a href = "{{ route('alunos.show', $aluno['id']) }}"><button type="button" >Mostrar Dados</button></a></td>

                        <td style="text-align:center">
                            <form action="{{ route('alunos.destroy', $aluno['id']) }}" method="POST">
                            @csrf 
                            @method('DELETE')
                            <button type="submit">Apagar Aluno</button>
                            </form>
                        </td>

                    </tr>
                </td>
            </tr>
        @endforeach 
    </table>

    <table  class="center" style="width:50%">
        <tr><td style="text-align:center"><a href = "{{ route('alunos.create') }}"><button type="button" >Cadastrar Novo Aluno</button></a></td></tr>
    </table>
    <!-- <a href = "{{ route('alunos.create') }}">Cadastrar Novo Aluno</a> -->

</body>
</html>