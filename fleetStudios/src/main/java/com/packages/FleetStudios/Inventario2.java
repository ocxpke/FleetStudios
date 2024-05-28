package com.packages.FleetStudios;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
					Inventario2 frame = new Inventario2();
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
	public Inventario2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
	
	public void añadirObjeto(Objeto o) {
		Connection con = DatabaseCon.connect(); // crear conexion con la base de datos
        Statement sta = DatabaseCon.statement(con);
        String query = "INSERT INTO INVENTORY_ITEMS (userId,itemId, value) " +
                "VALUES ('" + o.nombre + "', '" + o.desc + "', " + o.amount + ", ?)";
        
        try {
        	PreparedStatement ps = con.prepareStatement(query);
        	ps.setBytes(1, o.imgB);
        	ps.executeUpdate();
        	ps.close();
        	sta.close();
        	con.close();
        	System.out.println("Objeto añadido al inventario");
        }catch(SQLException e) {
        	System.err.println("Error al añadir objeto al inventario: " + e.getMessage());
        }
	}

}
