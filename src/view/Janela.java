package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Janela extends JFrame {

		private static final long serialVersionUID = 1L;
		 private CadastroProfessorPanel cadastroProfessor = new CadastroProfessorPanel(); 
		 private TelaIni telaInicial = new TelaIni(); 
		 private static JMenuBar menuCadastro;
		 private static JMenu Cadastro;
		
		public Janela() {
			this.setTitle("cadastro escolar");
			this.setSize(780, 460);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			this.setVisible(true);
			this.setJMenuBar(getMenuCadastro());
			this.setContentPane(telaInicial); 
		}
		
		public static JMenuBar getMenuCadastro() {
			if(menuCadastro == null) {
				menuCadastro = new JMenuBar();
			
			}
			menuCadastro.add(getCadastroMenu());
			
			return menuCadastro;
		}
		
		public static JMenu getCadastroMenu() {
			if(Cadastro == null) {
				Cadastro = new JMenu();
			}
			Cadastro = MenuItems.Cadastrar();
			return Cadastro;
		}
		
}
