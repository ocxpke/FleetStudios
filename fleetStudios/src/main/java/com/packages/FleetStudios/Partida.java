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
import javax.swing.JButton;

public class Partida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Partida frame = new Partida();
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
	public Partida() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textPosicion = new JLabel("Posicione los Barcos");
		textPosicion.setHorizontalAlignment(SwingConstants.CENTER);
		textPosicion.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textPosicion.setBounds(522, 20, 294, 50);
		contentPane.add(textPosicion);
		
		JLabel textTablero1 = new JLabel("Tablero");
		textTablero1.setHorizontalAlignment(SwingConstants.CENTER);
		textTablero1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textTablero1.setBounds(154, 125, 327, 258);
		contentPane.add(textTablero1);
		
		JLabel textTablero2 = new JLabel("Tablero");
		textTablero2.setHorizontalAlignment(SwingConstants.CENTER);
		textTablero2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textTablero2.setBounds(706, 111, 327, 258);
		contentPane.add(textTablero2);
		
		JLabel textCampo = new JLabel("Su campo");
		textCampo.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textCampo.setBounds(269, 413, 109, 23);
		contentPane.add(textCampo);
		
		JLabel textCampoContrario = new JLabel("Campo del Contrincante");
		textCampoContrario.setHorizontalAlignment(SwingConstants.CENTER);
		textCampoContrario.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textCampoContrario.setBounds(738, 413, 298, 23);
		contentPane.add(textCampoContrario);
		
		JLabel textOtroJugador = new JLabel("Otro Jugador");
		textOtroJugador.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textOtroJugador.setHorizontalAlignment(SwingConstants.CENTER);
		textOtroJugador.setBounds(823, 446, 157, 29);
		contentPane.add(textOtroJugador);
		
		JButton btnNewButton = new JButton("Aleatoriamente");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnNewButton.setBounds(235, 558, 123, 21);
	
		contentPane.add(btnNewButton);
		
		JButton btnManual = new JButton("Manual");
		btnManual.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnManual.setBounds(390, 558, 123, 21);
		btnManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manual newFrame = new Manual();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnManual);
		
		JButton btnNewButton_1 = new JButton("Jugar");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1.setBounds(631, 599, 131, 29);
		contentPane.add(btnNewButton_1);
	}
}
