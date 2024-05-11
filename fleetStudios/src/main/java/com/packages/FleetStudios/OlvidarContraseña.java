package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class OlvidarContraseña extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UsuarioEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlvidarContraseña frame = new OlvidarContraseña();
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
	public OlvidarContraseña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Continuar = new JButton("Continuar");
		Continuar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Continuar.setBounds(329, 359, 180, 40);
		contentPane.add(Continuar);
		
		UsuarioEmail = new JTextField();
		UsuarioEmail.setBounds(329, 281, 425, 35);
		contentPane.add(UsuarioEmail);
		UsuarioEmail.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario o Correo Electrónico");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(329, 229, 425, 31);
		contentPane.add(lblNewLabel);
		
		JButton Atras = new JButton("Atrás");
		Atras.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Atras.setBounds(577, 359, 180, 40);
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IniciarSesion newFrame = new IniciarSesion();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(Atras);
	}

}
