package com.packages.FleetStudios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TableroPro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroPro frame = new TableroPro();
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
	public TableroPro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		createBoard(contentPane ,100, 184, 30,30);
		createBoard(contentPane ,644, 184, 30,30);
		
		
	}

	private void createBoard(JPanel panel, int startX, int startY, int buttonWidth, int buttonHeight) {
        int space = 5; // Espacio entre los botones

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                JButton button = new JButton();
                int x = startX + col * (buttonWidth + space);
                int y = startY + row * (buttonHeight + space);
                button.setBounds(x, y, buttonWidth, buttonHeight); //coloca cada boton en un punto determinado
                panel.add(button);
            }
        }
    }

}
