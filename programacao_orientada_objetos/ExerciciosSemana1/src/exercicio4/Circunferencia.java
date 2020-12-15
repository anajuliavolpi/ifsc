package exercicio4;
import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
    	
       float raio = 0;
       Scanner pedirRaio = new Scanner(System.in);
       double area = 0;
       double comprimento = 0;
       System.out.println("Digite o raio: "); 
       raio = pedirRaio.nextFloat();       
       area = (Math.pow(raio,2)) *  Math.PI;
       System.out.println("Area: "+ area);       
       comprimento = 2 * Math.PI * raio;       
       System.out.println("Comprimento: "+ comprimento);
    }
}
