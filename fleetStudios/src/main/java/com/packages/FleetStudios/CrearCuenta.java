package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class CrearCuenta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField nick;
	private JTextField email;
	private JTextField repEmail;
	private JTextField contrasena;
	private JTextField repContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCuenta frame = new CrearCuenta();
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
	public CrearCuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 740);
		getContentPane().setLayout(null);
		
		nick = new JTextField();
		nick.setBounds(365, 163, 371, 40);
		getContentPane().add(nick);
		nick.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(365, 230, 371, 40);
		getContentPane().add(email);
		
		repEmail = new JTextField();
		repEmail.setColumns(10);
		repEmail.setBounds(365, 298, 371, 40);
		getContentPane().add(repEmail);
		
		contrasena = new JTextField();
		contrasena.setColumns(10);
		contrasena.setBounds(365, 370, 371, 40);
		getContentPane().add(contrasena);
		
		repContrasena = new JTextField();
		repContrasena.setColumns(10);
		repContrasena.setBounds(365, 440, 371, 40);
		getContentPane().add(repContrasena);
		
		JLabel textNick = new JLabel("Nick");
		textNick.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textNick.setBounds(365, 127, 52, 25);
		getContentPane().add(textNick);
		
		JLabel textEmail = new JLabel("Correo Electrónico");
		textEmail.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textEmail.setBounds(365, 206, 192, 13);
		getContentPane().add(textEmail);
		
		JLabel textFechaNac = new JLabel("Fecha de nacimiento");
		textFechaNac.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textFechaNac.setBounds(365, 274, 244, 13);
		getContentPane().add(textFechaNac);
		
		JLabel textContrasena = new JLabel("Contraseña");
		textContrasena.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textContrasena.setBounds(365, 346, 192, 13);
		getContentPane().add(textContrasena);
		
		JLabel textCrearCuenta = new JLabel("Crea Tu Cuenta");
		textCrearCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		textCrearCuenta.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textCrearCuenta.setBounds(446, 53, 192, 40);
		getContentPane().add(textCrearCuenta);
		
		JButton crearCuenta = new JButton("Crear Cuenta");
		crearCuenta.setFont(new Font("Arial Black", Font.PLAIN, 20));
		crearCuenta.setBounds(366, 540, 370, 50);
		crearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(crearCuenta);
		
		JButton iniciarSesion = new JButton("Iniciar Sesion");
		iniciarSesion.setFont(new Font("Arial Black", Font.PLAIN, 15));
		iniciarSesion.setBounds(468, 622, 170, 40);
		iniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IniciarSesion newFrame = new IniciarSesion();
				newFrame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(iniciarSesion);
		
		JLabel textPregunta = new JLabel("¿Ya tienes una cuenta?");
		textPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		textPregunta.setFont(new Font("Arial", Font.PLAIN, 15));
		textPregunta.setBounds(468, 600, 170, 25);
		getContentPane().add(textPregunta);
		
		JLabel textRepContrasena = new JLabel("Repetir contraseña");
		textRepContrasena.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textRepContrasena.setBounds(365, 416, 192, 13);
		getContentPane().add(textRepContrasena);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 366, 700);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(734, 0, 366, 700);
		getContentPane().add(btnNewButton_1);
		
		JLabel fondo = new JLabel("");
		fondo.setBounds(0, 0, 1100, 700);
		getContentPane().add(fondo);
	}
}
