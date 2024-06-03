package com.packages.FleetStudios;

import java.sql.Blob;

public class Objeto {
	protected String nombre, desc;
	protected int id, amount;
	protected byte[] imgB;

	public Objeto(int id, String nombre, String desc, int amount, byte[] imgB) {
		this.id = id;
		this.nombre = nombre;
		this.desc = desc;
		this.amount = amount;
		this.imgB = imgB;
	}

}
