<?php

use App\Http\Controllers\ControladorCategorias;
use App\Http\Controllers\ControladorProdutos;
use Illuminate\Support\Facades\Route;

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
    return view('index');
});

Route::resource('/produtos', ControladorProdutos::class);
Route::resource('/categorias', ControladorCategorias::class);
// Route::resource('/categorias/nova', ControladorCategorias::class);