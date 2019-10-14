import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class AddUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUser frame = new AddUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD USER");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(261, 28, 125, 25);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 65, 634, 12);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setBounds(32, 120, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(261, 120, 130, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(474, 120, 130, 26);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("ADD USERNAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(32, 89, 130, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAddPassword = new JLabel("ADD PASSWORD");
		lblAddPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddPassword.setBounds(261, 89, 130, 16);
		contentPane.add(lblAddPassword);
		
		JLabel lblAddRole = new JLabel("ADD ROLE");
		lblAddRole.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddRole.setBounds(474, 89, 125, 16);
		contentPane.add(lblAddRole);
		
		JButton btnNewButton = new JButton("ADD ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Username = textField.getText();
				String Password = textField_1.getText();
				String Role = textField_2.getText();
				
				String Login = Username + Password + Role;
					
				try 
				{
					BufferedWriter bw = new BufferedWriter(new FileWriter(new File("cars-users.txt"),true));
					PrintWriter pw = new PrintWriter(bw);
					if(!Login.equals("")) {
						JOptionPane.showMessageDialog(frame, "You have successfully entered the right credientials ");
						pw.println((Username) + "," + (Password) + "," +(Role));
					}
					else {
						pw.close();
						JOptionPane.showMessageDialog(frame,"Invalid credentials. Please enter the relevant details ");
					}
					
					pw.flush();
					pw.close();
				}
				
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(frame,"Invalid Credentials");
					
				}
				
				
				
			}
		});
			
		btnNewButton.setBounds(45, 193, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			private JFrame frmLoginSystem;

			public void actionPerformed(ActionEvent arg0) {
		
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,"Are you sure you want to exit ?", "Add User", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
					AddUser.this.dispose();
		}}
			
		});
		btnExit.setBounds(487, 193, 117, 29);
		contentPane.add(btnExit);
		
		JButton btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUser.this.dispose();                  // redirects to the home page (main menu)
					}
		});
		btnMainMenu.setBounds(269, 193, 117, 29);
		contentPane.add(btnMainMenu);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 169, 634, 12);
		contentPane.add(separator_1);
	}
}
