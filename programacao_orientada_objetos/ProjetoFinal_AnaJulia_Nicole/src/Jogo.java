public class Jogo {
	
	private Tabuleiro tabuleiro;
	boolean terminar = false;
	boolean ganhar = false;
	int[] jogada;
//	int rodada=0;

	public Jogo(){
		tabuleiro = new Tabuleiro();
		Jogar(tabuleiro);
		jogada = new int[2];
	}

	public void Jogar(Tabuleiro tabuleiro){
		do{
//			rodada++;
//			System.out.println("Rodada " + rodada);
			tabuleiro.mostrarCampo();
			terminar = tabuleiro.setPosicao();

			if(!terminar){
				tabuleiro.abrirVizinhas();
				terminar = tabuleiro.ganharJogo();
			}

		}while(!terminar);

		if(!tabuleiro.ganharJogo()){
			System.out.println("Voce PERDEU!!");
			tabuleiro.exibirTabuleiro();
		} else {
			System.out.println("Voce GANHOU!");
			tabuleiro.exibirTabuleiro();
		}
	}
}