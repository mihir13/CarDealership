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
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class SearchCar extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtCarModel;
	private JTextField txtColour;
	private JTextField txtSize;
	private JTextField txtTransmissionType;
	private JTextField txtMinSeats;
	private JTextField txtMaxSeats;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchCar frame = new SearchCar();
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
	public SearchCar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 350, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchCar = new JLabel("SEARCH CAR");
		lblSearchCar.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchCar.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblSearchCar.setBounds(288, 22, 117, 35);
		contentPane.add(lblSearchCar);
		
		JLabel lblThisSectionIs = new JLabel("This section is used to search a car using the parameters below. Please enter min and max numbers of seats");
		lblThisSectionIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisSectionIs.setBounds(6, 60, 688, 16);
		contentPane.add(lblThisSectionIs);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 82, 688, 16);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 406, 688, 16);
		contentPane.add(separator_1);
		
		txtCarModel = new JTextField();
		txtCarModel.addKeyListener(new KeyListener() {
			@Override
		    public void keyTyped(KeyEvent e) {

		    }

		    @Override
		    public void keyPressed(KeyEvent e) {
		    }

		    @Override
		    public void keyReleased(KeyEvent e) {
		        int pos = txtCarModel.getCaretPosition();
		        txtCarModel.setText(txtCarModel.getText().toLowerCase());
		        txtCarModel.setCaretPosition(pos);
		    }
			
		});
		txtCarModel.setForeground(Color.BLACK);
		txtCarModel.setHorizontalAlignment(SwingConstants.CENTER);
		txtCarModel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtCarModel.setBounds(6, 116, 130, 26);
		contentPane.add(txtCarModel);
		txtCarModel.setColumns(10);
		
		txtColour = new JTextField();
		txtColour.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				 int pos = txtColour.getCaretPosition();
				 txtColour.setText(txtColour.getText().toLowerCase());
				 txtColour.setCaretPosition(pos);
			        
			        // TODO Auto-generated method stub
				
			}
		});
		txtColour.setForeground(Color.BLACK);
		txtColour.setHorizontalAlignment(SwingConstants.CENTER);
		txtColour.setColumns(10);
		txtColour.setBounds(174, 116, 130, 26);
		contentPane.add(txtColour);
		
		txtSize = new JTextField();
		txtSize.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				 int pos = txtSize.getCaretPosition();
				 txtSize.setText(txtSize.getText().toLowerCase());
				 txtSize.setCaretPosition(pos);// TODO Auto-generated method stub
				
			}
		});
		txtSize.setForeground(Color.BLACK);
		txtSize.setHorizontalAlignment(SwingConstants.CENTER);
		txtSize.setColumns(10);
		txtSize.setBounds(349, 116, 130, 26);
		contentPane.add(txtSize);
		
		txtTransmissionType = new JTextField();
		txtTransmissionType.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int pos = txtTransmissionType.getCaretPosition();
				txtTransmissionType.setText(txtTransmissionType.getText().toLowerCase());
				txtTransmissionType.setCaretPosition(pos);
				// TODO Auto-generated method stub
				
			}
		});
		txtTransmissionType.setForeground(Color.BLACK);
		txtTransmissionType.setHorizontalAlignment(SwingConstants.CENTER);
		txtTransmissionType.setColumns(10);
		txtTransmissionType.setBounds(531, 116, 130, 26);
		contentPane.add(txtTransmissionType);
		
		txtMinSeats = new JTextField();
		txtMinSeats.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinSeats.setForeground(Color.BLACK);
		txtMinSeats.setColumns(10);
		txtMinSeats.setBounds(227, 166, 87, 26);
		contentPane.add(txtMinSeats);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 204, 649, 190);
		contentPane.add(scrollPane);
		
		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				String Model = txtCarModel.getText();				
				String Colour = txtColour.getText();
				String Size = txtSize.getText();				
				String Trans = txtTransmissionType.getText();				
				int MinSeats = Integer.parseInt(txtMinSeats.getText());
				int MaxSeats = Integer.parseInt(txtMaxSeats.getText());
				
				
			    try {
			    	textArea.setText(null);
		            FileReader fileReader = new FileReader("cars-import.txt");
		            BufferedReader reader = new BufferedReader(fileReader);
		            FileReader fileReader2 = new FileReader("cars-type.txt");
		            BufferedReader reader2 = new BufferedReader(fileReader2);
		          
		            String currentLine;
		            String currentType = null;
		     
					while ((currentLine = reader.readLine()) != null) {
						String[] carArr = currentLine.toLowerCase().split(",");
               // if the text entered matches with the list , it displays all the matched results in a list 

						if (txtCarModel.equals("") || carArr[1].contains(Model)){
		                    if (txtColour.equals("") || carArr[4].contains(Colour)){
		                        if (txtSize.equals("") || carArr[3].contains(Size)){
		                            if (txtTransmissionType.equals("") || carArr[7].contains(Trans)) {
		                            	textArea.append(currentLine + "\n");		            		                
		                           
		                            		}
		                            	}
		                            }
		                        }
						
		                    }
					
					
		          //      }
			//			}
				
					
			    }
		        catch (NumberFormatException | IOException ee) {
		            ee.printStackTrace();
		            JOptionPane.showMessageDialog(frame, "Could not search the list", "Error", JOptionPane.ERROR_MESSAGE);
		        }
				
				
			}
		});
		btnSearch.setBounds(87, 434, 117, 29);
		contentPane.add(btnSearch);
		
		JLabel lblCarModel = new JLabel("Car Model");
		lblCarModel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCarModel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarModel.setBounds(6, 90, 130, 26);
		contentPane.add(lblCarModel);
		
		JLabel lblColour = new JLabel("Colour");
		lblColour.setHorizontalAlignment(SwingConstants.CENTER);
		lblColour.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblColour.setBounds(174, 90, 130, 26);
		contentPane.add(lblColour);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setHorizontalAlignment(SwingConstants.CENTER);
		lblSize.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSize.setBounds(349, 90, 130, 26);
		contentPane.add(lblSize);
		
		JLabel lblTransmission = new JLabel("Transmission");
		lblTransmission.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransmission.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTransmission.setBounds(531, 91, 130, 25);
		contentPane.add(lblTransmission);
		
		JLabel lblSeats = new JLabel("Seats");
		lblSeats.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeats.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSeats.setBounds(273, 140, 110, 26);
		contentPane.add(lblSeats);
		
		JButton btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchCar.this.dispose();
				Home info = new Home();      // redirects to the home page (main menu)
				info.setVisible(true);
			}
		});
		btnMainMenu.setBounds(288, 434, 117, 29);
		contentPane.add(btnMainMenu);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			private JFrame frmLoginSystem;

			public void actionPerformed(ActionEvent arg0) {
		
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,"Are you sure you want to exit ?", "Search Car", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
		}}
			
		});
		btnExit.setBounds(519, 434, 117, 29);
		contentPane.add(btnExit);
		
		JLabel lblMinimum = new JLabel("Minimum");
		lblMinimum.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMinimum.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinimum.setBounds(136, 171, 86, 16);
		contentPane.add(lblMinimum);
		
		JLabel lblMaximum = new JLabel("Maximum");
		lblMaximum.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMaximum.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaximum.setBounds(335, 170, 78, 16);
		contentPane.add(lblMaximum);
		
		txtMaxSeats = new JTextField();
		txtMaxSeats.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaxSeats.setForeground(Color.BLACK);
		txtMaxSeats.setColumns(10);
		txtMaxSeats.setBounds(425, 166, 87, 26);
		contentPane.add(txtMaxSeats);
		
	
		
		
	}
}
