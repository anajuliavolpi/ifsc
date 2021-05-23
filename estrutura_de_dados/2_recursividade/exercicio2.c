//Escreva uma fun ̧c ̃ao recursiva que calcule a multiplica ̧c ̃ao de dois n ́umeros naturais,atrav ́es de incrementos sucessivos.

#include <stdio.h>
#include <stdlib.h>

int multiplicacao(int n1, int n2){
    
    if( n2 == 1){
        return n1;
    } else{
        return n1 + multiplicacao(n1, --n2);
    }
}

int main(){

    int n1, n2, resultado; 
    printf("Digite n1: ");
    scanf("%d", &n1);
    printf("Digite n2: ");
    scanf("%d", &n2);

    resultado = multiplicacao(n1, n2);
    printf("%d x %d = %d\n",n1, n2, resultado);

    return 0;

}