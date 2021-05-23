// 6. Dado um n ́umero n na base decimal, escreva uma fun ̧c ̃ao recursiva em C que converte(basta imprimir) este n ́umero para hexaadecimal.

#include<stdio.h>

void decimalHexa(int numero){
    int hexa=0;
    if(!numero)
        return;
    else {
        hexa=numero%16;
        decimalHexa(numero/16);
    }
    if(hexa>9)
        printf("%c",'A'+(hexa-10));
    else
        printf("%d",hexa);
    }

int main()
{
    int decimal=0;
    printf("Enter numero:");
    scanf("%d",&decimal);
    decimalHexa(decimal);
    printf("\n");
    return 0;
}