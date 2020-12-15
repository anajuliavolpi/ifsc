package matriz;

public class Main{

   public static void main( String args[] ){
	   
      int notas[][] = { { 8, 9, 7 }, { 6, 8, 9 },{ 9, 10, 9 },
    		   { 10, 8, 8 }, { 8, 6, 8 }};
      
      Turma ads3 = new Turma("ADS3-POO", notas );
      
      ads3.imprimirNotas(notas);
      
      System.out.println("Média da Turma: " + ads3.mediaTurma(notas));
      System.out.println("Maior Nota: " + ads3.maiorNota(notas));
      System.out.println("Menor Nota: "+ ads3.menorNota(notas));
 
   } 
}
//SAÍDA ESPERADA
//Notas da Turma ADS3-POO
//P1   P2   P3   Média
// 8    9    7   8.00
// 6    8    9   7.67
// 9   10    9   9.33
//10    8    8   8.67
// 8    6    8   7.33
//Média da Turma: 8.2
//Maior Nota: 10
//Menor Nota: 6
