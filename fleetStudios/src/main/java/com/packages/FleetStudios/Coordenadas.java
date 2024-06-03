package com.packages.FleetStudios;

public class Coordenadas {
	int x, y;

	public Coordenadas(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean iguales(Coordenadas c2) {
		boolean ret = false;
		if (this.x == c2.x && this.y == c2.y) {
			ret = true;
		}
		return ret;
	}

	public boolean posValid(Coordenadas c2) {
		boolean ret = false;

		if (Math.abs((this.x - c2.x)) + Math.abs((this.y - c2.y)) == 1) {
			ret = true;
		}

		return ret;
	}

	@Override
	public String toString() {
		String ret = "";
		ret += this.x + "," + this.y;
		return ret;
	}
}
