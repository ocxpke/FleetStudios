package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
		textEmail.setBounds(358, 193, 138, 18);
		contentPane.add(textEmail);
		
		JLabel textContrasena = new JLabel("Contraseña");
		textContrasena.setFont(new Font("Courgette", Font.PLAIN, 15));
		textContrasena.setBounds(358, 249, 138, 18);
		contentPane.add(textContrasena);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(358, 211, 381, 28);
		contentPane.add(email);
		
		JButton continuar = new JButton("");
		continuar.setIcon(new ImageIcon(IniciarSesion.class.getResource("/images/continuarr.png")));
		continuar.setFont(new Font("Arial Black", Font.PLAIN, 15));
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		continuar.setBounds(384, 365, 330, 70);
		contentPane.add(continuar);
		
		JButton olvidarContrasena = new JButton("");
		olvidarContrasena.setIcon(new ImageIcon(IniciarSesion.class.getResource("/images/¿Has olidado tu contraseña.png")));
		olvidarContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OlvidarContraseña newFrame = new OlvidarContraseña();
				newFrame.setVisible(true);
				dispose();
			}
		});
		olvidarContrasena.setBounds(423, 315, 250, 40);
		contentPane.add(olvidarContrasena);
		
		JLabel textPregunta = new JLabel("¿No tienes cuenta registrada?");
		textPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		textPregunta.setBounds(423, 457, 240, 13);
		contentPane.add(textPregunta);
		
		JButton registrate = new JButton("");
		registrate.setIcon(new ImageIcon(IniciarSesion.class.getResource("/images/Registrate.png")));
		registrate.setFont(new Font("Unispace", Font.PLAIN, 11));
		registrate.setBounds(466, 480, 160, 60);
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
		contrasena.setBounds(358, 265, 381, 28);
		contentPane.add(contrasena);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(IniciarSesion.class.getResource("/images/fondoIniciarSesion.png")));
		fondo.setBounds(0, 0, 1100, 700);
		contentPane.add(fondo);
	}
	
	public void resetFormulario() {
		email.setText(null);
		contrasena.setText(null);
	}
	
	public String[] getDatosLogin() {
		String textEmail = email.getText();
		String textContrasena = contrasena.getText();
		
		if(textEmail.isEmpty()) {
			JOptionPane.showMessageDialog(null, "El campo correo electronico no puede estar vacio", "Iniciar Sesion", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		
		if(textContrasena.isEmpty()) {
			JOptionPane.showMessageDialog(null, "El campo ccontraseña no puede estar vacio", "Iniciar Sesion", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		
		return new String[] {textEmail, textContrasena};
		
	}
}
