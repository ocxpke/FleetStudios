package com.packages.FleetStudios;

import java.sql.Blob;

public class Objeto {
	protected String nombre, desc;
	protected int amount;
	protected byte[] imgB;

	public Objeto(String nombre, String desc, int amount, byte[] imgB) {
		this.nombre = nombre;
		this.desc = desc;
		this.amount = amount;
		this.imgB = imgB;
	}

}
