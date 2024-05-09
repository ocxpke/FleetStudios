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
		
		JButton btnNewButton = new JButton("Abrir");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton.setBounds(630, 453, 130, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tick");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1.setBounds(630, 397, 130, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Tick");
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(630, 338, 130, 29);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Tick");
		btnNewButton_1_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1_2.setBounds(630, 286, 130, 29);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("Español");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_2.setBounds(612, 149, 130, 45);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_3 = new JButton("Conectarse");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1_3.setBounds(328, 149, 176, 45);
		contentPane.add(btnNewButton_1_3);
		
		JLabel lblnecesitasAyuda = new JLabel("¿Necesitas ayuda?");
		lblnecesitasAyuda.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblnecesitasAyuda.setBounds(349, 235, 226, 29);
		contentPane.add(lblnecesitasAyuda);
		
		JButton btnNewButton_1_2_1 = new JButton("Soporte");
		btnNewButton_1_2_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1_2_1.setBounds(630, 235, 130, 29);
		contentPane.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("AJUSTES");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(487, 57, 222, 36);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Aceptar");
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_3.setBounds(331, 531, 147, 36);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Atrás");
		btnNewButton_3_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_3_1.setBounds(647, 531, 147, 36);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton_3_1);
	}

}
