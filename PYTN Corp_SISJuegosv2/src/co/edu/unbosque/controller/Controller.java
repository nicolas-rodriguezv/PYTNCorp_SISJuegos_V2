package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistance.BinariosFile;
import co.edu.unbosque.view.*;

public class Controller implements ActionListener {

	private View gui = new View();
	private BinariosFile binario = new BinariosFile();
	private JugadorDAO jugadordao = new JugadorDAO();
	private JuegoDAO juegodao = new JuegoDAO();
	private PartidaDAO partidadao = new PartidaDAO();
	private Mensajes msg = new Mensajes();
	

	public Controller() {

		binario.escribirArchivoBinario();
		juegodao.escribirArchivoJuego();
		jugadordao.escribirArchivoJugador();
		partidadao.escribirArchivoPartida();
		
//		jugadordao.agregarJugador();
		
		AsignarOyentes();
		gui.setVisible(true);

	}

	public void AsignarOyentes() {

		gui.getPanelprincipal().getBtnJuego().addActionListener(this);
		gui.getPanelprincipal().getBtnJugadores().addActionListener(this);
		gui.getPanelprincipal().getBtnPartidas().addActionListener(this);
		gui.getPanelprincipal().getBtnTorneos().addActionListener(this);
		
		//panel juegos
		gui.getPanelJuegos().getAgregarJuego().addActionListener(this);
		gui.getPanelJuegos().getLeerJuego().addActionListener(this);
		
		//panel jugadores
		gui.getPanelJugadores().getAgregarJug().addActionListener(this);
		gui.getPanelJugadores().getLeerJug().addActionListener(this);
		gui.getPanelJugadores().getBuscarJug().addActionListener(this);
		
		//panel partidas
		gui.getPanelPartidas().getLeerPar().addActionListener(this);
		gui.getPanelPartidas().getAgregarPar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String comando = ae.getActionCommand();

		//Utilidades de juego
		
		if(comando.equals("JUEGO")) {
			gui.getPanelprincipal().setVisible(false);
			gui.getPanelJuegos().setVisible(true);
		}
		
		if(comando.equals("AGREGARJUEGO")) {
			juegodao.agregarJuego();
		}
		
		if(comando.equals("LEERJUEGO")) {
			System.out.println("Se ha leido el archivo con error de: "+juegodao.leerArchivoJuego());
		}
		
		//Utilidaxes de Jugador
//
		if(comando.equals("JUGADORES")) {
			gui.getPanelprincipal().setVisible(false);
			gui.getPanelJuegos().setVisible(false);
			gui.getPanelPartidas().setVisible(false);
			gui.getPanelJugadores().setVisible(true);
		}
		
		if(comando.equals("AGREGAR_JUGADOR")) {
			jugadordao.agregarJugador();
		}
		
		if(comando.equals("BUSCARJUGADOR")) {
			jugadordao.buscarJugadorPorID();
		}
		
		if(comando.equals("LEER_JUGADOR")) {
			System.out.println("Se ha leido el archivo con error de: "+jugadordao.leerArchivoJugador());
		}
		
		//Utilidades de partida
		
		if(comando.equals("PARTIDAS")) {
			gui.getPanelprincipal().setVisible(false);
			gui.getPanelJuegos().setVisible(false);
			gui.getPanelJugadores().setVisible(false);
			gui.getPanelPartidas().setVisible(true);
		}
		
		if(comando.equals("AGREGAR_PARTIDA")) {
			partidadao.agregarPartida();
		}
		
		if(comando.equals("LEER_PARTIDA")) {
			System.out.println("Se ha leido el archivo con error de: "+partidadao.leerArchivoPartida());

		}
	}
}
