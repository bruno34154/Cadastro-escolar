package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenuItem;
import view.Janela;
import view.MenuItems;

public class ControladorBarraDeMenu extends JMenuItem implements MouseListener {

	
	private static final long serialVersionUID = 1L;

	public ControladorBarraDeMenu() {
		super();
		MenuItems.getCadastrarProfessor().addMouseListener(this);
		MenuItems.getCadastrarAluno().addMouseListener(this);
		MenuItems.getCadastrarDiciplina().addMouseListener(this);
		repaint();
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getComponent() == MenuItems.getCadastrarProfessor()) {
			ControladorFrame.getTelaProfessor();
			repaint();
		}
		else if(e.getComponent() == MenuItems.getCadastrarDiciplina()) {
			ControladorFrame.getTelaDiciplina();
			repaint();
		}
		else if(e.getComponent() == MenuItems.getCadastrarAluno()) {
			ControladorFrame.getTelaAluno();
			repaint();
		}
			
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
