package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaIni extends JPanel {
	
	private static JLabel messageLabel;
		public  TelaIni() {
			this.setLayout(null);
			this.add(getMessageLabel());
		}
		
		public static JLabel getMessageLabel() {
			if(messageLabel == null) {
				messageLabel = new JLabel("Bem vindo a escola !! Selecione uma das Opções para o cadastro!!");
				messageLabel.setBounds(100, 150, 600, 50);
			}
			return messageLabel;
		}
}
