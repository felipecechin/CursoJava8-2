package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonAppv2{

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Primeira aplica��o");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		JButton botao = new JButton("Isto � um bot�o");
		botao.addActionListener(ev->{
			JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
		});
		cont.add(botao);
		frame.setVisible(true);
		
	}

}
