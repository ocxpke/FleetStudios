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
		
		JLabel textEmail = new JLabel("Correo Electrónico");
		textEmail.setFont(new Font("Courgette", Font.PLAIN, 15));
		textEmail.setBounds(358, 204, 138, 18);
		contentPane.add(textEmail);
		
		JLabel textContrasena = new JLabel("Contraseña");
		textContrasena.setFont(new Font("Courgette", Font.PLAIN, 15));
		textContrasena.setBounds(358, 260, 138, 18);
		contentPane.add(textContrasena);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(358, 224, 381, 26);
		contentPane.add(email);
		
		JButton continuar = new JButton("");
		continuar.setIcon(new ImageIcon("C:\\Users\\xandreiitaax\\OneDrive\\Escritorio\\f\\FleetStudios\\fleetStudios\\src\\main\\bin\\com\\packages\\continuar.png"));
		continuar.setFont(new Font("Arial Black", Font.PLAIN, 15));
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		continuar.setBounds(424, 333, 250, 50);
		contentPane.add(continuar);
		
		JButton olvidarContrasena = new JButton("");
		olvidarContrasena.setIcon(new ImageIcon("C:\\Users\\xandreiitaax\\OneDrive\\Escritorio\\f\\FleetStudios\\fleetStudios\\src\\main\\bin\\com\\packages\\¿Has olvidado tu contraseña.png"));
		olvidarContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OlvidarContraseña newFrame = new OlvidarContraseña();
				newFrame.setVisible(true);
				dispose();
			}
		});
		olvidarContrasena.setBounds(506, 393, 100, 40);
		contentPane.add(olvidarContrasena);
		
		JLabel textPregunta = new JLabel("¿No tienes cuenta registrada?");
		textPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		textPregunta.setBounds(467, 467, 180, 18);
		contentPane.add(textPregunta);
		
		JButton registrate = new JButton("");
		registrate.setIcon(new ImageIcon("C:\\Users\\xandreiitaax\\OneDrive\\Escritorio\\f\\FleetStudios\\fleetStudios\\src\\main\\bin\\com\\packages\\Registrate.jpg"));
		registrate.setFont(new Font("Unispace", Font.PLAIN, 11));
		registrate.setBounds(517, 487, 70, 40);
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
		contrasena.setBounds(358, 278, 381, 26);
		contentPane.add(contrasena);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\xandreiitaax\\OneDrive\\Escritorio\\f\\FleetStudios\\fleetStudios\\src\\main\\bin\\com\\packages\\3.jpg"));
		lblNewLabel.setBounds(0, 0, 1110, 703);
		contentPane.add(lblNewLabel);
		
		
	}
}
