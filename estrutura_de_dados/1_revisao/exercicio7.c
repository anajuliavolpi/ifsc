// 7. Crie   uma   struct  pessoa  contendo   os   campos   nome   e   idade   e   cidade.   Crie   um   vetor contendo   10   structs 
// do   tipo   pessoa   (sem   ponteiro).   Em   seguida,   leia   os   dados   de   10 pessoas preenchendo o vetor. Como passo final, deve-se imprimir os dados do vetor.
// Repita   o   exercício   anterior   considerando   agora   a   criação   de   um   vetor   de   ponteiros   destructs pessoa, ao invés de um vetor de structs pessoa.  
// Em seguida, leia os dados de 10 pessoas   preenchendo   o   vetor   com   ponteiros   de   structs   criadas   utilizando   alocaçãodinâmica de memória (malloc).
// Como passo final, deve-se imprimir os dados do vetor

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Pessoa{
	char nome[100];
	char cidade[50];
	int idade;
} Pessoa;

Pessoa* pessoas[10];

int main (int argc, char** argv){

	for (int i = 0; i < 10; ++i)
	{
		Pessoa* p = malloc(sizeof(Pessoa));
		printf("Digite o nome: ");
	    scanf("%s", p->nome);
		printf("Digite a idade: ");
	    scanf("%d", &p->idade);
		printf("Digite a cidade: ");
	    scanf("%s", p->cidade);

	    pessoas[i] = p;
	}


	for (int i = 0; i < 10; ++i)
	{
		printf("\nNome: %s\n",pessoas[i]->nome );
		printf("Idade: %d\n",pessoas[i]->idade );
		printf("Cidade: %s\n",pessoas[i]->cidade );
	}

    return 0;
}