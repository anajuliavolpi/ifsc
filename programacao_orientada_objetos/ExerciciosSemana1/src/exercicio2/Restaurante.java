package exercicio2;
import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args) {
    	
    	float valor = 0;
        Scanner pedirValor = new Scanner(System.in);
        float novoValor;
        System.out.println("Valor total da conta: ");
        valor = pedirValor.nextFloat();
        novoValor = (valor + (valor/100)*10);        
        System.out.println("Valor com gorjeta: " + novoValor);
    }

}
