/*
Inclua na estrutura um campo tipo caracter para armazenar o nome da pessoa
A função que busca a pessoa, deverá solicitar que o usuário informe os dados na tela
Na função main, um vetor da estrutura pessoas, para armazenar 3 pessoas
Criar um menu que permita:
Incluir pessoas no vetor
Imprimir todas as pessoas do vetor
Sair do programa
A cada vez que incluir uma nova pessoa, a função que busca pessoas deve retornar a pessoa incluida
Cada nova pessoa incluida e retornada deve ser armazenanda, na função main, em uma posição do vetor de pessoas
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> 
#include <string.h>

struct pessoa
{
	bool ativo;
	char nome[30];
	float peso;
	int idade;
	float altura;
};

void imprime_pessoa(struct pessoa uma_pessoa)
{
	printf ("\n\nNome: %s - Idade: %d - Peso: %f - Altura: %f\n", uma_pessoa.nome, uma_pessoa.idade, uma_pessoa.peso, uma_pessoa.altura );
}

struct pessoa busca_pessoa()
{
	struct pessoa a_pessoa;
	char nome[30];
	int idade;
	float peso, altura;

	printf("Digite o nome: \n");
	scanf("%s", nome);
	printf("Digite a idade: \n");
	scanf("%d", &idade);
	printf("Digite a altura: \n");
	scanf("%f", &altura);
	printf("Digite o peso: \n");
	scanf("%f", &peso);


	strcpy(a_pessoa.nome, nome);
	a_pessoa.ativo = true;
	a_pessoa.idade = idade;
	a_pessoa.peso = peso;
	a_pessoa.altura = altura;

	return a_pessoa;
}

int menu(){

	int opcao;
	printf("\n0 - Sair do programa\n");
	printf("1 - Incluir pessoas no vetor\n");
	printf("2 - Imprimir todas as pessoas do vetor\n");
	printf("Opção: ");
	scanf("%d", &opcao);
	return opcao;
}

int main()
{	

	struct pessoa pessoas[3];
	struct pessoa uma_pessoa;
	int count, opcao;

	count = 0;
	opcao = 3;

	do{
		opcao = menu();
		if (opcao == 1)
		{
			if (count < 3){			
				for (int i = 0; i <= 3; ++i)
				{
					if (pessoas[i].ativo == true)
					{
						continue;
					}
					uma_pessoa = busca_pessoa();
					pessoas[i] = uma_pessoa;
					count++;
					break;
				}

			} else{
				printf("\nLimite de pessoas alcancado!\n");
			}
		} 
		else if (opcao == 2)
		{
			for (int i = 0; i <= 3; ++i){

				if (pessoas[i].ativo != true)
				{
					continue;
				}
				imprime_pessoa(pessoas[i]);

			}
		}
		else if (opcao != 1 && opcao != 2 && opcao != 0)
		{
			printf("\nOpção invalida!\n");
		}
	} while(opcao != 0);

	return 0;
}