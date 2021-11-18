package co.edu.unbosque.model;

import java.io.Serializable;

public class JugadorDTO implements Serializable {
    private String nombre;
    private int edad;
    private String genero;
    private double puntaje;
    private long documento;
    
    public JugadorDTO(String nombre, int edad, String genero, double puntaje, long documento) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.puntaje = puntaje;
		this.documento = documento;
	}

	public int getEdad() {
		return edad;
	}
    
    public void setEdad(int edad) {
		this.edad = edad;
	}
    
    public String getNombre() {
		return nombre;
	}
    
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    public String getGenero() {
		return genero;
	}
    
    public void setGenero(String genero) {
		this.genero = genero;
	}
    
    public double getPuntaje() {
		return puntaje;
	}
    
    public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}
    
    public long getDocumento() {
		return documento;
	}
    
    public void setDocumento(long documento) {
		this.documento = documento;
	}
}
