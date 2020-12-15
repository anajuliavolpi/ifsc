package exercicio1;
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
    	
        float [] nota = new float[4];
        float soma = 0;
        float media = 0;
        Scanner pedirNota = new Scanner(System.in);
    
        System.out.println("Digite quatro notas: ");
        for (int i = 0; i < 4; i++) {
         nota[i] = pedirNota.nextInt();    
        }        
        for(int i = 0; i < 4; i++) {
          soma += nota[i];
        }
        media = soma/4;
        System.out.println("Media: "+media);
    }

}
