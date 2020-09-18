/*
Utilize a Atividade avaliativa que você desenvolveu no “Roteiro alocação de memória”
(um programa que aloca estruturas de alunos dinamicamente e cadastra as notas de
diversos alunos).
Sua tarefa é utilizar esse mesmo programa e implementar:
• Ao final do programa, gravar os dados de todos os alunos em arquivo (seja em
modo texto ou binário)
• Criar uma opção para ler os dados gravados no arquivo e imprimí-los na tela.
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
	printf("2 - Ler dados dos alunos\n");
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

void lerArquivo(){

	FILE* arq;
	char leitura[1024];

	arq = fopen("alunos.txt", "r");
	
	if (arq == NULL){
		printf("Erro ao abrir o arquivo\n");
		return;
	}

	printf("\nDados dos alunos:\n");

	while(feof(arq) == 0){
		fgets(leitura, sizeof(leitura), arq);
		printf("%s",leitura);
		memset(leitura, 0, sizeof(leitura));
	}
	
	fclose (arq);
}

int escreverArquivo(struct aluno *o_aluno){

	int retorno = 0;
	char informacao[100];
	FILE* arq;
	char matriculaString[10], notaString[10];

	arq = fopen("alunos.txt", "a+");

	if (arq == NULL){
		printf("Erro ao abrir o arquivo\n");
		return(-1);
	}

	sprintf(matriculaString, "%d", o_aluno->matricula);
	sprintf(notaString, "%d", o_aluno->nota);

	retorno = fputs("matricula: ", arq);
	retorno = fputs(matriculaString, arq);	
	retorno = fputs(" - nota: ", arq);
	retorno = fputs(notaString, arq);
	retorno = fputs("\n", arq);

	if (retorno == 0)
	{
		printf("Erro ao gravar no arquivo\n");
		return (-1);
	}

	fclose (arq);

	return 0;
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

			escreverArquivo(&o_aluno);

		} else if (opcao == 2)
		{
			lerArquivo();
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