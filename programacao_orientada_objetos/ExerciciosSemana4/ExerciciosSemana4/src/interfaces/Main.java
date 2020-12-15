package interfaces;


//Na Pilha Fixa usar Array
//Na Pilha Dinamica usar ArrayList
public class Main {
	public static void main(String args[]) {
	
		Pilha pilha;		
		
		System.out.println("Pilha Fixa:");		
		pilha = new PilhaFixa(10);
		
		for(int i=0; i<10; i++) 
			pilha.push(i*i);
		
		for(int i=0; i<10; i++) 
			System.out.println(pilha.pop());

		System.out.println("Pilha 2:");
		pilha = new PilhaDinamica();
		
		for(int i=0; i<15; i++) 
			pilha.push(i+1);
		
		for(int i=0; i<15; i++) 
			System.out.println(pilha.pop());   



	}
}
//SAIDA ESPERADA
//Pilha Fixa:
//81
//64
//49
//36
//25
//16
//9
//4
//1
//0
//Pilha 2:
//15
//14
//13
//12
//11
//10
//9
//8
//7
//6
//5
//4
//3
//2
//1
