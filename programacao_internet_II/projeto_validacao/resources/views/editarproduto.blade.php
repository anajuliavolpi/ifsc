@extends('layout.app', ["current" => "produtos"])@section('body')
<div class="card border">
    <div class="card-body">
        <!--Configurar o actions para chamar o método update-->
        <form action="{{ route('produtos.update', $cat['id']) }}" method="POST">
            @csrf
            @method('PUT')
            <div class="form-group">
                <label for="nomeProduto">Nome do Produto</label>
                <input type="text" class="form-control" name="nomeProduto" id="nomeProduto" placeholder="Nome">
            </div>

            <div class="form-group">
                <label for="estoque">Estoque do Produto</label>
                <input type="text" class="form-control" name="estoque" id="estoque" placeholder="Estoque">
            </div>

            <div class="form-group">
                <label for="preco">Preço do Produto</label>
                <input type="text" class="form-control" name="preco" id="preco" placeholder="Preço">
            </div>

            <div class="form-group">
                <label for="categoriaId">ID da Categoria</label>
                <input type="text" class="form-control" name="categoriaId" id="categoriaId" placeholder="ID da Categoria">
            </div>


            <button type="submit" class="btn btn-primary btn-sm">Salvar</button>
            <button type="cancel" class="btn btn-danger btn-sm">Cancel</button>
        </form>
    </div>
</div>
@endsection