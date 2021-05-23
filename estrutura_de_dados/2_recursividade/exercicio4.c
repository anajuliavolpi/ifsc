// 4. Escreva uma fun ̧c ̃ao recursiva que some os elementos em um vetor de inteiros.

#include<stdio.h>
#include <stdlib.h>

int soma (int vet [], int vet_tamanho){
   if(1 == vet_tamanho){
   		return vet [0];
   	} else{
   		return vet [vet_tamanho-1]+soma(vet, vet_tamanho-1);
	}   
}

int main (void){   

	int vet[10]={0}; 
    int resultado;
  
    for(int i = 0; i < 10; i++)
    {       
    	printf ("Informe um número: ");
        scanf ("%d",&vet[i]);
    }

    resultado = soma(vet,10);
      printf ("Soma dos 10 números é %d \n", resultado);;
 
    return 0;
}