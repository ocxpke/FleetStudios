package com.packages.FleetStudios;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inventario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario frame = new Inventario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Inventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton abrirInventario = new JButton("");
		abrirInventario.setIcon(new ImageIcon(Inventario.class.getResource("/images/abrir inventario.png")));
		abrirInventario.setBounds(216, 99, 200, 60);
		abrirInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FondoInventario newframe = new FondoInventario();
				newframe.setVisible(true);
				dispose();
			}
		});
		contentPane.add(abrirInventario);
		
		JButton atrasInventario = new JButton("");
		atrasInventario.setIcon(new ImageIcon(Inventario.class.getResource("/images/atrasInventario.png")));
		atrasInventario.setBounds(687, 99, 200, 60);
		atrasInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newframe = new Continuar(null, null); //cambiar
				newframe.setVisible(true);
				dispose();
			}
		});
		contentPane.add(atrasInventario);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Inventario.class.getResource("/images/fondoInventario.png")));
		lblNewLabel.setBounds(0, 0, 1100, 700);
		contentPane.add(lblNewLabel);
		
	}
}