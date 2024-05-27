package com.packages.FleetStudios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TablerosBarcos {

	final int LEN = 10;
	protected int tableroNum[][];
	protected BotonBarcos tableroBut[][];
	protected Barco b;

	public TablerosBarcos() {
		this.tableroNum = new int[LEN][LEN];
		this.tableroBut = new BotonBarcos[LEN][LEN];

		for (int i = 0; i < tableroNum.length; i++) {
			for (int z = 0; z < tableroNum[i].length; z++) {
				this.tableroNum[i][z] = 0;
			}
		}
	}

	public void ship2() {
		b = new Barco(2);
		for (int i = 0; i < tableroNum.length; i++) {
			for (int z = 0; z < tableroNum[i].length; z++) {
				int x = i;
				int y = z;

				this.tableroBut[i][z].btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tableroBut[x][y].btn.setBackground(Color.blue);
						try {
							b.loc[b.col][0] = x;
							b.loc[b.col][1] = y;
						} catch (Exception e1) {
							System.err.println(e1);
						}
						System.out.println(b.col);
						b.col++;

						if (b.col == 2) {
							resetBtn();
							System.out.println("re");

							isValidShip(b);

						}
					}
				});
			}
		}
	}

	public boolean isValidShip(Barco b) {
		boolean ret = true;
		System.out.println(this.tableNumToString());
		Coordenadas c1 = new Coordenadas(b.loc[0][0], b.loc[0][1]);
		Coordenadas c2 = new Coordenadas(b.loc[1][0], b.loc[1][1]);
		if (tableroNum[c1.x][c1.y] == 1 || tableroNum[c2.x][c2.y] == 1) {
			return false;
		}
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.posValid(c2));
		if (c1.posValid(c2)) {
			tableroNum[c1.x][c1.y] = 1;
			tableroNum[c2.x][c2.y] = 1;
		}
		System.out.println(this.tableNumToString());
		return ret;
	}

	// ESTO NO FUNCIONA
	public void resetBtn() {
		for (int i = 0; i < this.tableroBut.length; i++) {
			for (int z = 0; z < this.tableroBut[i].length; z++) {
				this.tableroBut[i][z].btn.removeActionListener(this.tableroBut[i][z].btn.getActionListeners()[0]);
			}
		}
	}

	public String tableNumToString() {
		String ret = "";
		for (int i = 0; i < this.tableroNum.length; i++) {
			for (int z = 0; z < this.tableroNum[i].length; z++) {
				ret += this.tableroNum[i][z] + " ";
			}
			ret += "\n";
		}
		return ret;
	}
}
