package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class panelJugadores extends JPanel {
	private JButton LeerJug;
	private JButton AgregarJug;
	private JButton buscarJug;
	
	public panelJugadores() {
		setLayout(new GridLayout(2,2));
		setSize(500, 400);
		TitledBorder border = BorderFactory.createTitledBorder("Jugadores");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		LeerJug = new JButton("Leer");
		LeerJug.setActionCommand("LEER_JUGADOR");
		AgregarJug = new JButton("Agregar");
		AgregarJug.setActionCommand("AGREGAR_JUGADOR");
		buscarJug = new JButton("Buscar");
		buscarJug.setActionCommand("BUSCARJUGADOR");
		add(LeerJug);
		add(AgregarJug);
		add(buscarJug);
		

	}

	public JButton getLeerJug() {
		return LeerJug;
	}

	public void setLeerJug(JButton leerJug) {
		LeerJug = leerJug;
	}

	public JButton getAgregarJug() {
		return AgregarJug;
	}

	public void setAgregarJug(JButton agregarJug) {
		AgregarJug = agregarJug;
	}
	
	public JButton getBuscarJug() {
		return buscarJug;
	}
	
	public void setBuscarJug(JButton buscarJug) {
		this.buscarJug = buscarJug;
	}

}
