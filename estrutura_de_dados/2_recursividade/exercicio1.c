// 1. Implemente em C um procedimento que imprima uma string invertida na tela, sem usarla ̧co de repeti ̧c ̃ao.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void invertida(char* string, int tamanho){
	if (tamanho > 0){
		invertida(string+1, tamanho-1);
		printf("%c",string[0]);
	}
}

int main (int argc, char** argv){

	// char* frase = "julia";
	char* frase[100];
	printf("Digite uma frase: ");
    scanf("%s", frase);
    invertida(frase, strlen(frase));
	printf("\n");

    return 0;
}