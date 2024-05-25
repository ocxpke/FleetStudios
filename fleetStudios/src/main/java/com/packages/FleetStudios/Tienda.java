package com.packages.FleetStudios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tienda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textTienda = new JLabel("Tienda");
		textTienda.setBounds(520, 10, 45, 13);
		contentPane.add(textTienda);
		

		JLabel imagen1 = new JLabel("weff");
		imagen1.setHorizontalAlignment(SwingConstants.LEFT);
		imagen1.setBounds(60, 185, 215, 390);
		contentPane.add(imagen1);
		
		JLabel imagen2 = new JLabel("fesdf");
		imagen2.setBounds(351, 185, 214, 391);
		contentPane.add(imagen2);
		
		JLabel imagen3 = new JLabel("dfswef");
		imagen3.setHorizontalAlignment(SwingConstants.CENTER);
		imagen3.setBounds(614, 185, 214, 391);
		contentPane.add(imagen3);
		
		JLabel imagen4 = new JLabel("efwrf");
		imagen4.setHorizontalAlignment(SwingConstants.RIGHT);
		imagen4.setBounds(872, 185, 214, 391);
		contentPane.add(imagen4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoTienda.png")));
		lblNewLabel.setBounds(0, 0, 1100, 700);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Tienda.class.getResource("/images/home.png")));
		btnNewButton.setBounds(974, 27, 60, 60);
		contentPane.add(btnNewButton);
	}
		
	public void cargarTienda() {
			contentPane.removeAll(); //borro todo lo que haya
			List<Objeto> objetos = obtenerObjetosAleatorios(); 
			
			//Cargar las Imagenes, boton comprar y los label en un bucle
			
			contentPane.revalidate(); //actualiza estructura del panel
			contentPane.repaint(); // redibuja el panel para reflejar los cambios nuevos
	}
	
	
	private List<Objeto> obtenerObjetosAleatorios(){
		List<Objeto> objetos = new ArrayList<>(); //lista de objetos
		
		Connection con=DatabaseCon.connect(); //crear conexion con la base de datos
		Statement sta =DatabaseCon.statement(con);
		ResultSet rs = DatabaseCon.getQuery(con, sta, "");
		
		/*
		 * Recorre la base de datos guarda todo en el objeto "objetos" 	
		*/
		try {
			while(rs.next()) {
				Objeto obj = new Objeto(
						rs.getString("Name"),
						rs.getString("Description"),
						rs.getInt("value")
						);
				objetos.add(obj);
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		
		Collections.shuffle(objetos);//mezclar todos los objetos
		return objetos.subList(0, 3);//devuelvo una lista con los 4 primeros elementos que salgan
	}
	
	private void comprarObjeto(Objeto o) {
		int monedas = 0;
		
		Connection con=DatabaseCon.connect(); //crear conexion con la base de datos
		Statement sta =DatabaseCon.statement(con);
		ResultSet rs = DatabaseCon.getQuery(con, sta, "");
		
		//Comprobamos si el numero de monedas dle jugador es mayor o igual a lo que cuesta el objeto
		if(monedas >= o.getAmount()) { //corregir
			// Ahora vamos a restar a las monedas que tenga el jugador lo que cuesta el objeto 
			monedas = (monedas - o.getAmount()); //esto hay que corregirlo
			inventario.add(o); //añadimos al inventario el objeto comprado
			//falta actualizar la vision del boton de las monedas del jugador
			actualizarJugador(); //actualizamos monedaas e inventario del jugador
		}else {
			JOptionPane.showMessageDialog(this, "No tienes suficientes monedas", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void actualizarJugador() {
		
		Connection con=DatabaseCon.connect(); //crear conexion con la base de datos
		Statement sta =DatabaseCon.statement(con);
		int mq = DatabaseCon.modifyQuery(con, sta, ""); //desde la base de datos actualizamos las cositas jiji @JOSE HAZ TU LABOR CHACHA
	}
}

