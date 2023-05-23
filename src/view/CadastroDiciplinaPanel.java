package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroDiciplinaPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private static JTextField nomeDiciplina;
	private static JTextField codigoDiciplina;
	private static JTextField cargaHoraria;
	private static JTextField descricaoDiciplina;
	private static JButton cadastrarProfessor = null;
	private static JLabel labelNomeDiciplina;
	private static JLabel labelCodigoDiciplina;
	private static JLabel labelCargaHoraria;
	private static JLabel labelDescricaoDiciplina;
	
	public CadastroDiciplinaPanel() {
		this.setLayout(null); 
		this.add(getNomeDiciplina());
		this.add(getCodigoDiciplina ());
		this.add(getCargaHoraria());
		this.add(getDescricaoDiciplina());
		this.add(getCadastrarDiciplina());
		this.add(getlabelNomeDiciplina());
		this.add(getLabelCodigoDiciplina());
		this.add(getLabelCargaHoraria());
		this.add(getLabelDescricaoDiciplina());
	}
	
	public static JTextField getNomeDiciplina () {
		
		if(nomeDiciplina == null) {
			nomeDiciplina = new JTextField();
			nomeDiciplina.setBounds(100, 40, 300, 30);
			
		}
		return nomeDiciplina;
	}
	public static JTextField getCodigoDiciplina () {
		
		if(codigoDiciplina== null) {
			codigoDiciplina = new JTextField();
			codigoDiciplina.setBounds(100, 100, 300, 30);
			
		}
		return codigoDiciplina;
	}
	public static JTextField getCargaHoraria() {
		
		if(cargaHoraria == null) {
			cargaHoraria = new JTextField();
			cargaHoraria.setBounds(100, 160, 300, 30);
			
		}
		return cargaHoraria;
	}
public static JTextField getDescricaoDiciplina () {
		
		if(descricaoDiciplina == null) {
			descricaoDiciplina = new JTextField();
			descricaoDiciplina.setBounds(100, 220, 300, 30);
			
		}
		return descricaoDiciplina;
	}

public static JButton getCadastrarDiciplina() {
	if(cadastrarProfessor == null) {
		cadastrarProfessor = new JButton("cadastrar diciplina");
		cadastrarProfessor.setBounds(150, 260, 200, 30);
	}
	return cadastrarProfessor;
}

public static JLabel getlabelNomeDiciplina() {
	if(labelNomeDiciplina == null) {
		labelNomeDiciplina = new JLabel("Digite o nome da diciplina:");
		labelNomeDiciplina.setVisible(true);
		labelNomeDiciplina.setBounds(100, 0, 200, 50);
	}
	return labelNomeDiciplina;
}
public static JLabel getLabelCodigoDiciplina() {
	if(labelCodigoDiciplina== null) {
		labelCodigoDiciplina = new JLabel("Digite o codigo da Disciplina:");
		labelCodigoDiciplina.setVisible(true);
		labelCodigoDiciplina.setBounds(100, 60, 220, 50);
	}
	return labelCodigoDiciplina;
}

public static JLabel getLabelCargaHoraria() {
	if(labelCargaHoraria == null) {
		labelCargaHoraria = new JLabel("Digite a carga horaria da diciplina:");
		labelCargaHoraria.setVisible(true);
		labelCargaHoraria.setBounds(100, 120, 260, 50);
	}
	return labelCargaHoraria;
}

public static JLabel getLabelDescricaoDiciplina() {
	if(labelDescricaoDiciplina == null) {
		labelDescricaoDiciplina= new JLabel("Digite a descrição da diciplina:");
		labelDescricaoDiciplina.setVisible(true);
		labelDescricaoDiciplina.setBounds(100, 180, 260, 50);
	}
	return labelDescricaoDiciplina;
}
}
