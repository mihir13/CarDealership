import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SellCars extends JFrame {

	private JFrame frame;
	private JPanel contentPane;
	private JTextField textField_Num;
	private JTextField textField_Date;
	String currentLine;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SellCars frame = new SellCars();
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
	public SellCars() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 350, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSellCars = new JLabel("SELL CARS");
		lblSellCars.setHorizontalAlignment(SwingConstants.CENTER);
		lblSellCars.setBounds(303, 26, 86, 16);
		contentPane.add(lblSellCars);
		
		JLabel lblThisSectionIs = new JLabel("This section is used to make changes to a car details to sold ");
		lblThisSectionIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisSectionIs.setBounds(141, 54, 430, 16);
		contentPane.add(lblThisSectionIs);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(19, 136, 662, 123);
		contentPane.add(scrollPane1);
		
		final JTextArea textArea1 = new JTextArea();
		scrollPane1.setViewportView(textArea1);
		textArea1.setEditable(false);
		

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(19, 383, 662, 41);
		contentPane.add(scrollPane_1);
		
		final JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		textArea_1.setEditable(false);
		
		JButton btnSelectCar = new JButton("SELECT CAR");
		btnSelectCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ListNum = Integer.parseInt(textField_Num.getText());
				int lines = 0;
				try {
					textArea_1.setText(null);
					BufferedReader reader = new BufferedReader(new FileReader("cars-import.txt"));
					while ((currentLine = reader.readLine()) != null){ //Counts the line numbers in the animal file
			            lines++;
			            if (lines == ListNum){
							
						
			            textArea_1.append(lines + ". " + currentLine);    // displays the list selected to be changed
			           
			            }
					}
					reader.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			
				
			
			}
		});
		btnSelectCar.setBounds(293, 353, 117, 29);
		contentPane.add(btnSelectCar);
		
		JButton btnShowChanges = new JButton("SHOW CHANGES");
		btnShowChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ListNum = Integer.parseInt(textField_Num.getText());
				int lines = 0;
				try {
					textArea_1.setText(null);
					BufferedReader reader = new BufferedReader(new FileReader("cars-import.txt"));
					while ((currentLine = reader.readLine()) != null){ //Counts the line numbers in the animal file
			            lines++;
			            if (lines == ListNum){
							
						
			            textArea_1.append(lines + ". " + currentLine);     // displays the changed list 
			           
			            }
					}
					reader.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			}
		});
		btnShowChanges.setBounds(79, 603, 131, 29);
		contentPane.add(btnShowChanges);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
				private JFrame frmLoginSystem;

				public void actionPerformed(ActionEvent arg0) {
			
					frmLoginSystem = new JFrame("Exit");
					if (JOptionPane.showConfirmDialog(frmLoginSystem,"Are you sure you want to exit ?", "Sell Cars", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
					System.exit(0);
			}}
		});
		btnExit.setBounds(516, 603, 117, 29);
		contentPane.add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 83, 688, 15);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 271, 688, 15);
		contentPane.add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(19, 136, 662, 37);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		
		JButton btnAddChanges = new JButton("ADD CHANGES");
		btnAddChanges.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				int ListNum = Integer.parseInt(textField_Num.getText());
				int lines = 0;
				String Date = textField_Date.getText();
				String soldCar = "";
			
				int j=0;
				Boolean clearCarFile = false;
				
				
				
				try { // Copies the contents of the cars file to a temp file
					BufferedReader reader2 = new BufferedReader(new FileReader("cars-import.txt"));
					String i = "";

					while ((i = reader2.readLine()) != null ){
						FileWriter fw = new FileWriter("temp.txt", true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter pw = new PrintWriter(bw);
						pw.println(i);
		                pw.flush();
		                pw.close();
		            }
		            reader2.close();

		            BufferedReader reader3 = new BufferedReader(new FileReader("cars-import.txt"));
		            while ((currentLine = reader3.readLine()) != null){
			            // Creates a variable soldCar, which stores the new sold string 
			            j++;
			            if (j == ListNum){
			                soldCar = currentLine.replace(", Unsold", Date + ", Sold");
			            }
			            
			        }
			        reader3.close();

			        BufferedReader reader4 = new BufferedReader((new FileReader("temp.txt")));
			        int counter = 0;
			    	String tempLine = "";
		
			        while ((tempLine = reader4.readLine()) != null){ //reads each line of the temp file
			            counter++;
			            FileWriter fw = new FileWriter("cars-import.txt", true);
			            BufferedWriter bw = new BufferedWriter(fw);
			            PrintWriter pw = new PrintWriter(bw);
			            
			            if (!clearCarFile){ // clears the car file once, so it is ready to be changed
			            	clearCarFile = true;
			            	new FileOutputStream("cars-import.txt");
			            }	
			            
			            if (counter == ListNum){ // if the line matches the desired line change, it prints the new soldCar string
			            	pw.println(soldCar);
			                pw.flush();
			                pw.close();
			            }
			            else{ // else, it prints the same line that was there before
			                pw.println(tempLine);
			                pw.flush();
			                pw.close();
			            } 
			        }
			        
			        reader4.close();
			        
			        PrintWriter writer = new PrintWriter("temp.txt");    // deletes the temp file
			        writer.print("");
			        writer.close();
			        JOptionPane.showMessageDialog(frame,"All your changes are saved"); 
		        }
				

		        catch (IOException ee){
		            System.out.println(ee);

		        }
				
		}
		});
		
		btnAddChanges.setBounds(174, 535, 131, 29);
		contentPane.add(btnAddChanges);
		
		
		textField_Date = new JTextField();
		textField_Date.setBounds(297, 487, 130, 26);
		contentPane.add(textField_Date);
		textField_Date.setColumns(10);
		
		JLabel lblEnterTheDate = new JLabel("Enter the date of the item sold ( if today please click on Today )");
		lblEnterTheDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheDate.setBounds(141, 459, 442, 16);
		contentPane.add(lblEnterTheDate);
		
		JButton btnToday = new JButton("TODAY");
		btnToday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date date = new Date();
				textField_Date.setText(sdf.format(date)); // shows today's date in text field
			
			}
		});
		btnToday.setBounds(403, 535, 117, 29);
		contentPane.add(btnToday);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(6, 576, 688, 15);
		contentPane.add(separator_3);
		
		JLabel lblYyyymmdd = new JLabel("(yyyy-mm-dd)");
		lblYyyymmdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblYyyymmdd.setBounds(303, 525, 110, 16);
		contentPane.add(lblYyyymmdd);
	
		JButton btnShowListOf = new JButton("SHOW LIST OF CARS");
		btnShowListOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				int lines = 0;
				try {
					BufferedReader reader = new BufferedReader(new FileReader("cars-import.txt"));
					while ((currentLine = reader.readLine()) != null){ //Counts the line numbers in the car file
			            lines++;
			            textArea1.append(lines + ". " + currentLine +"\n");
			           
			            
					}
					reader.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			
			
			}
		});
		btnShowListOf.setBounds(273, 95, 154, 29);
		contentPane.add(btnShowListOf);
		
		textField_Num = new JTextField();
		textField_Num.setBounds(280, 328, 139, 26);
		contentPane.add(textField_Num);
		textField_Num.setColumns(10);
		
		JLabel lblSelectACar = new JLabel("Select a car by typing the list number whose details need to be changed");
		lblSelectACar.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectACar.setBounds(99, 298, 523, 16);
		contentPane.add(lblSelectACar);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(6, 431, 688, 15);
		contentPane.add(separator_2);
		
		JButton btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SellCars.this.dispose();
				Home info = new Home();           // redirects to the home page (main menu)
				info.setVisible(true);

			}
		});
		btnMainMenu.setBounds(303, 603, 117, 29);
		contentPane.add(btnMainMenu);
	
		
		
		
	
	}
}
