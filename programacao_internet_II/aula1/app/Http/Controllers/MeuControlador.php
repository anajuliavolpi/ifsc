<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class MeuControlador extends Controller
{
    public function produtos(){
        return view('meusprodutos');
    }

    public function getidade(){

    }

    public function getsoma($valor1, $valor2){
        return $valor1 + $valor2;
    }

    public function ola($nome){
        return View ('ola', ['nome' => $nome]);
    }

    public 

}
