package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class panelPartidas extends JPanel {
	private JButton leerPar;
	private JButton agregarPar;

	public panelPartidas() {
		setLayout(new GridLayout(2, 2));
		setSize(500, 400);
		TitledBorder border = BorderFactory.createTitledBorder("Partidas");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		leerPar = new JButton("Leer Partida");
		leerPar.setActionCommand("LEER_PARTIDA");
		agregarPar = new JButton("Agregar Partida");
		agregarPar.setActionCommand("AGREGAR_PARTIDA");
		add(leerPar);
		add(agregarPar);
	}

	public JButton getLeerPar() {
		return leerPar;
	}

	public void setLeerPar(JButton leerPar) {
		this.leerPar = leerPar;
	}

	public JButton getAgregarPar() {
		return agregarPar;
	}

	public void setAgregarPar(JButton agregarPar) {
		this.agregarPar = agregarPar;
	}

	

}
