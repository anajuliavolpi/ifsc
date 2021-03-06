<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Cliente;

class ClienteController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $clientes = Cliente::all();
        return view('cliente', compact('clientes'));
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        return view('novocliente');
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        // $request->validate([
        //     'nome'=>'required|max:50|unique:clientes',
        //     'idade'=>'required',
        //     // 'endereco'=>'required|min:5',
        //     'email'=>'required|email'
        // ]);

        $regras = [
            'nome' => 'required|max:50|unique:clientes',
            'idade' => 'required',
            // 'endereco'=>'required|min:5',
            'email' => 'required|email'
        ];

        $mensagens = [
            'required'=>'O campo :attribute é obrigatório.',
            'nome.max'=>'Nome: Limite de 50 caracteres.',
            'nome.unique'=>'Nome: Usuário já registrado.',
            'email.email'=>'E-mail: Digite um e-mail válido.'
        ];

        $request->validate($regras, $mensagens);

        $cliente = new Cliente();
        $cliente->nome = $request->input('nome');
        // $cliente->endereco=$request->input('endereco');
        $cliente->idade = $request->input('idade');
        $cliente->email = $request->input('email');
        $cliente->save();
        return redirect('/clientes');
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        //
    }
}
