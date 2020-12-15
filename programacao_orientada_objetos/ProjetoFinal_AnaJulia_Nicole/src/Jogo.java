
public class Jogo {
	
	private Tabuleiro tabuleiro;
	boolean terminar = false;
	boolean ganhar = false;
	int[] jogada;

	public Jogo(){
		tabuleiro = new Tabuleiro();
		Jogar(tabuleiro);
		jogada = new int[2];
	}

	public void Jogar(Tabuleiro tabuleiro){
		
		do{
			
			tabuleiro.mostrarTabuleiro();
			terminar = tabuleiro.setPosicao(); //PERDEU: diz se a posicao tem -1 que é quando o jogo acaba

			if(!terminar){ // if FALSE 
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
