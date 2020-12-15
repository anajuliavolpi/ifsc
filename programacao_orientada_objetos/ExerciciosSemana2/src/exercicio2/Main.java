package exercicio2;

//Descricao dos metodos em aula.pdf
public class Main {
	
	public static void main(String arg[]) {

		if(Temperatura.converter(37, Temperatura.CelsiusToKelvin) == 310) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}

		if(Temperatura.converter(35, Temperatura.CelsiusToFahrenheit) == 95) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}

		if(Temperatura.converter(310, Temperatura.KelvinToCelsius) == 37) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}		

		if(Temperatura.converter(373, Temperatura.KelvinToFahrenheit) == 212) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}

		if(Temperatura.converter(203, Temperatura.FahrenheitToKelvin) == 368) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}

		if(Temperatura.converter(95, Temperatura.FahrenheitToCelsius) == 35) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}

	}
}
//SAIDA ESPERADA
//OK
//OK
//OK
//OK
//OK
//OK



