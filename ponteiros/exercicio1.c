/*
1. Escreva um programa que declare um inteiro, um real e um char, e ponteiros para inteiro, real, e char.
Associe as variáveis aos ponteiros (use &). Modifique os valores de cada variável usando os ponteiros.
Imprima os valores das variáveis antes e após a modificação.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

	int inteiro, *ponteiro_inteiro;
	float real, *ponteiro_real;
	char string, *ponteiro_string;

	ponteiro_inteiro = &inteiro;
	ponteiro_real = &real;
	ponteiro_string = &string;

	*ponteiro_inteiro = 20;
	*ponteiro_real = 17.5;
	*ponteiro_string = 'a';
	
	printf("Inteiro: %d\n", inteiro);
	printf("Real: %.2f\n", real);
	printf("Char: %c\n", string);

	return 0;
}