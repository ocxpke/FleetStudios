package com.packages.FleetStudios;

import java.util.Scanner;
import java.lang.Math;

public class Tablero {

	private final int XLEN = 10;
	private final int YLEN = 10;
	private int[][] table = new int[XLEN][YLEN];

	public Tablero() {
		for (int i = 0; i < this.table.length; i++) {
			for (int z = 0; z < this.table[i].length; z++) {
				this.table[i][z] = 0;
			}
		}
		this.ship2();
	}

	public void ship3() {

	}

	public void ship4() {

	}

	public void ship2() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		this.table[x][y]=1;
	}

	public String toString() {
		String res="";
		for (int i = 0; i < this.table.length; i++) {
			for (int z = 0; z < this.table[i].length; z++) {
				res+=this.table[i][z]+" ";
			}
			res+="\n";
		}
		return res;
	}
}
