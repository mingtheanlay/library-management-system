package com.library.gui.login;
import java.sql.*;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.library.gui.admin.*;
import com.library.librarian.gui.*;
import com.library.admin.*;
import com.library.admin.db.DB;
import com.library.admin.db.LibrarianDao;
import com.library.admin.db.ViewLibrarian;
public class LoginForm {

	private JFrame loginFrame;
      

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            LoginForm window = new LoginForm();
                            window.loginFrame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginFrame = new JFrame();
		loginFrame.setBackground(Color.WHITE);
		loginFrame.setTitle("Library Management System");
		loginFrame.setResizable(false);
		loginFrame.getContentPane().setBackground(Color.WHITE);
		loginFrame.setBounds(100, 100, 800, 400);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);
		
		JLabel lbTitlte = new JLabel("Library Management System");
		lbTitlte.setFont(new Font("Roboto Mono", Font.PLAIN, 36));
		lbTitlte.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitlte.setBounds(115, 22, 580, 85);
		loginFrame.getContentPane().add(lbTitlte);
		
		JLabel lbAccountName = new JLabel("Account Name");
		lbAccountName.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lbAccountName.setBounds(183, 146, 112, 27);
		loginFrame.getContentPane().add(lbAccountName);
		
		JLabel lbPassword = new JLabel("Password");
		lbPassword.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		lbPassword.setBounds(219, 201, 76, 27);
		loginFrame.getContentPane().add(lbPassword);
		

		JTextField tfAccountName = new JTextField();
		tfAccountName.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		tfAccountName.setBounds(345, 146, 320, 26);
		loginFrame.getContentPane().add(tfAccountName);
		tfAccountName.setColumns(10);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		passwordField.setBounds(345, 201, 320, 26);
		loginFrame.getContentPane().add(passwordField);
		
		JButton btnAdmin = new JButton("Login as Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tfAccountName.getText();
				String password=String.copyValueOf(passwordField.getPassword());
				
				//Blank
				if(name.isBlank()) {
					JOptionPane.showMessageDialog(null,"Please fill your account name","Login Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				if(password.isBlank()) {
					JOptionPane.showMessageDialog(null,"Please fill your password","Login Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				//Perform login
				
				if(name.equals("admin")&&password.equals("admin123")){
					AdminSection.main(new String[]{}); 
					loginFrame.dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					tfAccountName.setText("");
					passwordField.setText("");
				}	

			}
		});
		
		btnAdmin.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		btnAdmin.setBounds(430, 282, 164, 43);
		loginFrame.getContentPane().add(btnAdmin);
		
		JButton btnLibrarian = new JButton("Login as Librarian");
		btnLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LibrarianDao.validate(tfAccountName.getText(), password)
				
			try {
				//compare account
				Connection con=DB.getConnection();
				//PreparedStatement ps=con.prepareStatement("select * from librarian");
				// if you only need a few columns, specify them by name instead of using "*"
			      String query = "SELECT * FROM librarian";

			      // create the java statement
			      Statement st = con.createStatement();
			      // execute the query, and get a java resultset
			     ResultSet rs = st.executeQuery(query);
			     char[] password1=passwordField.getPassword();
			     String password=String.valueOf(password1);
			      while (rs.next()) {
						String name = rs.getString("name");
				    	String password_hash=rs.getString("password");
				    	 if(tfAccountName.getText().equals(name)) {
				    		 boolean compare_test = BCrypt.checkpw(password,password_hash);
				    		 if(compare_test==false) {
				    			  JOptionPane.showMessageDialog(null, "Passwords do not match", "Login error", JOptionPane.ERROR_MESSAGE);
				    			  return; 
				    		 }

				    	LibrarianSection.main(new String[] {});
						loginFrame.dispose();	 
						return;
					} 	
			
			      }
			  	JOptionPane.showMessageDialog(null, "User do not match", "Login error", JOptionPane.ERROR_MESSAGE);
				return;
				
			}
			catch(Exception e1) {
			System.err.println(e1);
			}
				
			}
		});
		btnLibrarian.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
		btnLibrarian.setBounds(202, 282, 164, 43);
		loginFrame.getContentPane().add(btnLibrarian);
	}
}
