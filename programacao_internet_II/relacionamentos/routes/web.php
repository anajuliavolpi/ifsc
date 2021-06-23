<?php

use Illuminate\Support\Facades\Route;

use App\Models\Desenvolvedor;
use App\Models\Projeto;
use App\Models\Alocacao;

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

Route::get('/desenvolvedor_projetos', function () {
    // $desenvolvedores = Desenvolvedor::all();
    $desenvolvedores = Desenvolvedor::with('projetos')->get();
    return $desenvolvedores->toJson();
});

Route::get('/projetos', function () {
    $projetos = Projeto::all();
    return $projetos->toJson();
});

Route::get('/alocacoes', function () {
    $alocacoes = Alocacao::all();
    return $alocacoes->toJson();
});

Route::get('/projetos_andamento', function () {
    $desenvolvedores = Desenvolvedor::with("projetos")->get();
    foreach ($desenvolvedores as $d) {
        echo "Nome do desenvolvedor: " . $d->nome . "<br>";
        echo "Cargo: " . $d->cargo . "<br>";
        if (count($d->projetos) > 0) {
            echo "Projetos: <br>";
            echo "<ul>";
            foreach ($d->projetos as $p) {
                echo "<li> Nome do projeto: " . $p->nome . " | ";
                echo "Horas do projeto: " . $p->estimativa_horas . " | ";
                echo "Horas trabalhadas: " . $p->pivot->horas_semanais . "</li>";
                "</li>";
            }
            echo "</ul>";
        }
        echo "<hr>";
    }
});

Route::get('/desenvolvedorprojetos', function () {
    $desenvolvedores = Desenvolvedor::with("projetos")->get();
    foreach ($desenvolvedores as $d) {
        echo "Nome do desenvolvedor: " . $d->nome . "<br>";
        echo "Cargo: " . $d->cargo . "<br>";
        if (count($d->projetos) > 0) {
            echo "Projetos: <br>";
            echo "<ul>";
            foreach ($d->projetos as $p) {
                echo "<li> Nome do projeto: " . $p->nome . " | ";
                echo "Horas do projeto: " . $p->estimativa_horas . " | ";
                "</li>";
                echo "Horas trabalhadas: " . $p->pivot->horas_semanais . " | ";
                echo "Desenvolvedor ID: " . $p->pivot->desenvolvedor_id . " | ";
                echo "Projeto ID: " . $p->pivot->projeto_id . " | ";
                echo "</li>";
            }
            echo "</ul>";
        }
        echo "<hr>";
    }
});
