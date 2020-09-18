/*
2. Crie um arquivo de texto, no Bloco de Notas (Notepad), com diversas linhas de texo. Faça um
programa que receba do usuario o nome um arquivo texto, acesse o arquivo e mostre na tela quantas
linhas esse arquivo possui. 
*/

#include <stdio.h>
#include <stdlib.h>

int contarLinhasArquivo(){

	char arquivoAbrir[50], leitura[1024], ch;
	int quantidadeLinhas = 0;
	FILE* arquivo;

	printf("Digite o nome do arquivo que desejas abrir: ");
	scanf("%s", arquivoAbrir);

	arquivo = fopen(arquivoAbrir, "r");

	if (arquivo == NULL){
		printf("Erro ao abrir o arquivo. Digite um arquivo existente valido!\n");
		return -1;
	}

	while(feof(arquivo) == 0){

		ch = fgetc(arquivo);
		if (ch == '\n')
		{
			quantidadeLinhas++;
		}
	}
	
	fclose (arquivo);
	return quantidadeLinhas;
}

int main()
{
	int quantidadeLinhas;

	quantidadeLinhas = contarLinhasArquivo();

	if (quantidadeLinhas != -1)
	{
		printf("\nQuantidade de linhas no arquivo lido: %d\n\n", quantidadeLinhas);	
	}
	return 0;
}