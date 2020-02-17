package com.library.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbTitlte = new JLabel("Library Management System");
		lbTitlte.setFont(new Font("Roboto Mono", Font.PLAIN, 36));
		lbTitlte.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitlte.setBounds(115, 22, 580, 85);
		frame.getContentPane().add(lbTitlte);
		
		JLabel lbAccountName = new JLabel("Account Name");
		lbAccountName.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lbAccountName.setBounds(183, 146, 112, 27);
		frame.getContentPane().add(lbAccountName);
		
		JLabel lbPassword = new JLabel("Password");
		lbPassword.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lbPassword.setBounds(219, 201, 76, 27);
		frame.getContentPane().add(lbPassword);
		

		JTextField tfAccountName = new JTextField();
		tfAccountName.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfAccountName.setBounds(345, 146, 320, 26);
		frame.getContentPane().add(tfAccountName);
		tfAccountName.setColumns(10);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		passwordField.setBounds(345, 201, 320, 26);
		frame.getContentPane().add(passwordField);
		
		JButton btnAdmin = new JButton("Login as Admin");
		btnAdmin.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		btnAdmin.setBounds(430, 282, 164, 43);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnLibrarian = new JButton("Login as Librarian");
		btnLibrarian.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		btnLibrarian.setBounds(202, 282, 164, 43);
		frame.getContentPane().add(btnLibrarian);
	}
}
