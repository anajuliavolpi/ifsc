/*
3. Faça um programa que leia do usuário o tamanho de um vetor a ser lido e Faça a
alocação dinâmica de memória. Em seguida, leia do usuário seus valores e mostre
quantos dos números são pares e quantos são ímpares.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

	int tamanho, countPar=0, countImpar=0;

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
			if (p[i] % 2 == 0)
			{
				countPar++;
			}
			else{
				countImpar++;
			}
		}
	}

	printf("Quantidade de numeros impares: %d\n", countImpar);
	printf("Quantidade de numeros pares: %d\n", countPar);

	free(p);

	return 0;
}