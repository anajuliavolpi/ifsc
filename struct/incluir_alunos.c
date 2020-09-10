#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> 
#include <string.h>

struct pessoa
{
	bool ativo;
	char nome[30], conceito_aluno;
	int idade;
	float media_aluno, maior_nota;
};

float media(float n1, float n2, float n3)
{	
	float media_final;
	media_final = (n1 + n2 + n3)/3;
	return media_final;

}

int maior(int n1, int n2)
{
	int maior;
	if(n1 > n2){
	    maior = n1;
	}
	else{
	    maior = n2;
	}
	return maior;

}

char conceito(float media)
{
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

void imprime_pessoa(struct pessoa um_aluno)
{
	printf ("\nNome: %s \nIdade: %d \nMedia: %.2f \nMaior Nota: %.2f \nConceito: %c\n", um_aluno.nome, um_aluno.idade, um_aluno.media_aluno, um_aluno.maior_nota, um_aluno.conceito_aluno);
}

struct pessoa busca_pessoa()
{
	struct pessoa o_aluno;
	char nome[30];
	int idade;
	float media_aluno, maior_nota, maior_n, nota1, nota2, nota3;
	char conceito_aluno;

	printf("Digite o nome do aluno: \n");
	scanf("%s", nome);
	printf("Digite a idade do aluno: \n");
	scanf("%d", &idade);
	printf("Digite a nota 1: \n");
	scanf("%f", &nota1);
	printf("Digite a nota 2: \n");
	scanf("%f", &nota2);
	printf("Digite a nota 3: \n");
	scanf("%f", &nota3);

	media_aluno = media(nota1, nota2, nota3);
	maior_n = maior(nota1, nota2);
	maior_nota = maior(maior_n, nota3);
	conceito_aluno = conceito(media_aluno);

	strcpy(o_aluno.nome, nome);
	o_aluno.ativo = true;
	o_aluno.idade = idade;
	o_aluno.media_aluno = media_aluno;
	o_aluno.maior_nota = maior_nota;
	o_aluno.conceito_aluno = conceito_aluno;

	return o_aluno;
}

int menu()
{
	int opcao;
	printf("\n0 - Sair do programa\n");
	printf("1 - Incluir alunos\n");
	printf("2 - Imprimir alunos\n");
	printf("\nOpção: ");
	scanf("%d", &opcao);
	return opcao;
}

int main()
{	
	struct pessoa alunos[3];
	struct pessoa um_aluno;
	int count, opcao;

	count = 0;
	opcao = 3;

	for (int i = 0; i < 3; ++i)
	{
		alunos[i].ativo = false;
	}

	do
	{
		opcao = menu();
		if (opcao == 1)
		{
			if (count < 3)
			{			
				for (int i = 0; i < 3; ++i)
				{
					if (alunos[i].ativo == true)
					{
						continue;
					}
					um_aluno = busca_pessoa();
					alunos[i] = um_aluno;
					count++;
					break;
				}
			}
			else
			{
				printf("\nLimite de alunos alcancado!\n");
			}
		} 
		else if (opcao == 2)
		{
			for (int i = 0; i < 3; ++i){
				if (alunos[i].ativo != true)
				{
					continue;
				}
				imprime_pessoa(alunos[i]);
			}
		}
		else if (opcao != 1 && opcao != 2 && opcao != 0)
		{
			printf("\nOpcao invalida!\n");
		}
	} while(opcao != 0);
	return 0;
}