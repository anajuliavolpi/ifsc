#include "arvore.h"
#include <stdlib.h>
#include <stdio.h>


No* criar_arvore(char chave){
    No* no = malloc(sizeof(No));
    no->chave = chave;
    no->esquerda = NULL;
    no->direita = NULL;

    return no;
}

No* inserir(No* arvore, No* esquerdo, No* direito){
    arvore->esquerda = esquerdo;
    arvore->direita = direito;

    return arvore;
}

void imprimir_preordem(No* no){

	if(no){
		printf("%c, ", no->chave);
		imprimir_preordem(no->esquerda);
		imprimir_preordem(no->direita);
	}	
}

void imprimir_simetrica(No* no){
    if(no != NULL){
        imprimir_simetrica(no->esquerda);
        printf("%c, ", no->chave);
        imprimir_simetrica(no->direita);
    }
}

void imprimir_posordem(No* no){
  if(no){
        imprimir_posordem(no->esquerda);
        imprimir_posordem(no->direita);
        printf("%c, ", no->chave);
    }
}

void imprimir_largura(No* no){
	
	// fila ad-hoc para armazenamento de nos
	No* fila[100]; // fila ad-hoc (sequencial) para armazenamento de nos
	int i=0, j=0;  // indices de inicio e fim de fila, respectivamente
	
	fila[j++] = no; // adicionar raiz na fila
	
	while(i < j){ // enquanto fila nao vazia
		No* atual = fila[i++]; // retira da fila;
		printf("%c, ", atual->chave);
		if(atual->esquerda) fila[j++] = atual->esquerda; // adiciona esq. na fila
		if(atual->direita) fila[j++] = atual->direita; // adiciona dir. na fila
	}	
}	

