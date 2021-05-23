#include <stdlib.h>
#include <stdio.h>

int busca_binaria_recursiva(int* vetor, int inicio, int fim, int numerobuscado){
    int i = (inicio + fim) / 2;

    if (inicio > fim) {
        return -1;
    }

    if (vetor[i] == numerobuscado) {
        return i;
    }

    if (vetor[i] < numerobuscado) {
        return busca_binaria_recursiva(vetor, i + 1, fim, numerobuscado);

    } else {  // vetor[i] > numerobuscado
        return busca_binaria_recursiva(vetor, inicio, i - 1, numerobuscado);
    }
}

void quick_sort(int* vetor, int inicial, int final ){
    
    if(inicial < final){
        int pivo = vetor[inicial];
        int i = inicial + 1;
        int j = final;
        while (i <= j) {
            while (vetor[i] < pivo) i++;
            while (vetor[j] > pivo) j--;
            if (i <= j){
               int aux = vetor[i];
               vetor[i] = vetor[j];
               vetor[j] = aux;
               i++;
               j--;
            }
        }
        
        if(pivo > vetor[j]){
            vetor[inicial/*pivo*/] = vetor[j];
            vetor[j] = pivo;
        }
        
        quick_sort(vetor, inicial, j-1);    
        quick_sort(vetor, j+1, final);
    }
}


int main (int argc, char* argv[]){

    int numerobuscado;

    int vetor[] = {300, 2270, 9350, 5860, 3220, 650, 6720,8620, 990, 
    4520, 8780, 420, 1000, 2400, 9930, 540,5160, 6300, 140, 
    6890, 8240, 2050, 70, 9900,  9630,2280, 6000, 8840, 4130, 
    1350, 7440, 150, 3340, 3670,4550, 70, 7730,  9820, 4110,
    5590, 4030, 5420, 4960,7130, 2620, 5950, 5020, 4680, 7460,
    3290, 1010, 9560, 2670, 4460, 1210, 8140, 2790, 1030, 
    650, 1330, 5890, 8120, 3380,  5080, 2750, 50, 3440, 9750, 6510, 
    280, 4980, 3180, 9050,  800, 2450, 9720, 4780, 2510, 8320,6800, 
    2040, 1800, 7330, 8300, 6790, 1190, 3520, 780,3560,  5710, 3150, 
    3950, 9600, 910, 6460, 1030, 8200, 9000, 660, 7820};

    int tamanhovetor = sizeof(vetor)/sizeof(vetor[0]);

    quick_sort(vetor, 0, tamanhovetor-1);
    
    printf("Digite o numero a ser buscado: ");
    scanf("%d", &numerobuscado);

    if (busca_binaria_recursiva(vetor, 0, tamanhovetor - 1, numerobuscado) != -1){
        printf("O numero %d foi encontrado na posicao %d\n", numerobuscado, busca_binaria_recursiva(vetor, 0, tamanhovetor - 1, numerobuscado));
    } else{
        printf("O numero buscado nao existe no vetor\n");
    }
}