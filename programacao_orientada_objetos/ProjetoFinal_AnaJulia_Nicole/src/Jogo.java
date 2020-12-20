import java.util.Scanner;

public class Jogo {

	private Tabuleiro tabuleiro;
	boolean terminar = false;
	boolean ganhar = false;
	int[] jogada;
	Scanner scanner = new Scanner(System.in);

	public Jogo() {
		tabuleiro = new Tabuleiro();
		Jogar(tabuleiro);
		jogada = new int[2];
	}

	public void Jogar(Tabuleiro tabuleiro) {

		String nivelStr = "";
		int op = -1;
		while (!terminar && op != 0) {

			op = menuPrincipal();
			switch (op) {
			case 1:

				int nivel = escolherNivel();
				switch (nivel) {
				case 1:
					nivelStr = "Facil  ";
					int count = 0;
					do {
						if (count == 0) {
							tabuleiro.mostrarTabuleiro(true, 10);
							count++;
						} else {
							tabuleiro.mostrarTabuleiro(false, 10);
						}
						terminar = tabuleiro.setPosicao(); // PERDEU: diz se a posicao tem -1 que é quando o jogo acaba

						if (!terminar) { // if FALSE
							tabuleiro.abrirVizinhas();
							terminar = tabuleiro.ganharJogo();
						}
					} while (!terminar);
					break;

				case 2:
					nivelStr = "Medio  ";
					int count1 = 0;
					do {
						if (count1 == 0) {
							tabuleiro.mostrarTabuleiro(true, 12);
							count1++;
						} else {
							tabuleiro.mostrarTabuleiro(false, 12);
						}
						terminar = tabuleiro.setPosicao();

						if (!terminar) {
							tabuleiro.abrirVizinhas();
							terminar = tabuleiro.ganharJogo();
						}
					} while (!terminar);
					break;

				case 3:
					nivelStr = "Dificil";
					int count2 = 0;
					do {
						if (count2 == 0) {
							tabuleiro.mostrarTabuleiro(true, 14);
							count2++;
						} else {
							tabuleiro.mostrarTabuleiro(false, 14);
						}
						terminar = tabuleiro.setPosicao();

						if (!terminar) {
							tabuleiro.abrirVizinhas();
							terminar = tabuleiro.ganharJogo();
						}
					} while (!terminar);
					break;
				}
				break;
				
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
			}
		}

		if (op != 0) {
			if (!tabuleiro.ganharJogo()) {
				System.out.println("\nVoce PERDEU!!\n");
				tabuleiro.exibirTabuleiro();
				tabuleiro.salvarHistorico(0, nivelStr);
			} else {
				System.out.println("\nVoce GANHOU!!\n");
				tabuleiro.exibirTabuleiro();
				tabuleiro.salvarHistorico(1, nivelStr);
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

	public int menuPrincipal() {
		System.out.println("\n");
		System.out.println("------------ MENU PRINCIPAL ----------");
		System.out.println("  1 - Novo Jogo");
		System.out.println("  2 - Exibir Historico de Vitorias");
		System.out.println("  3 - Limpar Historico");
		System.out.println("  4 - Creditos");
		System.out.println("  0 - Sair");
		System.out.println("---------------------------------------");
		System.out.print("Digite a opção: ");
		int op = Integer.parseInt(scanner.nextLine());
		return op;
	}

	public int escolherNivel() {
		System.out.println("\n");
		System.out.println("-------------- NIVEL ---------------");
		System.out.println("  Escolha o nivel:");
		System.out.println("  1 - Facil");
		System.out.println("  2 - Medio");
		System.out.println("  3 - Dificil");
		System.out.println("------------------------------------");
		System.out.print("Digite a opção: ");
		int op = Integer.parseInt(scanner.nextLine());
		return op;
	}
}
