// Algoritmo de Operador Condicional Ternário, em Java.

public class CondTernario
{
	public static void main(String[] args) {
		int a;
		String b;
		a = 12;
		
		b = (a == 5) ? "a é igual a 5" : "a é diferente de 5";
		System.out.println("Resultado : " + b );
		
		b = (a == 12 ) ? "a é igual a 12" : "a é diferente de 12";
		System.out.println("Resultado : " + b);
		
		a = 14;
  // Ou a = 23;
 //  Ou a = 10;
		b = (a > 14) ? "Atrasado" : (a < 14) ? "Adiantado" : "No horário";
		System.out.println("Resultado : " + b );
		
    // Valor utilizado paa avaliar expressões booleanas, para decidir qual valor deve ser atribuído a uma variável.
    // Substituto do "if else" em expressões simples.
	}
}
