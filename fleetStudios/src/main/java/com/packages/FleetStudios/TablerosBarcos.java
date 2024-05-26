package com.packages.FleetStudios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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

	public void ship2() {
		Barco b = new Barco(2);
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
						}catch(Exception e1) {
							System.err.println(e1);
						}
						System.out.println(b.col);
						b.col++;

						if (b.col == 2) {
							resetBtn(tableroBut);
							System.out.println("re");
							
							for (int i = 0; i < b.loc.length; i++) {
								for (int z = 0; z < b.loc[i].length; z++) {
									System.out.print(b.loc[i][z]+" ");
								}
								System.out.println();
							}
							
						}

					}
				});
			}
		}
	}

	//ESTO NO FUNCIONA
	public void resetBtn(BotonBarcos tableroBut[][]) {
		for (int i = 0; i < tableroBut.length; i++) {
			for (int z = 0; z < tableroBut[i].length; z++) {
				int x = i;
				int y = z;
				tableroBut[i][z].btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tableroBut[x][y].btn.setBackground(Color.green);
					}
				});
			}
		}
	}
}
