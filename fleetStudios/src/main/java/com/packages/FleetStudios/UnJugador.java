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
import javax.swing.JTextField;

public class UnJugador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFicha1;
	private JTextField TextFicha2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnJugador frame = new UnJugador();
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
	public UnJugador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sin Conexión");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(397, 42, 164, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ELEGIR NÚMERO DE BARCOS Y NOMBRE");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(212, 118, 541, 72);
		contentPane.add(lblNewLabel_1);
		
		JButton Ficha1 = new JButton("Ficha");
		Ficha1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Ficha1.setBounds(314, 301, 108, 21);
		contentPane.add(Ficha1);
		
		JButton Ficha2 = new JButton("Ficha");
		Ficha2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Ficha2.setBounds(314, 359, 108, 21);
		contentPane.add(Ficha2);
		
		JLabel lblNewLabel_3 = new JLabel("2B");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(286, 183, 37, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("3B");
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(379, 183, 37, 30);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("4B");
		lblNewLabel_3_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(464, 183, 37, 30);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("5B");
		lblNewLabel_3_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3_3.setBounds(553, 183, 37, 30);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("6B");
		lblNewLabel_3_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3_4.setBounds(642, 183, 37, 30);
		contentPane.add(lblNewLabel_3_4);
		
		JButton Tick1 = new JButton("Tick");
		Tick1.setBounds(276, 223, 60, 21);
		contentPane.add(Tick1);
		
		JButton Tick2 = new JButton("Tick");
		Tick2.setBounds(364, 223, 60, 21);
		contentPane.add(Tick2);
		
		JButton Tick3 = new JButton("Tick");
		Tick3.setBounds(454, 223, 60, 21);
		contentPane.add(Tick3);
		
		JButton Tick5 = new JButton("Tick");
		Tick5.setBounds(631, 223, 60, 21);
		contentPane.add(Tick5);
		
		JButton Tick4 = new JButton("Tick");
		Tick4.setBounds(543, 223, 60, 21);
		contentPane.add(Tick4);
		
		textFicha1 = new JTextField();
		textFicha1.setBounds(454, 295, 125, 30);
		contentPane.add(textFicha1);
		textFicha1.setColumns(10);
		
		TextFicha2 = new JTextField();
		TextFicha2.setColumns(10);
		TextFicha2.setBounds(454, 350, 125, 30);
		contentPane.add(TextFicha2);
		
		JButton Comienza = new JButton("COMIENZA");
		Comienza.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Comienza.setBounds(240, 427, 154, 47);
		Comienza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Partida newFrame = new Partida();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(Comienza);
		
		JButton Atras = new JButton("ATRÁS");
		Atras.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Atras.setBounds(504, 427, 154, 47);
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(Atras);
	}

}
