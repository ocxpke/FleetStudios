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
import java.io.ByteArrayInputStream;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class Tienda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private static int coins = 0;

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
	 * 
	 * @throws SQLException
	 */
	public Tienda(Clip c, String name) {

		List<Objeto> listaRand = obtenerObjetosAleatorios();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 740);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

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

		Connection con = DatabaseCon.connect(); // crear conexion con la base de datos
		Statement sta = DatabaseCon.statement(con);
		ResultSet rs = DatabaseCon.getQuery(con, sta, "Select coins from USERS where nick='" + name + "'");
		try {
			coins = rs.getInt("coins");
			rs.close();
			sta.close();
			con.close();
		} catch (Exception e) {
			System.err.println(e);
		}

		JLabel precioImg4 = new JLabel("");
		precioImg4.setIcon(new ImageIcon(Tienda.class.getResource("/images/precio.gif")));
		precioImg4.setBounds(871, 561, 110, 40);
		contentPane.add(precioImg4);

		JLabel precioImg3 = new JLabel("");
		precioImg3.setIcon(new ImageIcon(Tienda.class.getResource("/images/precio.gif")));
		precioImg3.setBounds(606, 561, 110, 40);
		contentPane.add(precioImg3);

		JLabel precioImg2 = new JLabel("");
		precioImg2.setIcon(new ImageIcon(Tienda.class.getResource("/images/precio.gif")));
		precioImg2.setBounds(330, 561, 110, 40);
		contentPane.add(precioImg2);

		JLabel precioImg = new JLabel("");
		precioImg.setIcon(new ImageIcon(Tienda.class.getResource("/images/precio.gif")));
		precioImg.setBounds(41, 561, 110, 40);
		contentPane.add(precioImg);

		JLabel precio4 = new JLabel("");
		precio4.setFont(new Font("Monocraft", Font.BOLD, 15));
		precio4.setBounds(991, 561, 60, 40);
		contentPane.add(precio4);

		JLabel precio3 = new JLabel("");
		precio3.setFont(new Font("Monocraft", Font.BOLD, 15));
		precio3.setBounds(726, 561, 60, 40);
		contentPane.add(precio3);

		JLabel precio2 = new JLabel("");
		precio2.setFont(new Font("Monocraft", Font.BOLD, 15));
		precio2.setBounds(450, 561, 60, 40);
		contentPane.add(precio2);

		JLabel precio1 = new JLabel("");
		precio1.setFont(new Font("Monocraft", Font.BOLD, 15));
		precio1.setBounds(161, 561, 60, 40);
		contentPane.add(precio1);

		JLabel desc4 = new JLabel("");
		desc4.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 14));
		desc4.setBounds(875, 387, 169, 170);
		contentPane.add(desc4);

		JLabel desc3 = new JLabel("");
		desc3.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 14));
		desc3.setBounds(617, 387, 169, 170);
		contentPane.add(desc3);

		JLabel desc2 = new JLabel("");
		desc2.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 14));
		desc2.setBounds(348, 387, 169, 170);
		contentPane.add(desc2);

		JLabel imgItem4 = new JLabel("");
		imgItem4.setBounds(875, 217, 169, 160);
		contentPane.add(imgItem4);

		JLabel imgItem3 = new JLabel("");
		imgItem3.setBounds(617, 217, 169, 160);
		contentPane.add(imgItem3);

		JLabel imgItem2 = new JLabel("");
		imgItem2.setBounds(348, 217, 169, 160);
		contentPane.add(imgItem2);

		JLabel desc1 = new JLabel("");
		desc1.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 14));
		desc1.setBounds(57, 387, 169, 170);
		contentPane.add(desc1);

		JLabel imgItem1 = new JLabel("");
		imgItem1.setBounds(56, 217, 169, 160);
		contentPane.add(imgItem1);

		JLabel nomItem4 = new JLabel("");
		nomItem4.setHorizontalAlignment(SwingConstants.CENTER);
		nomItem4.setFont(new Font("Monocraft", Font.BOLD, 17));
		nomItem4.setBounds(851, 123, 200, 40);
		contentPane.add(nomItem4);

		JLabel nomItem3 = new JLabel("");
		nomItem3.setHorizontalAlignment(SwingConstants.CENTER);
		nomItem3.setFont(new Font("Monocraft", Font.BOLD, 17));
		nomItem3.setBounds(593, 123, 210, 40);
		contentPane.add(nomItem3);

		JLabel nomItem2 = new JLabel("");
		nomItem2.setHorizontalAlignment(SwingConstants.CENTER);
		nomItem2.setFont(new Font("Monocraft", Font.BOLD, 17));
		nomItem2.setBounds(330, 123, 210, 40);
		contentPane.add(nomItem2);

		JLabel nomItem1 = new JLabel("");
		nomItem1.setHorizontalAlignment(SwingConstants.CENTER);
		nomItem1.setFont(new Font("Monocraft", Font.BOLD, 17));
		nomItem1.setBounds(39, 123, 210, 40);
		contentPane.add(nomItem1);

		JLabel coinsMostrar = new JLabel("");
		coinsMostrar.setForeground(Color.WHITE);
		coinsMostrar.setHorizontalAlignment(SwingConstants.RIGHT);
		coinsMostrar.setFont(new Font("Tahoma", Font.BOLD, 25));
		coinsMostrar.setBounds(912, 35, 71, 40);
		coinsMostrar.setText(coins + "");
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

		JButton ntmCompra1 = new JButton("");
		ntmCompra1.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoBtnComprar.gif")));
		ntmCompra1.setBounds(34, 622, 215, 40);
		ntmCompra1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprarObjeto(listaRand.get(0), name, coinsMostrar);
			}
		});
		contentPane.add(ntmCompra1);

		JButton ntmCompra2 = new JButton("");
		ntmCompra2.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoBtnComprar.gif")));
		ntmCompra2.setBounds(325, 622, 215, 40);
		ntmCompra2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprarObjeto(listaRand.get(1), name, coinsMostrar);
			}
		});
		contentPane.add(ntmCompra2);

		JButton ntmCompra3 = new JButton("");
		ntmCompra3.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoBtnComprar.gif")));
		ntmCompra3.setBounds(593, 622, 215, 40);
		ntmCompra3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprarObjeto(listaRand.get(2), name, coinsMostrar);
			}
		});
		contentPane.add(ntmCompra3);

		JButton ntmCompra4 = new JButton("");
		ntmCompra4.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoBtnComprar.gif")));
		ntmCompra4.setBounds(851, 622, 215, 40);
		ntmCompra4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprarObjeto(listaRand.get(3), name, coinsMostrar);
			}
		});
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

		JLabel imagen1 = new JLabel("");
		imagen1.setIcon(new ImageIcon(Tienda.class.getResource("/images/img1.png")));
		imagen1.setBounds(34, 182, 215, 430);
		contentPane.add(imagen1);

		JLabel imagen3 = new JLabel("");
		imagen3.setIcon(new ImageIcon(Tienda.class.getResource("/images/img3.png")));
		imagen3.setBounds(593, 183, 215, 430);
		contentPane.add(imagen3);

		JLabel imagen2 = new JLabel("");
		imagen2.setIcon(new ImageIcon(Tienda.class.getResource("/images/img2.png")));
		imagen2.setBounds(325, 183, 215, 430);
		contentPane.add(imagen2);

		JLabel imagen4 = new JLabel("");
		imagen4.setIcon(new ImageIcon(Tienda.class.getResource("/images/img4.png")));
		imagen4.setBounds(851, 182, 215, 430);
		contentPane.add(imagen4);

		JLabel fondoTienda = new JLabel("");
		fondoTienda.setIcon(new ImageIcon(Tienda.class.getResource("/images/fondoTienda.png")));
		fondoTienda.setBounds(0, 0, 1100, 700);
		contentPane.add(fondoTienda);

		nomItem1.setText(listaRand.get(0).nombre);
		nomItem2.setText(listaRand.get(1).nombre);
		nomItem3.setText(listaRand.get(2).nombre);
		nomItem4.setText(listaRand.get(3).nombre);

		desc1.setText("<html>" + listaRand.get(0).desc + "<html>");
		desc2.setText("<html>" + listaRand.get(1).desc + "<html>");
		desc3.setText("<html>" + listaRand.get(2).desc + "<html>");
		desc4.setText("<html>" + listaRand.get(3).desc + "<html>");

		precio1.setText(listaRand.get(0).amount + "");
		precio2.setText(listaRand.get(1).amount + "");
		precio3.setText(listaRand.get(2).amount + "");
		precio4.setText(listaRand.get(3).amount + "");

		try {
			ImageIcon imageIcon1 = new ImageIcon(listaRand.get(0).imgB);
			imgItem1.setIcon(imageIcon1);

			ImageIcon imageIcon2 = new ImageIcon(listaRand.get(1).imgB);
			imgItem2.setIcon(imageIcon2);

			ImageIcon imageIcon3 = new ImageIcon(listaRand.get(2).imgB);
			imgItem3.setIcon(imageIcon3);

			ImageIcon imageIcon4 = new ImageIcon(listaRand.get(3).imgB);
			imgItem4.setIcon(imageIcon4);

		} catch (Exception e1) {
			System.err.println(e1);
		}

	}

	public void cargarTienda() {
		contentPane.removeAll(); // borro todo lo que haya
		List<Objeto> objetos = obtenerObjetosAleatorios();

		// Cargar las Imagenes, boton comprar y los label en un bucle

		contentPane.revalidate(); // actualiza estructura del panel
		contentPane.repaint(); // redibuja el panel para reflejar los cambios nuevos
	}

	public List<Objeto> obtenerObjetosAleatorios() {
		List<Objeto> objetos = new ArrayList<>(); // lista de objetos

		Connection con = DatabaseCon.connect(); // crear conexion con la base de datos
		Statement sta = DatabaseCon.statement(con);
		ResultSet rs = DatabaseCon.getQuery(con, sta, "SELECT * FROM ITEMS");

		/*
		 * Recorre la base de datos guarda todo en el objeto "objetos"
		 */
		try {
			while (rs.next()) {
				Objeto obj = new Objeto(rs.getInt(1), rs.getString("name"), rs.getString("desc"), rs.getInt("value"),
						rs.getBytes("image"));
				objetos.add(obj);
			}
			rs.close();
			sta.close();
			con.close();
		} catch (SQLException e) {
			System.err.println(e);
		}

		Collections.shuffle(objetos);// mezclar todos los objetos
		return objetos.subList(0, 4);// devuelvo una lista con los 4 primeros elementos que salgan
	}

	public void comprarObjeto(Objeto o, String name, JLabel coinsMostrar) {
		if (Tienda.coins >= o.amount) {
			Tienda.coins -= o.amount;
			coinsMostrar.setText(Tienda.coins + "");
			actualizaInventario(o, name);
			actualizarJugador(name, Tienda.coins);
			JOptionPane.showMessageDialog(null, "Objeto comprado con éxito!");

		} else {
			JOptionPane.showMessageDialog(null, "No tienes suficientes monedas para comprar este objeto");
		}
	}

	public void actualizarJugador(String name, int coins) {

		Connection con = DatabaseCon.connect(); // crear conexion con la base de datos
		Statement sta = DatabaseCon.statement(con);
		int mq = DatabaseCon.modifyQuery(con, sta,
				"Update USERS set coins = " + coins + " WHERE nick = '" + name + "'"); // desde la base de datos
																						// actualizamos las cositas jij
																						// @JOSE
		try {
			sta.close();
			con.close();
		} catch (SQLException e) {
			System.err.println(e);
		}
	}

	public void actualizaInventario(Objeto o, String name) {
		Connection con = DatabaseCon.connect(); // crear conexion con la base de datos
		Statement sta = DatabaseCon.statement(con);
		try {
			ResultSet rs = DatabaseCon.getQuery(con, sta,
					"SELECT * from INVENTORY_ITEMS where nick='" + name + "' and itemId=" + o.id);
			int ai;
			if (!rs.next()) {
				ai = DatabaseCon.modifyQuery(con, sta,
						"INSERT INTO INVENTORY_ITEMS (nick, itemId, amount) values ('" + name + "'," + o.id + ",1)");
			} else {
				ai = DatabaseCon.modifyQuery(con, sta, "UPDATE INVENTORY_ITEMS SET amount=" + (rs.getInt("amount") + 1)
						+ " where nick='" + name + "' and itemId=" + o.id);

			}

			sta.close();
			con.close();
		} catch (SQLException e) {
			System.err.println(e);
		}
	}
}
