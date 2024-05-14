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
import javax.swing.ImageIcon;

public class CrearCuenta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField nick;
	private JTextField email;
	private JTextField contrasena;

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
		textNick.setBounds(353, 221, 52, 25);
		getContentPane().add(textNick);
		
		JLabel textEmail = new JLabel("Correo Electrónico");
		textEmail.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textEmail.setBounds(353, 285, 192, 13);
		getContentPane().add(textEmail);
		
		JLabel textContrasena = new JLabel("Contraseña");
		textContrasena.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textContrasena.setBounds(353, 346, 192, 13);
		getContentPane().add(textContrasena);
		
		JButton crearCuenta = new JButton("");
		crearCuenta.setIcon(new ImageIcon("C:\\Users\\xandreiitaax\\OneDrive\\Escritorio\\f\\FleetStudios\\fleetStudios\\src\\main\\bin\\com\\packages\\CreaTuCuenta.png"));
		crearCuenta.setFont(new Font("Arial Black", Font.PLAIN, 20));
		crearCuenta.setBounds(365, 540, 370, 50);

		crearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(crearCuenta);
		
		JButton iniciarSesion = new JButton("");
		iniciarSesion.setIcon(new ImageIcon("C:\\Users\\xandreiitaax\\OneDrive\\Escritorio\\f\\FleetStudios\\fleetStudios\\src\\main\\bin\\com\\packages\\iniciar sesión.png"));
		iniciarSesion.setFont(new Font("Arial Black", Font.PLAIN, 15));
		iniciarSesion.setBounds(492, 510, 100, 40);
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
		textPregunta.setBounds(459, 475, 158, 25);
		getContentPane().add(textPregunta);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon("C:\\Users\\xandreiitaax\\OneDrive\\Escritorio\\f\\FleetStudios\\fleetStudios\\src\\main\\bin\\com\\packages\\4.jpg"));
		fondo.setBounds(0, 0, 1100, 700);
		getContentPane().add(fondo);
		
		
		
		
	}
}
