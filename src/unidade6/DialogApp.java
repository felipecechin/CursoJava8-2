package unidade6;

import javax.swing.JOptionPane;

public class DialogApp {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Iniciando a aplica��o...","Instala��o Conclu�da",JOptionPane.INFORMATION_MESSAGE);
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int resposta = JOptionPane.showConfirmDialog(null,"O nome "+nome+" foi informado. Salvar as altera��es?");
		JOptionPane.showMessageDialog(null,""+resposta);
		
	}
}
