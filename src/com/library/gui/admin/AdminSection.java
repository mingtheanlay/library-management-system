package com.library.gui.admin;

import java.awt.EventQueue;

import com.library.gui.login.*;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminSection {

	private JFrame adminFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSection window = new AdminSection();
					window.adminFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminSection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		adminFrame = new JFrame();
		adminFrame.setBounds(100, 100, 720, 512);
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminFrame.getContentPane().setLayout(null);
		
		JPanel navPanel = new JPanel();
		navPanel.setBackground(new Color(106, 90, 205));
		navPanel.setBounds(0, 0, 226, 490);
		adminFrame.getContentPane().add(navPanel);
		navPanel.setLayout(null);
		
		JLabel lbAdminSection = new JLabel("ADMIN SECTION");
		lbAdminSection.setBackground(new Color(255, 255, 255));
		lbAdminSection.setBounds(19, 66, 184, 33);
		navPanel.add(lbAdminSection);
		lbAdminSection.setFont(new Font("Roboto", Font.BOLD, 24));
		lbAdminSection.setForeground(new Color(255, 255, 255));
		
		JButton btnRemoveLibrarian = new JButton("Remove Librarian");
		btnRemoveLibrarian.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		btnRemoveLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveLibrarian.setBounds(0, 267, 226, 45);
		navPanel.add(btnRemoveLibrarian);
		btnRemoveLibrarian.setForeground(new Color(255, 255, 255));
		btnRemoveLibrarian.setBackground(new Color(106, 90, 205));
		
			btnRemoveLibrarian.setOpaque(false);
			btnRemoveLibrarian.setContentAreaFilled(false);
			btnRemoveLibrarian.setBorderPainted(false);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm.main(new String[] {});
				adminFrame.dispose();
			}
		});
		
		btnLogout.setFont(new Font("Roboto Mono", Font.PLAIN, 16));
		btnLogout.setBounds(59, 398, 104, 45);
		navPanel.add(btnLogout);
		
		JButton btnViewLibrarian = new JButton("View Librarian");
		btnViewLibrarian.setOpaque(false);
		btnViewLibrarian.setForeground(Color.WHITE);
		btnViewLibrarian.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		btnViewLibrarian.setContentAreaFilled(false);
		btnViewLibrarian.setBorderPainted(false);
		btnViewLibrarian.setBackground(new Color(106, 90, 205));
		btnViewLibrarian.setBounds(0, 209, 226, 45);
		navPanel.add(btnViewLibrarian);
		
		JButton btnAddLibrarian = new JButton("Add Librarian");
		btnAddLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAddLibrarian.setOpaque(false);
		btnAddLibrarian.setForeground(Color.WHITE);
		btnAddLibrarian.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		btnAddLibrarian.setContentAreaFilled(false);
		btnAddLibrarian.setBorderPainted(false);
		btnAddLibrarian.setBackground(new Color(106, 90, 205));
		btnAddLibrarian.setBounds(0, 152, 226, 45);
		navPanel.add(btnAddLibrarian);
		
		
		JPanel addLibrarianForm = new JPanel();
		addLibrarianForm.setBounds(226, 0, 494, 490);
		addLibrarianForm.setLayout(null);
		adminFrame.add(addLibrarianForm);
		
		JLabel lbName = new JLabel("Name");
		lbName.setHorizontalAlignment(SwingConstants.RIGHT);
		lbName.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lbName.setBounds(66, 100, 77, 16);
		addLibrarianForm.add(lbName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblPassword.setBounds(66, 142, 77, 16);
		addLibrarianForm.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblEmail.setBounds(66, 184, 77, 16);
		addLibrarianForm.add(lblEmail);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblAddress.setBounds(66, 227, 77, 16);
		addLibrarianForm.add(lblAddress);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblCity.setBounds(66, 268, 77, 16);
		addLibrarianForm.add(lblCity);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNumber.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblPhoneNumber.setBounds(21, 308, 122, 16);
		addLibrarianForm.add(lblPhoneNumber);
		
		JTextField tfName = new JTextField();
		tfName.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfName.setBounds(206, 95, 233, 26);
		addLibrarianForm.add(tfName);
		tfName.setColumns(10);
		
		JTextField tfEmail = new JTextField();
		tfEmail.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfEmail.setColumns(10);
		tfEmail.setBounds(206, 179, 233, 26);
		addLibrarianForm.add(tfEmail);
		
		JTextField tfAddress = new JTextField();
		tfAddress.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfAddress.setColumns(10);
		tfAddress.setBounds(206, 223, 233, 26);
		addLibrarianForm.add(tfAddress);
		
		Container tfCity = new JTextField();
		tfCity.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		((JTextField) tfCity).setColumns(10);
		tfCity.setBounds(206, 264, 233, 26);
		addLibrarianForm.add(tfCity);
		
		JTextField tfPhoneNumber = new JTextField();
		tfPhoneNumber.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfPhoneNumber.setColumns(10);
		tfPhoneNumber.setBounds(206, 304, 233, 26);
		addLibrarianForm.add(tfPhoneNumber);
		
		JPasswordField tfPassword = new JPasswordField();
		tfPassword.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfPassword.setBounds(206, 138, 233, 26);
		addLibrarianForm.add(tfPassword);
		
		JButton btnSubmitLibrarian = new JButton("Add Librarian");
		btnSubmitLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSubmitLibrarian.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		btnSubmitLibrarian.setBounds(147, 364, 133, 46);
		addLibrarianForm.add(btnSubmitLibrarian);
		
		JLabel lbAddLibrarian = new JLabel("Add Librarian");
		lbAddLibrarian.setBounds(115, 35, 208, 28);
		addLibrarianForm.add(lbAddLibrarian);
		lbAddLibrarian.setHorizontalAlignment(SwingConstants.CENTER);
		lbAddLibrarian.setFont(new Font("Roboto Condensed", Font.PLAIN, 32));
	}

}
