// Programa que lê os dados fornecidos e os retorna organizadamente usando a liguagem de programação java e a lógica de progrmação

import java.util.Scanner;

public class LerDados
{
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		String str, str1, str2, str3, str4;
		System.out.println("Bem-vindo ao programa que ler dados digitados por você.\n");
		
		System.out.println("Entre com seu nome:");
		str = texto.nextLine();
		System.out.println("\nBem-vindo " + str);
		
		System.out.println("\nDigite a sua idade:");
		int numero = texto.nextInt();
		texto.nextLine();
		
		System.out.println("\nDigite onde você trabalha: ");
		str1=texto.nextLine();
		
		System.out.println("\nDigite onde você estuda: ");
		str2=texto.nextLine();
		
		System.out.println("\nDigite o curso que estuda:");
		str3= texto.nextLine();
		
		System.out.println("\nDigite qual foi o seu primeiro amor:");
		str4= texto.nextLine();
		
		
	System.out.println("\nSeus dados são: \n" + "Seu nome é : " + str + "\nVocê trabalha na empresa : " + str1 + "\nVocê estuda no instituto : " + str2 + "\nO curso que você estuda é : " + str3 + "\nO seu primeiro amor foi : " + str4);
		
		System.out.println("Sua idade é : " + numero + " anos.");
		
		texto.close();
		
	}
}