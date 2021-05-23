#include <stdlib.h>
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

}

//Implementar
int pop(Pilha* p){
    return 0;
}

//Implementar
int tamanho(Pilha* p){
    return 0;
}
