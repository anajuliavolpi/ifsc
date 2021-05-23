#include <stdlib.h>
#include "lista.h"


Lista* criar_lista(int tamanho){
	Lista* l = malloc(sizeof(Lista));
	l->elementos = malloc(sizeof(No)*tamanho);
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
    return NULL;
}

//Implementar
No* inserir(Lista* l, int x){
    return NULL;
}

//Implementar
void remover(Lista* l, int x){

}

//Implementar
No* primeiro(Lista* l){
    return NULL;
}

//Implementar
No* ultimo(Lista* l){
    return NULL;
}

//Implementar
int buscar_indice(Lista* l, int i){
    return -1;
}
