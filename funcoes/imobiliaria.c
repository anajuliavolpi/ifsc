#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct terreno
{
	char nome_rua[30], nome_bairro[30];
	int numero_imovel;
	float area_terreno, preco_terreno;
};

struct preco
{
	char  nome_bairro[30];
	float valor_metro_quadrado;
};


struct terreno preenche_terreno()
{
	struct terreno o_terreno;
	char nome_rua[30], nome_bairro[30];
	int numero_imovel;
	float area_terreno;

	printf("Digite o nome da rua do terreno: \n");
	scanf("%s", nome_rua);
	printf("Digite o nome do bairro do terreno: \n");
	scanf("%s", nome_bairro);
	printf("Digite o numero do imovel: \n");
	scanf("%d", &numero_imovel);
	printf("Digite a area total do terreno: \n");
	scanf("%f", &area_terreno);

	strcpy(o_terreno.nome_rua, nome_rua);
	strcpy(o_terreno.nome_bairro, nome_bairro);
	o_terreno.numero_imovel = numero_imovel;
	o_terreno.area_terreno = area_terreno;

	return o_terreno;
}

struct preco preenche_preco_bairro()
{
	struct preco o_preco;
	char  nome_bairro[30];
	float valor_metro_quadrado;

	printf("Digite o nome do bairro: \n");
	scanf("%s", nome_bairro);
	printf("Digite o valor do metro quadrado do bairro: \n");
	scanf("%f", &valor_metro_quadrado);

	strcpy(o_preco.nome_bairro, nome_bairro);		
	o_preco.valor_metro_quadrado = valor_metro_quadrado;

	return o_preco;
}

void relatorio_terrenos(struct terreno terrenos[])
{

	for (int i = 0; i < 5; ++i)
	{
		if (terrenos[i].numero_imovel != -1)
		{				
			printf("\n __________________________________________\n");
			printf("|\n");
			printf("|   Rua: %s\n", terrenos[i].nome_rua);
			printf("|   Numero do imóvel: %d\n", terrenos[i].numero_imovel);
			printf("|   Bairro: %s\n", terrenos[i].nome_bairro);
			printf("|   Area total do terreno (m2): %.2f\n", terrenos[i].area_terreno);
			printf("|   Preco total do terreno: R$%.2f\n", terrenos[i].preco_terreno);
			printf("|__________________________________________\n");
		}
	}
}

struct terreno calcular_preco_terreno(struct terreno um_terreno, struct preco precos[]){

	struct terreno o_terreno;
	int count = 0;

	for (int i = 0; i < 5; ++i)
	{		
		if (strcmp(um_terreno.nome_bairro, precos[i].nome_bairro) == 0)
		{
			o_terreno.preco_terreno = um_terreno.area_terreno * precos[i].valor_metro_quadrado;
			strcpy(o_terreno.nome_rua, um_terreno.nome_rua);
			strcpy(o_terreno.nome_bairro, um_terreno.nome_bairro);
			o_terreno.numero_imovel = um_terreno.numero_imovel;
			o_terreno.area_terreno = um_terreno.area_terreno;
			count++;
		}
	}

	if (count == 0)
	{
		o_terreno.preco_terreno = 0.00;
		strcpy(o_terreno.nome_rua, um_terreno.nome_rua);
		strcpy(o_terreno.nome_bairro, "BAIRRO NAO CADASTRADO");
		o_terreno.numero_imovel = um_terreno.numero_imovel;
		o_terreno.area_terreno = um_terreno.area_terreno;
	}

	return o_terreno;
}

int menu()
{
	int opcao;
	printf("\n0 - Sair do programa\n");
	printf("1 - Cadastro de preco\n");
	printf("2 - Cadastro de terreno\n");
	printf("3 - Relatorio\n");
	printf("\nOpção: ");
	scanf("%d", &opcao);
	return opcao;
}

int main()
{	

	struct terreno terrenos[5]={};
	struct preco precos[5]={};

	struct terreno um_terreno;
	struct preco um_preco;

	int count_precos, count_terrenos, opcao;

	count_precos = 0;
	count_terrenos = 0;
	opcao = 4;

	for (int i = 0; i < 5; ++i)
	{
		terrenos[i].numero_imovel = -1;
	}

	do
	{
		opcao = menu();
		switch (opcao){

			case 0:
				printf("\nVolte sempre!\n\n");
				break;

			case 1:
				if (count_precos < 5){
					um_preco = preenche_preco_bairro();
					precos[count_precos] = um_preco;
					count_precos++;
				} 
				else
				{
					printf("\nLimite de precos cadastrados.\n");
				}
				break;

			case 2:
				if (count_terrenos < 5){

					um_terreno = preenche_terreno();
					terrenos[count_terrenos] = um_terreno;
					count_terrenos++;
				}
				else
				{
					printf("\nLimite de bairros cadastrados.\n");
				}
				break;

			case 3:
				if (count_terrenos == 0 || count_precos == 0)
				{
					printf("\nCadastre terrenos e precos antes de gerar um relatorio!\n");
				}
				else{
					for (int i = 0; i < count_terrenos; ++i)
					{
						if (terrenos[i].numero_imovel != -1)
						{							
							terrenos[i]=calcular_preco_terreno(terrenos[i], precos);
						}					
					}
					relatorio_terrenos(terrenos);
				}
				break;

			default:
            	printf("\nOpcao invalida!\n");
		}

	} while(opcao != 0);

	return 0;
}