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

public class CrearCuenta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		
		txt1 = new JTextField();
		txt1.setBounds(217, 203, 360, 25);
		getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(217, 270, 360, 25);
		getContentPane().add(txt2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(217, 341, 360, 25);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(217, 411, 360, 25);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(217, 483, 360, 25);
		getContentPane().add(textField_4);
		
		JLabel Escrito1 = new JLabel("Nick");
		Escrito1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		Escrito1.setBounds(217, 168, 52, 25);
		getContentPane().add(Escrito1);
		
		JLabel lblNewLabel = new JLabel("Correo Electrónico");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(217, 247, 192, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel txt3 = new JLabel("Repite correo electrónico");
		txt3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txt3.setBounds(217, 318, 244, 13);
		getContentPane().add(txt3);
		
		JLabel txt4 = new JLabel("Contraseña");
		txt4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txt4.setBounds(217, 388, 192, 13);
		getContentPane().add(txt4);
		
		JLabel escrito5 = new JLabel("");
		escrito5.setToolTipText("Repite contraseña");
		escrito5.setFont(new Font("Arial Black", Font.PLAIN, 15));
		escrito5.setBounds(217, 460, 192, 13);
		getContentPane().add(escrito5);
		
		JLabel lblRepiteContrasea = new JLabel("Repite contraseña");
		lblRepiteContrasea.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblRepiteContrasea.setBounds(217, 460, 192, 13);
		getContentPane().add(lblRepiteContrasea);
		
		JLabel lblNewLabel_1 = new JLabel("Crea Tu Cuenta");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(385, 81, 192, 40);
		getContentPane().add(lblNewLabel_1);
		
		JButton boton1 = new JButton("Crear Cuenta");
		boton1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		boton1.setBounds(217, 529, 360, 40);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(boton1);
		
		JButton boton2 = new JButton("Iniciar Sesion");
		boton2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		boton2.setBounds(324, 628, 166, 25);
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IniciarSesion newFrame = new IniciarSesion();
				newFrame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(boton2);
		
		JLabel txt6 = new JLabel("¿Ya tienes una cuenta?");
		txt6.setFont(new Font("Arial", Font.PLAIN, 15));
		txt6.setBounds(336, 594, 166, 30);
		getContentPane().add(txt6);
	}

}
