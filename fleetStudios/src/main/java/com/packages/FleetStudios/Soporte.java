package com.packages.FleetStudios;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.sound.sampled.Clip;
import javax.swing.DropMode;
import javax.swing.JTextArea;

public class Soporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textSolucionDeProblemas;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Clip c =null;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soporte frame = new Soporte(c);
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
	public Soporte(Clip c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Continuar con = new Continuar(c);
			}
		});
		btnAtras.setBounds(968, 39, 89, 23);
		contentPane.add(btnAtras);
		
		table = new JTable();
		table.setBounds(391, 284, 1, 1);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Sink&Win Labs Soporte");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 24, 1086, 44);
		contentPane.add(lblNewLabel);
		
		JLabel textCompras = new JLabel("");
		textCompras.setBounds(27, 227, 1026, 65);
		contentPane.add(textCompras);
		
		JToggleButton compras = new JToggleButton("Compras");
		compras.setBackground(Color.LIGHT_GRAY);
		compras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(compras.isSelected()) {
					textCompras.setForeground(Color.BLACK);

					textCompras.setText("<html>¿He comprado un artículo por accidente, que debo hacer? Para seguir viendo este problema, tendrá que compartir una captura de pantalla de la factura que se le entregó cuando realizó la compra, así como su ID de jugador en support@sink&win.com. Tan pronto como el equipo reciba los detalles, el equipo volverá a los siguientes pasos."
							+ "Alternativamente, si está buscando obtener la cantidad que gastó, tendría que presentar una solicitud en Google Play Store o en la tienda de aplicaciones (ios)<html>");
				}else {
					textCompras.setForeground(Color.LIGHT_GRAY);
					textCompras.setText("<html>¿He comprado un artículo por accidente, que debo hacer? Para seguir viendo este problema, tendrá que compartir una captura de pantalla de la factura que se le entregó cuando realizó la compra, así como su ID de jugador en support@sink&win.com. Tan pronto como el equipo reciba los detalles, el equipo volverá a los siguientes pasos."
							+ "Alternativamente, si está buscando obtener la cantidad que gastó, tendría que presentar una solicitud en Google Play Store o en la tienda de aplicaciones (ios)<html>");
				}
			}
		});		compras.setBounds(27, 196, 148, 21);
		contentPane.add(compras);
		
		JLabel textNuevoEnElJuego = new JLabel("");
		textNuevoEnElJuego.setBounds(27, 340, 1026, 65);
		contentPane.add(textNuevoEnElJuego);
		
		JToggleButton nuevoEnElJuego = new JToggleButton("Nuevo en el juego?");
		nuevoEnElJuego.setBackground(Color.LIGHT_GRAY);
		nuevoEnElJuego.setBounds(27, 309, 154, 21);
		nuevoEnElJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nuevoEnElJuego.isSelected()) {
					textNuevoEnElJuego.setForeground(Color.BLACK);

					textNuevoEnElJuego.setText("<html>¿Cómo charlas con otras personas? Ve a opciones. Asegúrate de que el chat del juego esté marcado para poder chatear con otras personas <br>"
							+ "¿Cómo subo de nivel más rápido? Juega partidas públicas en cualquiera de los modos, como multijugador o torneo, así obtendrás puntos. Estos puntos los obtienes cuando destruyes un barco. Cada nivel necesita una cierta cantidad de puntos y puedes comprar potenciador de puntos en la tienda para subir de nivel más rápido.<html>");
				}else {
					textNuevoEnElJuego.setForeground(Color.LIGHT_GRAY);
					textNuevoEnElJuego.setText("<html>¿Cómo charlas con otras personas? Ve a opcionales. Asegúrate de que el chat del juego esté marcado para poder chatear con otras personas <br>"
							+ "¿Cómo subo de nivel más rápido? Juega partidas públicas en cualquiera de los modos, como multijugador o torneo, así obtendrás puntos. Estos puntos los obtienes cuando destruyes un barco. Cada nivel necesita una cierta cantidad de puntos y puedes comprar potenciador de puntos en la tienda para subir de nivel más rápido.<html>");
				}
			}
		});
		contentPane.add(nuevoEnElJuego);
		
		JLabel textArticulosPopulares = new JLabel("");
		textArticulosPopulares.setBounds(27, 95, 1026, 91);
		contentPane.add(textArticulosPopulares);
		
		JToggleButton articulosPopulares = new JToggleButton("Artículos Populares");
		articulosPopulares.setBackground(Color.LIGHT_GRAY);
		articulosPopulares.setBounds(27, 63, 160, 21);
		articulosPopulares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(articulosPopulares.isSelected()) {
					textArticulosPopulares.setForeground(Color.BLACK);
					
					textArticulosPopulares.setText("<html>¿Por qué no tengo la nueva actualización? <br> Gracias por informarnos sobre su interés en la nueva actualización.Entendemos que los jugadores sin la actualización estén ansiosos por acceder a ella.Actualmente la nueva actualización se encuentra en la fase de prueba beta y apreciamos su entusiasmo"
							+ ". Durante esta fase de prueba beta, estamos recopilando activamente comentarios para garatinzar una experiencia fluida y optimizada."
							+ "Según los resultados y las aportaciones de los usuarios, nuestro plan es hacer que la actualización esté disponible para una base de jugadores más grande en un futuro próximo.<html>");
				}else {
					textArticulosPopulares.setForeground(Color.LIGHT_GRAY);
					textArticulosPopulares.setText("<html>¿Por qué no tengo la nueva actualización? <br> Gracias por informarnos sobre su interés en la nueva actualización. <br>Entendemos que los jugadores sin la actualización estén ansiosos por acceder a ella. Actualmente, la nueva actualización se encuentra en la fase de prueba beta y apreciamos su entusiasmo<html>");
				}
			}
		});
		contentPane.add(articulosPopulares);
		
		JLabel textProblemas = new JLabel("");
		textProblemas.setBounds(27, 456, 1026, 65);
		contentPane.add(textProblemas);
		
		JToggleButton solucionDeProblemas = new JToggleButton("Solución de Problemas");
		solucionDeProblemas.setBackground(Color.LIGHT_GRAY);
		solucionDeProblemas.setBounds(27, 425, 179, 21);
		solucionDeProblemas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(solucionDeProblemas.isSelected()) {
					textProblemas.setForeground(Color.BLACK);
					
					textProblemas.setText("<html>Mi juego tarda demasiado en cargarse. Puedes probar estas soluciones si el juego tarda demasiado en cargarse: 1. Verifique si tiene una conexión a Internet estable y el dispositivo está conectado correctamente 2. Intente no cambiar entre la red Wifi y la red móvil mientras carga el juego 3. Si el almacenamiento de su dispositivo está lleno o casi lleno, intente liberar espacio y luego inicie el juego<html>");
				}else {
					textProblemas.setForeground(Color.LIGHT_GRAY);
					textProblemas.setText("<html>Mi juego tarda demasiado en cargarse. Puedes probar estas soluciones si el juego tarda demasiado en cargarse: 1. Verifique si tiene una conexión a Internet estable y el dispositivo está conectado correctamente 2. Intente no cambiar entre la red Wifi y la red móvil mientras carga el juego 3. Si el almacenamiento de su dispositivo está lleno o casi lleno, intente liberar espacio y luego inicie el juego<html>");
				}
			}
		});
		contentPane.add(solucionDeProblemas);
		
		JLabel textComoSeJuega = new JLabel("");
		textComoSeJuega.setBounds(27, 581, 1026, 65);
		contentPane.add(textComoSeJuega);
		
		JToggleButton comoSeJuega = new JToggleButton("Cómo se juega");
		comoSeJuega.setBackground(Color.LIGHT_GRAY);
		comoSeJuega.setBounds(27, 550, 160, 21);
		comoSeJuega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comoSeJuega.isSelected()) {
					textComoSeJuega.setForeground(Color.BLACK);
					
					textComoSeJuega.setText("<html>¿Por qué no obtuve las recompensas del último torneo? Tienes que reclamar tu premio ganador dentro de los próximos 7 días. Si no ha reclamado el premio, no recibirá las recompensas.<br>"
							+ "¿Por qué mis monedas desaparecieron sin usar? Asegúrese de haber comprobbado los valores correctamente. Si aún cree que hay alguno discrepancia, escríbanos a support@sink&win.com con su ID de jugador y detalles<html>");
				}else {
					textComoSeJuega.setForeground(Color.LIGHT_GRAY);
					textComoSeJuega.setText("<html>¿Por qué no obtuve las recompensas del último torneo? Tienes que reclamar tu premio ganador dentro de los próximos 7 días. Si no ha reclamado el premio, no recibirá las recompensas.<br>"
							+ "¿Por qué mis monedas desaparecieron sin usar? Asegúrese de haber comprobbado los valores correctamente. Si aún cree que hay alguno discrepancia, escríbanos a support@sink&win.com con su ID de jugador y detalles<html>");
				}
			}
		});
		contentPane.add(comoSeJuega);
		
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
