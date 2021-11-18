package co.edu.unbosque.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.view.Mensajes;

public class PartidaDAO {

	private Mensajes msg = new Mensajes();
	private ArrayList<PartidaDTO> partida = new ArrayList<PartidaDTO>();
	private String ruta = "./data/partida_DAO.dat";
	
	
	public void agregarPartida() {
		leerArchivoPartida();
		
		String tipoPartida = msg.leerDatoString("Digite el tipo de partida | Unranked / Ranked");
		String jugador1 = msg.leerDatoString("Digite el jugador 1");
		String jugador2 = msg.leerDatoString("Digite el jugador 2");
		double puntaje1 = 0;
		double puntaje2 = 0;
		
		partida.add(new PartidaDTO(tipoPartida, jugador1, jugador2, puntaje1, puntaje2));
		
		escribirArchivoPartida();
	}
	
	public int escribirArchivoPartida() {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
			salida.writeObject(partida);
			salida.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public int leerArchivoPartida() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta));
			partida = (ArrayList<PartidaDTO>)in.readObject();
			in.close();
		} catch(IOException | ClassNotFoundException e) {
			return -1;
		}
		return 0;
	}
}
