#include <stdlib.h>
#include <stdio.h>
#include "lista.h"



int main (int argc, char* argv[]){

	Lista* l = criar_lista();

	inserir(l, 10); //0
	inserir(l, 9); // 1
    inserir(l, 8); // 2
    inserir(l, 7);
    inserir(l, 6);
    inserir(l, 5);
    inserir(l, 4);
    inserir(l, 7);



    printf("Tamanho da lista: %d\n", tamanho(l));


	printf("Primeiro elemento: %d\n", primeiro(l)->chave);

	printf("Ultimo elemento: %d\n", ultimo(l)->chave);

	printf("Existem %d elementos na lista\n", tamanho(l));

    remover(l, 8);

    printf("Existem agora %d elementos na lista\n", tamanho(l));

    printf("Segundo elemento: %d\n", buscar_por_indice(l, 2)->chave);
	destruir_lista(l);

	return 0;
}
