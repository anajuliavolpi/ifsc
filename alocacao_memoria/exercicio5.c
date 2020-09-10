/*
5. Faça um programa que leia um número N e:
• Crie dinamicamente e leia um vetor de inteiro de N posições;
• Leia um número inteiro X e conte e mostre os múltiplos desse número que existem
no vetor.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

	int n, x, countX=0;

	printf("Digite N (tamanho do vetor): ");
	scanf("%d", &n);
	printf("Digite X (multiplos): ");
	scanf("%d", &x);

	int *p = (int*) malloc(n * sizeof(int));
	if (p == NULL)
	{
		printf("ERRO! Sem memoria\n");
	} 
	else{
		for (int i = 0; i < n; ++i)
		{
			printf("Digite p[%d]: ", i);
			scanf("%d", &p[i]);
			if (p[i] % x == 0)
			{
				countX++;
			}
		}
	}

	printf("Quantidade de numeros multiplos de %d: %d\n", x, countX);

	free(p);

	return 0;
}