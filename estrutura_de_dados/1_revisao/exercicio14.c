// 14. Ainda   considerando   o   exercício   anterior,   implemente   uma  
// função   para   remover   umapessoa do vetor através no nome.

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

	char nome_busca[100];

	for (int i = 0; i < 3; ++i)
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

	printf("Digite o nome para deletar: ");
    scanf("%s", nome_busca);

	for (int i = 0; i < 3; ++i)
	{
		if (strcmp(nome_busca, pessoas[i]->nome) == 0){

			
			// Pessoa* ptemp = pessoas[i];
			// free(ptemp);

			pessoas[i] = pessoas[i+1];

			// printf("\nNome: %s\n",pessoas[i]->nome );
			// printf("Idade: %d\n",pessoas[i]->idade );
			// printf("Cidade: %s\n",pessoas[i]->cidade );
		} 			
	}

	for (int i = 0; i < 2; ++i)
	{
		// if (strcmp(nome_busca, pessoas[i]->nome) == 0){

			printf("\nNome: %s\n",pessoas[i]->nome );
			printf("Idade: %d\n",pessoas[i]->idade );
			printf("Cidade: %s\n",pessoas[i]->cidade );
		// } 			
	}

    return 0;
}