import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 32;
		int b = 30;
		int value = a + b;
		System.out.println(value);
		System.out.println(a - b);
		
		
		double c = 10.35784;
		System.out.println("Sem o Locale");
		System.out.println(c);
		System.out.printf("%.2f%n",c);
		System.out.printf("%.4f%n",c);
		System.out.println("Com o Locale");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",c);
		
		System.out.println("Resultado = " + c + " metros");
		
		System.out.printf("Resultado = %.2f metros%n", c);
		
		
		
		
		
		String nome = "Vitor";
		int idade = 20;
		double renda = 4300.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
