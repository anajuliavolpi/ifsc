#ifndef PILHA_H_INCLUDED
#define PILHA_H_INCLUDED

typedef struct No{
    struct No* prox;
    int dado;
} No;

typedef struct Pilha{
    No* topo;
}Pilha;

// cria uma pilha com tamanho definido
Pilha* criar_pilha();
// destroi a pilha
void destruir_pilha(Pilha* p);
// insere no topo da pilha
void push(Pilha* p, int x);
// remove do topo da pilha
int pop(Pilha* p);
// retorna o tamanho da pilha (numero de elementos inseridos)
int tamanho(Pilha* p);

#endif // PILHA_H_INCLUDED
