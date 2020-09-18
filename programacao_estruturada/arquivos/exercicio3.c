/*
3. Crie um segundo arquivo de texto, no Bloco de Notas, e faça um programa que receba o nome de
dois arquivos do usuario. Leia o conteúdo dos 2 arquivos e crie um terceiro arquivo com o
conteudo dos dois primeiros juntos (o conteudo do primeiro seguido do conteudo do segundo).
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void lerArquivo(){

	FILE* arq;
	char leitura[1024];

	arq = fopen("arquivo3Abrir.txt", "r");
	
	if (arq == NULL){
		printf("Erro ao abrir o arquivo\n");
		return;
	}

	// fgets(leitura, sizeof(leitura), arquivo3);
	printf("\nConteudo do arquivo 3:\n");

	while(feof(arq) == 0){
		fgets(leitura, sizeof(leitura), arq);
		printf("%s",leitura);
		memset(leitura, 0, sizeof(leitura));
	}
	
	fclose (arq);
}

void juntarArquivos(FILE *arquivo, FILE *arquivo3){

	char leitura[1024];

	while(feof(arquivo) == 0){
		fgets(leitura, sizeof(leitura), arquivo);
		fputs(leitura, arquivo3);
		memset(leitura, 0, sizeof(leitura));
	}
	fclose (arquivo);
}

void abrirArquivos(char *arquivo1Abrir, char *arquivo2Abrir){

	FILE* arquivo1;
	FILE* arquivo2; 
	FILE* arquivo3;

	arquivo1 = fopen(arquivo1Abrir, "r");
	arquivo2 = fopen(arquivo2Abrir, "r");
	arquivo3 = fopen("arquivo3Abrir.txt", "a+");

	if (arquivo1 == NULL || arquivo2 == NULL || arquivo3 == NULL){
		printf("Erro ao abrir os arquivos\n");
		return;
	}

	juntarArquivos(arquivo1, arquivo3);
	juntarArquivos(arquivo2, arquivo3);
	fclose (arquivo3);
	lerArquivo();
}

void pedirArquivo(){

	char arquivo1Abrir[50], arquivo2Abrir[50];

	printf("Digite o nome do primeiro arquivo que desejas abrir: ");
	scanf("%s", arquivo1Abrir);

	printf("Digite o nome do segundo arquivo que desejas abrir: ");
	scanf("%s", arquivo2Abrir);

	abrirArquivos(arquivo1Abrir, arquivo2Abrir);

}

int main()
{
	pedirArquivo();	
	return 0;
}