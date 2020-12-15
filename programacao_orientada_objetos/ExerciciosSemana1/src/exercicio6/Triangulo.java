package exercicio6;
import java.util.Scanner;

public class Triangulo {
    
    public static void main(String[] args) {

    	int x = 0, y = 0, z = 0;
    	Scanner pedirValor = new Scanner(System.in);
    
	     System.out.println("Digite x:");
	     x = pedirValor.nextInt();
	     
	     System.out.println("Digite y:");
	     y = pedirValor.nextInt();
	     
	     System.out.println("Digite z:");
	     z = pedirValor.nextInt();
	     
	     if((x > (y+z)) || (y > (x + z)) || (z > (x + y))) {
	       
	    	 System.out.println("Os valores não formam um triângulo"); 
	     
	     } else if ((x == y) && (x == z) && (y == z)) {
	    	
	    	 System.out.println("Triangulo Equilatero");
	    
	     } else if((x == y) || (x == z) || (y == z)) {
	    	 
	    	 System.out.println("Triangulo Isosceles"); 
	    
    	} else if((x != y)&& (x != z) && ( y != z)) {
	    	 System.out.println("Triangulo Escaleno");
	    }
    }
}
