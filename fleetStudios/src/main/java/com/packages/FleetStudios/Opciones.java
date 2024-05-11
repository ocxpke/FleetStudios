package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Opciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-27,4
	 */
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opciones frame = new Opciones();
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
	public Opciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sonido");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(349, 286, 185, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNotificacin = new JLabel("Notificación");
		lblNotificacin.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNotificacin.setBounds(349, 338, 185, 29);
		contentPane.add(lblNotificacin);
		
		JLabel lblChatDelJuego = new JLabel("Chat del Juego");
		lblChatDelJuego.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblChatDelJuego.setBounds(349, 397, 185, 29);
		contentPane.add(lblChatDelJuego);
		
		JLabel lblPolticaDePrivacidad = new JLabel("Política de Privacidad");
		lblPolticaDePrivacidad.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblPolticaDePrivacidad.setBounds(349, 453, 255, 29);
		contentPane.add(lblPolticaDePrivacidad);
		
		JButton Tick4 = new JButton("Abrir");
		Tick4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Tick4.setBounds(630, 453, 130, 29);
		contentPane.add(Tick4);
		
		JButton Tick3 = new JButton("Tick");
		Tick3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Tick3.setBounds(630, 397, 130, 29);
		contentPane.add(Tick3);
		
		JButton Tick2 = new JButton("Tick");
		Tick2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Tick2.setBounds(630, 338, 130, 29);
		contentPane.add(Tick2);
		
		JButton Tick1 = new JButton("Tick");
		Tick1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Tick1.setBounds(630, 286, 130, 29);
		Tick1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tick1.setLabel("lalalalalaa");
			}
		});
		contentPane.add(Tick1);
		
		JButton Idioma = new JButton("Español");
		Idioma.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Idioma.setBounds(612, 149, 130, 45);
		contentPane.add(Idioma);
		
		JButton RedSocial = new JButton("Conectarse");
		RedSocial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		RedSocial.setFont(new Font("Arial Black", Font.PLAIN, 20));
		RedSocial.setBounds(328, 149, 176, 45);
		contentPane.add(RedSocial);
		
		JLabel lblnecesitasAyuda = new JLabel("¿Necesitas ayuda?");
		lblnecesitasAyuda.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblnecesitasAyuda.setBounds(349, 235, 226, 29);
		contentPane.add(lblnecesitasAyuda);
		
		JButton Soporte = new JButton("Soporte");
		Soporte.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Soporte.setBounds(630, 235, 130, 29);
		contentPane.add(Soporte);
		
		JLabel lblNewLabel_1 = new JLabel("AJUSTES");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(487, 57, 222, 36);
		contentPane.add(lblNewLabel_1);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Aceptar.setBounds(331, 531, 147, 36);
		Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(Aceptar);
		
		JButton Atras = new JButton("Atrás");
		Atras.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Atras.setBounds(647, 531, 147, 36);
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(Atras);
	}

}
