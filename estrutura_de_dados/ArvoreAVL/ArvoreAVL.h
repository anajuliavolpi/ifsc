#ifndef ARVOREAVL_H_INCLUDED
#define ARVOREAVL_H_INCLUDED

typedef struct No{
    int chave;
    struct No* esquerdo;
    struct No* direito;
    int peso;
} No;

typedef struct ArvoreAVL{
    No* raiz;
} ArvoreAVL;

ArvoreAVL* criar_arvore();
void destruir_arvore(ArvoreAVL* arvore);
int buscar(ArvoreAVL* arvore, int chave);
void inserir(ArvoreAVL* arvore, int chave);
void remover(ArvoreAVL* arvore, int chave);
int altura(ArvoreAVL* arvore);

#endif // ARVOREAVL_H_INCLUDED
