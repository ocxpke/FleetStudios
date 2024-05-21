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
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

public class CrearCuenta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField nick;
	private JTextField email;
	private JTextField fecNac;
	private JTextField contra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Clip c = null;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCuenta frame = new CrearCuenta(c);
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
	public CrearCuenta(Clip musicTheme) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 740);
		getContentPane().setLayout(null);
		
		nick = new JTextField();
		nick.setBounds(366, 214, 371, 40);
		getContentPane().add(nick);
		nick.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(366, 281, 371, 40);
		getContentPane().add(email);
		
		fecNac = new JTextField();
		fecNac.setColumns(10);
		fecNac.setBounds(366, 349, 371, 40);
		getContentPane().add(fecNac);
		
		contra = new JTextField();
		contra.setColumns(10);
		contra.setBounds(366, 421, 371, 40);
		getContentPane().add(contra);
		
		JLabel textNick = new JLabel("Nick");
		textNick.setFont(new Font("3270 Nerd Font", Font.BOLD, 20));
		textNick.setBounds(366, 190, 52, 25);
		getContentPane().add(textNick);
		
		JLabel textEmail = new JLabel("Correo Electrónico");
		textEmail.setFont(new Font("3270 Nerd Font", Font.BOLD, 20));
		textEmail.setBounds(366, 265, 209, 13);
		getContentPane().add(textEmail);
		
		JLabel textFechaNac = new JLabel("Fecha de nacimiento");
		textFechaNac.setFont(new Font("3270 Nerd Font", Font.BOLD, 20));
		textFechaNac.setBounds(366, 332, 244, 13);
		getContentPane().add(textFechaNac);
		
		JLabel textContrasena = new JLabel("Contraseña");
		textContrasena.setFont(new Font("3270 Nerd Font", Font.BOLD, 20));
		textContrasena.setBounds(366, 404, 192, 13);
		getContentPane().add(textContrasena);
		
		JButton crearCuenta = new JButton("");
		crearCuenta.setIcon(new ImageIcon(CrearCuenta.class.getResource("/images/CreaCuenta.png")));
		crearCuenta.setFont(new Font("Arial Black", Font.PLAIN, 20));
		crearCuenta.setBounds(367, 482, 370, 50);
		crearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar(musicTheme);
				newFrame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(crearCuenta);
		
		JButton iniciarSesion = new JButton("");
		iniciarSesion.setIcon(new ImageIcon(CrearCuenta.class.getResource("/images/IniciarSesion2.png")));
		iniciarSesion.setFont(new Font("Arial Black", Font.PLAIN, 15));
		iniciarSesion.setBounds(468, 556, 170, 40);
		iniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IniciarSesion newFrame = new IniciarSesion(musicTheme);
				newFrame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(iniciarSesion);
		
		JLabel textPregunta = new JLabel("¿Ya tienes una cuenta?");
		textPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		textPregunta.setFont(new Font("3270 Nerd Font", Font.BOLD | Font.ITALIC, 15));
		textPregunta.setBounds(457, 532, 192, 25);
		getContentPane().add(textPregunta);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(CrearCuenta.class.getResource("/images/fondoCreaTuCuenta.png")));
		fondo.setBounds(0, 0, 1100, 700);
		getContentPane().add(fondo);
	}
}
