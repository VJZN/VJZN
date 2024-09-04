package estruturas;

import javax.swing.JOptionPane;

/**
 * @author Prof. Giulian Dalton Luz
 * Faculdade Impacta Tecnologia
 * Data: 13/mar/2014
 * Laboratório em sala de aula
 * 
 * Receber um número inteiro e exibir uma mensagem caso ele seja par;
 * 
 * @version 1.0
 */

public class Par {
	public static void main(String[] args) {
		//variável para abrigar um número inteiro
		int numero;
		
		//variável auxiliar para ler um valor digitado pelo usuário
		String lido;
		
		//Leitura do valor
		lido = JOptionPane.showInputDialog("Digite um número inteiro");
		
		//conversão do texto para o tipo int
		numero = Integer.parseInt(lido);
		
		//TODO Lab03a ### Insira aqui a lógica para verificar se o número é par e apresentar a mensagem 
		
		
		//Mensagem de saída
		JOptionPane.showMessageDialog(null, "O número " + numero + " é par");
	}
}
