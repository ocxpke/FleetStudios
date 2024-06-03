package com.packages.FleetStudios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.crypto.Data;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inventario2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario2 frame = new Inventario2(null, null);
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
	public Inventario2(Clip musicTheme, String nick) {

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 800);

		// siempre se abre en el centro
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));

		Connection con = DatabaseCon.connect();
		Statement sta = DatabaseCon.statement(con);

		ResultSet rs = DatabaseCon.getQuery(con, sta,
				"SELECT I.NAME, I.IMAGE, I.DESC, II.AMOUNT FROM INVENTORY_ITEMS II JOIN ITEMS I ON I.itemId==II.itemId WHERE II.nick='"
						+ nick + "';");
		int cnt = 0;
		try {
			while (rs.next()) {
				cnt++;
			}
		} catch (Exception e) {
			System.err.println(e);
		}

		panel.setLayout(new GridLayout(1, cnt, 5, 5));

		rs = DatabaseCon.getQuery(con, sta,
				"SELECT I.NAME, I.IMAGE, I.DESC, II.AMOUNT FROM INVENTORY_ITEMS II JOIN ITEMS I ON I.itemId==II.itemId WHERE II.nick='"
						+ nick + "';");
		try {
			while (rs.next()) {
				String itN = rs.getString("name");
				ImageIcon imageIcon1 = new ImageIcon(rs.getBytes("image"));
				String desc = rs.getString("desc");
				int amount = rs.getInt("amount");

				PanelItemInv item = new PanelItemInv(itN, imageIcon1, desc, amount);
				item.setPreferredSize(new Dimension(360, 700));
				panel.add(item);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		panel.revalidate();
		panel.repaint();

		JScrollPane scrollpane = new JScrollPane(panel);
		scrollpane.setBounds(0, 0, 1100, 720);
		
		contentPane.add(scrollpane);
		
		JButton btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventario inv=new Inventario(musicTheme, nick);
				dispose();
				inv.setVisible(true);
			}
		});
		btnAtras.setIcon(new ImageIcon(Inventario2.class.getResource("/images/btnAtrasInv.png")));
		btnAtras.setFont(new Font("Monocraft", Font.BOLD, 23));
		btnAtras.setBounds(489, 720, 200, 41);
		contentPane.add(btnAtras);

	}
}
