/*
5. Faça um programa que leia dois valores inteiros e chame uma função que receba estes 2 valores de entrada
e retorne o maior valor na primeira variável e o menor valor na segunda variável. Escreva o conteúdo das 2
variáveis na tela.
*/

#include <stdio.h>
#include <stdlib.h>

void maiorValor(int *ponteiro_inteiro1, int *ponteiro_inteiro2){

	int aux;

	if (*ponteiro_inteiro2 > *ponteiro_inteiro1)
	{
		aux = *ponteiro_inteiro1;
		*ponteiro_inteiro1 = *ponteiro_inteiro2;
		*ponteiro_inteiro2 = aux;
	}

}

int main()
{

	int inteiro1, inteiro2, *ponteiro_inteiro1, *ponteiro_inteiro2;

	printf("Inteiro 1: ");
	scanf("%d", &inteiro1);
	printf("Inteiro 2: ");
	scanf("%d", &inteiro2);

	ponteiro_inteiro1 = &inteiro1;
	ponteiro_inteiro2 = &inteiro2;

	maiorValor(ponteiro_inteiro1, ponteiro_inteiro2);

	printf("\nVariavel 1: %d\n", inteiro1);
	printf("Variavel 2: %d\n", inteiro2);

	return 0;
}