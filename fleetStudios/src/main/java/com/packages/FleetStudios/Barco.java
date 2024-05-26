package com.packages.FleetStudios;

public class Barco {
	int tam, col;
	int loc[][];

	public Barco(int tam) {
		this.tam = tam;
		this.col = 0;
		loc = new int[tam][2];
	}

}
