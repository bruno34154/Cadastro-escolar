package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroAlunoPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static JTextField nomeAluno;
	private static JTextField matricula;
	private static JTextField RgAluno;
	private static JTextField CpfAluno;
	private static JButton cadastrarAluno = null;
	private static JLabel labelNome;
	private static JLabel labelMatricula;
	private static JLabel labelRg;
	private static JLabel labelCpfAluno;
	
	public CadastroAlunoPanel() {
		this.setLayout(null); 
		this.add(getNomeAluno());
		this.add(getMatricula());
		this.add(getRg());
		this.add(getCpf());
		this.add(getCadastrarAluno());
		this.add(getlabelNome());
		this.add(getLabelMatricula());
		this.add(getLabelRg());
		this.add(getLabelCpf());
	}
	
	public static JTextField getNomeAluno () {
		
		if(nomeAluno == null) {
			nomeAluno = new JTextField();
			nomeAluno.setBounds(100, 40, 300, 30);
			
		}
		return nomeAluno;
	}
	public static JTextField getMatricula () {
		
		if(matricula == null) {
			matricula = new JTextField();
			matricula.setBounds(100, 100, 300, 30);
			
		}
		return matricula;
	}
	public static JTextField getRg () {
		
		if(RgAluno == null) {
			RgAluno = new JTextField();
			RgAluno.setBounds(100, 160, 300, 30);
			
		}
		return RgAluno;
	}
public static JTextField getCpf() {
		
		if(CpfAluno == null) {
			CpfAluno = new JTextField();
			CpfAluno.setBounds(100, 220, 300, 30);
			
		}
		return CpfAluno;
	}

public static JButton getCadastrarAluno() {
	if(cadastrarAluno == null) {
		cadastrarAluno = new JButton("cadastrar aluno");
		cadastrarAluno.setBounds(150, 260, 200, 30);
	}
	return cadastrarAluno;
}

public static JLabel getlabelNome() {
	if(labelNome == null) {
		labelNome = new JLabel("Digite o nome do aluno:");
		labelNome.setVisible(true);
		labelNome.setBounds(100, 0, 200, 50);
	}
	return labelNome;
}
public static JLabel getLabelMatricula() {
	if(labelMatricula == null) {
		labelMatricula = new JLabel("Digite a matricula do aluno:");
		labelMatricula.setVisible(true);
		labelMatricula.setBounds(100, 60, 200, 50);
	}
	return labelMatricula;
}

public static JLabel getLabelRg() {
	if(labelRg == null) {
		labelRg = new JLabel("Digite o RG do aluno:");
		labelRg.setVisible(true);
		labelRg.setBounds(100, 120, 220, 50);
	}
	return labelRg;
}

public static JLabel getLabelCpf() {
	if(labelCpfAluno == null) {
		labelCpfAluno = new JLabel("Digite o Cpf do aluno:");
		labelCpfAluno.setVisible(true);
		labelCpfAluno.setBounds(100, 180, 220, 50);
	}
	return labelCpfAluno;
}
}
