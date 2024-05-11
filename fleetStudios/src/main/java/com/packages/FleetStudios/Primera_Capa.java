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
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton InicioSesion = new JButton("Iniciar Sesión");
		InicioSesion.setBounds(447, 237, 190, 65);
		InicioSesion.setFont(new Font("Arial Black", Font.PLAIN, 15));
		InicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IniciarSesion newFrame = new IniciarSesion();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(InicioSesion);
		
		JButton CreaUnaCuenta = new JButton("Crea tu Cuenta");
		CreaUnaCuenta.setBounds(447, 345, 190, 65);
		CreaUnaCuenta.setFont(new Font("Arial Black", Font.PLAIN, 15));
		CreaUnaCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearCuenta nuevoUsu = new CrearCuenta();
				nuevoUsu.setVisible(true);
				dispose();
			}
		});
		contentPane.add(CreaUnaCuenta);
			
	}
}
