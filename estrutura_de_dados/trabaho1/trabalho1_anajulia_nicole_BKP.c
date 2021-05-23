// Trabalho 1
// Alunas: Ana Júlia Volpi e Nicole Bortoli

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h> //clock(), CLOCKS_PER_SEC e clock_t

void imprime(int* vetor, int tamanho, int status){
    int i;
    if (status == 0){ // status = 0:  vetor inicial
    	printf("\n-------- VETOR INICIAL --------\n");
    } else { // status = 1: vetor ordenado
    	printf("\n\n-------- VETOR ORDENADO --------\n");
    }
    for(i = 0; i < tamanho; i++){
        printf("%d ", vetor[i]);
    }
    printf("\n");
}

void verificacao(int* vetor, int tamanho){

	for (int i = 0; i < tamanho-1; i++){
		if (vetor[i] > vetor[i+1]){
			printf("\nERRO NA ORDENACAO!!!\n");
			i = tamanho+1;
		}
	}
}

void bubble_sort(int* vetor, int tamanho){

	int i, j;
	for (i = 0; i < tamanho-1; i++){
		for (j = 0; j < tamanho-i-1; j++){
			if (vetor[j] > vetor[j+1]){
				int aux = vetor[j];
				vetor[j] = vetor[j+1];
				vetor[j+1] = aux;
			}
		}		
	}
	verificacao(vetor, tamanho);
}

void insertion_sort(int* vetor, int tamanho){

	int i, j;
	for (i = 1; i < tamanho; i++){
		int eleito = vetor[i]; // vai ser inserido
		for (j = i-1; j >= 0 && eleito < vetor[j]; j--){
			vetor[j+1] = vetor[j];
		}
		vetor[j+1] = eleito;
	}
	verificacao(vetor, tamanho);
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

void merge_sort(int* vetor, int* auxiliar, int inicial, int final ){
   
    // pelo menos dois elementos
    if(inicial < final){
        //fase da divisao
        //0                        9
        //5 1 3 10 6 --- 7 11 15 2 4
        int meio = (inicial+final)/2;
        merge_sort(vetor, auxiliar, inicial, meio);  //5 1 3 10 6
        merge_sort(vetor, auxiliar, meio+1, final); // 7 11 15 2 4
        
        //a) 1 3 5 6 10    ---  b) 2 4 7 11 15
        //0                   9
        //1 2 3 4 5 6 7 10 11 15 -> aux
        //fase da conquista
        int esquerda = inicial;
        int direita = meio + 1;
        int posicao_final = inicial;
        
        // enquanto tiver elementos em a e b
        while ((esquerda <= meio)/*a*/ && (direita <= final) /*b*/) {
            if(vetor[esquerda] <= vetor[direita]){
                auxiliar[posicao_final++] = vetor[esquerda++];
            } else {
                auxiliar[posicao_final++] = vetor[direita++];
            }
        }
        // se sobrou em a
        while ((esquerda <= meio)) {
            auxiliar[posicao_final++] = vetor[esquerda++];
        }
        // se sobrou em b
        while ((direita <= final)) {
            auxiliar[posicao_final++] = vetor[direita++];
        }
        // transferindo de volta do auxiliar para o vetor
        while (inicial <= final) {
            vetor[inicial] = auxiliar[inicial];
            inicial++;
        }
    } 
}

int main(){
	
	clock_t t_bubble, t_insertion, t_merge, t_quick; //variável para armazenar tempo
	int *vetor1, *vetor2, *vetor3, *vetor4, *aux;
	int qtd_numeros_ordenados;

	printf("Digite a quantidade de números a serem ordenados: ");
	scanf("%d", &qtd_numeros_ordenados);

	vetor1 = malloc (qtd_numeros_ordenados * sizeof(int));
	vetor2 = malloc (qtd_numeros_ordenados * sizeof(int));
	vetor3 = malloc (qtd_numeros_ordenados * sizeof(int));
	vetor4 = malloc (qtd_numeros_ordenados * sizeof(int));
	aux = malloc (qtd_numeros_ordenados * sizeof(int));

	srand(time(0));
	for (int i = 0; i < qtd_numeros_ordenados; i++){
		vetor1[i] = rand() % 1000;
		vetor2[i] = vetor1[i];
		vetor3[i] = vetor1[i];
		vetor4[i] = vetor1[i];
	}

	// QUICK SORT
	t_quick = clock(); //armazena tempo	
 	quick_sort(vetor1, 0, qtd_numeros_ordenados-1);
	t_quick = clock() - t_quick; //tempo final - tempo inicial
	verificacao(vetor1, qtd_numeros_ordenados);
	
	// MERGE SORT
	t_merge = clock(); 
	merge_sort(vetor2, aux, 0, qtd_numeros_ordenados-1);
	t_merge = clock() - t_merge;
	verificacao(vetor2, qtd_numeros_ordenados);

	// INSERTION SORT
	t_insertion = clock(); 
	insertion_sort(vetor3, qtd_numeros_ordenados);
	t_insertion = clock() - t_insertion;

	// BUBBLE SORT
	t_bubble = clock(); 
	bubble_sort(vetor4, qtd_numeros_ordenados);
	t_bubble = clock() - t_bubble;
	
	printf("\nResultado da ordenação de %d números:\n", qtd_numeros_ordenados); 
	printf("\n1 – Quick sort (%.3f milissegundos)\n", ((double)t_quick)/((CLOCKS_PER_SEC/1000))); //conversão para double
	printf("2 – Merge sort (%.3f milissegundos)\n", ((double)t_merge)/((CLOCKS_PER_SEC/1000)));
	printf("3 – Insertion sort (%.3f milissegundos)\n", ((double)t_insertion)/((CLOCKS_PER_SEC/1000)));
	printf("4 – Bubble sort (%.3f milissegundos)\n\n", ((double)t_bubble)/((CLOCKS_PER_SEC/1000)));

	free(vetor1);
	free(vetor2);
	free(vetor3);
	free(vetor4);
	free(aux);

}