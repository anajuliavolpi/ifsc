/*
Criar um programa em linguagem C, do tipo console, para cadastrar as notas dos alunos
de uma turma do curso ADS. Ao final, calcular e imprimir a nota média da turma, mostrando o total de alunos, a maior
e a menor nota.
*/

#include <stdio.h>
#include <stdlib.h>

struct aluno
{
	int matricula;
	int nota;
};

int menu()
{
	int opcao;	
	printf("\n0 - Encerrar o programa\n");
	printf("1 - Inserir aluno\n");
	printf("\nOpção: ");
	scanf("%d", &opcao);
	return opcao;
}

int calcMedia(struct aluno *alunos, int count){

	int soma = 0;
	int media;

	for (int i = 1; i <= count; i++)
	{	
		soma = soma + alunos[i].nota;
	}
	media = soma/count;
	return media;
}

int main()
{
	int opcao, count=0, matricula, nota;
	int media;
	struct aluno *alunos = (struct aluno*) malloc(sizeof(struct aluno));
	struct aluno *alunosBKP = (struct aluno*) malloc(sizeof(struct aluno));

	do{
		opcao = menu();

		if (opcao == 1)
		{

			alunosBKP = realloc(alunos, ++count * sizeof(struct aluno));
			if (alunosBKP != NULL)
			{
				alunos = alunosBKP;
			}

			struct aluno o_aluno;

			printf("Digite a matricula do aluno: ");
			scanf("%d", &matricula);
			printf("Digite a nota do aluno: ");
			scanf("%d", &nota);
			
			o_aluno.matricula = matricula;
			o_aluno.nota = nota;

			alunos[count] = o_aluno;

		} 
		else if (opcao != 0 && opcao != 1)
		{
			printf("\nOpcao Invalida!\n");
		}

	} while(opcao != 0);

	media = calcMedia(alunos, count);
	printf("\nMedia da turma: %d\n", media);

	free(alunos);
	free(alunosBKP);

	return 0;
}