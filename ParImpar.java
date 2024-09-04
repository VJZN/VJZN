package estruturas;

import javax.swing.JOptionPane;

/**
 * @author Prof. Giulian Dalton Luz
 * Faculdade Impacta Tecnologia
 * Data: 13/mar/2014
 * Laboratório em sala de aula
 * 
 * Receber um número inteiro e exibir uma mensagem informando se ele é par ou ímpar;
 * 
 * @version 1.0
 */

public class ParImpar {
	public static void main(String[] args) {
		//variável para abrigar um número inteiro
		int numero;
		
		//variável auxiliar para ler um valor digitado pelo usuário
		String lido;
		
		//Leitura do valor
		lido = JOptionPane.showInputDialog("Digite um número inteiro");
		
		//conversão do texto para o tipo int
		numero = Integer.parseInt(lido);
		
		//TODO Lab03b ### Insira aqui a lógica para verificar se o número é par ou ímpar e apresentar a mensagem correta 
		
		
		//Mensagem de saída
		JOptionPane.showMessageDialog(null, "O número " + numero + " é par");		
		JOptionPane.showMessageDialog(null, "O número " + numero + " é impar");
	}
}
