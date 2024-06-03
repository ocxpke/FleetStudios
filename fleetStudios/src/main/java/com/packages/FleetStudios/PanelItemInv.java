package com.packages.FleetStudios;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PanelItemInv extends JPanel {

	private static final long serialVersionUID = 1L;
	public TitleInv titulo;
	public ContInv cont;
	public BottInv bttInv;

	/**
	 * Create the panel.
	 */
	public PanelItemInv(String nomI, ImageIcon img, String desc, int amount) {
		setLayout(new BorderLayout(0, 0));

		titulo = new TitleInv(nomI);
		titulo.setPreferredSize(new Dimension(360, 100));
		add(titulo, BorderLayout.NORTH);

		cont = new ContInv(img, desc);
		cont.setPreferredSize(new Dimension(360, 500));
		add(cont, BorderLayout.CENTER);

		bttInv = new BottInv(amount);
		bttInv.setPreferredSize(new Dimension(360, 100));
		add(bttInv, BorderLayout.SOUTH);

	}

}
