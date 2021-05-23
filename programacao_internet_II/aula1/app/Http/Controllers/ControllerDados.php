<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ControllerDados extends Controller
{
    public function getdados(Request $request){

        $dados = [
            'nome' => $request->input('nome'),
            'curso' => $request->input('curso')
        ];
        return View ('formulario', $dados);

        // $nome = "Julia";
        // $curso = "Ads";
        // $matricula = "20201234";
        // $email = "julia@email.com";
        // $cidade = "Blumenau";

        // $dados = [
        //     'nome' => $nome,
        //     'curso' => $curso,
        //     'matricula' => $matricula,
        //     'email' => $email,
        //     'cidade' => $cidade,
        // ];

        // return View ('home', $dados);
    }
}
