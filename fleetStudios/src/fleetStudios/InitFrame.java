package fleetStudios;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InitFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitFrame frame = new InitFrame();
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
	public InitFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton iniSesion = new JButton("Iniciar sesion");
		iniSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectUser newFrame = new SelectUser();
				newFrame.setVisible(true);
				dispose();
			}
		});
		iniSesion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		iniSesion.setBounds(476, 342, 155, 40);
		
		contentPane.add(iniSesion);
		
		JButton creditos = new JButton("Creditos");
		creditos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		creditos.setBounds(476, 394, 155, 40);
		contentPane.add(creditos);
	}
}
