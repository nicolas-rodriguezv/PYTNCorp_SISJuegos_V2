package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class panelJuegos extends JPanel {
	private JButton agregarJuego;
	private JButton leerJuego;

	public panelJuegos() {
		setLayout(new GridLayout(3, 3));
		setSize(500, 400);
		TitledBorder border = BorderFactory.createTitledBorder("Juegos");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		agregarJuego = new JButton("Agregar Juego");
		agregarJuego.setActionCommand("AGREGARJUEGO");
		leerJuego = new JButton("Leer Juego");
		leerJuego.setActionCommand("LEERJUEGO");
		add(leerJuego);
		add(agregarJuego);
	}

	public JButton getAgregarJuego() {
		return agregarJuego;
	}

	public void setAgregarJuego(JButton agregarJuego) {
		this.agregarJuego = agregarJuego;
	}

	public JButton getLeerJuego() {
		return leerJuego;
	}

	public void setLeerJuego(JButton leerJuego) {
		this.leerJuego = leerJuego;
	}

	
}
