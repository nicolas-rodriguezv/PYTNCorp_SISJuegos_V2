package co.edu.unbosque.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.view.Mensajes;

public class JugadorDAO {
	
	private Mensajes msg = new Mensajes();
	private ArrayList<JugadorDTO> jugador = new ArrayList<JugadorDTO>();
	private String ruta = "./data/jugador_DTO.dat";
	
	public JugadorDTO buscarJugadorPorID() {
		leerArchivoJugador();
		
		long documento = msg.leerDatoLong("Ingrese el ID del jugador");
		
		for(JugadorDTO jugadordto : jugador) {
			
			if(jugadordto.getDocumento() == documento) {
				return jugadordto;
			}
		}
		return null;
	}
	
	public void agregarJugador() {
		
		leerArchivoJugador();
		
		String nombre = msg.leerDatoString("Digite el nombre del jugador");
		int edad = msg.leerDatoEntero("Digite la edad del jugador");
		String genero = msg.leerDatoString("Digite el genero del jugador");
		long documento = msg.leerDatoLong("Digite el documento del jugador");
		int puntaje = 0;
		jugador.add(new JugadorDTO(nombre, edad, genero, puntaje, documento));
		
		escribirArchivoJugador();
	}
	
	
	
	public int escribirArchivoJugador() {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
			salida.writeObject(jugador);
			salida.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public int leerArchivoJugador() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta));
			jugador = (ArrayList<JugadorDTO>)in.readObject();
			in.close();
		} catch(IOException | ClassNotFoundException e) {
			return -1;
		}
		return 0;
	}
	// Leer este metodo mediante un JTextField
	
}
