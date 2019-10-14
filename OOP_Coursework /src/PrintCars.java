import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Font;

public class PrintCars extends JFrame {

	private JPanel contentPane;
	private Scanner sc;
	private JFrame frame;
	String currentLine;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintCars frame = new PrintCars();
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
	public PrintCars() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 350, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrintCars = new JLabel("PRINT CARS");
		lblPrintCars.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblPrintCars.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrintCars.setBounds(283, 16, 130, 29);
		contentPane.add(lblPrintCars);
			
		JLabel lblThisSectionIs = new JLabel("This section is used to print a list of cars sorted by sold and unsold and print in a file");
		lblThisSectionIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisSectionIs.setBounds(67, 51, 588, 16);
		contentPane.add(lblThisSectionIs);
			
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 68, 688, 12);
		contentPane.add(separator);
			
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 312, 688, 12);
		contentPane.add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 110, 688, 194);
		contentPane.add(scrollPane);
		
		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
			
		JButton btnSoldCars = new JButton("SOLD CARS");
		btnSoldCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sold = "Sold";
			    try {
		            FileReader fileReader = new FileReader("cars-import.txt");
		            BufferedReader reader = new BufferedReader(fileReader);
		            
		            String currentLine;
		            textArea.append("Sold"+"\n");
					while ((currentLine = reader.readLine()) != null) {
		                String[] carArr = currentLine.toLowerCase().split(",");
		            
		                if (currentLine.contains(sold)){
		                	textArea.append(currentLine+"\n");     // displays the list of sold cars
		                }


			 }
			    }  catch (IOException ee) {
		            ee.printStackTrace();
		        }
			    
			}
		});
		btnSoldCars.setBounds(67, 79, 117, 29);
		contentPane.add(btnSoldCars);
			
		JButton btnUnsoldCars = new JButton("UNSOLD CARS");
		btnUnsoldCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unsold = "Unsold";
				
				
			    try {
		            FileReader fileReader = new FileReader("cars-import.txt");
		            BufferedReader reader = new BufferedReader(fileReader);
					
		            textArea.append("Unsold"+"\n");

					while ((currentLine = reader.readLine()) != null) {
		                String[] carArr = currentLine.toLowerCase().split(",");
						String ArrDate = carArr[9];
		                if (currentLine.contains(unsold)){
		                	textArea.append("Unsold");
		                	textArea.append(currentLine+"\n");    // displays the list of unsold cars
		                	
		                }
			 }
			    }  catch (IOException ee) {
		            ee.printStackTrace();
		        }
			
			}
		});
		btnUnsoldCars.setBounds(538, 79, 117, 29);
		contentPane.add(btnUnsoldCars);
			
		JButton btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrintCars.this.dispose();
				Home info = new Home();
				info.setVisible(true);
				
			}
		});
		btnMainMenu.setBounds(296, 336, 117, 29);
		contentPane.add(btnMainMenu);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			private JFrame frmLoginSystem;

			public void actionPerformed(ActionEvent arg0) {
		
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,"Are you sure you want to exit ?", "Print Cars", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
		}
			}
		});
		btnExit.setBounds(538, 334, 117, 29);
		contentPane.add(btnExit);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			        String sold = "Sold";
			        String unsold = "Unsold";
			        try {
			            /* reads the textfile and stores into textfile */
			            FileReader fileReader = new FileReader("cars-import.txt");
			            BufferedReader bufferedReader = new BufferedReader(fileReader);

			            while ((currentLine = bufferedReader.readLine()) != null) {

			                if (currentLine.contains(sold)) {
			                    File file = new File("cars-output.txt");

			                    if (!file.exists()) {
			                        file.createNewFile();
			                    }
			                    FileWriter fw = new FileWriter("cars-output.txt", true);     // writes all the unsold cars into the textfile
			                    BufferedWriter bw = new BufferedWriter(fw);
			                    PrintWriter pw = new PrintWriter(bw);
			                
			                    pw.println(currentLine);
			                    
			                    pw.flush();
			                    pw.close();
			                }
			            }
			            bufferedReader.close();

			        } catch (IOException ex) {
			            System.out.println("Error");
			        }
			
			        try {
			            /* reads the textfile*/
			            FileReader fileReader = new FileReader("cars-import.txt");
			            BufferedReader bufferedReader = new BufferedReader(fileReader);

			            while ((currentLine = bufferedReader.readLine()) != null) {

			                if (currentLine.contains(unsold)) {
			                    FileWriter fw = new FileWriter("cars-output.txt", true);     // writes all the unsold cars into the textfile
			                    BufferedWriter bw = new BufferedWriter(fw);
			                    PrintWriter pw = new PrintWriter(bw);
			                    pw.println(currentLine);
			                    pw.flush();
			                    pw.close();
			                }
			            }
			            bufferedReader.close();
	                    JOptionPane.showMessageDialog(frame,"The list is stored in cars-output.txt");
			        } catch (IOException ex) {
			            System.out.println("Error");
			        }
			}
		});
		btnPrint.setBounds(67, 336, 117, 29);
		contentPane.add(btnPrint);
		
	
		}
	}


