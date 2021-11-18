package co.edu.unbosque.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.view.Mensajes;

public class JuegoDAO {

	private Mensajes gui = new Mensajes();
	private ArrayList<JuegoDTO> juego = new ArrayList<JuegoDTO>();
	private String ruta = "./data/juego_DAO.dat";
	
	
	public void agregarJuego() {
		leerArchivoJuego();
		
		String nombre = gui.leerDatoString("Digite el nombre del juego");
		String tipo = gui.leerDatoString("Digite el tipo de juego");
		int jugadores = gui.leerDatoEntero("Digite el numero de jugadores");
		
		gui.mostrarInformacion("El juego fue agregado exitosamente!");
		
		juego.add(new JuegoDTO(nombre, tipo, jugadores));
		
		escribirArchivoJuego();
		
	}
	
    public int escribirArchivoJuego() {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
            salida.writeObject(juego);
            salida.close();
        } catch (IOException e) {
            return -1;
        }
        return 0;
    }
	
	public int leerArchivoJuego() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta));
			juego = (ArrayList<JuegoDTO>)in.readObject();
			in.close();
		} catch(IOException | ClassNotFoundException e) {
			return -1;
		}
		return 0;
	}
}
