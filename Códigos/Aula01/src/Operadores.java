
public class Operadores {

	public static void main(String[] args) {
		
		//adi��o, subtra��o, multiplica��o e divis�o
		float saldo = 0;
		
		saldo = saldo + 1000;
		System.out.println("Seu saldo atual �: " + saldo);
		
		saldo += 500;
		saldo++;
		
		saldo = saldo - 200;
		
		//saldo = saldo * 100;
		saldo *= 100;
		
		saldo = saldo/2;
		
		
		//resto
		//verificar se um n�mero � par
		int num = 14;
		boolean ehPar = num % 2 == 0;
		System.out.println("O valor " + num + " � par? " + ehPar);
		
		//operadores relacionais
		// > >= < <= != == 	|| 	&&
		//resultado de um operador relacional � sempre VERDADEIRO OU FALSO
		
		boolean testeCondicional = 5 > 2; //true
		testeCondicional = 3 == 4; //false
		
		//operador tern�rio
		int idade = 20;
		String msg = idade >= 18 ?  "Voc� pode passar" : "Sinto muito, vc � menor de idade";
		
	}

}
