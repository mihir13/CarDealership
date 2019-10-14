import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.util.Scanner;

public class Login {

	FileWriter fileWriter;
	private JFrame frame;
	private JTextField username;
	private JPasswordField passwordField;
	private Scanner x;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 300, 500, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(43, 69, 88, 22);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(43, 137, 88, 22);
		frame.getContentPane().add(lblPassword);
		
		username = new JTextField();
		username.setBounds(268, 67, 130, 26);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(268, 137, 130, 21);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Username = username.getText();
				String Password = passwordField.getText();
				
				boolean found = false;
				String tempUsername = "";
				String tempPassword = "";
				String tempRole = "";
			        
				try
				{
					username.setText(null);
					passwordField.setText(null);
					x = new Scanner(new File("cars-users.txt"));
					x.useDelimiter("[,\n]");
			        	
			           		
					while(x.hasNext() && !found)  // reads every username and password in text file and matches 
					{
						tempUsername = x.next();
						tempPassword = x.next();
						tempRole = x.next();
					
						if(tempUsername.trim().equals(Username.trim()) && tempPassword.trim().equals(Password.trim()))
						{
							found = true;
							JOptionPane.showMessageDialog(frame, "You have successfully entered the right credientials ");
								
							username.setText(null);
							passwordField.setText(null);

							if(tempRole.trim().equals("admin")) {
								
								Home info = new Home();     // the admin can get access of all functionality with function to add users 
								info.setVisible(true);
								AddUser Add = new AddUser();
								Add.setVisible(true);     
								frame.dispose();
							}
							
						
						
							if(tempRole.trim().equals("customer")) {
								
								SearchCar search = new SearchCar();   // customers only get to see the search cars function
								search.setVisible(true); 
								frame.dispose();
							}
							
							if(tempRole.trim().equals("staff")) {
							Home info = new Home();
							info.setVisible(true);        // staff get access of all functionality 
							frame.dispose(); 
							}
						
						}
						
					}
				

				}
				
				
				catch(Exception e1) {
					System.out.println("Error");	
					JOptionPane.showMessageDialog(frame,"Invalid Username or Password");

				}    
				x.close();
				
			    }
			
		
	});
		btnLogin.setBounds(43, 194, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblLoginPage = new JLabel("LOGIN PAGE");
		lblLoginPage.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblLoginPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginPage.setBounds(148, 19, 194, 29);
		frame.getContentPane().add(lblLoginPage);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 173, 488, 9);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 48, 488, 9);
		frame.getContentPane().add(separator_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				username.setText(null);
				passwordField.setText(null);    // resets the text boxes to delete any mistakes 
				
			}
		});
		btnReset.setBounds(202, 194, 117, 29);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			private JFrame frmLoginSystem;

			public void actionPerformed(ActionEvent arg0) {
		
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,"Are you sure you want to exit ?", "Login Page", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
		}
		}
		});
		btnExit.setBounds(359, 194, 117, 29);
		frame.getContentPane().add(btnExit);
		
	
	}
}
