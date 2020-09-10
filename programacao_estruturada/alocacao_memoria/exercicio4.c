/*
4. Faça um programa que receba do usuário o tamanho de uma string e chame uma
função para alocar dinamicamente essa string. Em seguida, o usuário devera informar o
conteudo dessa string. O programa imprime a string sem suas vogais.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

	int tamanho;

	printf("Digite o tamanho da string: ");
	scanf("%d", &tamanho);

	char *p = (char*) malloc(tamanho * sizeof(char));
	if (p == NULL)
	{
		printf("ERRO! Sem memoria\n");
	} 
	else{
		printf("Digite a string: ");
		scanf("%s", p);
	}
	
	printf("Palavra sem vogais: \n");

	for (int i = 0; i < tamanho; i++)
	{
		if (p[i] != 'a' && p[i] != 'e' && p[i] != 'i' && p[i] != 'o' && p[i] != 'u')
		{
			printf("%c", p[i]);
		}
	}

	printf("\n");

	free(p);

	return 0;
}