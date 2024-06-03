package com.packages.FleetStudios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.UIManager;

public class TablerosBarcos {

	final int LEN = 10;
	protected int tableroNum[][];
	protected BotonBarcos tableroBut[][];
	protected Barco bs[] = new Barco[6];
	// protected Barco b;

	public TablerosBarcos() {
		this.tableroNum = new int[LEN][LEN];
		this.tableroBut = new BotonBarcos[LEN][LEN];

		for (int i = 0; i < tableroNum.length; i++) {
			for (int z = 0; z < tableroNum[i].length; z++) {
				this.tableroNum[i][z] = 0;
			}
		}

	}

	public void ship2(int index, int lenB) {
		bs[index] = new Barco(lenB);
		for (int i = 0; i < tableroNum.length; i++) {
			for (int z = 0; z < tableroNum[i].length; z++) {
				int x = i;
				int y = z;

				this.tableroBut[i][z].btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tableroBut[x][y].btn.setBackground(Color.blue);
						try {
							bs[index].loc[bs[index].col][0] = x;
							bs[index].loc[bs[index].col][1] = y;
						} catch (Exception e1) {
							System.err.println(e1);
						}
						bs[index].col++;

						if (bs[index].col == 2) {
							resetBtn();
							boolean isSV = isValidShip(bs[index]);
							// Here we rest wrong position
							if (!isSV) {
								//Arreglar posicion ya escogida
								tableroBut[bs[index].loc[0][0]][bs[index].loc[0][1]].btn
										.setBackground(UIManager.getColor("Button.background"));
								tableroBut[bs[index].loc[1][0]][bs[index].loc[1][1]].btn
										.setBackground(UIManager.getColor("Button.background"));
								bs[index] = null;
								ship2(index, lenB);
							} else {
								System.out.println(tableNumToString());
								ship2(index + 1, lenB);
							}

						}
					}
				});
			}
		}
	}

	public boolean isValidShip(Barco b) {
		boolean ret = true;
		// System.out.println(this.tableNumToString());
		Coordenadas c1 = new Coordenadas(b.loc[0][0], b.loc[0][1]);
		Coordenadas c2 = new Coordenadas(b.loc[1][0], b.loc[1][1]);
		if (tableroNum[c1.x][c1.y] == 1 || tableroNum[c2.x][c2.y] == 1) {
			return false;
		}
		
		 System.out.println(c1.toString()); System.out.println(c2.toString());
		 
		// System.out.println(c1.posValid(c2));
		if (c1.posValid(c2)) {
			tableroNum[c1.x][c1.y] = 1;
			tableroNum[c2.x][c2.y] = 1;
		} else {
			ret = false;
		}
		// System.out.println(this.tableNumToString());
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
