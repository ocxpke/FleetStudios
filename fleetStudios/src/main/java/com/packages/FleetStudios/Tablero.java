package com.packages.FleetStudios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Tablero extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected TablerosBarcos tb1, tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero frame = new Tablero();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tablero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		tb1 = new TablerosBarcos();
		tb2 = new TablerosBarcos();

		createBoard(contentPane, 100, 100, 30, 30, tb1);
		createBoard(contentPane, 644, 100, 30, 30, tb2);
		/*
		 * colocar b t1 colocar b t2 jugar
		 */

		tb1.tableroBut[3][3].btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ejemplo
				tb1.tableroBut[3][3].btn.setBackground(Color.green);
			}
		});

	}

	private void createBoard(JPanel panel, int startX, int startY, int buttonWidth, int buttonHeight,
			TablerosBarcos tb) {
		int space = 5; // Espacio entre los botones

		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				BotonBarcos bs = new BotonBarcos(row, col);
				int x = startX + col * (buttonWidth + space);
				int y = startY + row * (buttonHeight + space);
				bs.btn.setBounds(x, y, buttonWidth, buttonHeight); // coloca cada boton en un punto determinado
				tb.tableroBut[row][col] = bs;
				panel.add(bs.btn);
			}
		}
	}

}