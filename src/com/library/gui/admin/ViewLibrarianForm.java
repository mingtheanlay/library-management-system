package com.library.gui.admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import com.library.gui.login.LoginForm;

public class ViewLibrarianForm {

	private JFrame adminFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLibrarianForm window = new ViewLibrarianForm();
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
	public ViewLibrarianForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		adminFrame = new JFrame();
		adminFrame.setBounds(100, 100, 450, 300);
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminFrame.getContentPane().setLayout(null);
		adminFrame.setResizable(false);
		
		adminFrame = new JFrame();
		adminFrame.setBounds(100, 100, 450, 300);
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		btnViewLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewLibrarian();
			}
		});
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
				AddLibrarianForm.main(new String[] {});
				adminFrame.dispose();
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
		
		viewLibrarian();
	}
	
private void viewLibrarian() {
		
		JTable tbViewLibrarian;
		JPanel viewLibrarian = new JPanel();
		viewLibrarian.setBounds(226, 0, 494, 490);
		viewLibrarian.setLayout(null);
		
		JLabel lbViewLibrarian = new JLabel("View Librarian");
		lbViewLibrarian.setBounds(135, 35, 208, 28);
		viewLibrarian.add(lbViewLibrarian);
		lbViewLibrarian.setHorizontalAlignment(SwingConstants.CENTER);
		lbViewLibrarian.setFont(new Font("Roboto Condensed", Font.PLAIN, 32));
		
		JScrollPane spViewLibrarian = new JScrollPane();
		spViewLibrarian.setBounds(6, 88, 1, 1);
		viewLibrarian.add(spViewLibrarian);
		
		tbViewLibrarian = new JTable();
		spViewLibrarian.setViewportView(tbViewLibrarian);
		
		adminFrame.getContentPane().add(viewLibrarian);
	}

}
