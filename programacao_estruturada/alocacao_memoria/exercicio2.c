/*
2. Faça um programa que leia do usuario o tamanho de um vetor a ser lido e faça a
alocação dinamica de memoria. Em seguida, leia do usuario seus valores e imprima o
vetor lido.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

	int tamanho;

	printf("Digite o tamanho do vetor: ");
	scanf("%d", &tamanho);

	int *p = (int*) malloc(tamanho * sizeof(int));
	if (p == NULL)
	{
		printf("ERRO! Sem memoria\n");
	} 
	else{
		for (int i = 0; i < tamanho; ++i)
		{
			printf("Digite p[%d]: ", i);
			scanf("%d", &p[i]);
		}
	}

	for (int i = 0; i < tamanho; ++i)
		{
			printf("p[%d] = %d\n", i, p[i]);
		}

	free(p);

	return 0;
}