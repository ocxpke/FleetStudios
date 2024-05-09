package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Continuar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Continuar frame = new Continuar();
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
	public Continuar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Un Jugador");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton.setBounds(354, 205, 435, 43);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UnJugador newFrame = new UnJugador();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnMultijugador = new JButton("Multijugador");
		btnMultijugador.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnMultijugador.setBounds(354, 274, 435, 43);
		btnMultijugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultiJugador newFrame = new MultiJugador();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnMultijugador);
		
		JButton btnTorneo = new JButton("Torneo");
		btnTorneo.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnTorneo.setBounds(354, 346, 435, 43);
		contentPane.add(btnTorneo);
		
		JButton btnNewButton_1 = new JButton("Opciones");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Opciones newFrame = new Opciones();
				newFrame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1.setBounds(311, 426, 227, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Cerrar Sink&Win");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Primera_Capa newFrame = new Primera_Capa();
				newFrame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(621, 426, 227, 37);
		contentPane.add(btnNewButton_1_1);
	}
}
