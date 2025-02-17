package model;

import java.util.ArrayList;
import java.util.List;

import ofertable.Ofertable;

public class Atraccion extends Ofertable {
	protected int id;
	protected String nombre;
	protected int tipoDeAtraccion;
	protected int tiempoEnMinutos;
	protected int costo;
	protected int cupo;

	public Atraccion(int id, String nombre, int costo, int tiempo, int cupo, int tipo) {
		this.id = id;
		this.nombre = nombre;
		this.tiempoEnMinutos = tiempo;
		this.costo = costo;
		this.cupo = cupo;
		this.tipoDeAtraccion = tipo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getTipo() {
		return this.tipoDeAtraccion;
	}

	public int getTiempo() {
		return this.tiempoEnMinutos;
	}

	public int getCosto() {
		return this.costo;
	}

	@Override
	public int getCostoTotal() {
		return getCosto();
	}

	public int getCupo() {
		return this.cupo;
	}

	public void ocuparAtraccion() {
		this.cupo--;
	}

	public boolean cupoDisponible() {
		if (this.getCupo() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void setTiempoTotal() {

	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	@Override
	public void setCostoTotal() {
	}

	@Override
	public String toString() {

		return "[" + nombre + ", costo: " + costo + " monedas, tiempo: " + tiempoEnMinutos + " minutos, cupo: " + cupo
				+ ", tipo: " + this.nombreTipo() + "]\n";
	}

	@Override
	public List<Atraccion> getAtracciones() {
		return null;

	}

	@Override
	public int getTiempoTotal() {
		return getTiempo();
	}

	@Override
	public List<Atraccion> getListaAtracciones() {
		return null;
	}
	
	public int getID() {
		return this.id;
	}

	public String nombreTipo() {
		switch (this.tipoDeAtraccion) {
		case 1: {
			return "TERROR";
		}
		case 2: {
			return "AUDIOVISUAL";
		}
		case 3: {
			return "EXPLORACION";
		}

		}
		return null;
	}
	public List<Atraccion> getAtraccionesPorId(int id){
		
		List<Atraccion> atraccionesPorId = new ArrayList<Atraccion>();
		
		for (Atraccion atraccion : atracciones) {
			if(atraccion.getID() == id) {
				atraccionesPorId.add(atraccion);
			}
		}
		return atraccionesPorId;
	}
	
	
	
}
