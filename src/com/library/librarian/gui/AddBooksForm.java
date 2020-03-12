package com.library.librarian.gui;

import java.awt.EventQueue;

import com.library.gui.login.*;

import javax.swing.JFrame;
import java.awt.Color;


import javax.swing.JPanel;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import com.library.admin.db.*;

public class AddBooksForm {

	private JFrame librarianForm;
	private JTextField tfISBN;
	private JTextField tfTitle;
	private JTextField tfAuthor;
	private JTextField tfPublisher;
	private JTextField tfEdition;
	private JTextField tfQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBooksForm window = new AddBooksForm();
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
	public AddBooksForm() {
		initialize();
	}
	private void clearField() {
		tfISBN.setText("");
		tfTitle.setText("");
		tfAuthor.setText("");
		tfPublisher.setText("");
		tfEdition.setText("");
		tfQuantity.setText("");
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
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		btnSubmit.setBounds(353, 408, 94, 36);
		librarianForm.getContentPane().add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String id=tfISBN.getText();
			String title=tfTitle.getText();
			String author=tfAuthor.getText();
			String publisher=tfPublisher.getText();
			String sedition=tfEdition.getText();
			String squantity=tfQuantity.getText();
			int quantity=Integer.parseInt(squantity);
			int edition=Integer.parseInt(sedition);
			int i=BookDao.save(id,title, author, publisher,edition,quantity);
			if(i>0){
				JOptionPane.showMessageDialog(null,"Books added successfully!");
				clearField();
				//LibrarianSuccess.main(new String[]{});
				//frame.dispose();
			
				
			}else{
				JOptionPane.showMessageDialog(null,"Sorry, unable to save!");
			}
				
				
	}});
	
		// **********************
		
		JLabel lbdAddBooks = new JLabel("Add Books");
		lbdAddBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lbdAddBooks.setFont(new Font("Roboto Condensed", Font.PLAIN, 32));
		lbdAddBooks.setBounds(378, 31, 208, 38);
		librarianForm.getContentPane().add(lbdAddBooks);
		
		JLabel lblIBSN = new JLabel("ISBN");
		lblIBSN.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblIBSN.setBounds(291, 102, 123, 16);
		librarianForm.getContentPane().add(lblIBSN);
		
		tfISBN = new JTextField();
		tfISBN.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfISBN.setColumns(10);
		tfISBN.setBounds(429, 98, 252, 26);
		librarianForm.getContentPane().add(tfISBN);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblTitle.setBounds(291, 151, 123, 16);
		librarianForm.getContentPane().add(lblTitle);
		
		tfTitle = new JTextField();
		tfTitle.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfTitle.setColumns(10);
		tfTitle.setBounds(429, 147, 252, 26);
		librarianForm.getContentPane().add(tfTitle);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblAuthor.setBounds(291, 199, 123, 16);
		librarianForm.getContentPane().add(lblAuthor);
		
		tfAuthor = new JTextField();
		tfAuthor.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfAuthor.setColumns(10);
		tfAuthor.setBounds(429, 195, 252, 26);
		librarianForm.getContentPane().add(tfAuthor);
		
		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblPublisher.setBounds(291, 249, 123, 16);
		librarianForm.getContentPane().add(lblPublisher);
		
		tfPublisher = new JTextField();
		tfPublisher.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfPublisher.setColumns(10);
		tfPublisher.setBounds(429, 245, 252, 26);
		librarianForm.getContentPane().add(tfPublisher);
		
		JLabel lblEdition = new JLabel("Edition");
		lblEdition.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblEdition.setBounds(291, 297, 123, 16);
		librarianForm.getContentPane().add(lblEdition);
		
		tfEdition = new JTextField();
		tfEdition.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfEdition.setColumns(10);
		tfEdition.setBounds(429, 293, 252, 26);
		librarianForm.getContentPane().add(tfEdition);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lblQuantity.setBounds(291, 348, 123, 16);
		librarianForm.getContentPane().add(lblQuantity);
		
		tfQuantity = new JTextField();
		tfQuantity.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfQuantity.setColumns(10);
		tfQuantity.setBounds(429, 344, 252, 26);
		librarianForm.getContentPane().add(tfQuantity);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		btnReset.setBounds(472, 408, 94, 36);
		librarianForm.getContentPane().add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearField();
				
			}
			
		});
	}

	
}
