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
	private JTextField txt1;
	private JTextField txt2;

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
		escrito0.setFont(new Font("Arial Black", Font.PLAIN, 20));
		escrito0.setBounds(403, 112, 119, 29);
		contentPane.add(escrito0);
		
		JLabel escrito1 = new JLabel("Correo Electrónico");
		escrito1.setFont(new Font("Courgette", Font.PLAIN, 15));
		escrito1.setBounds(293, 169, 138, 18);
		contentPane.add(escrito1);
		
		JLabel escrito2 = new JLabel("Contraseña");
		escrito2.setFont(new Font("Courgette", Font.PLAIN, 15));
		escrito2.setBounds(293, 226, 138, 18);
		contentPane.add(escrito2);
		
		txt1 = new JTextField();
		txt1.setBounds(303, 197, 254, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(303, 254, 254, 19);
		contentPane.add(txt2);
		
		JButton Continuar = new JButton("Continuar");
		Continuar.setFont(new Font("Arial Black", Font.PLAIN, 15));
		Continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		Continuar.setBounds(361, 340, 185, 42);
		contentPane.add(Continuar);
		
		JButton OlvidarContraseña = new JButton("¿Has olvidado tu contraseña?");
		OlvidarContraseña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OlvidarContraseña newFrame = new OlvidarContraseña();
				newFrame.setVisible(true);
				dispose();
			}
		});
		OlvidarContraseña.setBounds(403, 283, 237, 21);
		contentPane.add(OlvidarContraseña);
		
		JLabel lblNewLabel = new JLabel("¿No tienes cuenta registrada?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(322, 403, 224, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Registrate");
		btnNewButton.setBounds(384, 426, 103, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearCuenta newFrame = new CrearCuenta();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton);
	}
}
