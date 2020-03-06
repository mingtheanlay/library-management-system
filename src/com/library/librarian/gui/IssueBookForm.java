package com.library.librarian.gui;

import java.awt.EventQueue;

import com.library.gui.login.*;

import javax.swing.JFrame;
import java.awt.Color;


import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class IssueBookForm {

	private JFrame librarianForm;
	private JTextField ISBN;
	private JTextField tfStudentID;
	private JTextField tfStudentName;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBookForm window = new IssueBookForm();
					window.librarianForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IssueBookForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		librarianForm = new JFrame();
		librarianForm.setBounds(100, 100, 720, 512);
		librarianForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		librarianForm.getContentPane().setLayout(null);
		librarianForm.setResizable(false);
		
		JPanel navPanel = new JPanel();
		navPanel.setBackground(new Color(106, 90, 205));
		navPanel.setBounds(0, 0, 226, 490);
		librarianForm.getContentPane().add(navPanel);
		navPanel.setLayout(null);
		
		JLabel lbLibrarianSection = new JLabel("LIBRARIAN");
		lbLibrarianSection.setHorizontalAlignment(SwingConstants.CENTER);
		lbLibrarianSection.setBackground(new Color(255, 255, 255));
		lbLibrarianSection.setBounds(16, 17, 187, 74);
		navPanel.add(lbLibrarianSection);
		lbLibrarianSection.setFont(new Font("Roboto", Font.BOLD, 24));
		lbLibrarianSection.setForeground(new Color(255, 255, 255));
		
	
		
		JButton btnAddBooks = new JButton("Add Books");	
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBooksForm.main(new String[] {});
				librarianForm.dispose();
			}
		});
		
		JLabel lblSection = new JLabel("SECTION");
		lblSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblSection.setForeground(Color.WHITE);
		lblSection.setFont(new Font("Roboto", Font.BOLD, 24));
		lblSection.setBackground(Color.WHITE);
		lblSection.setBounds(16, 50, 187, 63);
		navPanel.add(lblSection);
		btnAddBooks.setOpaque(false);
		btnAddBooks.setForeground(Color.WHITE);
		btnAddBooks.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		btnAddBooks.setContentAreaFilled(false);
		btnAddBooks.setBorderPainted(false);
		btnAddBooks.setBackground(new Color(106, 90, 205));
		btnAddBooks.setBounds(0, 125, 226, 36);
		navPanel.add(btnAddBooks);
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookForm.main(new String[] {});
				librarianForm.dispose();
			}
		});
		
		JButton btnaViewBooks = new JButton("View Books");
		btnaViewBooks.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		btnaViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewBooksForm.main(new String[] {});
				librarianForm.dispose();
			}
		});
		btnaViewBooks.setBounds(0, 220, 226, 36);
		navPanel.add(btnaViewBooks);
		btnaViewBooks.setForeground(new Color(255, 255, 255));
		btnaViewBooks.setBackground(new Color(106, 90, 205));
		
			btnaViewBooks.setOpaque(false);
			btnaViewBooks.setContentAreaFilled(false);
			btnaViewBooks.setBorderPainted(false);
		btnIssueBook.setOpaque(false);
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		btnIssueBook.setContentAreaFilled(false);
		btnIssueBook.setBorderPainted(false);
		btnIssueBook.setBackground(new Color(106, 90, 205));
		btnIssueBook.setBounds(0, 173, 226, 36);
		navPanel.add(btnIssueBook);
		
		JButton btnViewIssueBooks = new JButton("View Issued Books");
		btnViewIssueBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooksForm.main(new String[] {});
				librarianForm.dispose();
			}
		});
		btnViewIssueBooks.setOpaque(false);
		btnViewIssueBooks.setForeground(Color.WHITE);
		btnViewIssueBooks.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		btnViewIssueBooks.setContentAreaFilled(false);
		btnViewIssueBooks.setBorderPainted(false);
		btnViewIssueBooks.setBackground(new Color(106, 90, 205));
		btnViewIssueBooks.setBounds(0, 263, 226, 36);
		navPanel.add(btnViewIssueBooks);
		
		JButton btnReturnBooks = new JButton("Return Book");
		btnReturnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBookForm.main(new String[] {});
				librarianForm.dispose();
			}
		});
		btnReturnBooks.setOpaque(false);
		btnReturnBooks.setForeground(Color.WHITE);
		btnReturnBooks.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		btnReturnBooks.setContentAreaFilled(false);
		btnReturnBooks.setBorderPainted(false);
		btnReturnBooks.setBackground(new Color(106, 90, 205));
		btnReturnBooks.setBounds(0, 311, 226, 36);
		navPanel.add(btnReturnBooks);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm.main(new String[] {});
				librarianForm.dispose();
			}
		});
		
		btnLogout.setFont(new Font("Roboto Mono", Font.PLAIN, 16));
		btnLogout.setBounds(59, 406, 104, 45);
		navPanel.add(btnLogout);
		
		JLabel lblISBN = new JLabel("ISBN");
		lblISBN.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblISBN.setBounds(283, 133, 123, 16);
		librarianForm.getContentPane().add(lblISBN);
		
		ISBN = new JTextField();
		ISBN.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		ISBN.setColumns(10);
		ISBN.setBounds(448, 129, 252, 26);
		librarianForm.getContentPane().add(ISBN);
		
		JLabel lblStudentID = new JLabel("Student's ID");
		lblStudentID.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblStudentID.setBounds(283, 182, 123, 16);
		librarianForm.getContentPane().add(lblStudentID);
		
		tfStudentID = new JTextField();
		tfStudentID.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfStudentID.setColumns(10);
		tfStudentID.setBounds(448, 178, 252, 26);
		librarianForm.getContentPane().add(tfStudentID);
		
		tfStudentName = new JTextField();
		tfStudentName.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfStudentName.setColumns(10);
		tfStudentName.setBounds(448, 226, 252, 26);
		librarianForm.getContentPane().add(tfStudentName);
		
		JLabel lblStudentName = new JLabel("Student's Name");
		lblStudentName.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblStudentName.setBounds(283, 230, 123, 16);
		librarianForm.getContentPane().add(lblStudentName);
		
		JLabel lblContact = new JLabel("Student's Contact");
		lblContact.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblContact.setBounds(283, 280, 148, 16);
		librarianForm.getContentPane().add(lblContact);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(448, 276, 252, 26);
		librarianForm.getContentPane().add(textField_3);
		
		JLabel lblIssueBook = new JLabel("Issue Books");
		lblIssueBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBook.setFont(new Font("Roboto Condensed", Font.PLAIN, 32));
		lblIssueBook.setBounds(368, 52, 208, 38);
		librarianForm.getContentPane().add(lblIssueBook);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		btnReset.setBounds(482, 358, 94, 36);
		librarianForm.getContentPane().add(btnReset);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		btnSubmit.setBounds(363, 358, 94, 36);
		librarianForm.getContentPane().add(btnSubmit);
		
		// **********************
	
	}
}
