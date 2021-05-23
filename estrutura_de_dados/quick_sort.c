#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void imprime(int* vetor, int tamanho){
    int i;
    for(i = 0; i < tamanho; i++){
        printf("%d ", vetor[i]);
    }
    printf("\n");
}

// 0 1 6 3 4 5 2 7 8
// p i->         <-j
// p   i->   <-j
// p     j i        para algoritmo


void quick_sort(int* vetor, int inicial, int final ){
    
    if(inicial < final){
        int pivo = vetor[inicial];
        printf("Pivo %d\n", pivo);
        int i = inicial + 1;
        int j = final;
        // 5 1 2 3 6 8 7
        // p i         j
        //       j i     (para)
        // 3 1 2 | 5 | 6 8 7
        while (i <= j) {
            while (vetor[i] < pivo) i++;
            while (vetor[j] > pivo) j--;
            // i (esquerda) -> elemento maior
            // j (direita)  -> elemento menor
            if (i <= j){
               int aux = vetor[i];
               vetor[i] = vetor[j];
               vetor[j] = aux;
               i++;
               j--;
            }
        }
        // 5 1 2 3 6 8 7
        // 3 1 2 5 6 8 7
        if(pivo > vetor[j]){
            vetor[inicial/*pivo*/] = vetor[j];
            vetor[j] = pivo;
        }
        imprime(vetor, 7);
        // 3 1 2 | 5 (j) | 6 8 7
        // [inicial, j-1] 5 [j+1, final]
        quick_sort(vetor, inicial, j-1);    
        quick_sort(vetor, j+1, final);
    }
}


int main(){
    // int dados[] = {2, 1, 10, 3, 8, 4, 5};
    int dados[] = {56, 29, 35, 42, 15, 41, 75, 21};
    // 56   29   35   42                                                15   41   75   21

    int aux[8];
    int tamanho = 8;
    imprime(dados, tamanho);
    quick_sort(dados, 0, tamanho-1);
    imprime(dados, tamanho);
}
 
