#include <stdlib.h>
#include "pilha.h"


Pilha* criar_pilha(){
	Pilha* p = malloc(sizeof(Pilha));
	p->topo = NULL;
    return p;
}

void destruir_pilha(Pilha* p){
	No* pt = p->topo;
	while(pt){
		No* temp = pt->prox;
		free(pt);
		pt = temp;
	}
	free(p);
}

void push(Pilha* p, int x){
	No* pt = malloc(sizeof(No));
	pt->dado = x;
	pt->prox = p->topo;
	p->topo = pt; 
}

int pop(Pilha* p){
    int valor = -1;
    No* pt = p->topo;
    valor = pt->dado;
    p->topo = pt->prox;
    free(pt);
    return valor;
}

int tamanho(Pilha* p){
    int tam = 0;
    No* pt = p->topo;
    while(pt){
		pt = pt->prox;
		tam++;
	}	
	return tam;
}
