package fleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class UnJugador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnJugador frame = new UnJugador();
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
	public UnJugador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sin Conexión");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(397, 42, 164, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ELEGIR NÚMERO DE BARCOS Y NOMBRE");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(212, 118, 541, 72);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ficha");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton.setBounds(314, 301, 108, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ficha");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1.setBounds(314, 359, 108, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("2B");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(286, 183, 37, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("3B");
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(379, 183, 37, 30);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("4B");
		lblNewLabel_3_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(464, 183, 37, 30);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("5B");
		lblNewLabel_3_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3_3.setBounds(553, 183, 37, 30);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("6B");
		lblNewLabel_3_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3_4.setBounds(642, 183, 37, 30);
		contentPane.add(lblNewLabel_3_4);
		
		JButton btnNewButton_2 = new JButton("Tick");
		btnNewButton_2.setBounds(276, 223, 60, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Tick");
		btnNewButton_2_1.setBounds(364, 223, 60, 21);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Tick");
		btnNewButton_2_2.setBounds(454, 223, 60, 21);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("Tick");
		btnNewButton_2_3.setBounds(631, 223, 60, 21);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("Tick");
		btnNewButton_2_4.setBounds(543, 223, 60, 21);
		contentPane.add(btnNewButton_2_4);
		
		textField = new JTextField();
		textField.setBounds(454, 295, 125, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(454, 350, 125, 30);
		contentPane.add(textField_1);
		
		JButton btnNewButton_3 = new JButton("COMIENZA");
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_3.setBounds(240, 427, 154, 47);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Partida newFrame = new Partida();
				newFrame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("ATRÁS");
		btnNewButton_3_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_3_1.setBounds(504, 427, 154, 47);
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
