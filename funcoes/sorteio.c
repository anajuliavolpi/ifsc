#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int sorteio(){
	int numRand=0;
	srand(time(NULL));
	numRand = 1 + (rand() % 10);
	return numRand;
}

int main(){

	int num_sorteado, i, n[10];
	i = 0;

	for (int i = 0; i < 10; ++i)
	{
		n[i] = 0;
	}

	num_sorteado = sorteio();

	do{

		num_sorteado = sorteio();
		n[num_sorteado-1]++;
		i++;

	} while (i < 100);

	for (int i = 1; i <= 10; ++i)
	{
		printf("Numero %d foi sorteado %d vezes\n", i, n[i-1]);
	}

	return 0;
}