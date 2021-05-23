#include <stdlib.h>
#include "lista.h"

Lista* criar_lista(int tamanho){
	Lista* l = malloc(sizeof(Lista));
	l->elementos = malloc(sizeof(No)*tamanho+1);
	l->tamanho = 0;
	l->limite = tamanho;
	return l;
}

//Pronto
void destruir_lista(Lista* l){
	free(l->elementos);
	free(l);
}

//Pronto
int tamanho(Lista* l){
	return l->tamanho;
}

//Pronto
int limite(Lista* l){
	return l->limite;
}

//Implementar
No* buscar(Lista* l, int x){
    int i;
    No* buscado = NULL;

    l->elementos[l->tamanho].chave = x;
    while(l->elementos[i].chave != x){
        i++;
    }
    buscado = i == tamanho ? NULL : &l->elementos[i];

    return buscado;
}

//Implementar
No* inserir(Lista* l, int x){
    No* inserido = NULL;

    if(buscar(l, x) == NULL){
        int posicao = l->tamanho++;
        inserido = &l->elementos[posicao];
        inserido->chave = x;
    }
    return inserido;
}

static int buscar_o_indice(Lista* l, int x){
    int i;
    int buscado = -1;

    for(i = 0; i < l->tamanho; i++){
        if(l->elementos[i].chave == x){
            buscado = i;
            break;
        }
    }
    return buscado;
}

void remover(Lista* l, int x){
    int i;
    int posicao = buscar_o_indice(l, x);

    if(posicao != -1){
        for(i = posicao; i < l->tamanho-1; i++){
            l->elementos[i] = l->elementos[i+1];
        }
        l->tamanho--;
    }
}

//Implementar
No* primeiro(Lista* l){
    return &l->elementos[0];
}

//Implementar
No* ultimo(Lista* l){
    return &l->elementos[l->tamanho-1];
}

//Implementar
int buscar_indice(Lista* l, int i){
    return l->elementos[i].chave;
}
