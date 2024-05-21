package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class OlvidarContraseña extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nickField;
	private JTextField newPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Clip c=null;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlvidarContraseña frame = new OlvidarContraseña(c);
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
	public OlvidarContraseña(Clip c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton continuar = new JButton("");
		continuar.setIcon(new ImageIcon(OlvidarContraseña.class.getResource("/images/continuar2.png")));
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		continuar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		continuar.setBounds(329, 446, 180, 40);
		contentPane.add(continuar);
		
		nickField = new JTextField();
		nickField.setBounds(329, 243, 425, 35);
		contentPane.add(nickField);
		nickField.setColumns(10);
		
		JLabel labelNickText = new JLabel("Nick de usuario");
		labelNickText.setHorizontalAlignment(SwingConstants.CENTER);
		labelNickText.setFont(new Font("3270 Nerd Font", Font.BOLD, 20));
		labelNickText.setBounds(329, 212, 425, 31);
		contentPane.add(labelNickText);
		
		JButton atras = new JButton("");
		atras.setIcon(new ImageIcon(OlvidarContraseña.class.getResource("/images/atras.png")));
		atras.setFont(new Font("Arial Black", Font.PLAIN, 20));
		atras.setBounds(574, 446, 180, 40);
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IniciarSesion newFrame = new IniciarSesion(c);
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(atras);
		
		newPassword = new JTextField();
		newPassword.setColumns(10);
		newPassword.setBounds(329, 341, 425, 35);
		contentPane.add(newPassword);
		
		JLabel textUsuEmail_1 = new JLabel("Nueva contraseña");
		textUsuEmail_1.setHorizontalAlignment(SwingConstants.CENTER);
		textUsuEmail_1.setFont(new Font("3270 Nerd Font", Font.BOLD, 20));
		textUsuEmail_1.setBounds(329, 309, 425, 31);
		contentPane.add(textUsuEmail_1);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(OlvidarContraseña.class.getResource("/images/fondoOlvidarContrasena.png")));
		fondo.setBounds(0, 0, 1100, 700);
		contentPane.add(fondo);
	}
}
