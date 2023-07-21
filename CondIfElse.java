// Algoritmo que faz comparação de preços de livros como exemplo para a condicional if else, em Java.

import java.util.Scanner;

public class CondIfElse
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		    double livroLinux;
		    double livroJava;
		    
		    System.out.println("Entre com o preço do livro de Linux: ");
		    livroLinux = entrada.nextDouble();
		    System.out.println("Entre com o preço do livro de Java: ");
		    livroJava = entrada.nextDouble();
		    
		    double total = livroLinux + livroJava;
		    System.out.println("O preço total é " + total);
		    
		    if (livroLinux == 10) {
		        System.out.println("Livro de linux quase de graça!\n");
		    }
		    
		    if (total <= 120.00) {
		        System.out.println("O preço está bom!");
		    }
		    
		    else {
		        System.out.println("Livros muitos caros!");
		    }
		    
		    if (livroLinux < livroJava) {
		        System.out.println("Livro de linux mais barato.");
		    }
		    
		    else if (livroLinux > livroJava) {
		        System.out.println("Livro de Java mais barato.");
		    }
		    
		    else {
		        System.out.println("Livros com o mesmo preço.");
		    }
		
		
	}
}
