#include <stdio.h>
#include <stdlib.h>
#include<time.h>

int numRandom(){
	int numRand=0;
	srand(time(NULL));
	numRand = 1 + (rand() % 10);
	return numRand;
}

int dicas(int numRand, int numUser){
	if (numUser == numRand || numUser == 0)
	{
		return 0;
	} 
	else if (numUser < numRand)
	{
		return 1;
	}
	else
	{
		return 2;
	}
}

int digite_numero(){
	int numero;
	printf("Digite um número: \n");
	scanf("%d", &numero);
	return numero;
}

int main(){
	int numUser, numRand, continuar, count;
	count = 0;
	continuar = 0;
	printf("Se desejar sair, digite 0 (zero)\n");
	numRand = numRandom();
	// printf("RAND: %d\n", numRand);
	do{
		numUser = digite_numero();
		continuar = dicas(numRand, numUser);

		if (continuar == 1)
		{
			printf("O número sorteado é MAIOR\n");
		} 
		else if (continuar == 2)
		{
			printf("O número sorteado é MENOR\n");
		}
		count = count + 1;
	}while(continuar != 0 && numUser != 0);
	if (numUser == 0)
	{
		printf("Obrigada por jogar!\n");
	}
	else
	{
		printf("Você acertou!\n");
		printf("Número de tentativas: %d\n", count);
	}
	return 0;
}