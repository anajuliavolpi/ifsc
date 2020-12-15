package string;

public class Main {
	
	public static void verificar(int n,boolean boo) {
		
		System.out.print("Questao "+ n +" - ");
		if(boo)
			System.out.println("OK");
		else
			System.out.println("ERRO");		
	}
	
	public static void main(String[] args) {

		verificar(1,MinhasFuncoes.rep("Hello", 3).equals("HelloHelloHello"));
		
		verificar(2,MinhasFuncoes.substituir("Hellllooooooo", 't', 'a').equals("Hellllooooooo"));
		
		verificar(3,MinhasFuncoes.substituir("Hellllooooooo", 'e', 'a').equals("Hallllooooooo"));
			
		verificar(4,!MinhasFuncoes.contem("Hellllooooooo", 'a'));
		
		verificar(5,MinhasFuncoes.contem("Hellllooooooo", 'e'));
		
		verificar(6,!MinhasFuncoes.contem("Hellllooooooo", 'E'));
		
		verificar(7, MinhasFuncoes.contem("Hellllooooooo", "lo"));
		
		verificar(8,!MinhasFuncoes.contem("Hellllooooooo", "000"));
		
		verificar(9,MinhasFuncoes.contem("Hellllooooooo", "ooooooo"));
		
		verificar(10,!MinhasFuncoes.contem("Hellllooooooo", "oooooooo"));
		
		verificar(11,MinhasFuncoes.contador("Hellllooooooo", 't')==0);
		
		verificar(12,MinhasFuncoes.contador("Hellllooooooo", 'e')==1);
		
		verificar(13,MinhasFuncoes.contador("Hellllooooooo", 'l') == 4);
		
		verificar(14,MinhasFuncoes.contador(MinhasFuncoes.rep("Hello", 3), "Hello") == 3);
		
		verificar(15,MinhasFuncoes.contador(MinhasFuncoes.rep("Hello", 4), "Hello") == 4);
		
		verificar(16,MinhasFuncoes.subString("Helloworld", 3, 7).equals("lowo"));
		
		String palavras[] = {"joAO", "joSe", "maRia", "antOnIo", "anDRe", "LuIs"};	
		
		verificar(17,MinhasFuncoes.concatenar(palavras).equals("Joao Jose Maria Antonio Andre Luis "));
		
		verificar(18,MinhasFuncoes.concatenar(palavras,'-').equals("Joao-Jose-Maria-Antonio-Andre-Luis-"));
		
		verificar(19,MinhasFuncoes.primeiraLetraMaiuscula("maria").equals("Maria "));
		
		verificar(20,MinhasFuncoes.primeiraLetraMaiuscula("antOnIo luIs").equals("Antonio Luis "));	

	}
}
