#include <stdlib.h>
#include <stdio.h>
#include "pilha.h"

//Pronto
Pilha* criar_pilha(int tamanho){
    Pilha* p = malloc(sizeof(Pilha));
    p->dados = malloc(sizeof(int)*tamanho);
    p->M = tamanho;
    p->topo = -1;
    return p;
}

//Pronto
void destruir_pilha(Pilha* p){
    free(p->dados);
    free(p);
}

//Implementar
void push(Pilha* p, int x){
    p->topo++;

    if(p->topo > p->M){
        printf("\nOverflow\n");
        return;
    }

    p->dados [p->topo] = x;
}

//Implementar
int pop(Pilha* p){
    if(p->topo > 0){
        printf("\nUnderflow\n");
        return NULL;
    }

    float aux = p->dados [p->topo];
    p->topo--;
    return aux;
}

//Implementar
int tamanho(Pilha* p){
    return p->dados[p->topo];
}
