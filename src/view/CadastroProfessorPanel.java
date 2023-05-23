package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroProfessorPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private static JTextField nomeProfessor;
	private static JTextField diciplinaProfessor;
	private static JTextField instituicaoProfessor;
	private static JTextField salarioProfessor;
	private static JButton cadastrarProfessor = null;
	private static JLabel labelNome;
	private static JLabel labelDiciplina;
	private static JLabel labelInstituicao;
	private static JLabel labelSalario;
	
	public CadastroProfessorPanel() {
		this.setLayout(null); 
		this.add(getNomeProfessor());
		this.add(getDiciplinaProfessor());
		this.add(getInstituicaoProfessor());
		this.add(getSalarioProfessor());
		this.add(getCadastrarProfessor());
		this.add(getlabelNome());
		this.add(getLabelDiciplina());
		this.add(getLabelInstituicao());
		this.add(getLabelSalario());
	}
	
	public static JTextField getNomeProfessor () {
		
		if(nomeProfessor == null) {
			nomeProfessor = new JTextField();
			nomeProfessor.setBounds(100, 40, 300, 30);
			
		}
		return nomeProfessor;
	}
	public static JTextField getDiciplinaProfessor () {
		
		if(diciplinaProfessor == null) {
			diciplinaProfessor = new JTextField();
			diciplinaProfessor.setBounds(100, 100, 300, 30);
			
		}
		return diciplinaProfessor;
	}
	public static JTextField getInstituicaoProfessor () {
		
		if(instituicaoProfessor == null) {
			instituicaoProfessor = new JTextField();
			instituicaoProfessor.setBounds(100, 160, 300, 30);
			
		}
		return instituicaoProfessor;
	}
public static JTextField getSalarioProfessor () {
		
		if(salarioProfessor == null) {
			salarioProfessor = new JTextField();
			salarioProfessor.setBounds(100, 220, 300, 30);
			
		}
		return salarioProfessor;
	}

public static JButton getCadastrarProfessor() {
	if(cadastrarProfessor == null) {
		cadastrarProfessor = new JButton("cadastrar professor");
		cadastrarProfessor.setBounds(150, 260, 200, 30);
	}
	return cadastrarProfessor;
}

public static JLabel getlabelNome() {
	if(labelNome == null) {
		labelNome = new JLabel("Digite o nome do professor:");
		labelNome.setVisible(true);
		labelNome.setBounds(100, 0, 200, 50);
	}
	return labelNome;
}
public static JLabel getLabelDiciplina() {
	if(labelDiciplina== null) {
		labelDiciplina = new JLabel("Digite o nome da Disciplina:");
		labelDiciplina.setVisible(true);
		labelDiciplina.setBounds(100, 60, 200, 50);
	}
	return labelDiciplina;
}

public static JLabel getLabelInstituicao() {
	if(labelInstituicao == null) {
		labelInstituicao = new JLabel("Digite o nome da instituição:");
		labelInstituicao.setVisible(true);
		labelInstituicao.setBounds(100, 120, 220, 50);
	}
	return labelInstituicao;
}

public static JLabel getLabelSalario() {
	if(labelSalario == null) {
		labelSalario = new JLabel("Digite o Salario:");
		labelSalario.setVisible(true);
		labelSalario.setBounds(100, 180, 220, 50);
	}
	return labelSalario;
}
}
