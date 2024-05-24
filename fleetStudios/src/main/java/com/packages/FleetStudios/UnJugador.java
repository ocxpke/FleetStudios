package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JTextField;

public class UnJugador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Clip c = null;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnJugador frame = new UnJugador(c);
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
	public UnJugador(Clip musicTheme) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textSinConexion = new JLabel("Sin Conexión");
		textSinConexion.setHorizontalAlignment(SwingConstants.CENTER);
		textSinConexion.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textSinConexion.setBounds(397, 42, 164, 40);
		contentPane.add(textSinConexion);
		
		JButton comienza = new JButton("COMIENZA");
		comienza.setFont(new Font("Arial Black", Font.PLAIN, 20));
		comienza.setBounds(240, 427, 154, 47);
		comienza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tablero newFrame = new Tablero();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(comienza);
		
		JButton atras = new JButton("ATRÁS");
		atras.setFont(new Font("Arial Black", Font.PLAIN, 20));
		atras.setBounds(504, 427, 154, 47);
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar(musicTheme);
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(atras);
	}

}
