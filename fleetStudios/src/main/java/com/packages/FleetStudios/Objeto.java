package com.packages.FleetStudios;

public class Objeto {
	private String nombre, desc;
	private int amount;

	public Objeto(String nombre, String desc, int amount) {
		this.nombre = nombre;
		this.desc = desc;
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
