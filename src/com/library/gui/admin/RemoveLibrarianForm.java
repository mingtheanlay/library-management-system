package com.library.gui.admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.library.gui.login.LoginForm;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.library.admin.db.*;
public class RemoveLibrarianForm {

	private JFrame adminFrame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveLibrarianForm window = new RemoveLibrarianForm();
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
	public RemoveLibrarianForm() {
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
		
		JLabel lblDeleteLibrarian = new JLabel("Delete Librarian");
		lblDeleteLibrarian.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteLibrarian.setFont(new Font("Roboto Condensed", Font.PLAIN, 32));
		lblDeleteLibrarian.setBounds(380, 52, 208, 38);
		adminFrame.getContentPane().add(lblDeleteLibrarian);
		
		JLabel label = new JLabel("Librarian's ID");
		label.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		label.setBounds(265, 148, 123, 16);
		adminFrame.getContentPane().add(label);
		
		JButton btnSubmitRemove = new JButton("Remove");
		btnSubmitRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sid=textField.getText();
				if(sid==null||sid.trim().equals("")){
					JOptionPane.showMessageDialog(null,"Id can't be blank");
				}else{
					int id=Integer.parseInt(sid);
					int i=LibrarianDao.delete(id);
					if(i>0){
						JOptionPane.showMessageDialog(null,"Record deleted successfully!");
					}else{
						JOptionPane.showMessageDialog(null,"Unable to delete given id!");
						textField.setText("");
					}
				}
			}
		});
		btnSubmitRemove.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		btnSubmitRemove.setBounds(417, 228, 94, 46);
		adminFrame.getContentPane().add(btnSubmitRemove);
		
		textField = new JTextField();
		textField.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		textField.setBounds(403, 144, 252, 26);
		adminFrame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
