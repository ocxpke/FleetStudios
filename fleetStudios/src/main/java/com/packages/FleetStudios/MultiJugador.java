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

public class MultiJugador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiJugador frame = new MultiJugador();
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
	public MultiJugador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Multijugador");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(422, 34, 146, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ELEGIR NÚMERO DE BARCOS ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(338, 112, 378, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2B");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(295, 173, 38, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("3B");
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(385, 173, 38, 31);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("4B");
		lblNewLabel_2_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(473, 173, 38, 31);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("5B");
		lblNewLabel_2_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(581, 174, 38, 31);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("6B");
		lblNewLabel_2_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(678, 173, 38, 31);
		contentPane.add(lblNewLabel_2_4);
		
		JButton Tick1 = new JButton("Tick");
		Tick1.setBounds(282, 214, 62, 21);
		contentPane.add(Tick1);
		
		JButton Tick2 = new JButton("Tick");
		Tick2.setBounds(374, 214, 62, 21);
		contentPane.add(Tick2);
		
		JButton Tick3 = new JButton("Tick");
		Tick3.setBounds(464, 214, 62, 21);
		contentPane.add(Tick3);
		
		JButton Tick4 = new JButton("Tick");
		Tick4.setBounds(568, 214, 62, 21);
		contentPane.add(Tick4);
		
		JButton Tick5 = new JButton("Tick");
		Tick5.setBounds(664, 214, 62, 21);
		contentPane.add(Tick5);
		
		JButton Comienza = new JButton("COMIENZA");
		Comienza.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Comienza.setBounds(338, 302, 188, 43);
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
		Atras.setBounds(574, 302, 188, 43);
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
