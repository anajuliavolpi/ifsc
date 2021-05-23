// 1. Faça um algoritmo que solicite o nome de uma pessoa, como saída, exiba a soma dasletras do nome (tabela ASCII)

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (void)
{
    char nome[50];
    int i, soma;
    printf("Digite seu nome: ");
    scanf("%s", nome);
    soma = 0;
    for(i = 0; i < strlen(nome); i++){
        soma += (int)nome[i];
    }

    printf("\nSoma: %d\n", soma);
    return 0;
}