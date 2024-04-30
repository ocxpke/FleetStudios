package fleetStudios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectUser frame = new SelectUser();
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
	public SelectUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bienvenida = new JLabel("Bienvenido jugador!!!");
		bienvenida.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		bienvenida.setBounds(474, 36, 214, 36);
		contentPane.add(bienvenida);
		
		JButton usuExe = new JButton("Usuario existente");
		usuExe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usuExe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		usuExe.setBounds(486, 275, 202, 40);
		contentPane.add(usuExe);
		
		JButton nuevoUsu = new JButton("Nuevo usuario");
		nuevoUsu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nuevoUsu.setBounds(486, 370, 202, 40);
		contentPane.add(nuevoUsu);
	}
}
