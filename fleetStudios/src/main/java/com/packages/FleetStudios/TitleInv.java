package com.packages.FleetStudios;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class TitleInv extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TitleInv(String nombre) {
		setLayout(null);
		
		JLabel titulo = new JLabel("");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(new Color(127, 255, 0));
		titulo.setFont(new Font("Monocraft", Font.BOLD, 27));
		titulo.setBounds(0, 11, 360, 78);
		titulo.setText(nombre);
		add(titulo);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(TitleInv.class.getResource("/images/tituloObj.png")));
		fondo.setBounds(0, 0, 360, 100);
		add(fondo);

	}
}
