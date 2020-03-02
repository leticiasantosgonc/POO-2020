import java.util.Iterator;

public class SintaxeBasica {

	public static void main(String[] args) {
		
		//coment�rio de linha
		
		/* 
		coment�rio de bloco
		 */

		//texto
		String nome = "Vinicius";
		char letra = 'A';
		
		int idade = 28;
		
		//float tem um f no final da declara��o
		//6 casas depois da v�rgula
		float peso = 79.5f; 
		
		//muitas casas depois da v�rgula
		double duplaPrecisao = 79.5;
		
		short valoresPequenos; 
		
		byte valoresMenoresAinda;
		
		boolean vouf = true;
		
		long valoresIntGrandes = 12346142755235L;
		
		//final => constante
		final long SEC_IN_NANOS = 1_000_000_000L;
		
		//declara��o de vari�vel do tipo String
		String texto;
		String textoPreAlocado = new String();
		String textoComValor = "Teste";
		
		//manipulando Strings
		String inicio = "Hello ";
		String fim = "World!!!";
		
		String juntas = inicio + fim;
		System.out.print("A string ficou: " + juntas + "\n");
		System.out.println("String com quebra no final");
		System.out.printf("\n\tOi, eu sou o %s e tenho %d anos\n\n", nome, idade);
		
	}

}
