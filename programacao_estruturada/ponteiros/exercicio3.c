/*
3. Escreva um programa que contenha duas variáveis inteiras. Leia essas variáveis do teclado. Em seguida,
compare seus endereços e exiba o conteúdo do maior endereço.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

	int inteiro1, inteiro2;

	printf("Inteiro 1: ");
	scanf("%d", &inteiro1);
	printf("Inteiro 2: ");
	scanf("%d", &inteiro2);

	printf("\nEndereco inteiro 1: %x\n", &inteiro1);
	printf("Endereco inteiro 2: %x\n\n", &inteiro2);


	if (&inteiro1 > &inteiro2)
	{
		printf("Conteudo do endereco maior: %x\n\n", inteiro1);
	} else 
	{
		printf("Conteudo do endereco maior: %x\n\n", inteiro2);
	}

	return 0;
}