package estruturas;

import javax.swing.JOptionPane;

/**
 * @author Prof. Giulian Dalton Luz
 * Faculdade Impacta Tecnologia
 * Data: 13/mar/2014
 * Laboratório em sala de aula
 * 
 * Receber um valor em minutos e exibir o equivalente em horas,
 * somente no caso do valor informado ser positivo;

 * 
 * @version 1.0
 */

public class Minutos1 {
	public static void main(String[] args) {
		// variáveis para abrigar minutos e horas
		int minutos;
		double horas;

		// variável auxiliar para ler um valor digitado pelo usuário
		String lido;

		// Leitura do valor da primeira nota
		lido = JOptionPane.showInputDialog("Digite a número de minutos");

		// conversão do texto para o tipo int
		minutos = Integer.parseInt(lido);


		// TODO Lab03h ### Insira aqui a lógica para verificar se o número de minutos é positivo e em caso afirmativo 
		//calcular e exibir o valor em horas
		horas = 0;
		
		// Mensagem de saída
		JOptionPane.showMessageDialog(null, minutos + " minutos correspondem a " + horas + " horas.");
	}
}
