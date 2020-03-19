package com.library.gui.admin;

import java.awt.EventQueue;

import com.library.gui.login.*;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.net.URI;
import java.net.URISyntaxException;


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
		btnRemoveLibrarian.setBounds(-2, 267, 226, 45);
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
		btnViewLibrarian.setBounds(-2, 209, 226, 45);
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
		btnAddLibrarian.setBounds(-2, 152, 226, 45);
		navPanel.add(btnAddLibrarian);
		String html=new String("<html><body><h2>Welcome</h2></body></html>");
		JLabel lblNewLabel = new JLabel(html);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(322, 29, 267, 150);
		adminFrame.getContentPane().add(lblNewLabel);
		
		JButton btn1=new JButton();
		ImageIcon icon=new ImageIcon("/Users/chinyongchhe/Downloads/iconfinder_Github_1298743.png");
		Image img=icon.getImage();
		Image imgScale=img.getScaledInstance(30,30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon=new ImageIcon(imgScale);
		btn1.setIcon(scaledIcon);
		btn1.setBounds(664, 434, 30, 30);
		adminFrame.getContentPane().add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//File html=new File("<html><body><a href=\"https://www.javatpoint.com/\" target=\"_blank\"> this-link </a></body></html>");
                try {
    				URI uri = new URI("https://github.com/mingtheanlay/library-management-system");
                	java.awt.Desktop.getDesktop().browse(uri);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
			}
		});

		
		
	
		
	}
}
