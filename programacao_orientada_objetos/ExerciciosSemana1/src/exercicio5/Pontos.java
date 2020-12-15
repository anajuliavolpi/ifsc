package exercicio5;
import java.util.Scanner;

public class Pontos {

    public static void main(String[] args) {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        Scanner pedirValor = new Scanner(System.in);
        double distancia = 0;
        int x = 0, y = 0;        
        System.out.println("Digite X1:");
        x1 = pedirValor.nextInt();        
        System.out.println("Digite Y1:");
        y1 = pedirValor.nextInt();
        System.out.println("Digite X2:");
        x2 = pedirValor.nextInt();
        System.out.println("Digite Y2:");
        y2 = pedirValor.nextInt();
        distancia = Math.sqrt(Math.pow((x2 - x1), 2) +  Math.pow((y2 - y1), 2));
        System.out.println("Distancia entre os pontos: " + distancia);
    }
}
