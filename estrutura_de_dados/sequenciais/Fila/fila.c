#include <stdlib.h>
#include "fila.h"

//Pronto
Fila* criar_fila(int tamanho){
    Fila* f = malloc(sizeof(Fila));
    f->dados = malloc(sizeof(int)*tamanho);
    f->M = tamanho;
    f->f = -1;
    f->r = -1;
    f->tamanho = 0;
    return f;
}

//Pronto
void destruir_fila(Fila* f){
    free(f->dados);
    free(f);
}

//Implementar
void inserir(Fila* f, int x){

}

//Implementar
int remover(Fila* fi){
    return 0;
}

//Implementar
int tamanho(Fila* f){
    return 0;
}
