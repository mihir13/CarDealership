import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;


public class Login {

	private JFrame frame;
	private JTextField username;
	private JPasswordField passwordField;

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
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(43, 108, 76, 22);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(43, 172, 76, 16);
		frame.getContentPane().add(lblPassword);
		
		username = new JTextField();
		username.setBounds(268, 106, 130, 26);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(268, 169, 130, 21);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String uname = username.getText();
			String pass= passwordField.getText();
			
			if (uname.equals("name") && pass.equals("password"))
			{
				JOptionPane.showMessageDialog(frame, "You have successfully entered the right credientials ");
			}
			else
				JOptionPane.showMessageDialog(frame,"Invalid Username or Password");
			}
		});
		btnLogin.setBounds(43, 218, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblLoginPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginPage.setBounds(148, 35, 194, 29);
		frame.getContentPane().add(lblLoginPage);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 196, 469, 9);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(25, 87, 469, 9);
		frame.getContentPane().add(separator_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				username.setText(null);
				passwordField.setText(null);
				
			}
		});
		btnReset.setBounds(202, 218, 117, 29);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				system.exit()
			}
		});
		btnExit.setBounds(359, 218, 117, 29);
		frame.getContentPane().add(btnExit);
		
	
	}
}
