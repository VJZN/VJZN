package estruturas;

import javax.swing.JOptionPane;

/**
 * @author Prof. Giulian Dalton Luz
 * Faculdade Impacta Tecnologia
 * Data: 13/mar/2014 
 * Laboratório em sala de aula
 * 
 * Receber duas notas, calcular e exibir a média aritmética; caso a
 * média seja maior ou igual a 7,0 exiba uma mensagem de felicitações
 * pela aprovação.
 * 
 * @version 1.0
 */

public class Aprovacao1 {
	public static void main(String[] args) {
		// variáveis para abrigar duas notas
		double nota1, nota2;

		// variável auxiliar para ler um valor digitado pelo usuário
		String lido;

		// Leitura do valor da primeira nota
		lido = JOptionPane.showInputDialog("Digite a primeira nota (formato #.##)");

		// conversão do texto para o tipo double
		nota1 = Double.parseDouble(lido);

		// Leitura do valor da segunda nota
		lido = JOptionPane.showInputDialog("Digite a segunda nota (formato #.##)");

		// conversão do texto para o tipo double
		nota2 = Double.parseDouble(lido);

		// TODO Lab03f ### Insira aqui a lógica para verificar se o aluno foi aprovado

		// Mensagem de saída
		JOptionPane.showMessageDialog(null, "Parabéns, você foi aprovado");
	}
}
