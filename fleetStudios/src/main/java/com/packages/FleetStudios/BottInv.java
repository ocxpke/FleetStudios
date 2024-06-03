package com.packages.FleetStudios;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class BottInv extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public BottInv(int amnt) {
		setLayout(null);

		JLabel amount = new JLabel("");
		amount.setForeground(new Color(50, 205, 50));
		amount.setHorizontalAlignment(SwingConstants.CENTER);
		amount.setFont(new Font("Monocraft", Font.BOLD, 33));
		amount.setBounds(217, 11, 122, 65);
		amount.setText(amnt + "");
		add(amount);

		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(BottInv.class.getResource("/images/amountFnd.png")));
		fondo.setBounds(0, 0, 360, 100);
		add(fondo);

	}
}
