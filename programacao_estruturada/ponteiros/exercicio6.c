/*
Criar uma Função de impressão do IMC que recebe o ponteiro do valor calculado do IMC e
imprime o resultado na tela
*/

#include <stdio.h>
#include <stdlib.h>

int menu()
{
	int opcao;	
	printf("\n0 - Encerrar o programa\n");
	printf("1 - Calcular IMC\n");
	printf("\nOpção: ");
	scanf("%d", &opcao);
	return opcao;
}

void calcularIMC(float *ponteiro_IMC){

	float peso, altura;

	printf("Digite o peso: ");
	scanf("%f", &peso);
	printf("Digite a altura: ");
	scanf("%f", &altura);

	*ponteiro_IMC = peso/(altura*altura);
}

void imprimirIMC(float *ponteiro_IMC){

	if (*ponteiro_IMC > 40)
	{
		printf("Obesidade grau 3\n");
	}
	else if (*ponteiro_IMC < 39.9 && *ponteiro_IMC > 35)
	{
		printf("Obesidade grau 2\n");
	}
	else if (*ponteiro_IMC < 34.9 && *ponteiro_IMC > 30)
	{
		printf("Obesidade grau 1\n");
	}
	else if (*ponteiro_IMC < 29.9 && *ponteiro_IMC > 25)
	{
		printf("Sobrepeso\n");
	}
	else if (*ponteiro_IMC < 24.9 && *ponteiro_IMC > 18.5)
	{
		printf("Peso normal\n");
	}
	else
	{
		printf("Abaixo do peso\n");
	}

}

int main()
{

	float imc, *ponteiro_IMC;
	int opcao;

	ponteiro_IMC = &imc;

	do{
		opcao = menu();

		if (opcao == 1)
		{

			calcularIMC(ponteiro_IMC);

			printf("\nVALOR DO IMC: %.2f\n", *ponteiro_IMC);

			imprimirIMC(ponteiro_IMC);

		} else if (opcao != 0 && opcao != 1)
		{
			printf("\nOpcao Invalida!\n");
		}

	} while(opcao != 0);

	return 0;
}