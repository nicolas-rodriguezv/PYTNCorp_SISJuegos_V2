package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.GridLayout;

public class Panelprincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnJuego;
	private JButton btnJugadores;
	private JButton btnPartidas;
	private JButton btnTorneos;
	
	public Panelprincipal() {
		setLayout(new GridLayout(3, 3));
		setSize(500, 500);
		TitledBorder border = BorderFactory.createTitledBorder("Categorias");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		btnJugadores = new JButton("Jugadores");
		btnJugadores.setActionCommand("JUGADORES");
		btnJuego = new JButton("Juego");
		btnJuego.setActionCommand("JUEGO");
		btnPartidas = new JButton("Partidas");
		btnPartidas.setActionCommand("PARTIDAS");
		btnTorneos = new JButton("Torneos");
		btnTorneos.setActionCommand("TORNEOS");
		add(btnJugadores);
		add(btnJuego);
		add(btnPartidas);
		add(btnTorneos);

	}

	public JButton getBtnJuego() {
		return btnJuego;
	}

	public void setBtnJuego(JButton btnJuego) {
		this.btnJuego = btnJuego;
	}

	public JButton getBtnJugadores() {
		return btnJugadores;
	}

	public void setBtnJugadores(JButton btnJugadores) {
		this.btnJugadores = btnJugadores;
	}

	public JButton getBtnPartidas() {
		return btnPartidas;
	}

	public void setBtnPartidas(JButton btnPartidas) {
		this.btnPartidas = btnPartidas;
	}

	public JButton getBtnTorneos() {
		return btnTorneos;
	}

	public void setBtnTorneos(JButton btnTorneos) {
		this.btnTorneos = btnTorneos;
	}

}