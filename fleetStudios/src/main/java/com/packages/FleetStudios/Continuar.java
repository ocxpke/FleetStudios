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
		
		JButton unJugador = new JButton("Un Jugador");
		unJugador.setFont(new Font("Arial Black", Font.PLAIN, 20));
		unJugador.setBounds(354, 205, 435, 45);
		unJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UnJugador newFrame = new UnJugador();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(unJugador);
		
		JButton multijugador = new JButton("Multijugador");
		multijugador.setFont(new Font("Arial Black", Font.PLAIN, 20));
		multijugador.setBounds(354, 274, 435, 45);
		multijugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultiJugador newFrame = new MultiJugador();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(multijugador);
		
		JButton tienda = new JButton("Tienda");
		tienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tienda.setFont(new Font("Arial Black", Font.PLAIN, 20));
		tienda.setBounds(354, 346, 435, 45);
		contentPane.add(tienda);
		
		JButton opciones = new JButton("Opciones");
		opciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Opciones newFrame = new Opciones();
				newFrame.setVisible(true);
				dispose();
			}
		});
		opciones.setFont(new Font("Arial Black", Font.PLAIN, 20));
		opciones.setBounds(311, 426, 230, 40);
		contentPane.add(opciones);
		
		JButton cerrar = new JButton("Cerrar Sink&Win");
		cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Primera_Capa newFrame = new Primera_Capa();
				newFrame.setVisible(true);
				dispose();
			}
		});
		cerrar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		cerrar.setBounds(621, 426, 230, 40);
		contentPane.add(cerrar);
	}
}
