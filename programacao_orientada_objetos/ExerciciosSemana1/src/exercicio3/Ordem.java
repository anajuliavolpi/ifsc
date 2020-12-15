package exercicio3;
import java.util.Scanner;

public class Ordem {

		public static void main(String[] args) {
			
	       int [] numeros = new int[4];
	       boolean ordenacao;
	       int aux = 0;
	       int ehzero = 0;
	       Scanner pedirNumero = new Scanner(System.in);
	       
	       System.out.println("Digite quatro números: ");
	       for(int i = 0; i < 4; i++) {
	    	   numeros[i] = pedirNumero.nextInt();
	       }	       
	       if(numeros[3] == 0) {
	    	   ehzero = 1;
		   }
	       if(ehzero == 1) {
	    	   for(int i = 0; i < 4; i++) {
	    		   for(int j = 0; j < 3; j++) {
	    			   if(numeros[j] > numeros[j+1]) {
		                    aux = numeros[j];
		                    numeros[j] = numeros[j+1];
		                    numeros[j+1] = aux;
	    			   }
	    		   }
	    	   }	     
    		   System.out.println("Ordem crescente:");
	    	   for(int i = 0; i < 4; i++) {
	    		   System.out.println(numeros[i]);
	    	   }
	       } 
		
	       if(ehzero == 0) {
	    	   for(int i = 0; i < 4; i++) {
	    		   for(int j = 0; j < 3; j++) {
	    			   if(numeros[j] < numeros[j+1]) {
		                    aux = numeros[j];
		                    numeros[j] = numeros[j+1];
		                    numeros[j+1] = aux;
		                }
		            }
		       }
    		   System.out.println("Ordem decrescente:");
	    	   for(int i = 0; i < 4; i++) {
	    		   System.out.println(numeros[i]);
	    	   }
	       	}
		}
}


