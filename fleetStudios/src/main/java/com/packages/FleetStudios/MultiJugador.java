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
import java.awt.Color;

public class MultiJugador extends JFrame {

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
					MultiJugador frame = new MultiJugador(c);
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
	public MultiJugador(Clip musicTheme) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textMultijugador = new JLabel("Multijugador");
		textMultijugador.setHorizontalAlignment(SwingConstants.CENTER);
		textMultijugador.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textMultijugador.setBounds(422, 34, 146, 52);
		contentPane.add(textMultijugador);
		
		JButton comienza = new JButton("COMIENZA");
		comienza.setFont(new Font("Arial Black", Font.PLAIN, 20));
		comienza.setBounds(338, 302, 188, 43);
		comienza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Partida newFrame = new Partida();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(comienza);
		
		JButton atras = new JButton("ATRÁS");
		atras.setFont(new Font("Arial Black", Font.PLAIN, 20));
		atras.setBounds(574, 302, 188, 43);
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
