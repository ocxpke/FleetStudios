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
		
		JLabel textSonido = new JLabel("Sonido");
		textSonido.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textSonido.setBounds(349, 286, 185, 29);
		contentPane.add(textSonido);
		
		JLabel textNotificacion = new JLabel("Notificación");
		textNotificacion.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textNotificacion.setBounds(349, 338, 185, 29);
		contentPane.add(textNotificacion);
		
		JLabel textChat = new JLabel("Chat del Juego");
		textChat.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textChat.setBounds(349, 397, 185, 29);
		contentPane.add(textChat);
		
		JLabel textPolitica = new JLabel("Política de Privacidad");
		textPolitica.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textPolitica.setBounds(349, 453, 255, 29);
		contentPane.add(textPolitica);
		
		JButton tick4 = new JButton("Abrir");
		tick4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		tick4.setBounds(630, 453, 130, 29);
		contentPane.add(tick4);
		
		JButton tick3 = new JButton("Tick");
		tick3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		tick3.setBounds(630, 397, 130, 29);
		contentPane.add(tick3);
		
		JButton tick2 = new JButton("Tick");
		tick2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		tick2.setBounds(630, 338, 130, 29);
		contentPane.add(tick2);
		
		JButton tick1 = new JButton("Tick");
		tick1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		tick1.setBounds(630, 286, 130, 29);
		tick1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tick1.setLabel("lalalalalaa");
			}
		});
		contentPane.add(tick1);
		
		JButton textIdioma = new JButton("Español");
		textIdioma.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textIdioma.setBounds(612, 149, 130, 45);
		contentPane.add(textIdioma);
		
		JButton textRedSocial = new JButton("Conectarse");
		textRedSocial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textRedSocial.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textRedSocial.setBounds(328, 149, 176, 45);
		contentPane.add(textRedSocial);
		
		JLabel textAyuda = new JLabel("¿Necesitas ayuda?");
		textAyuda.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textAyuda.setBounds(349, 235, 226, 29);
		contentPane.add(textAyuda);
		
		JButton soporte = new JButton("Soporte");
		soporte.setFont(new Font("Arial Black", Font.PLAIN, 20));
		soporte.setBounds(630, 235, 130, 29);
		contentPane.add(soporte);
		
		JLabel textAjustes = new JLabel("AJUSTES");
		textAjustes.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textAjustes.setBounds(487, 57, 222, 36);
		contentPane.add(textAjustes);
		
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
