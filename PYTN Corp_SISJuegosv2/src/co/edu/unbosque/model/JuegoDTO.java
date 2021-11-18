package co.edu.unbosque.model;

import java.io.*;

public class JuegoDTO implements Serializable {
    private String nombre;
    private String tipo;
    private int jugadores;

    public JuegoDTO(String nombre, String tipo, int jugadores){
        this.nombre = nombre;
        this.tipo = tipo;
        this.jugadores = jugadores;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getJugadores() {
		return jugadores;
	}
	
	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}
}


