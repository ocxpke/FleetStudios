package com.packages.FleetStudios;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ContInv extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel desc;
	public JLabel img;

	/**
	 * Create the panel.
	 */
	public ContInv(ImageIcon imgIt, String descIt) {
		setLayout(null);

		img = new JLabel("");
		img.setBounds(89, 52, 169, 160);
		img.setIcon(imgIt);
		add(img);

		desc = new JLabel("");
		desc.setFont(new Font("Monocraft", Font.BOLD, 20));
		desc.setBounds(10, 251, 340, 238);
		desc.setText("<html>" + descIt + "<html>");
		add(desc);

		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(ContInv.class.getResource("/images/fndoCont.png")));
		fondo.setBounds(0, 0, 360, 500);
		add(fondo);

	}

}
