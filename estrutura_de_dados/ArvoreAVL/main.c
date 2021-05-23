#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "ArvoreAVL.h"

// Funcao auxiliar para medicao de tempo
unsigned long long rdtscl(void)
{
    unsigned int lo, hi;
    __asm__ __volatile__ ("rdtsc" : "=a"(lo), "=d"(hi));
    return ( (unsigned long long)lo)|( ((unsigned long long)hi)<<32 );
}

int main()
{
	int i, chaves = 30000;
	unsigned long long inicio, fim, dif;
    printf("Criando arvore AVL\n");
    ArvoreAVL* arvore = criar_arvore();

    
    printf("Inserindo %d chaves na arvore\n", chaves);
    for(i=0; i< chaves; i++){
        inicio = rdtscl();
        inserir(arvore, i);
        fim = rdtscl();
        dif = fim - inicio;
        printf("Ciclos de clock gastos por chave: %llu\n", dif);
    }
    

    printf("Raiz: %d\n", arvore->raiz->chave);
    printf("Altura: %d\n", altura(arvore));

    destruir_arvore(arvore);

    return 0;
}
