package exercicio1;

public class Ponto {
	
	int x, y;

	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;	
	}

	public Ponto() {
		// TODO Auto-generated constructor stub
	}

	public void setX(int x) {
		this.x = x;		
	}

	public void setY(int y) {
		this.y = y;		
	}

	public int norma() {		
		int norma = (int) Math.sqrt((Math.pow(x,2) + Math.pow(y, 2)));
		return norma;
	}

	public int distancia(Ponto ponto2) {		
		int distancia =  (int) Math.sqrt(Math.pow((ponto2.x - x), 2) + (Math.pow((ponto2.y - y), 2)));
		return distancia;
	}

	public static int distancia(Ponto ponto1, Ponto ponto2) {
		int distancia =  (int) Math.sqrt(Math.pow((ponto2.x - ponto1.x), 2) + (Math.pow((ponto2.y - ponto1.y), 2)));
		return distancia;
	}
}
