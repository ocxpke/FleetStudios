package com.packages.FleetStudios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BotonBarcos {
	JButton btn;
	int x;
	int y;

	public BotonBarcos(int x, int y) {
		this.x = x;
		this.y = y;
		btn = new JButton();
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(x + "," + y);
				btn.setBackground(Color.green);
			}
		});
	}

}
//ButtonShips bs =new btnsebsfd(x,y);
