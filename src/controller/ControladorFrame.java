package controller;
import view.Janela;
import view.CadastroProfessorPanel;
import view.CadastroDiciplinaPanel;
import view.CadastroAlunoPanel;
public class ControladorFrame {
	static Janela frame = new Janela();
	 private static CadastroProfessorPanel cadastroProfessor = new CadastroProfessorPanel(); 
	 private static CadastroDiciplinaPanel cadastroDiciplina = new CadastroDiciplinaPanel();
	 private static CadastroAlunoPanel cadastroAluno = new CadastroAlunoPanel();
	public ControladorFrame() {
		frame.repaint();
		frame.validate();
	}
	
	public static void getTelaProfessor() {
		
			frame.setContentPane(cadastroProfessor);
		
	}
	public static void getTelaDiciplina() {
		// TODO Auto-generated method stub
		frame.setContentPane(cadastroDiciplina);
	} 
	public static void getTelaAluno() {
		// TODO Auto-generated method stub
		frame.setContentPane(cadastroAluno);
	} 
	
	
	public static void main(String[] args) {
		
		new ControladorBotao();
		new ControladorBarraDeMenu();
		new ControladorFrame();
	}

	
	
}
