#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pilha.h"

int main()
{
    Pilha* p = criar_pilha(10);

    push(p, 2);
    push(p, 4);
    push(p, 12);
    push(p, 15);


    while(tamanho(p) > 0){
        printf("pop: %d\n", pop(p));
    }

    destruir_pilha(p);
    return 0;
}
