// Algoritmo que calcula a área de um território onde a largura sempre terá um valor fixo, programa em java usando lógica de programação.

import java.util.Scanner;

public class Constante {
    private static final double LARGURA = 10.0;
    // usando uma constante "LARGURA" para adicionar um valor fixo para fazer o seguinte calculo
    
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Entre com o comprimento: ");
	    double compr = entrada.nextDouble();
	   // usando uma variável do tipo double "compr" para guardar os dados que o usuário vai digitar.
	   
	    double area = calculaArea(LARGURA, compr);
	    System.out.println("A área é: " + area);
	   // usando um método "calculaArea", uma função que recebe o valor da largura e do comprimento e retorna o resultado do método calculaArea.
	}
	
	private static double calculaArea(double largura, double comprimento){
	    return largura * comprimento;
    // função do método calculaArea, calculaArea recebendo os valores da largura e do comprimento e multiplicando para mostrar o resultado final. 
	}
	
}
