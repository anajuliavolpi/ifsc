#include<stdio.h>
#include<stdlib.h>

int maior(int n1, int n2){
	
	int maior;

	if(n1 > n2){
	    maior = n1;
	}
	else{
	    maior = n2;
	}

	return maior;

}

int main(){
    
    int n1, n2, n3, n4, maior1, maior2, maior3;

    printf("Digite n1: \n");
    scanf("%d", &n1);
    printf("Digite n2: \n");
    scanf("%d", &n2);
    printf("Digite n3: \n");
    scanf("%d", &n3);
    printf("Digite n4: \n");
    scanf("%d", &n4);

    maior1 = maior(n1, n2);
    maior2 = maior(n3, n4);
    maior3 = maior(maior1, maior2);

    printf("Maior: %d\n", maior3);

    return 0;

}