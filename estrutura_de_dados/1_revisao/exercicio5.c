// 5. Implemente em C um procedimento que imprima uma string invertida na tela.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void invertida(char* str, int tamanho){
	if (tamanho > 0){
		invertida(str+1, tamanho -1);
		printf("%c",str[0]);
	}
}

int main (void)
{

	char frase[50];
	printf("Digite uma frase: ");
	scanf("%s", frase);

	invertida(frase, strlen(frase));
	printf("\n");

    return 0;
}