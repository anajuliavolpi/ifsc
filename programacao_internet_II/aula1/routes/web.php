<?php

use Illuminate\Support\Facades\Route;
use Illuminate\Http\Request;
use App\Http\Controllers\MeuControlador;
use App\Http\Controllers\ControllerDados;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::get('obrigatorio/{parametro}', function ($parametro) {
    echo "Parametro: ".$parametro;
});


Route::get('opcional/{parametro?}', function ($parametro=null) {
    if (isset ($parametro))
        echo "Parametro: ".$parametro;
    else
    echo "usuario nao informou parametro";
});

Route::prefix('/aplicacao')->Group(function(){

    Route::get('/', function(){
        return view('app');
    })->name('aplicacao');

    Route::get('/user', function(){
        return view('user');
    })->name('aplicacao.user');

    Route::get('/profile', function(){
        return view('profile');
    })->name('aplicacao.profile');
});

// Route::get('/produtos', function () {
//     return view('meusprodutos');

//     // echo "<h3>Produtos</h3>";
//     // echo "<ol>";
//     // echo "<li>notebook</li>";
//     // echo "<li>impressora</li>";
//     // echo "<li>mouse</li>";
//     // echo "<ol>";

// })->name('meusprodutos');


Route::get('/produtos', [MeuControlador::class, 'produtos'])->name('meusprodutos');

Route::post('/requisicoes', function(Request $request){
    return "Hello Post";
});

Route::get('idade', [MeuControlador::class, 'getidade']);

Route::get('soma/{valor1}/{valor2}', [MeuControlador::class, 'getsoma']);

Route::get('ola/{valor1}', [MeuControlador::class, 'ola']);

// Route::get('dados', [ControllerDados::class, 'getdados']);

Route::get('dados', [ControllerDados::class, 'getdados']);

Route::post('dados', [ControllerDados::class, 'getdados']);