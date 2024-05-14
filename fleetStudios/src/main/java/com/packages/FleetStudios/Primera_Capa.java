package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Primera_Capa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Primera_Capa frame = new Primera_Capa();
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
	public Primera_Capa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton inicioSesion = new JButton("");
		inicioSesion.setIcon(new ImageIcon("C:\\Users\\ocXpke\\Downloads\\Iniciar sesion.png"));
		inicioSesion.setBounds(375, 351, 350, 80);
		inicioSesion.setFont(new Font("Arial Black", Font.PLAIN, 15));
		inicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IniciarSesion newFrame = new IniciarSesion();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(inicioSesion);
		
		JButton creaUnaCuenta = new JButton("");
		creaUnaCuenta.setIcon(new ImageIcon("C:\\Users\\ocXpke\\Downloads\\Diseño sin título (1).png"));
		creaUnaCuenta.setBounds(375, 429, 350, 80);
		creaUnaCuenta.setFont(new Font("Arial Black", Font.PLAIN, 15));
		creaUnaCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearCuenta nuevoUsu = new CrearCuenta();
				nuevoUsu.setVisible(true);
				dispose();
			}
		});
		contentPane.add(creaUnaCuenta);
			
	}
}
