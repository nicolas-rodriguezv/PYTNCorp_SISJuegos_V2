package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class View extends JFrame {
	private Panelprincipal Panelprincipal;
	private panelJugadores panelJugadores;
	private panelJuegos panelJuegos = new panelJuegos();
	private panelTorneos panelTorneos;
	private panelPartidas panelPartidas;

	public View() {
		setSize(520, 400);
		setResizable(false);
		setTitle("Sistema Informativo de Juegos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		Panelprincipal = new Panelprincipal();
		add(Panelprincipal, BorderLayout.CENTER);
		getContentPane().add(panelJuegos);
		panelJuegos.setVisible(false);
		panelJugadores= new panelJugadores();
		panelJugadores.setVisible(false);
		add(panelJugadores);
		panelPartidas=new panelPartidas();
		panelPartidas.setVisible(false);
		add(panelPartidas);

	}

	public Panelprincipal getPanelprincipal() {
		return Panelprincipal;
	}

	public void setPanelprincipal(Panelprincipal panelprincipal) {
		Panelprincipal = panelprincipal;
	}

	public panelJugadores getPanelJugadores() {
		return panelJugadores;
	}

	public void setPanelJugadores(panelJugadores panelJugadores) {
		this.panelJugadores = panelJugadores;
	}

	public panelJuegos getPanelJuegos() {
		return panelJuegos;
	}

	public void setPanelJuegos(panelJuegos panelJuegos) {
		this.panelJuegos = panelJuegos;
	}

	public panelTorneos getPanelTorneos() {
		return panelTorneos;
	}

	public void setPanelTorneos(panelTorneos panelTorneos) {
		this.panelTorneos = panelTorneos;
	}

	public panelPartidas getPanelPartidas() {
		return panelPartidas;
	}

	public void setPanelPartidas(panelPartidas panelPartidas) {
		this.panelPartidas = panelPartidas;
	}
}
