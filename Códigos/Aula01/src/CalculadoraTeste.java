import java.util.Scanner; //adiciona a classe Scanner do pacote java.util

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		//declara��o
		Calculadora calc;
		
		//inicializa��o
		calc = new Calculadora();
		
		//ctrl + shift + O => adiciona as importa��es
		Scanner in = new Scanner(System.in);
		
		//syso e a�... ctrl + barra de espa�o
		System.out.println("Informe dois valores");
		//double num1, num2;
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		
		System.out.println("Resultado somar: " + calc.somar(num1, num2));
		System.out.println("Resultado resto: " + calc.resto(num1, num2));
		System.out.println("Resultado potencia: " + calc.potencia(num1, num2));
		
	}

}
