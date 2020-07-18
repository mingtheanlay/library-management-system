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
import com.library.admin.db.*;
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
		adminFrame.setBounds(100, 100, 720, 512);
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminFrame.getContentPane().setLayout(null);
		adminFrame.setResizable(false);
		
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
				RemoveLibrarianForm.main(new String[] {});
				adminFrame.dispose();
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
				ViewLibrarianForm.main(new String[] {});
				adminFrame.dispose();
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
            
                
               	JLabel lblIssueBook = new JLabel("View Librarian");
		lblIssueBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBook.setFont(new Font("Roboto Condensed", Font.PLAIN, 32));
		lblIssueBook.setBounds(367, 24, 208, 38);
		adminFrame.getContentPane().add(lblIssueBook);
		
	    String[] columnNames = { "ID", "Name", "Password","Email", "Address", "City", "Contact" }; 
	      
		JTable tbViewLibrarian = new JTable(ViewLibrarian.view(),columnNames);
		tbViewLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tbViewLibrarian.setBounds(248, 94, 448, 370);
		adminFrame.getContentPane().add(tbViewLibrarian);
		
		JScrollPane sp = new JScrollPane(tbViewLibrarian);
		sp.setBounds(232, 95, 482, 369);
		adminFrame.getContentPane().add(sp);
                
                tbViewLibrarian.setRowHeight(30);
                tbViewLibrarian.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                tbViewLibrarian.getColumnModel().getColumn(0).setPreferredWidth(27);  
                tbViewLibrarian.getColumnModel().getColumn(1).setPreferredWidth(50);
                tbViewLibrarian.getColumnModel().getColumn(2).setPreferredWidth(80);
                tbViewLibrarian.getColumnModel().getColumn(3).setPreferredWidth(120);
                tbViewLibrarian.getColumnModel().getColumn(4).setPreferredWidth(70);   
                tbViewLibrarian.getColumnModel().getColumn(5).setPreferredWidth(50);  
                tbViewLibrarian.getColumnModel().getColumn(6).setPreferredWidth(100);
        }
}