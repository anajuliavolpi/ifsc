// 6. Crie   uma   struct  pessoa  contendo   os   campos   nome   e   idade   e   cidade.   Crie   um   vetor contendo   10   structs 
// do   tipo   pessoa   (sem   ponteiro).   Em   seguida,   leia   os   dados   de   10 pessoas preenchendo o vetor. Como passo final, deve-se imprimir os dados do vetor.


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Pessoa{
	char nome[100];
	char cidade[50];
	int idade;
} Pessoa;

Pessoa pessoas[10];

int main (int argc, char** argv){


	for (int i = 0; i < 10; ++i)
	{
		printf("Digite o nome: ");
	    scanf("%s", pessoas[i].nome);
		printf("Digite a idade: ");
	    scanf("%d", &pessoas[i].idade);
		printf("Digite a cidade: ");
	    scanf("%s", pessoas[i].cidade);
	}


	for (int i = 0; i < 10; ++i)
	{
		printf("\nNome: %s\n",pessoas[i].nome );
		printf("Idade: %d\n",pessoas[i].idade );
		printf("Cidade: %s\n",pessoas[i].cidade );
	}

    return 0;
}