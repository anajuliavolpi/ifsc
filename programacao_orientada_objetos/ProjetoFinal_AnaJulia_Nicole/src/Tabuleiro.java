import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {
	private char[][] tabuleiro;
	private int[][] bombas;
	private int linha, coluna;
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	public Tabuleiro(){
		bombas = new int[10][10];
		tabuleiro = new char[10][10];
		iniciarBombas(); // coloca 0 em todas as posições do tabuleiro de bombas
		sortearBombas(); // coloca, aleatoriamente, 10 bombas no tabuleiro de bombas
		preencherInformacoesBombasVizinhas(); // preenche o tabuleiro de bombas com o número de bombas vizinhas
		iniciaTabuleiro(); // inicia o tabuleiro de exibição com _

	}

	public boolean ganharJogo(){

		int count=0;
		for(int linha = 1 ; linha < 9 ; linha++) {
			for(int coluna = 1 ; coluna < 9 ; coluna++) {
				if(tabuleiro[linha][coluna]=='#') {
					count++;
				}
			}
		}
		if(count == 10) {
			return true;
		}
		else {
			return false;                
		}
	}

	public void abrirVizinhas(){
		for(int i=-1 ; i<2 ; i++) {
			for(int j=-1 ; j<2 ; j++) {
				if((bombas[linha+i][coluna+j] != -1) && (linha != 0 && linha != 9 && coluna != 0 && coluna != 9)){
					tabuleiro[linha+i][coluna+j]=Character.forDigit(bombas[linha+i][coluna+j], 10);
				}
			}
		}
	}

	public int getPosicao(int linha, int coluna){
		return bombas[linha][coluna];
	}

	public boolean setPosicao(){

		do{
			System.out.print("\nLinha: "); 
			linha = scanner.nextInt();
			System.out.print("Coluna: "); 
			coluna = scanner.nextInt();

			if(linha < 1 || linha > 8 || coluna < 1 || coluna > 8) {
				System.out.println("Posicao Invalida!\nDigite numeros de 1 a 8");
			}
			else if (tabuleiro[linha][coluna] != '#') {
				System.out.println("Essa posicao ja foi escolhida!");

			}


			//			if( (tabuleiro[linha][coluna] != '#') && ((linha < 9 && linha > 0) && (coluna < 9 && coluna > 0)))
			//                System.out.println("Posicao ja escolhida!");
			//            
			//            if( linha < 1 || linha > 8 || coluna < 1 || coluna > 8)
			//                System.out.println("Posicao Invalida!\nDigite numeros de 0 a 9");
			//            




			//			if((tabuleiro[linha][coluna] != '#') && ((linha < 9 && linha > 0) && (coluna < 9 && coluna > 0)))
			//				System.out.println("Essa posicao ja foi escolhida!");
			//
			//			if(linha < 0 || linha > 7 || coluna < 0 || coluna > 9) {
			//				System.out.println("Posicao Invalida!\nDigite numeros de 0 a 9");
			//			}

		}while((linha < 1 && linha > 8) && (coluna < 1 && coluna > 8) || (tabuleiro[linha][coluna] != '#'));
		//	}while((linha < 0 && linha > 7) && (coluna < 0 && coluna > 9) || (tabuleiro[linha][coluna] != '#'));

		if(getPosicao(linha, coluna) == -1) {
			return true;
		} else {
			return false;
		}

	}

	public void mostrarTabuleiro(){


//		System.out.print("\n   0 1 2 3 4 5 6 7 8 9"); 
//		System.out.println("\n   -------------------"); 
//
//		for(int linha = 0 ; linha < 8 ; linha++){
//			System.out.print(linha + " | ");
//
//			for(int coluna = 1 ; coluna < 9 ; coluna++){
//				System.out.print(" "+ tabuleiro[linha][coluna]);
//			}
//
//			System.out.println();
//		}

//		PARTE DO SITE
//		System.out.println("\n     Linhas");
//        for(int linha = 8 ; linha > 0 ; linha--){
//            System.out.print("       "+linha + " ");
//            
//            for(int coluna = 1 ; coluna < 9 ; coluna++){
//                    System.out.print("   "+ tabuleiro[linha][coluna]);
//            }
//                
//            System.out.println();
//        }
//            
//        System.out.println("\n            1   2   3   4   5   6   7   8");
//        System.out.println("                      Colunas");


		System.out.print("\n    1 2 3 4 5 6 7 8"); 
		System.out.println("\n   ----------------"); 
		
        for(int linha = 1 ; linha < 8 ; linha++){
        	System.out.print(linha + " |");;
            
            for(int coluna = 1 ; coluna < 9 ; coluna++){
                    System.out.print(" "+ tabuleiro[linha][coluna]);
            }
                
            System.out.println();
        }
      



		/*
		System.out.print("\n   0 1 2 3 4 5 6 7 8 9"); 
		System.out.println("\n   -------------------"); 


//		for (int linha = 0; linha < 8; linha++){
        for(int linha = 8 ; linha > 0 ; linha--){	
			System.out.print(linha + " | ");

//			for (int coluna = 0; coluna < 10; coluna++){
			for (int coluna = 1; coluna < 9; coluna++){
				System.out.print(" "+ tabuleiro[linha][coluna]);
			}
			System.out.println();
		}
		 */
	}

	public void preencherInformacoesBombasVizinhas(){

		for (int linha=1 ; linha < 9 ; linha++) {
			for(int coluna=1 ; coluna < 9 ; coluna++){

				for(int i=-1 ; i<=1 ; i++) {
					for(int j=-1 ; j<=1 ; j++) {
						if(bombas[linha][coluna] != -1) {
							if(bombas[linha+i][coluna+j] == -1) {
								bombas[linha][coluna]++;
							}
						}
					}
				}
			}
		}
	}

	public void exibirTabuleiro(){
		for(int i=1 ; i < 9; i++) {
			for(int j=1 ; j < 9 ; j++) {
				if(bombas[i][j] == -1) {
					tabuleiro[i][j]='*';
				}
			}
		}
		mostrarTabuleiro();
	}

	public void iniciaTabuleiro(){
		for(int i=1; i < bombas.length; i++) {
			for(int j=1; j < bombas.length; j++) {
				tabuleiro[i][j]= '#';
			}
		}
	}

	public void iniciarBombas(){
		for(int i=0; i < bombas.length; i++) {
			for(int j=0; j < bombas.length; j++) {
				bombas[i][j]=0;
			}
		}
	}

	public void sortearBombas(){

		boolean sorteado;
		int linha, coluna;
		for(int i=0 ; i<10 ; i++){

			do{
				linha = random.nextInt(8) + 1;
				coluna = random.nextInt(8) + 1;

				if(bombas[linha][coluna] == -1) {
					sorteado=true;
				} else {
					sorteado = false;
				}

			}while(sorteado);

			bombas[linha][coluna] = -1;
		}
	}
}

