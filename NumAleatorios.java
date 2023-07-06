// Programa para gerar números aleatórios na linguagem de programação java, usando lógica de programação.

import java.util.Random;

public class NumAleatorios
{
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(30) + 1;
		System.out.println("Número gerado: " + valor);
		
	}
}