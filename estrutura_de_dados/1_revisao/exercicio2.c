// 2. Crie um algoritmo que solicite dois nomes A e B, verifique se os nomes são iguais; se A émaior que B (número de caracteres); se B é maior que A

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (void)
{
    char nome1[50], nome2[50];
    int i, qtd1, qtd2;
    printf("Digite o primeiro nome: ");
    scanf("%s", nome1);
    printf("Digite o segundo nome: ");
    scanf("%s", nome2);
    qtd1 = 0;
	qtd2 = 0;



	if (strcmp(nome1, nome2) == 0)
	{
		printf("\nOs nomes nao sao iguais!\n");

	} else{

		for(i = 0; i < strlen(nome1); i++){
	       qtd1 += 1;
		}
		for(i = 0; i < strlen(nome2); i++){
		   qtd2 += 1;
		}
	    if (qtd1 > qtd2){
			printf("\nO primeiro nome eh maior!\n");
   		} else{
			printf("\nO segundo nome eh maior!\n");
   		}

	}
    return 0;
}