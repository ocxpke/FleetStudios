package com.packages.FleetStudios;

public class TablerosBarcos {

	final int LEN = 10;
	protected int tableroNum[][];
	protected BotonBarcos tableroBut[][];

	public TablerosBarcos() {
		this.tableroNum = new int[LEN][LEN];
		this.tableroBut = new BotonBarcos[LEN][LEN];

		for (int i = 0; i < tableroNum.length; i++) {
			for (int z = 0; z < tableroNum[i].length; z++) {
				this.tableroNum[i][z] = 0;
			}
		}
	}
}
