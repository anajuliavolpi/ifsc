<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ClienteControlador extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */

    private $alunos = [
        ['id'=>1, 'nome'=>'Julia', 'idade'=>'20', 'curso'=>'ADS', 'email'=>'julia@gmail.com']
    ];


    public function __construct(){
        $alunos = session('alunos');
        if (!isset($alunos))
            session(['alunos'=>$this->alunos]);
    }

    private function getIndex($id, $alunos){
        $ids = array_column($alunos, 'id');
        $index = array_search($id, $ids);
        return $index;
    }

    public function index()
    {
        $alunos = session('alunos');
        return View('aluno.index', compact(['alunos']));
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        return View ('aluno.create');
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $alunos = session('alunos');
        $id = end($alunos)['id']+1;
        $nome = $request->nome;
        $idade = $request->idade;
        $curso = $request->curso;
        $email = $request->email;
        $dados = ["id" =>$id, 
            "nome"=>$nome,
            "idade"=>$idade,
            "curso"=>$curso,
            "email"=>$email];
        $alunos[] = $dados;
        // $this->alunos[] = $dados;

        session(['alunos'=>$alunos]);
        return redirect()->route('alunos.index'); 

    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        $alunos = session('alunos');
        $index = $this->getIndex($id,$alunos);
        $aluno = $alunos[$index];
        return View ('aluno.info', compact(['aluno']));
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {

        $alunos = session('alunos');
        // $aluno = $alunos[$id-1];
        $index = $this->getIndex($id, $alunos);
        $aluno = $alunos[$index];
        return View ('aluno.edit', compact(['aluno']));    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        
        $alunos = session('alunos');
        // $alunos[$id-1]['nome']=$request->nome;
        $index = $this->getIndex($id, $alunos);
        $alunos[$index]['nome']=$request->nome;
        $alunos[$index]['idade']=$request->idade;
        $alunos[$index]['curso']=$request->curso;
        $alunos[$index]['email']=$request->email;
        session(['alunos'=>$alunos]);
        return redirect()->route('alunos.index');
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        $alunos = session('alunos');
        $ids = array_column($alunos, 'id');
        $index = array_search($id, $ids);
        array_splice($alunos, $index, 1);
        session(['alunos' => $alunos]);
        return redirect()->route('alunos.index');
    }
}
