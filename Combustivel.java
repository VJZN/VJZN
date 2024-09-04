package estruturas;

import javax.swing.JOptionPane;

/**
 * @author Prof. Giulian Dalton Luz 
 * Faculdade Impacta Tecnologia 
 * Data: 13/mar/2014 
 * Laboratório em sala de aula
 * 
 * Utilizando switch-case
 * Dados o tipo de combustível e a quantidade de litros, calcule e exiba o valor a ser pago, seguindo:
 * A - Alcool    Preço=1,7997
 * D - Diesel    Preço=0,9798
 * G - Gasolina  Preço=2,1009
 * 
 * @version 1.0
 */

public class Combustivel {
	public static void main(String[] args) {
		// variáveis para abrigar o preço, o tipo, a quantidade de litros e o total
		double preco, litros, total;
		char tipo;

		// variável auxiliar para ler um valor digitado pelo usuário
		String lido;

		// Leitura do valor da primeira nota
		lido = JOptionPane.showInputDialog("Digite a tipo (A - Alcool / D - Diesel / G - Gasolina)");

		// conversão do texto para o tipo char, obtem o primeiro caracter
		tipo = lido.charAt(0);
		
		//converte para maiúsculos para funcionar caso o usuário digite a, d ou g. 
		tipo = Character.toUpperCase(tipo);

		// Leitura do valor da quantidade de combustível
		lido = JOptionPane.showInputDialog("Quantidade de litros");

		// conversão do texto para o tipo double
		litros = Double.parseDouble(lido);

		// TODO Lab03e ### Insira aqui a lógica para verificar se o aluno foi aprovado
		preco = 1.7997;
		preco = 0.9798;
		preco = 2.1009;
		
		total = litros * preco;
		// Mensagem de saída
		JOptionPane.showMessageDialog(null, "Abastecimento (" + tipo + ") = " + litros + "L Valor à pagar: R$ " + String.format("%.2f", total));
	}
}
