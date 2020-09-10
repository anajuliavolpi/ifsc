#include <stdio.h>
#include <string.h>

int main(){

	int numero, tamanho;
	char numerosString[];

	printf("Digite um número: \n");
	scanf("%d", &numero);

	sprintf(numerosString, "%d", numero);

	tamanho = strlen(numero);
	
	for (int i = 0; i < tamanho; ++i)
	{
		switch(numero[i]){

			case 0:
				numerosString = numerosString + "zero, "
			case 1:
				numerosString = numerosString + "um, "
			case 2:
				numerosString = numerosString + "dois, "
			case 3:
				numerosString = numerosString + "tres, "
			case 4:
				numerosString = numerosString + "quatro, "
			case 5:
				numerosString = numerosString + "cinco, "
			case 6:
				numerosString = numerosString + "seis, "
			case 7:
				numerosString = numerosString + "sete, "
			case 8:
				numerosString = numerosString + "oito, "
			case 9:
				numerosString = numerosString + "nove, "
		}
	}


	printf("%s\n",numerosString );

	return 0;
}


