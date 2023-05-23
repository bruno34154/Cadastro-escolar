package controller;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

import model.Professor;
import model.Aluno;
import model.Disciplina;

import view.CadastroProfessorPanel;
import view.CadastroAlunoPanel;
import view.CadastroDiciplinaPanel;


public class ControladorBotao  implements 	ActionListener{
	private static final long serialVersionUID = 1L;
	CriadorDeArquivoController arquivo = new CriadorDeArquivoController();
	private static ArrayList<Professor> professores = new ArrayList<Professor>();
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private static ArrayList<Disciplina> diciplinas = new ArrayList<Disciplina>();
	public  ControladorBotao() {
		CadastroProfessorPanel.getCadastrarProfessor().addActionListener(this);
		CadastroAlunoPanel.getCadastrarAluno().addActionListener(this);
		CadastroDiciplinaPanel.getCadastrarDiciplina().addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == CadastroProfessorPanel.getCadastrarProfessor()) {
			Professor professor = new Professor(null, null, null, 0);
			professor.setNome(CadastroProfessorPanel.getNomeProfessor().getText());
			professor.setDisciplina(CadastroProfessorPanel.getDiciplinaProfessor().getText());
			professor.setInstituicao(CadastroProfessorPanel.getInstituicaoProfessor().getText());
			String salario = CadastroProfessorPanel.getSalarioProfessor().getText();
			professor.setSalario(Float.parseFloat(salario));
			System.out.println(professor.getNome() );
			System.out.println(professor.getDisciplina());
			System.out.println(professor.getInstituicao() );
			System.out.println(professor.getSalario());
				professores.add(professor);
				//ControladorRepositorio.setProfessores(professor);
				//ControladorRepositorio.getProfessores();
				
				try {
					arquivo.createFileProfessor(professores);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
		}
		else if(e.getSource() == CadastroAlunoPanel.getCadastrarAluno()) {
			Aluno aluno = new Aluno(null, null, null, null);
			aluno.setNome(CadastroAlunoPanel.getNomeAluno().getText());
			aluno.setMatricula(CadastroAlunoPanel.getMatricula().getText());
			aluno.setCpf(CadastroAlunoPanel.getCpf().getText());
			aluno.setRg(CadastroAlunoPanel.getRg().getText());
			System.out.println(aluno.getNome() );
			alunos.add(aluno);
			try {
				arquivo.createFileAluno(alunos); 
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == CadastroDiciplinaPanel.getCadastrarDiciplina()) {
			Disciplina diciplina  = new Disciplina(null, null, null, null);
			diciplina.setNome(CadastroDiciplinaPanel.getNomeDiciplina().getText());
			diciplina.setCodigo(CadastroDiciplinaPanel.getCodigoDiciplina().getText());
			diciplina.setCargaHoraria(CadastroDiciplinaPanel.getCargaHoraria().getText());
			diciplina.setDescricao(CadastroDiciplinaPanel.getDescricaoDiciplina().getText());
			//System.out.println(aluno.getNome() );
			diciplinas.add(diciplina);
			try {
				arquivo.createFileDisciplina(diciplinas);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	
}
