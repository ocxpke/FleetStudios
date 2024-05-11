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
	private JTextField Nick;
	private JTextField CorreoElectronico;
	private JTextField RepCorreoElectronico;
	private JTextField Contrasena;
	private JTextField RepContrasena;

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
		setBounds(250, 50, 1100, 700);
		getContentPane().setLayout(null);
		
		Nick = new JTextField();
		Nick.setBounds(365, 163, 360, 25);
		getContentPane().add(Nick);
		Nick.setColumns(10);
		
		CorreoElectronico = new JTextField();
		CorreoElectronico.setColumns(10);
		CorreoElectronico.setBounds(365, 230, 360, 25);
		getContentPane().add(CorreoElectronico);
		
		RepCorreoElectronico = new JTextField();
		RepCorreoElectronico.setColumns(10);
		RepCorreoElectronico.setBounds(365, 298, 360, 25);
		getContentPane().add(RepCorreoElectronico);
		
		Contrasena = new JTextField();
		Contrasena.setColumns(10);
		Contrasena.setBounds(365, 370, 360, 25);
		getContentPane().add(Contrasena);
		
		RepContrasena = new JTextField();
		RepContrasena.setColumns(10);
		RepContrasena.setBounds(365, 440, 360, 25);
		getContentPane().add(RepContrasena);
		
		JLabel Escrito1 = new JLabel("Nick");
		Escrito1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		Escrito1.setBounds(365, 127, 52, 25);
		getContentPane().add(Escrito1);
		
		JLabel lblNewLabel = new JLabel("Correo Electrónico");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(365, 206, 192, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel txt3 = new JLabel("Repite correo electrónico");
		txt3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txt3.setBounds(365, 274, 244, 13);
		getContentPane().add(txt3);
		
		JLabel txt4 = new JLabel("Contraseña");
		txt4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txt4.setBounds(365, 346, 192, 13);
		getContentPane().add(txt4);
		
		JLabel lblNewLabel_1 = new JLabel("Crea Tu Cuenta");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(446, 53, 192, 40);
		getContentPane().add(lblNewLabel_1);
		
		JButton CrearCuenta = new JButton("Crear Cuenta");
		CrearCuenta.setFont(new Font("Arial Black", Font.PLAIN, 20));
		CrearCuenta.setBounds(365, 509, 360, 40);
		CrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(CrearCuenta);
		
		JButton IniciarSesion = new JButton("Iniciar Sesion");
		IniciarSesion.setFont(new Font("Arial Black", Font.PLAIN, 15));
		IniciarSesion.setBounds(468, 595, 170, 30);
		IniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IniciarSesion newFrame = new IniciarSesion();
				newFrame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(IniciarSesion);
		
		JLabel txt6 = new JLabel("¿Ya tienes una cuenta?");
		txt6.setHorizontalAlignment(SwingConstants.CENTER);
		txt6.setFont(new Font("Arial", Font.PLAIN, 15));
		txt6.setBounds(468, 573, 170, 25);
		getContentPane().add(txt6);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contraseña");
		lblRepetirContrasea.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblRepetirContrasea.setBounds(365, 416, 192, 13);
		getContentPane().add(lblRepetirContrasea);
	}
}
