import java.awt.EventQueue;

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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.awt.event.ActionEvent;

public class AddCar extends JFrame {
	private JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCar frame = new AddCar();
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
	public AddCar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 350, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddCar = new JLabel("ADD CAR");
		lblAddCar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddCar.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblAddCar.setBounds(305, 19, 99, 27);
		contentPane.add(lblAddCar);
		
		JLabel lblThisSectionIs = new JLabel("This section is used to add a car into the database using the parameters below");
		lblThisSectionIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisSectionIs.setBounds(6, 47, 673, 32);
		contentPane.add(lblThisSectionIs);
		
		JLabel lblNewLabel = new JLabel("Number Plate");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(95, 103, 173, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setHorizontalAlignment(SwingConstants.CENTER);
		lblModel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblModel.setBounds(95, 131, 173, 22);
		contentPane.add(lblModel);
		
		JLabel lblCarType = new JLabel("Car Type ");
		lblCarType.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCarType.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarType.setBounds(95, 159, 173, 22);
		contentPane.add(lblCarType);
		
		JLabel lblSizeOnly = new JLabel("Size ( Only for Vans )");
		lblSizeOnly.setHorizontalAlignment(SwingConstants.CENTER);
		lblSizeOnly.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSizeOnly.setBounds(95, 187, 180, 16);
		contentPane.add(lblSizeOnly);
		
		JLabel lblColour = new JLabel("Colour");
		lblColour.setHorizontalAlignment(SwingConstants.CENTER);
		lblColour.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblColour.setBounds(95, 215, 173, 22);
		contentPane.add(lblColour);
		
		JLabel lblMileage = new JLabel("Mileage");
		lblMileage.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMileage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMileage.setBounds(95, 243, 173, 22);
		contentPane.add(lblMileage);
		
		JLabel lblAccidentHistory = new JLabel("Accident History");
		lblAccidentHistory.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccidentHistory.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAccidentHistory.setBounds(95, 271, 173, 22);
		contentPane.add(lblAccidentHistory);
		
		JLabel lblTransmissionType = new JLabel("Transmission Type ");
		lblTransmissionType.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransmissionType.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTransmissionType.setBounds(95, 299, 173, 22);
		contentPane.add(lblTransmissionType);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPrice.setBounds(95, 327, 173, 16);
		contentPane.add(lblPrice);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(16, 79, 673, 12);
		contentPane.add(separator);
		
		JLabel lblArrivalDate = new JLabel("Arrival Date");
		lblArrivalDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrivalDate.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblArrivalDate.setBounds(95, 355, 173, 16);
		contentPane.add(lblArrivalDate);
		
		JLabel lblSellingDate = new JLabel("Selling Date");
		lblSellingDate.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSellingDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblSellingDate.setBounds(95, 383, 173, 22);
		contentPane.add(lblSellingDate);
		
		textField = new JTextField();
		textField.setBounds(442, 99, 158, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(442, 127, 158, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(442, 155, 158, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(442, 183, 158, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(442, 211, 158, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(442, 239, 158, 26);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(442, 267, 158, 26);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(442, 295, 158, 26);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(442, 323, 158, 26);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(442, 351, 158, 26);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(442, 379, 158, 26);
		contentPane.add(textField_10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String NumPlate = textField.getText();
				String Model = textField_1.getText();
				String CarType = textField_2.getText();
				String Size = textField_3.getText();				
				String Colour = textField_4.getText();
				String Mileage = textField_5.getText();				
				String AccHis = textField_6.getText();
				String Trans = textField_7.getText();				
				String Price = textField_8.getText();
				String ArrDate = textField_9.getText();				
				String SelDate = textField_10.getText();
				
				String Arr = NumPlate + Model + CarType + Size + Mileage + AccHis + Trans + Price + ArrDate + SelDate;
				
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Date date = new Date();
					ArrDate =sdf.format(date); // shows today's date in text field
					BufferedWriter bw = new BufferedWriter(new FileWriter(new File("cars-import.txt"),true));
					PrintWriter pw = new PrintWriter(bw);
					// if the text boxes are not empty the user can entered the required details into the list 
					if (!Arr.equals("")) {
						JOptionPane.showMessageDialog(frame, "You have successfully entered the right credentials ");
						// if the entered details do not contain sell date, the list is saved as unsold 
						if (SelDate.equals("")) {
							pw.println((NumPlate) + ", " + (Model) + ", " +(CarType)+ ", " +(Size)+ ", " +(Colour)+ ", " +(Mileage)+ ", " +(AccHis)+ ", " +(Trans)+ ", " +(Price)+ ", " +(ArrDate)+ ", " +(SelDate)+  ", Unsold");

						}
						else {
							pw.println((NumPlate) + ", " + (Model) + ", " +(CarType)+ ", " +(Size)+ ", " +(Colour)+ ", " +(Mileage)+ ", " +(AccHis)+ ", " +(Trans)+ ", " +(Price)+ ", " +(ArrDate)+ ", " +(SelDate)+  ", Sold");

						}
					}
					else {
						pw.close();
						JOptionPane.showMessageDialog(frame,"Invalid credentials. Please enter the relevant details ");
					}
					
					pw.flush();
					pw.close();
					
					
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					textField_7.setText(null);
					textField_8.setText(null);
					textField_9.setText(null);
					textField_10.setText(null);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(frame,"Invalid Credentials");
				}
				
			}
		});
		btnNewButton.setBounds(95, 432, 138, 27);
		contentPane.add(btnNewButton);
		
		JButton btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCar.this.dispose();
				Home info = new Home();      // redirects to the home page (main menu)
				info.setVisible(true);
				
			}
		});
		btnMainMenu.setBounds(305, 432, 138, 27);
		contentPane.add(btnMainMenu);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 408, 673, 12);
		contentPane.add(separator_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
		
				private JFrame frmLoginSystem;

				public void actionPerformed(ActionEvent arg0) {
			
					frmLoginSystem = new JFrame("Exit");
					if (JOptionPane.showConfirmDialog(frmLoginSystem,"Are you sure you want to exit ?", "Add Car", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
					System.exit(0);
			}
			}
		});
		btnExit.setBounds(483, 431, 117, 29);
		contentPane.add(btnExit);
	}
}
