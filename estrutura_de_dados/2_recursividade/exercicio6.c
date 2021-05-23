// 6. Dado um n ́umero n na base decimal, escreva uma fun ̧c ̃ao recursiva em C que converte(basta imprimir) este n ́umero para bin ́ario.

#include<stdio.h>
#include <stdlib.h>

void decimalBinario(int decimal);

int main (void){   

    int decimal;
    printf("Digite um numero inteiro: \n");
    scanf("%d", &decimal);
    printf("Resultado: ");
    decimalBinario(decimal);
     printf("\n");

    return 0;
}

void decimalBinario(int decimal){

    int n;
    if (decimal/2 != 0)
    {
        n = decimal/2;
        decimalBinario(n);
        printf("%d", decimal%2);
    } else{
        printf("%d",decimal%2);
    }
}