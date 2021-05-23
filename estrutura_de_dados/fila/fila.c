#include <stdlib.h>
#include "fila.h"


Fila* criar_fila(){
	Fila* f = malloc(sizeof(Fila));
	f->inicio = NULL;
	f->fim = NULL;
	return f;
}

void destruir_fila(Fila* f){
	No* pt = f->inicio;
	while(pt){
		No* tmp = pt->prox;
		free(pt);
		pt = tmp;
	}
	free(f);
}

void inserir(Fila* f, int x){
	No* pt = malloc(sizeof(Fila));
	pt->dado = x;
	pt->prox = NULL;
	if(f->fim != NULL){
		f->fim->prox = pt;
	} else {
		f->inicio = pt;
	}
	f->fim = pt;
}

// Problema pratico 2
int remover(Fila* fi){
    int valor = -1;

    if(fi->inicio > -1){
        int* pt = fi->inicio;
        fi->inicio = fi->inicio->prox;
        valor = pt;
        free(pt);
    }else{
        return valor;
    }
}

int tamanho(Fila* f){
    int tam = 0;
    No* pt = f->inicio;
    while(pt){
		pt = pt->prox;
		tam++;
	}
	return tam;
}

