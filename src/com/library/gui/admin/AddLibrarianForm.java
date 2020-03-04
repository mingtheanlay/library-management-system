package com.library.gui.admin;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.library.gui.login.LoginForm;
import com.library.admin.db.*;
import com.library.admin.function.*;

public class AddLibrarianForm {

	private JFrame adminFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddLibrarianForm window = new AddLibrarianForm();
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
	public AddLibrarianForm() {
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
			
		// **********************
		addLibrarian();
		
	}
	
	private void addLibrarian() {
		JPanel addLibrarianForm = new JPanel();
		addLibrarianForm.setBounds(226, 0, 494, 490);
		addLibrarianForm.setLayout(null);
		adminFrame.getContentPane().add(addLibrarianForm);
		
		
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
		
		JTextField tfCity = new JTextField();
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
				String name=tfName.getText();
				String password=String.valueOf(tfPassword.getPassword());
				String email=tfEmail.getText();
				String address=tfAddress.getText();
				String city=tfCity.getText();
				String phone=tfPhoneNumber.getText();
				
				//Check null
				if(name.isBlank()) {
					JOptionPane.showMessageDialog(null,"Please fill your account name","Login Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				if(password.isBlank()) {
					JOptionPane.showMessageDialog(null,"Please fill your password","Login Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				if(email.isBlank()) {
					JOptionPane.showMessageDialog(null,"Please fill your account Email","Login Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				if(address.isBlank()) {
					JOptionPane.showMessageDialog(null,"Please fill your Address","Login Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				if(city.isBlank()) {
					JOptionPane.showMessageDialog(null,"Please fill your city","Login Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				if(phone.isBlank()) {
					JOptionPane.showMessageDialog(null,"Please fill your phone","Login Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				//Email Validation
				String emailRegrex="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
				Pattern emailpat=Pattern.compile(emailRegrex,Pattern.CASE_INSENSITIVE);
				Matcher matcher_email=emailpat.matcher(email);
				if(matcher_email.matches()==false) {
					JOptionPane.showMessageDialog(null,"Please fill correct email format","Login Error",JOptionPane.ERROR_MESSAGE);
					tfEmail.setText("");
					return;
				}
				
				//Phone Validation

				String phoneRegrex="^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{3,4})$";
				Pattern phonepat=Pattern.compile(phoneRegrex);
				Matcher matcher_phone=phonepat.matcher(phone);
				System.out.println(matcher_phone.matches());
				if(matcher_phone.matches()==false) {
					tfPhoneNumber.setText("");
					JOptionPane.showMessageDialog(null,"Please fill correct phone format","Login Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				
				//Save to database
				int i=LibrarianDao.save(name, password, email, address, city, phone);
				if(i>0){
					JOptionPane.showMessageDialog(null,"Librarian added successfully!");
					AddLibrarianForm.main(new String[] {});
					adminFrame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(null,"Sorry, unable to save!");
				}
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
