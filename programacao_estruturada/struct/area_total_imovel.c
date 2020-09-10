/*
Cálculo de área total de imóvel
O objetivo é criar um programa que auxilie a calcular a área total de um imóvel (casa, apartamento, etc)
Para isso, utilize o conceito de estrutura (struct). Para isso teremos a struct "Parte", conforme o exemplo, que
identifica cada uma das peças do imível ( quarto, sala, cozinha por exemplo).
Crie um menu de opções que permita:
1-Incluir parte
2-Calcular total
0-Sair
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> 
#include <string.h>

struct parte
{
	bool ativo;
	int comprimento;
	int largura;
	int area;
	char nome_area[20];
};

void imprime_area_do_imovel(struct parte parte_do_imovel)
{
	printf ("\n\nNome da area: %s - Largura: %d - Comprimento: %d - Area: %d\n", parte_do_imovel.nome_area, parte_do_imovel.largura, parte_do_imovel.comprimento, parte_do_imovel.area);
}

struct parte preencher_parte_do_imovel()
{
	struct parte parte_do_imovel;
	int comprimento;
	int largura;
	int area;
	char nome_area [20];

	printf("Digite o nome da area: \n");
	scanf("%s", nome_area);
	printf("Digite o comprimento: \n");
	scanf("%d", &comprimento);
	printf("Digite a largura: \n");
	scanf("%d", &largura);

	strcpy(parte_do_imovel.nome_area, nome_area);
	parte_do_imovel.ativo = true;
	parte_do_imovel.comprimento = comprimento;
	parte_do_imovel.largura = largura;
	parte_do_imovel.area = (largura * comprimento);

	return parte_do_imovel;
}

int menu(){

	int opcao;
	printf("\n0 - Sair do programa\n");
	printf("1 - Incluir parte\n");
	printf("2 - Calcular total\n");
	printf("Opção: ");
	scanf("%d", &opcao);
	return opcao;
}

int calcular_area_total_imovel(struct parte parte_do_imovel, int valor_total_imovel){

	int valor_totall_imovel, valor_area_parte_do_imovel;
	valor_totall_imovel = parte_do_imovel.area + valor_total_imovel;
	return valor_totall_imovel;

}

int main()
{	

	struct parte partes_do_imovel[5];
	struct parte uma_parte_do_imovel;
	int count, opcao, valor_total;

	count = 0;
	opcao = 3;
	valor_total = 0;

	do{
		opcao = menu();
		if (opcao == 1)
		{
			if (count < 5){			
				for (int i = 0; i <= 5; ++i)
				{
					if (partes_do_imovel[i].ativo == true)
					{
						continue;
					}
					uma_parte_do_imovel = preencher_parte_do_imovel();
					partes_do_imovel[i] = uma_parte_do_imovel;
					
					valor_total = valor_total + uma_parte_do_imovel.area;
					count++;
					break;
				}

			} else{
				printf("\nLimite de partes alcancado!\n");
			}
		} 
		else if (opcao == 2)
		{
			for (int i = 0; i <= 5; ++i){

				if (partes_do_imovel[i].ativo != true)
				{
					continue;
				}
				
			}
		}
		else if (opcao != 1 && opcao != 2 && opcao != 0)
		{
			printf("\nOpção invalida!\n");
		}
	} while(opcao != 0);

	return 0;
}