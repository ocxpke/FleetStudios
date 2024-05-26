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
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

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
					Tienda frame = new Tienda(null, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Tienda(Clip c, String name){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 740);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		//List<Objeto> listaRand = obtenerObjetosAleatorios();
		
		Connection con=DatabaseCon.connect(); //crear conexion con la base de datos
		Statement sta =DatabaseCon.statement(con);
		
		ResultSet rs = DatabaseCon.getQuery(con, sta, "Select coins from USERS where nick='"+name+"'");
		int coins=0;
		try {
			coins=rs.getInt("coins");
		}catch(Exception e) {
			System.err.println(e);
		}
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar continuar = new Continuar(c, name);
				continuar.setVisible(true);
				dispose();
			}
		});
		
		JLabel nomItem4 = new JLabel("");
		nomItem4.setHorizontalAlignment(SwingConstants.CENTER);
		nomItem4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nomItem4.setBounds(887, 123, 140, 40);
		contentPane.add(nomItem4);
		
		JLabel nomItem3 = new JLabel("");
		nomItem3.setHorizontalAlignment(SwingConstants.CENTER);
		nomItem3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nomItem3.setBounds(632, 123, 140, 40);
		contentPane.add(nomItem3);
		
		JLabel nomItem2 = new JLabel("");
		nomItem2.setHorizontalAlignment(SwingConstants.CENTER);
		nomItem2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nomItem2.setBounds(370, 123, 140, 40);
		contentPane.add(nomItem2);
		
		JLabel nomItem1 = new JLabel("");
		nomItem1.setHorizontalAlignment(SwingConstants.CENTER);
		nomItem1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nomItem1.setBounds(77, 123, 140, 40);
		contentPane.add(nomItem1);
		
		JButton ntmCompra1 = new JButton("");
		ntmCompra1.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoBtnCompra.gif")));
		ntmCompra1.setBounds(39, 570, 210, 40);
		contentPane.add(ntmCompra1);
		
		JLabel coinsMostrar = new JLabel("");
		coinsMostrar.setForeground(Color.WHITE);
		coinsMostrar.setHorizontalAlignment(SwingConstants.RIGHT);
		coinsMostrar.setFont(new Font("Tahoma", Font.BOLD, 25));
		coinsMostrar.setBounds(912, 35, 74, 40);
		coinsMostrar.setText(coins+"");
		contentPane.add(coinsMostrar);
		
		JLabel monedasImg = new JLabel("");
		monedasImg.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoCoins.gif")));
		monedasImg.setBounds(906, 35, 110, 40);
		contentPane.add(monedasImg);
		
		btnAtras.setIcon(new ImageIcon(Tienda.class.getResource("/images/home.png")));
		btnAtras.setBounds(1026, 22, 60, 60);
		contentPane.add(btnAtras);
		
		JLabel imgTienda = new JLabel("");
		imgTienda.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoTiendaNom.png")));
		imgTienda.setBounds(430, 22, 200, 60);
		contentPane.add(imgTienda);

		JLabel imagen1 = new JLabel("");
		imagen1.setIcon(new ImageIcon(Tienda.class.getResource("/images/img1.png")));
		imagen1.setHorizontalAlignment(SwingConstants.LEFT);
		imagen1.setBounds(39, 169, 215, 390);
		contentPane.add(imagen1);
		
		JLabel imagen2 = new JLabel("");
		imagen2.setIcon(new ImageIcon(Tienda.class.getResource("/images/img2.png")));
		imagen2.setBounds(330, 169, 214, 391);
		contentPane.add(imagen2);
		
		JLabel imagen3 = new JLabel("");
		imagen3.setIcon(new ImageIcon(Tienda.class.getResource("/images/img3.png")));
		imagen3.setHorizontalAlignment(SwingConstants.CENTER);
		imagen3.setBounds(593, 169, 214, 391);
		contentPane.add(imagen3);
		
		JLabel imagen4 = new JLabel("");
		imagen4.setIcon(new ImageIcon(Tienda.class.getResource("/images/img4.png")));
		imagen4.setHorizontalAlignment(SwingConstants.RIGHT);
		imagen4.setBounds(851, 169, 214, 391);
		contentPane.add(imagen4);
		
		JButton ntmCompra2 = new JButton("");
		ntmCompra2.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoBtnCompra.gif")));
		ntmCompra2.setBounds(330, 571, 210, 40);
		contentPane.add(ntmCompra2);
		
		JButton ntmCompra3 = new JButton("");
		ntmCompra3.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoBtnCompra.gif")));
		ntmCompra3.setBounds(593, 571, 210, 40);
		contentPane.add(ntmCompra3);
		
		JButton ntmCompra4 = new JButton("");
		ntmCompra4.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoBtnCompra.gif")));
		ntmCompra4.setBounds(855, 571, 210, 40);
		contentPane.add(ntmCompra4);
		
		JLabel fondoNomItem1 = new JLabel("");
		fondoNomItem1.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoNomItem.png")));
		fondoNomItem1.setBounds(39, 123, 210, 40);
		contentPane.add(fondoNomItem1);
		
		JLabel fondoNomItem1_1 = new JLabel("");
		fondoNomItem1_1.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoNomItem.png")));
		fondoNomItem1_1.setBounds(330, 123, 210, 40);
		contentPane.add(fondoNomItem1_1);
		
		JLabel fondoNomItem1_1_1 = new JLabel("");
		fondoNomItem1_1_1.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoNomItem.png")));
		fondoNomItem1_1_1.setBounds(593, 123, 210, 40);
		contentPane.add(fondoNomItem1_1_1);
		
		JLabel fondoNomItem1_1_1_1 = new JLabel("");
		fondoNomItem1_1_1_1.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoNomItem.png")));
		fondoNomItem1_1_1_1.setBounds(851, 123, 210, 40);
		contentPane.add(fondoNomItem1_1_1_1);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoTienda.png")));
		fondo.setBounds(0, 0, 1100, 700);
		contentPane.add(fondo);
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
			sta.close();
			con.close();
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
			//inventario.add(o); //añadimos al inventario el objeto comprado
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

