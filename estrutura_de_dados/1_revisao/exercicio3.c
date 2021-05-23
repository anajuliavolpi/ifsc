// 4.Escreva um algoritmo que leia 16 números informados pelo usuário para uma matriz 4x4.
// Exiba na tela somente os números positivos. No lugar dos números negativos imprima ocarácter '&'.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (void)
{

	char c;
	int tamanho = 4;
	int matriz[tamanho][tamanho];



	for (int i = 0; i < tamanho; i++)
	{
		for (int j = 0; j < tamanho; j++)
		{			
    		printf("Digite um numero: ");
    		scanf("%d", &matriz[i][j]);
		}
	}

	for (int i = 0; i < tamanho; i++)
	{
		for (int j = 0; j < tamanho; j++)
		{			
			if (matriz[i][j] < 0)
			{
				matriz[i][j] = '&';
			}
			c = matriz[i][j] + '0';
    		printf(" %c ", c);
	    }
   		printf("\n");

	}

    return 0;
}