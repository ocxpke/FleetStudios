package com.packages.FleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Opciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean play = true, noti = true, chatBool = true, politics = true;
	/**
	 * @wbp.nonvisual location=-27,4
	 */
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Clip c = null;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opciones frame = new Opciones(c);
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
	public Opciones(Clip musicTheme) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1115, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel textSonido = new JLabel("Sonido");
		textSonido.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 20));
		textSonido.setBounds(349, 286, 185, 29);
		contentPane.add(textSonido);

		JLabel textNotificacion = new JLabel("Notificación");
		textNotificacion.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 20));
		textNotificacion.setBounds(349, 338, 185, 29);
		contentPane.add(textNotificacion);

		JLabel textChat = new JLabel("Chat del Juego");
		textChat.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 20));
		textChat.setBounds(349, 397, 280, 29);
		contentPane.add(textChat);

		JLabel textPolitica = new JLabel("Política de Privacidad");
		textPolitica.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 20));
		textPolitica.setBounds(349, 453, 317, 29);
		contentPane.add(textPolitica);

		JButton politicaBtn = new JButton("");
		politicaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (politics) {
					politicaBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/cross.png")));
					politics = false;
				} else {
					politicaBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/check.png")));
					politics = true;
				}
			}
		});
		politicaBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/check.png")));
		politicaBtn.setFont(new Font("Arial Black", Font.PLAIN, 20));
		politicaBtn.setBounds(676, 442, 50, 50);
		contentPane.add(politicaBtn);

		JButton chatBtn = new JButton("");
		chatBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chatBool) {
					chatBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/cross.png")));
					chatBool = false;
				} else {
					chatBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/check.png")));
					chatBool = true;
				}
			}
		});
		chatBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/check.png")));
		chatBtn.setFont(new Font("Arial Black", Font.PLAIN, 20));
		chatBtn.setBounds(676, 386, 50, 50);
		contentPane.add(chatBtn);

		JButton notificacionBtn = new JButton("");
		notificacionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (noti) {
					notificacionBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/cross.png")));
					noti = false;
				} else {
					notificacionBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/check.png")));
					noti = true;
				}
			}
		});
		notificacionBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/check.png")));
		notificacionBtn.setFont(new Font("Arial Black", Font.PLAIN, 20));
		notificacionBtn.setBounds(676, 331, 50, 50);
		contentPane.add(notificacionBtn);

		JButton sonidoBtn = new JButton("");
		sonidoBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/check.png")));
		sonidoBtn.setFont(new Font("Arial Black", Font.PLAIN, 20));
		sonidoBtn.setBounds(676, 275, 50, 50);
		sonidoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (play) {
					sonidoBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/cross.png")));
					musicTheme.close();
					play = false;
				} else {
					sonidoBtn.setIcon(new ImageIcon(Opciones.class.getResource("/images/check.png")));
					try {
						String ruta = "./src/main/java/images/musicaJuego.wav";
						AudioInputStream audStream = AudioSystem.getAudioInputStream(new File(ruta));
						musicTheme.open(audStream);
						musicTheme.loop(Clip.LOOP_CONTINUOUSLY);
						musicTheme.start();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					play = true;
				}

			}
		});
		contentPane.add(sonidoBtn);

		JLabel textAyuda = new JLabel("¿Necesitas ayuda?");
		textAyuda.setFont(new Font("Monocraft", Font.BOLD | Font.ITALIC, 20));
		textAyuda.setBounds(349, 235, 271, 29);
		contentPane.add(textAyuda);

		JButton soporte = new JButton("");
		soporte.setIcon(new ImageIcon(Opciones.class.getResource("/images/soporte.png")));
		soporte.setFont(new Font("Arial Black", Font.PLAIN, 20));
		soporte.setBounds(630, 229, 130, 40);
		soporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soporte newFrame = new Soporte();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(soporte);

		JButton Atras = new JButton("");
		Atras.setIcon(new ImageIcon(Opciones.class.getResource("/images/AtrasOpciones.png")));
		Atras.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Atras.setBounds(473, 507, 150, 50);
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar newFrame = new Continuar(musicTheme);
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(Atras);

		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Opciones.class.getResource("/images/ajustes.png")));
		fondo.setBounds(0, 0, 1100, 700);
		contentPane.add(fondo);
		
		
	}
}
