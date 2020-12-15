import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {
	private char[][] tabuleiro;
	private int[][] bombas;
	private int linha, coluna;
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	public void Tabuleiro(){
		bombas = new int[10][10];
		tabuleiro = new char[10][10];
		iniciaBombas(); // coloca 0 em todas as posições do tabuleiro de bombas
		sorteiabombas(); // coloca, aleatoriamente, 10 bombas no tabuleiro de bombas
		preencheBombasVizinhas(); // preenche o tabuleiro de bombas com o número de bombas vizinhas
		iniciaTabuleiro(); // inicia o tabuleiro de exibição com _

	}

	public boolean ganharJogo(){
		int count=0;
		for(int line = 1 ; line < 9 ; line++)
			for(int column = 1 ; column < 9 ; column++)
				if(tabuleiro[line][column]=='#')
					count++;
		if(count == 10)
			return true;
		else
			return false;                
	}

	public void abrirVizinhas(){
		for(int i=-1 ; i<2 ; i++)
			for(int j=-1 ; j<2 ; j++)
				if((bombas[linha+i][coluna+j] != -1) && (linha != 0 && linha != 9 && coluna != 0 && coluna != 9)){
					tabuleiro[linha+i][coluna+j]=Character.forDigit(bombas[linha+i][coluna+j], 10);
				}
	}

	public int getPosicao(int linha, int coluna){
		return bombas[linha][coluna];
	}

	public boolean setPosicao(){

		do{
			System.out.println("\nLinha: "); 
			linha = scanner.nextInt();
			System.out.println("Coluna: "); 
			coluna = scanner.nextInt();

			if((tabuleiro[linha][coluna] != '#') && ((linha < 9 && linha > 0) && (coluna < 9 && coluna > 0)))
				System.out.println("Essa posicao ja foi escolhida!");

			if(linha < 0 || linha > 9 || coluna < 0 || coluna > 9)
				System.out.println("Posicao Invalida!\nDigite numeros de 0 a 9");

		}while((linha < 0 && linha > 9) && (coluna < 0 && coluna > 9) || (tabuleiro[linha][coluna] != '#') );

		if(getPosicao(linha, coluna) == -1)
			return true;
		else
			return false;

	}

	public void mostrarCampo(){
		
		for (int linha = 0; linha < 8; linha++){
			
			System.out.print(linha + " ");
			
			for (int coluna = 1 ; coluna < 10 ; coluna++){
				System.out.print(" "+ tabuleiro[linha][coluna]);
			}

			System.out.println();
		}

		System.out.println("\n   0 1 2 3 4 5 6 7 8");        
	}

	public void preencheBombasVizinhas(){
		for (int line=1 ; line < 9 ; line++) {
			for(int column=1 ; column < 9 ; column++){

				for(int i=-1 ; i<=1 ; i++) {
					for(int j=-1 ; j<=1 ; j++) {
						if(bombas[line][column] != -1) {
							if(bombas[line+i][column+j] == -1) {
								bombas[line][column]++;
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
		mostrarCampo();
	}

	public void iniciaTabuleiro(){
		for(int i=1 ; i<bombas.length ; i++)
			for(int j=1 ; j<bombas.length ; j++)
				tabuleiro[i][j]= '#';
	}

	public void iniciaBombas(){
		for(int i=0 ; i<bombas.length ; i++)
			for(int j=0 ; j<bombas.length ; j++)
				bombas[i][j]=0;
	}

	public void sorteiabombas(){
		boolean sorteado;
		int linha, coluna;
		for(int i=0 ; i<10 ; i++){

			do{
				linha = random.nextInt(8) + 1;
				coluna = random.nextInt(8) + 1;

				if(bombas[linha][coluna] == -1)
					sorteado=true;
				else
					sorteado = false;
			}while(sorteado);

			bombas[linha][coluna] = -1;
		}
	}
}
