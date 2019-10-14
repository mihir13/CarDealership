import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class AddCars extends JFrame {
	
	private JPanel contentPane;
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCars frame = new AddCars();
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
	public AddCars() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 350, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
		JLabel lblAddCars = new JLabel("ADD CARS");
		lblAddCars.setBounds(271, 16, 66, 16);
		lblAddCars.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblAddCars);
			
		JLabel lblNewLabel = new JLabel("This section is used to add a list of cars ");
		lblNewLabel.setBounds(182, 44, 256, 16);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 73, 588, 16);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(6, 299, 588, 16);
		contentPane.add(separator_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 85, 588, 212);
		contentPane.add(scrollPane);
		
		final JTextArea textArea1 = new JTextArea();
		textArea1.setEditable(false);
		scrollPane.setViewportView(textArea1);
		
		
		JButton btnShow = new JButton("SHOW");
		btnShow.setBounds(61, 327, 82, 29);
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea1.setText(null);
				BufferedReader br = null;
				String currentLine;
				int lines = 0;
				try {
					BufferedReader reader = new BufferedReader(new FileReader("cars-import.txt"));
					while ((currentLine = reader.readLine()) != null){ // Counts the line numbers in the car file
			            lines++;
			            textArea1.append(lines + ". " + currentLine +"\n");    // displays the list 
			           
			            
					}
					reader.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			
			}
			
			
		});
		contentPane.add(btnShow);
			
		JButton btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.setBounds(248, 327, 119, 29);
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCars.this.dispose();
				Home info = new Home();      // redirects to the home page (main menu)
				info.setVisible(true);
							}
		});
		contentPane.add(btnMainMenu);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			private JFrame frmLoginSystem;

			public void actionPerformed(ActionEvent arg0) {
		
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,"Are you sure you want to exit ?", "Add Cars", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
		}
			}
		});
		btnExit.setBounds(462, 327, 75, 29);
		contentPane.add(btnExit);
		
	
	}
	}


