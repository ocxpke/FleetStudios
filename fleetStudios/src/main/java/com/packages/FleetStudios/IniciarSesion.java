package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class IniciarSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField email;
	private JTextField contrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion frame = new IniciarSesion();
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
	public IniciarSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textTuCuenta = new JLabel("Tu Cuenta");
		textTuCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		textTuCuenta.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textTuCuenta.setBounds(433, 112, 240, 29);
		contentPane.add(textTuCuenta);
		
		JLabel textEmail = new JLabel("Correo Electrónico");
		textEmail.setFont(new Font("Courgette", Font.PLAIN, 15));
		textEmail.setBounds(358, 193, 138, 18);
		contentPane.add(textEmail);
		
		JLabel textContrasena = new JLabel("Contraseña");
		textContrasena.setFont(new Font("Courgette", Font.PLAIN, 15));
		textContrasena.setBounds(358, 285, 138, 18);
		contentPane.add(textContrasena);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(358, 213, 381, 40);
		contentPane.add(email);
		
		JButton continuar = new JButton("Continuar");
		continuar.setFont(new Font("Arial Black", Font.PLAIN, 15));
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		continuar.setBounds(385, 500, 330, 70);
		contentPane.add(continuar);
		
		JButton olvidarContrasena = new JButton("¿Has olvidado tu contraseña?");
		olvidarContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OlvidarContraseña newFrame = new OlvidarContraseña();
				newFrame.setVisible(true);
				dispose();
			}
		});
		olvidarContrasena.setBounds(423, 427, 250, 40);
		contentPane.add(olvidarContrasena);
		
		JLabel textPregunta = new JLabel("¿No tienes cuenta registrada?");
		textPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		textPregunta.setBounds(433, 606, 240, 13);
		contentPane.add(textPregunta);
		
		JButton registrate = new JButton("Registrate");
		registrate.setFont(new Font("Unispace", Font.PLAIN, 11));
		registrate.setBounds(472, 619, 160, 60);
		registrate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearCuenta newFrame = new CrearCuenta();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(registrate);
		
		contrasena = new JTextField();
		contrasena.setColumns(10);
		contrasena.setBounds(358, 304, 381, 40);
		contentPane.add(contrasena);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 360, 700);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(739, 0, 360, 700);
		contentPane.add(btnNewButton_1);
		
		JLabel fondo = new JLabel("");
		fondo.setBounds(0, 0, 1100, 700);
		contentPane.add(fondo);
	}
}
