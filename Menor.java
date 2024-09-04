package estruturas;

import javax.swing.JOptionPane;

/**
 * @author Prof. Giulian Dalton Luz
 * Faculdade Impacta Tecnologia
 * Data: 13/mar/2014
 * Laboratório em sala de aula
 * 
 *  Ler três números inteiros e encontrar  o menor deles. 
 * 
 * @version 1.0
 */

public class Menor {
	public static void main(String[] args) {
		//variáveis para abrigar números inteiro
		int a, b ,c;
		int menor = 0;
		
		//variável auxiliar para ler um valor digitado pelo usuário
		String lido;
		
		//Leitura do valor
		lido = JOptionPane.showInputDialog("Digite um número inteiro");
		
		//conversão do texto para o tipo int
		a = Integer.parseInt(lido);
		
		//Leitura do valor
				lido = JOptionPane.showInputDialog("Digite um número inteiro");
				
		//conversão do texto para o tipo int
		b = Integer.parseInt(lido);
		
		//Leitura do valor
		lido = JOptionPane.showInputDialog("Digite um número inteiro");
		
		//conversão do texto para o tipo int
		c = Integer.parseInt(lido);
		
		//TODO Lab03d ### Insira aqui a lógica para verificar qual o menor número 
		
		
		//Mensagem de saída
		JOptionPane.showMessageDialog(null, "O menor número entre " + a + ", "+ b + " e "+ c + " é " + menor);		
	}
}
