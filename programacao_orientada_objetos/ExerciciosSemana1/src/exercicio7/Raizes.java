package exercicio7;
import java.util.Scanner;

public class Raizes {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner pedirValor = new Scanner(System.in);
        double delta = 0;
        double raizDelta = 0;
        double x1 = 0;
        double x2 = 0;        
        
        System.out.println("Digite o valor de A:");
        a = pedirValor.nextInt();
        
        System.out.println("Digite o valor de B:");
        b = pedirValor.nextInt();
        
        System.out.println("Digite o valor de C:");
        c = pedirValor.nextInt();
        
        double elevado = Math.pow(b, 2);
        
       delta = (Math.pow(b, 2)) - 4 * a * c;
       
       if(delta > 0) {
           raizDelta = Math.sqrt(delta);
           x1 = (- b + raizDelta) /(2 * a);
           x2 = (- b - raizDelta) /(2 * a);
           
           System.out.println("Raiz 1: " + x1);
           System.out.println("Raiz 2: " + x2);
       }
    
    
       if(delta == 0) {
    	   x1 = - b /(2 * a);
    	   System.out.println("Raiz 1: " + x1);        
       }
    
       if(delta < 0) {
    	   System.out.println("Equação sem raíz nos reais");
       }
    }
}


