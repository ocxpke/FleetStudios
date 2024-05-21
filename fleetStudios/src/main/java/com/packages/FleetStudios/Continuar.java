package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class Continuar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Clip c = null;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Continuar frame = new Continuar(c);
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
	public Continuar(Clip musicTheme) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton unJugador = new JButton("");
		unJugador.setIcon(new ImageIcon(Continuar.class.getResource("/images/Un jugador.png")));
		unJugador.setFont(new Font("Arial Black", Font.PLAIN, 20));
		unJugador.setBounds(333, 201, 435, 60);
		unJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UnJugador newFrame = new UnJugador(musicTheme);
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(unJugador);
		
		JButton multijugador = new JButton("");
		multijugador.setIcon(new ImageIcon(Continuar.class.getResource("/images/Multijugador.png")));
		multijugador.setFont(new Font("Arial Black", Font.PLAIN, 20));
		multijugador.setBounds(333, 284, 435, 60);
		multijugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultiJugador newFrame = new MultiJugador(musicTheme);
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(multijugador);
		
		JButton tienda = new JButton("");
		tienda.setIcon(new ImageIcon(Continuar.class.getResource("/images/Tienda.png")));
		tienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tienda.setFont(new Font("Arial Black", Font.PLAIN, 20));
		tienda.setBounds(333, 458, 435, 60);
		contentPane.add(tienda);
		
		JButton opciones = new JButton("");
		opciones.setIcon(new ImageIcon(Continuar.class.getResource("/images/opciones.png")));
		opciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Opciones newFrame = new Opciones(musicTheme);
				newFrame.setVisible(true);
				dispose();
			}
		});
		opciones.setFont(new Font("Arial Black", Font.PLAIN, 20));
		opciones.setBounds(250, 540, 230, 50);
		contentPane.add(opciones);
		
		JButton cerrar = new JButton("");
		cerrar.setIcon(new ImageIcon(Continuar.class.getResource("/images/cerrarr.png")));
		cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Primera_Capa newFrame;
				try {
					musicTheme.stop();
					newFrame = new Primera_Capa(musicTheme);
					newFrame.setVisible(true);
					dispose();
				} catch (Exception y) {
					System.err.println(y);
				}
					
				
			}
		});
		cerrar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		cerrar.setBounds(622, 540, 230, 50);
		contentPane.add(cerrar);
		
		JButton inventario = new JButton("");
		inventario.setIcon(new ImageIcon(Continuar.class.getResource("/images/Inventario.png")));
		inventario.setFont(new Font("Arial Black", Font.PLAIN, 20));
		inventario.setBounds(333, 370, 435, 60);
		contentPane.add(inventario);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Continuar.class.getResource("/images/battle.png")));
		fondo.setBounds(0, 0, 1100, 700);
		contentPane.add(fondo);
	}
}
