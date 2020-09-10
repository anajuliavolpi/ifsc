/* 
1. Crie um programa que:
(a) Aloque dinamicamente um array de 5 numeros inteiros,
(b) Peça para o usuario digitar os 5 numeros no espaço alocado,
(c) Mostre na tela os 5 numeros,
(d) Libere a memoria alocada.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

	int *p = (int*) malloc(5 * sizeof(int));
	if (p == NULL)
	{
		printf("ERRO! Sem memoria\n");
	} 
	else{
		for (int i = 0; i < 5; ++i)
		{
			printf("Digite p[%d]: ", i);
			scanf("%d", &p[i]);
		}
	}

	for (int i = 0; i < 5; ++i)
		{
			printf("p[%d] = %d\n", i, p[i]);
		}

	free(p);

	return 0;
}