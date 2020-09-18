/*
1. Escreva um programa que:
(a) Crie/abra um arquivo texto de nome “arq.txt”
(b) Permita que o usuario grave diversas informações nesse arquivo, at ´ e que o usu ´ ario ´ entre
com o caractere ‘0’
(c) Feche o arquivo
Agora, abra e leia o arquivo, e escreva na tela todos as informações armazenadas.
*/

#include <stdio.h>
#include <stdlib.h>

int escreverArquivo(char *arquivo, char *modo){

	int retorno = 0;
	char informacao[100];
	FILE* arq;

	arq = fopen(arquivo, modo);

	if (arq == NULL){
		printf("Erro ao abrir o arquivo\n");
		return(-1);
	}

	printf("Digite a informacao: ");
	scanf("%s", informacao);

	retorno = fputs(informacao, arq);
	retorno = fputs("\n", arq);

	if (retorno == 0)
	{
		printf("Erro ao gravar no arquivo\n");
		return (-1);
	}

	fclose (arq);

	return 0;
}

void lerArquivo(char *arquivo){

	FILE* arq;
	char leitura[1024];

	arq = fopen(arquivo, "r");
	
	if (arq == NULL){
		printf("Erro ao abrir o arquivo\n");
		return;
	}

	fgets(leitura, sizeof(leitura), arq);
	printf("\nConteudo do arquivo:\n");

	while(feof(arq) == 0){
		printf("%s",leitura);
		fgets(leitura, sizeof(leitura), arq);
	}
	
	fclose (arq);
}

int menu()
{
	int opcao;	
	printf("\n0 - Encerrar o programa\n");
	printf("1 - Inserir informacao\n");
	printf("\nOpção: ");
	scanf("%d", &opcao);
	return opcao;
}

int main()
{

	char* arquivo = "arq.txt";
    char* modoA = "a+";
	int opcao = 0;

	do{
		opcao = menu();
		if (opcao == 1){

			escreverArquivo(arquivo, modoA);
		} 
		else if (opcao != 0 && opcao != 1)
		{
			printf("\nOpcao Invalida!\n");
		}
	} while(opcao != 0);

	lerArquivo(arquivo);

	return 0;
}