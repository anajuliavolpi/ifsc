import java.util.Scanner;

public class Jogo {

	private Tabuleiro tabuleiro;
	boolean terminar = false;
	boolean ganhar = false;
	int[] jogada;
	Scanner scanner = new Scanner(System.in);


	public Jogo(){
		tabuleiro = new Tabuleiro();
		Jogar(tabuleiro);
		jogada = new int[2];
	}

//	public void Jogar(Tabuleiro tabuleiro){
//		
//		do{
//			
//			tabuleiro.mostrarTabuleiro();
//			terminar = tabuleiro.setPosicao(); //PERDEU: diz se a posicao tem -1 que é quando o jogo acaba
//
//			if(!terminar){ // if FALSE 
//				tabuleiro.abrirVizinhas();
//				terminar = tabuleiro.ganharJogo();
//			}
//
//		}while(!terminar);
//
//		if(!tabuleiro.ganharJogo()){
//			System.out.println("Voce PERDEU!!");
//			tabuleiro.exibirTabuleiro();
//			tabuleiro.salvarHistorico(0);
//			tabuleiro.lerHistorico();
////			tabuleiro.limparHistorico();
//		} else {
//			System.out.println("Voce GANHOU!");
//			tabuleiro.exibirTabuleiro();
//			tabuleiro.salvarHistorico(1);
//			tabuleiro.lerHistorico();
////			tabuleiro.limparHistorico();
//		}		
//	}	
	
	public void Jogar(Tabuleiro tabuleiro){

		int op = -1;
//		do{
		while(!terminar && op != 0) {

//			int op = -1;
//			while(op != 0){
				op = menuPrincipal();
				switch(op){
				case 1:

//					int nivel = escolherNivel();
//					switch(nivel){
//					case 1:

					do {
						tabuleiro.mostrarTabuleiro();
						terminar = tabuleiro.setPosicao(); //PERDEU: diz se a posicao tem -1 que é quando o jogo acaba

						if(!terminar){ // if FALSE 
							tabuleiro.abrirVizinhas();
							terminar = tabuleiro.ganharJogo();
						}
					}while(!terminar);				
					
						break;
//					}
				case 2:
					tabuleiro.lerHistorico();
					break;	
				case 3:
					tabuleiro.limparHistorico();
					break;
				case 4:
					mostrarCreditos();
					break;
				case 0:
					System.out.println("Finalizando o sistema");
					break;
				default:
					System.out.println("Opção inválida");
					break;
//				}
			}


//		}while(!terminar && op != 0);
		}
				
		if (op != 0) {	
			if(!tabuleiro.ganharJogo()){
				System.out.println("\nVoce PERDEU!!\n");
				tabuleiro.exibirTabuleiro();
				tabuleiro.salvarHistorico(0);
			} else {
				System.out.println("\nVoce GANHOU!!\n");
				tabuleiro.exibirTabuleiro();
				tabuleiro.salvarHistorico(1);
			}	
		}
	}


	private void mostrarCreditos() {
		System.out.println("\n\n");
		System.out.println(" -------------------------------------");
		System.out.println("|                                     |");
		System.out.println("|   Este jogo foi desenvolvido por:   |");
		System.out.println("|                                     |");
		System.out.println("|          Ana  Julia  Volpi          |");
		System.out.println("|           Nicole  Bortoli           |");
		System.out.println("|                                     |");
		System.out.println("|             IFSC Gaspar             |");
		System.out.println("|                                     |");
		System.out.println(" -------------------------------------");
		System.out.println("\n\n");
}

	public int menuPrincipal(){
		System.out.println("\n");
		System.out.println("------------ MENU PRINCIPAL ----------");
		System.out.println("  1 - Novo Jogo");
		System.out.println("  2 - Exibir Historico de Vitorias");
		System.out.println("  3 - Limpar Historico");
		System.out.println("  4 - Creditos");
		System.out.println("  0 - Sair");
		System.out.println("---------------------------------------");
		System.out.println("Digite a opção:");
		int op = Integer.parseInt(scanner.nextLine());
		return op;
	}

	public int escolherNivel(){
		System.out.println("------------------------------------");
		System.out.println("  Escolha o nivel:");
		System.out.println("  1 - Facil");
		System.out.println("  2 - Medio");
		System.out.println("  3 - Dificil");
		System.out.println("------------------------------------");
		System.out.println("Digite a opção:");
		int op = Integer.parseInt(scanner.nextLine());
		return op;
	}
}
