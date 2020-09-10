#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> 
#include <string.h>

struct pizza
{
	bool pizza_ativa;
	char nome_pizza[30];
	int codigo_pizza;
};

struct preco
{
	bool preco_ativo;
	int codigo_pizza;
	float preco_pizza;
};

struct pedido
{
	bool pedido_ativo;
	char nome_pizza[30];
	int quantidade_pizza;

};

struct pizza preenche_pizza()
{
	struct pizza a_pizza;
	char nome_pizza[30];
	int codigo_pizza;

	printf("Digite o NOME da pizza: \n");
	scanf("%s", nome_pizza);
	printf("Digite o CODIGO da pizza: \n");
	scanf("%d", &codigo_pizza);

	strcpy(a_pizza.nome_pizza, nome_pizza);
	a_pizza.codigo_pizza = codigo_pizza;
	a_pizza.pizza_ativa = true;

	return a_pizza;
}

struct preco preenche_preco_pizza()
{
	struct preco o_preco;
	int codigo_pizza;
	float preco_pizza;

	printf("Digite o CODIGO da pizza: \n");
	scanf("%d", &codigo_pizza);
	printf("Digite o PRECO da pizza: \n");
	scanf("%f", &preco_pizza);

	o_preco.codigo_pizza = codigo_pizza;
	o_preco.preco_pizza = preco_pizza;
	o_preco.preco_ativo = true;

	return o_preco;
}

void procurar_pizza(struct pedido um_pedido, struct pizza pizzas[], struct preco precos[]){

	for (int i = 0; i < 2; ++i)
	{
		if (strcmp(um_pedido.nome_pizza, pizzas[i].nome_pizza) == 0)
		{
			for (int j = 0; j < 2; ++j)
			{
				if (pizzas[i].codigo_pizza == precos[j].codigo_pizza)
				{
					printf("\n __________________________________________\n");
					printf("|\n");
					printf("|   Nome da pizza: %s\n", pizzas[i].nome_pizza);
					printf("|   Quantidade de pizzas: %d\n", um_pedido.quantidade_pizza);
					printf("|   Valor total das pizzas: R$%.2f\n", (um_pedido.quantidade_pizza * precos[j].preco_pizza));
					printf("|__________________________________________\n");
				}
			}
		}
	}
}

struct pedido realizar_pedido(){

	struct pedido o_pedido;
	char nome_pizza[30];
	int quantidade_pizza;

	printf("Digite o NOME da pizza: \n");
	scanf("%s", nome_pizza);
	printf("Digite a QUANTIDADE de pizzas: \n");
	scanf("%d", &quantidade_pizza);

	strcpy(o_pedido.nome_pizza, nome_pizza);
	o_pedido.quantidade_pizza = quantidade_pizza;
	o_pedido.pedido_ativo = true;
	
	return o_pedido;

}

int menu()
{
	int opcao;
	printf("\n0 - Sair do programa\n");
	printf("1 - Cadastro de pizza\n");
	printf("2 - Cadastro de precos\n");
	printf("3 - Pedido\n");
	printf("\nOpção: ");
	scanf("%d", &opcao);
	return opcao;
}

int main()
{	

	struct pizza pizzas[2];
	struct preco precos[2];

	struct pizza uma_pizza;
	struct preco um_preco;
	struct pedido um_pedido;
	int count_precos, count_pizzas, opcao;

	count_precos = 0;
	count_pizzas = 0;
	opcao = 3;

	for (int i = 0; i < 3; ++i)
	{
		pizzas[i].pizza_ativa = false;
		precos[i].preco_ativo = false;
	}

	do
	{
		opcao = menu();
		if (opcao == 1)
		{
			if (count_pizzas <= 2)
			{			
				for (int i = 0; i < 2; ++i)
				{
					if (pizzas[i].pizza_ativa == true)
					{
						continue;
					}
					uma_pizza = preenche_pizza();
					pizzas[i] = uma_pizza;
					count_pizzas++;
					break;
				}
			}
			else
			{
				printf("\nLimite de pizzas alcancado!\n");
			}
		} 
		else if (opcao == 2)
		{
			if (count_precos <= 2)
			{			
				for (int i = 0; i < 2; ++i)
				{
					if (precos[i].preco_ativo == true)
					{
						continue;
					}
					um_preco = preenche_preco_pizza();
					precos[i] = um_preco;
					count_precos++;
					break;
				}
			}
			else
			{
				printf("\nLimite de precos alcancado!\n");
			}
		} 
		else if (opcao == 3)
		{
			if (count_pizzas == 0 || count_precos == 0)
			{
				printf("\nCadastre pizzas e precos antes de realizar um pedido!\n");
			}
			else{
				um_pedido = realizar_pedido();
				procurar_pizza(um_pedido, pizzas, precos);
			}
		}
		else if (opcao != 1 && opcao != 2 && opcao != 3  && opcao != 0)
		{
			printf("\nOpcao invalida!\n");
		}

	} while(opcao != 0);

	return 0;
}