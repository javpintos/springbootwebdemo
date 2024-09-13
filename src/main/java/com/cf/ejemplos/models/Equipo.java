package com.cf.ejemplos.models;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String nombre;
	List<Jugador> plantilla;
	
	public Equipo() {
		this.plantilla = new ArrayList();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(List<Jugador> plantilla) {
		this.plantilla = plantilla;
	}
	
	public void addJugador(Jugador jugador) {
		plantilla.add(jugador);
	}

}
