/*
4. Faça um programa que leia 2 valores inteiros e chame uma função que receba estas 2 variáveis e troque o
seu conteúdo, ou seja, esta função é chamada passando duas variáveis A e B por exemplo e, após a execução
da função, A conterá o valor de B e B terá o valor de A.
*/

#include <stdio.h>
#include <stdlib.h>

void trocaNumeros(int *ponteiro_inteiro1, int *ponteiro_inteiro2){

	int aux;

	aux = *ponteiro_inteiro1;
	*ponteiro_inteiro1 = *ponteiro_inteiro2;
	*ponteiro_inteiro2 = aux;

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

	trocaNumeros(ponteiro_inteiro1, ponteiro_inteiro2);

	printf("\nInteiro 1: %d\n", inteiro1);
	printf("Inteiro 2: %d\n", inteiro2);

	return 0;
}