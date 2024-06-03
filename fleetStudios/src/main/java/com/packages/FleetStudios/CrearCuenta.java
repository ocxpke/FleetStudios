package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

public class CrearCuenta extends JFrame {

	private static final long serialVersionUID = 1L;
	protected JTextField nick;
	protected JTextField email;
	protected JTextField fecNac;
	protected JTextField contra;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 740);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		nick = new JTextField();
		nick.setFont(new Font("Monocraft", Font.PLAIN, 20));
		nick.setBounds(366, 214, 371, 40);
		getContentPane().add(nick);
		nick.setColumns(10);

		email = new JTextField();
		email.setFont(new Font("Monocraft", Font.PLAIN, 20));
		email.setColumns(10);
		email.setBounds(366, 281, 371, 40);
		getContentPane().add(email);

		fecNac = new JTextField();
		fecNac.setFont(new Font("Monocraft", Font.PLAIN, 20));
		fecNac.setColumns(10);
		fecNac.setBounds(366, 349, 371, 40);
		getContentPane().add(fecNac);

		contra = new JTextField();
		contra.setFont(new Font("Monocraft", Font.PLAIN, 20));
		contra.setColumns(10);
		contra.setBounds(366, 421, 371, 40);
		getContentPane().add(contra);

		JLabel textNick = new JLabel("Nick");
		textNick.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 20));
		textNick.setBounds(366, 195, 121, 25);
		getContentPane().add(textNick);

		JLabel textEmail = new JLabel("Correo Electrónico");
		textEmail.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 20));
		textEmail.setBounds(366, 258, 272, 25);
		getContentPane().add(textEmail);

		JLabel textFechaNac = new JLabel("Fecha de nacimiento");
		textFechaNac.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 20));
		textFechaNac.setBounds(366, 325, 272, 25);
		getContentPane().add(textFechaNac);

		JLabel textContrasena = new JLabel("Contraseña");
		textContrasena.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 20));
		textContrasena.setBounds(366, 397, 192, 25);
		getContentPane().add(textContrasena);

		JButton crearCuenta = new JButton("");
		crearCuenta.setIcon(new ImageIcon(CrearCuenta.class.getResource("/images/CreaCuenta.png")));
		crearCuenta.setFont(new Font("Arial Black", Font.PLAIN, 20));
		crearCuenta.setBounds(367, 482, 370, 50);
		crearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Connection con = DatabaseCon.connect();
					Statement sta = DatabaseCon.statement(con);

					int rs = DatabaseCon.modifyQuery(con, sta, "INSERT INTO USERS VALUES ('" + nick.getText() + "','"
							+ email.getText() + "','" + contra.getText() + "','" + fecNac.getText() + "',5,0);");
					if (rs == 0 || rs == -1 || nick.getText().isBlank() || email.getText().isBlank()) {
						JOptionPane.showMessageDialog(null,
								"Datos erroneos compruebe todos los campos y vuelva a intentarlo.", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} else {
						Continuar newFrame = new Continuar(musicTheme, nick.getText());
						newFrame.setVisible(true);
						dispose();
					}
					sta.close();
					con.close();
				} catch (Exception err) {
					System.err.println(err);
				}
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
		textPregunta.setFont(new Font("Monocraft", Font.ITALIC, 15));
		textPregunta.setBounds(439, 533, 229, 25);
		getContentPane().add(textPregunta);

		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(CrearCuenta.class.getResource("/images/fondoCreaTuCuenta.png")));
		fondo.setBounds(0, 0, 1100, 700);
		getContentPane().add(fondo);
	}

	public String isSomethingNull() {
		String ret = "";

		if (nick.getText().isBlank()) {
			ret = "El campo nick no puede estar vacío";
		} else if (contra.getText().isBlank()) {
			ret = "El campo contraseña no puede estar vacío";
		} else if (fecNac.getText().isBlank()) {
			ret = "La fecha de nacimiento no puede estar vacía";
		} else if (email.getText().isBlank()) {
			ret = "El campo correo electrónico no puede estar vacío";
		}

		return ret;

	}
}
