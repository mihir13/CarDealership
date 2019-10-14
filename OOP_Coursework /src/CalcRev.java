import java.awt.EventQueue;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;


public class CalcRev extends JFrame {


	public JPanel contentPane;
	public JFrame frame;
	public JTextField textField;
	public JTextField textField_Month;
	public JTextField textField_Date;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcRev frame = new CalcRev();
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
	public CalcRev() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 350, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblCalculateRevenue = new JLabel("CALCULATE REVENUE");
		lblCalculateRevenue.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCalculateRevenue.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculateRevenue.setBounds(206, 30, 180, 26);
		contentPane.add(lblCalculateRevenue);
		
		JLabel lblNewLabel = new JLabel("This section is used to calculate revenue of cars sold daily and monthly");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 68, 531, 16);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 88, 585, 12);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 381, 688, 12);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(19, 131, 130, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSellingDate = new JLabel("Month");
		lblSellingDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblSellingDate.setBounds(208, 131, 130, 16);
		contentPane.add(lblSellingDate);
		
		JLabel lblRevenue = new JLabel("Revenue");
		lblRevenue.setHorizontalAlignment(SwingConstants.CENTER);
		lblRevenue.setBounds(461, 131, 130, 16);
		contentPane.add(lblRevenue);
		
		textField = new JTextField();
		textField.setBounds(461, 155, 130, 26);
		textField.setColumns(10);
		contentPane.add(textField);
		
		
		textField_Month = new JTextField();
		textField_Month.setBounds(208, 155, 130, 26);
		textField_Month.setColumns(10);
		contentPane.add(textField_Month);
		
		JLabel lblNewLabel_2 = new JLabel("(dd/mm/yyyy)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(19, 193, 130, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblmm = new JLabel("(mm)");
		lblmm.setHorizontalAlignment(SwingConstants.CENTER);
		lblmm.setBounds(208, 193, 130, 16);
		contentPane.add(lblmm);
		
		textField_Date = new JTextField();
		textField_Date.setColumns(10);
		textField_Date.setBounds(19, 155, 130, 26);
		contentPane.add(textField_Date);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home info = new Home();      // redirects to the home page (main menu)
				info.setVisible(true);
			
			}
		});
		btnMainMenu.setBounds(288, 411, 117, 29);
		contentPane.add(btnMainMenu);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Edit this 
			  	String Date = textField_Date.getText();
				String Month = textField_Month.getText();
				
				try {
					FileReader fileReader = new FileReader("cars-import.txt");
		            BufferedReader reader = new BufferedReader(fileReader);
		            Double Revenue = 0.0;
		            int dayCounter = 0;
		            String selDate = "";
		        	String currentLine;
		            
		            while ((currentLine = reader.readLine()) != null) { //reads the animal file and isolates the sell date if it exists
		                String[] CarArr = currentLine.split(",");
	        
		                if (CarArr.length == 12) {
		                    selDate = CarArr[10];
		                	
		                    if (textField_Date.equals("") || CarArr[10].contains(Date)) {
		                    	if (textField_Month.equals("") || CarArr[10].contains(Month)) { 
		                    	Revenue = Revenue + Double.parseDouble(CarArr[8]); //adds the revenue together
		                    	dayCounter = 1;
		                    }
		                    }
		                }
		            }

		            if (dayCounter > 0) {
		            	String Revenue1 = String.valueOf(Revenue);
		            	
		            	textField.setText("£"+Revenue1);
		            } else {
		            	JOptionPane.showMessageDialog(frame, "Please enter the right details");
		            	textField.setText(null);
		            	textField_Date.setText(null);
		            	textField_Month.setText(null);
		            	}
		        } catch (NumberFormatException | IOException ee) {
		            System.out.println("Error computing revenue");

		        }	
			}
		});
		btnCalculate.setBounds(127, 221, 130, 26);
		contentPane.add(btnCalculate);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(6, 311, 585, 20);
		contentPane.add(separator_2);
		
		JButton btnMainMenu_1 = new JButton("MAIN MENU");
		btnMainMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalcRev.this.dispose();
				Home info = new Home();      // redirects to the home page (main menu)
				info.setVisible(true);
		
			}
		});
		btnMainMenu_1.setBounds(140, 328, 117, 29);
		contentPane.add(btnMainMenu_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			private JFrame frmLoginSystem;

			public void actionPerformed(ActionEvent arg0) {
		
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,"Are you sure you want to exit ?", "Calculate Revenue", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
		}}
		});
		btnExit.setBounds(358, 328, 117, 29);
		contentPane.add(btnExit);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setHorizontalAlignment(SwingConstants.CENTER);
		lblOr.setBounds(170, 160, 26, 16);
		contentPane.add(lblOr);

	
	
	}


}
