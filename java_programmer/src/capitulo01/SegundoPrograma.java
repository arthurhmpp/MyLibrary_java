package capitulo01;

import javax.swing.JOptionPane;

public class SegundoPrograma {
	public static void main(String[] args){
		System.out.println(JOptionPane.WARNING_MESSAGE); // PODE SUBSTITUIR POR 2
		JOptionPane.showMessageDialog(
				null,
				"Hello world!",
				"Mensagem de erro",
				JOptionPane.ERROR_MESSAGE); // PODE SUBSTITUIR POR 0
	}
}
