import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tabuleiro {
	private char[][] tabuleiro;
	private int[][] bombas;
	private int linha, coluna;
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	Date horaInicial, horaFinal;

	public Tabuleiro() {
		horaInicial = Calendar.getInstance().getTime();
		bombas = new int[10][10];
		tabuleiro = new char[10][10];
//		iniciarBombas(); // coloca 0 em todas as posições do tabuleiro de bombas
//		sortearBombas(); // coloca, aleatoriamente, 10 bombas no tabuleiro de bombas
//		preencherInformacoesBombasVizinhas(); // preenche o tabuleiro de bombas com o número de bombas vizinhas
//		iniciaTabuleiro(); // inicia o tabuleiro de exibição com _

	}

	public void iniciar(int quantidadeBombas) {
		iniciarBombas(); // coloca 0 em todas as posições do tabuleiro de bombas
		sortearBombas(quantidadeBombas); // coloca, aleatoriamente, 10 bombas no tabuleiro de bombas
		preencherInformacoesBombasVizinhas(); // preenche o tabuleiro de bombas com o número de bombas vizinhas
		iniciaTabuleiro(); // inicia o tabuleiro de exibição com _
	}
	
	public boolean ganharJogo() {

		int count = 0;
		for (int linha = 1; linha < 9; linha++) {
			for (int coluna = 1; coluna < 9; coluna++) {
				if (tabuleiro[linha][coluna] == '#') {
					count++;
				}
			}
		}
//		if (count <= 50) {
		if (count == 10) {			
			return true;

		} else {
			return false;
		}
	}

	public void salvarHistorico(int resultado, String nivel) {

		String duracao = "";

		try {
			
			FileWriter historico = new FileWriter("historico.txt", true);
		
			horaFinal = Calendar.getInstance().getTime();
			long diff = horaFinal.getTime() - horaInicial.getTime();
			long diffSec = diff / 1000 % 60;
			long diffMin = diff / (60 * 1000) % 60;
			long diffHoras = diff / (60 * 60 * 1000) % 24;
			duracao = diffHoras + ":" + diffMin + ":" + diffSec;
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			if (resultado == 1) {
				historico.write(simpleDateFormat.format(horaInicial) + " | Nivel " + nivel + " | Duracao: " + duracao + " | Ganhou" + "\n");
			} else {
				historico.write(simpleDateFormat.format(horaInicial) + " | Nivel " + nivel + " | Duracao: " + duracao + " | Perdeu" + "\n");
			}
			
			historico.close();

		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}
	
	public void lerHistorico() {
		
		
		 try {
		      FileReader arquivo = new FileReader("historico.txt");
		      BufferedReader lerArquivo = new BufferedReader(arquivo);

		        System.out.printf("\n");

		      
		      // le a primeira linha, a variável "linha" recebe o valor "null" quando o 
		      // processo de repetição atingir o final do arquivo texto		   
		      String linha = lerArquivo.readLine();
		      while (linha != null) {
		        System.out.printf("%s\n", linha);
		        linha = lerArquivo.readLine(); // lê da segunda até a última linha
		      }

		      arquivo.close();
		      
		    } catch (IOException e) {
		    	System.err.printf("\nHistorico Vazio\n");
//		        System.err.printf("Erro na abertura do historico: %s.\n",e.getMessage());
		    }		
	}

	public void limparHistorico() {
		
	    File arquivo = new File("historico.txt"); 
	    if (arquivo.delete()) { 
	        System.out.printf("Historico limpado com sucesso!\n");
	    }
	}
	
	public void abrirVizinhas() {
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				if ((bombas[linha + i][coluna + j] != -1) && (linha != 0 && linha != 9 && coluna != 0 && coluna != 9)) {
					tabuleiro[linha + i][coluna + j] = Character.forDigit(bombas[linha + i][coluna + j], 10);
				}
			}
		}
	}

	public int getPosicao(int linha, int coluna) {
		return bombas[linha][coluna];
	}

	public boolean setPosicao() {

		do {
			System.out.print("\nLinha: ");
			linha = scanner.nextInt();
			System.out.print("Coluna: ");
			coluna = scanner.nextInt();

			if (linha < 1 || linha > 8 || coluna < 1 || coluna > 8) {
				System.out.println("Posicao Invalida!\nDigite numeros de 1 a 8");
			} else if (tabuleiro[linha][coluna] != '#') {
				System.out.println("Essa posicao ja foi escolhida!");

			}

			// if( (tabuleiro[linha][coluna] != '#') && ((linha < 9 && linha > 0) && (coluna
			// < 9 && coluna > 0)))
			// System.out.println("Posicao ja escolhida!");
			//
			// if( linha < 1 || linha > 8 || coluna < 1 || coluna > 8)
			// System.out.println("Posicao Invalida!\nDigite numeros de 0 a 9");
			//

			// if((tabuleiro[linha][coluna] != '#') && ((linha < 9 && linha > 0) && (coluna
			// < 9 && coluna > 0)))
			// System.out.println("Essa posicao ja foi escolhida!");
			//
			// if(linha < 0 || linha > 7 || coluna < 0 || coluna > 9) {
			// System.out.println("Posicao Invalida!\nDigite numeros de 0 a 9");
			// }

		} while ((linha < 1 && linha > 8) && (coluna < 1 && coluna > 8) || (tabuleiro[linha][coluna] != '#'));
		// }while((linha < 0 && linha > 7) && (coluna < 0 && coluna > 9) ||
		// (tabuleiro[linha][coluna] != '#'));

		if (getPosicao(linha, coluna) == -1) {
			return true;
		} else {
			return false;
		}

	}

	public void mostrarTabuleiro(boolean init, int quantidadeBombas) {

		if (init) {
			iniciar(quantidadeBombas);
		}
		
		System.out.print("\n    1 2 3 4 5 6 7 8");
		System.out.println("\n   ----------------");

		for (int linha = 1; linha < 8; linha++) {
			System.out.print(linha + " |");

			for (int coluna = 1; coluna < 9; coluna++) {
				System.out.print(" " + tabuleiro[linha][coluna]);
			}

			System.out.println();
		}
	}

	public void preencherInformacoesBombasVizinhas() {

		for (int linha = 1; linha < 9; linha++) {
			for (int coluna = 1; coluna < 9; coluna++) {

				for (int i = -1; i <= 1; i++) {
					for (int j = -1; j <= 1; j++) {
						if (bombas[linha][coluna] != -1) {
							if (bombas[linha + i][coluna + j] == -1) {
								bombas[linha][coluna]++;
							}
						}
					}
				}
			}
		}
	}

	public void exibirTabuleiro() {
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				if (bombas[i][j] == -1) {
					tabuleiro[i][j] = '*';
				} else {					
					tabuleiro[i][j] = Character.forDigit(bombas[i][j], 10);
				}
			}
		}
		mostrarTabuleiro(false, 0);
	}

	public void iniciaTabuleiro() {
		for (int i = 1; i < bombas.length; i++) {
			for (int j = 1; j < bombas.length; j++) {
				tabuleiro[i][j] = '#';
			}
		}
	}

	public void iniciarBombas() {
		for (int i = 0; i < bombas.length; i++) {
			for (int j = 0; j < bombas.length; j++) {
				bombas[i][j] = 0;
			}
		}
	}

//	public void sortearBombas() {
	public void sortearBombas(int quantidadeBombas) {

		boolean sorteado;
		int linha, coluna;
		for(int i=0; i < quantidadeBombas; i++){
//		for (int i = 0; i < 10; i++) {

			do {
				linha = random.nextInt(8) + 1;
				coluna = random.nextInt(8) + 1;

				if (bombas[linha][coluna] == -1) {
					sorteado = true;
				} else {
					sorteado = false;
				}

			} while (sorteado);

			bombas[linha][coluna] = -1;
		}
	}
}

