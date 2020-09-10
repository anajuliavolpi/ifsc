#include<stdio.h>
#include<stdlib.h>

float media(float n1, float n2, float n3){
	
	float media_final;
	media_final = (n1 + n2 + n3)/3;
	return media_final;

}

char conceito(float media){

    char conceito_aluno;

    if (media < 4.9)
    {
        conceito_aluno = 'D';
    } 
    else if (media < 6.9)
    {
        conceito_aluno = 'C';
    } 
    else if (media < 8.9)
    {
        conceito_aluno = 'B';
    }
    else {
        conceito_aluno = 'A';
    }

    return conceito_aluno;

}


int main(){
    
    float n1, n2, n3, media_final;
    int opcao;
    char conceito_aluno, nome[50];
    
    opcao = 1;

    do{
        printf("Digite o nome do aluno: \n");
        scanf("%s", nome);
        printf("Digite nota 1: \n");
        scanf("%f", &n1);
        printf("Digite nota 2: \n");
        scanf("%f", &n2);
        printf("Digite nota 3: \n");
        scanf("%f", &n3);

        media_final = media(n1, n2, n3);
        conceito_aluno = conceito(media_final);

        printf("Media da(o) %s: %.2f\n", nome, media_final);
        printf("Conceito: %c\n", conceito_aluno);
       
        printf("0 - Sair\n");
        printf("1 - Continuar\n");
        scanf("%d", &opcao);

    } while(opcao != 0);

    return 0;

}