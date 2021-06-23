<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ClienteControlador extends Controller
{
    
    public function create()
    {
        return View ('operacao.create');
    }

    public function store(Request $request)
    {
        $valor1 = $request->valor1;
        $valor2 = $request->valor2;
        $dados = [
            "sum" =>$valor1+$valor2, 
            "sub"=>$valor1-$valor2,
            "div"=>$valor1/$valor2,
            "mult"=>$valor1*$valor2
        ];

        return View ('operacao.index', compact(['dados']));
    }
}
