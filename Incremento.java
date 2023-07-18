// Código para incrementar e decrementar números nas variáveis em java.


import java.util.Scanner;

public class Incremento
{
	public static void main(String[] args) {
		int num = 10;
		int result = 0;
		
	    System.out.println("Primeiro atribui, depois incrementa:");
	    System.out.println("Valor original: " + result);
	    
	    result = num++; // Primeiro atribui, depois incrementa
	    System.out.println("Valor de num após o incremento: " + num);
	    System.out.println("Valor de result após o incremento: " + result);
	    
	    num = 10; result = 0;
	    
	    System.out.println("Primeiro incrementa, depois atribui: ");
	    result = ++num; // Primeiro incrementa, depois atribui
	    System.out.println("Valor de num após o incremento: " + num);
	    System.out.println("Valor de result após o incremento: " + result);
	   
	   // lembrando que para decrementar é a mesma lógica, porém com o sinal de negativo "--".
	    
		
		
	}
}
