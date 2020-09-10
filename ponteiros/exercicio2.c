/*
2. Escreva um programa que contenha duas variáveis inteiras. Compare seus endereços e exiba o maior
endereço.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

	int inteiro1 = 20, inteiro2 = 17;

	printf("Endereco inteiro1: %x\n", &inteiro1);
	printf("Endereco inteiro2: %x\n\n", &inteiro2);


	if (&inteiro1 > &inteiro2)
	{
		printf("Endereco maior: %x\n", &inteiro1);
	} else 
	{
		printf("Endereco maior: %x\n", &inteiro2);
	}

	return 0;
}