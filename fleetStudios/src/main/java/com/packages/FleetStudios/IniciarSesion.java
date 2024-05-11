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
	private JTextField textContrasena;
	private JTextField textField;

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
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel escrito0 = new JLabel("Tu Cuenta");
		escrito0.setHorizontalAlignment(SwingConstants.CENTER);
		escrito0.setFont(new Font("Arial Black", Font.PLAIN, 20));
		escrito0.setBounds(433, 116, 240, 29);
		contentPane.add(escrito0);
		
		JLabel escrito1 = new JLabel("Correo Electrónico");
		escrito1.setFont(new Font("Courgette", Font.PLAIN, 15));
		escrito1.setBounds(369, 197, 138, 18);
		contentPane.add(escrito1);
		
		JLabel escrito2 = new JLabel("Contraseña");
		escrito2.setFont(new Font("Courgette", Font.PLAIN, 15));
		escrito2.setBounds(369, 271, 138, 18);
		contentPane.add(escrito2);
		
		textContrasena = new JTextField();
		textContrasena.setColumns(10);
		textContrasena.setBounds(369, 215, 360, 25);
		contentPane.add(textContrasena);
		
		JButton Continuar = new JButton("Continuar");
		Continuar.setFont(new Font("Arial Black", Font.PLAIN, 15));
		Continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		Continuar.setBounds(463, 409, 185, 40);
		contentPane.add(Continuar);
		
		JButton OlvidarContraseña = new JButton("¿Has olvidado tu contraseña?");
		OlvidarContraseña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OlvidarContraseña newFrame = new OlvidarContraseña();
				newFrame.setVisible(true);
				dispose();
			}
		});
		OlvidarContraseña.setBounds(463, 376, 185, 20);
		contentPane.add(OlvidarContraseña);
		
		JLabel lblNewLabel = new JLabel("¿No tienes cuenta registrada?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(433, 472, 240, 13);
		contentPane.add(lblNewLabel);
		
		JButton Registrate = new JButton("Registrate");
		Registrate.setBounds(502, 497, 110, 25);
		Registrate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearCuenta newFrame = new CrearCuenta();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(Registrate);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(369, 289, 360, 25);
		contentPane.add(textField);
	}
}
