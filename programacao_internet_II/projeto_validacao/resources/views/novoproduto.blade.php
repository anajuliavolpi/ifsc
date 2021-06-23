@extends('layout.app', ["current" => "produtos"])@section('body')
    <div class="card border">
        <div class="card-body">
            <form action="/produtos" method="POST">
                @csrf
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
                <!-- <a href="/categorias/create" class="btn btn-primary">Cadastre suas categorias</a> -->

                <button type="reset" class="btn btn-danger btn-sm" onclick="window.location.replace('/')">Cancelar</button>
                <!-- <button type="cancel" class="btn btn-danger btn-sm"><a href="/">Cancelar</a></button> -->

            </form>
        </div>
    </div>
@endsection


<!-- <a href="/produtos/create" class="btn btn-primary">Cadastre seus produtos</a> -->