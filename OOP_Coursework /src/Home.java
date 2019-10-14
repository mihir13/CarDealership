import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;

public class Home extends JFrame {
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home Fframe = new Home();
					Fframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 400, 800, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnAddCar = new JButton("ADD CAR");
		btnAddCar.setBounds(6, 109, 117, 29);
		btnAddCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.this.dispose();
				AddCar Add = new AddCar();      // closes the current window and displays the selected window 
				Add.setVisible(true);
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAddCar);
		
		JLabel lblNewLabel = new JLabel("HOME PAGE");
		lblNewLabel.setBounds(227, 17, 334, 29);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JButton btnAddCars = new JButton("ADD CARS");
		btnAddCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.this.dispose();
				AddCars Add1 = new AddCars();
				Add1.setVisible(true);
				//Edit all frame closing
				
			}
		});
		btnAddCars.setBounds(135, 109, 117, 29);
		contentPane.add(btnAddCars);
		
		JButton btnSearchCar = new JButton("SEARCH CAR");
		btnSearchCar.setBounds(264, 109, 117, 29);
		btnSearchCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.this.dispose();
				SearchCar Search = new SearchCar();
				Search.setVisible(true);
			}
		});
		contentPane.add(btnSearchCar);
		
		JButton btnPrintCars = new JButton("PRINT CARS");
		btnPrintCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.this.dispose();
				PrintCars Print = new PrintCars();
				Print.setVisible(true);
			}
		});
		btnPrintCars.setBounds(388, 109, 117, 29);
		contentPane.add(btnPrintCars);
		
		JButton btnCalculateRevenue = new JButton("CALCULATE REVENUE");
		btnCalculateRevenue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.this.dispose();
				CalcRev Rev = new CalcRev();
				Rev.setVisible(true);
			}
		});
		btnCalculateRevenue.setBounds(632, 109, 160, 29);
		contentPane.add(btnCalculateRevenue);
		
		JButton btnSellCar = new JButton("SELL CAR");
		btnSellCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.this.dispose();
				SellCars Sel = new SellCars();
				Sel.setVisible(true);
			}
		});
		btnSellCar.setBounds(517, 109, 117, 29);
		contentPane.add(btnSellCar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 85, 786, 12);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 156, 788, 12);
		contentPane.add(separator_1);
		
		JLabel lblcaption = new JLabel("This is the home page where you can access to all these pages ");
		lblcaption.setHorizontalAlignment(SwingConstants.CENTER);
		lblcaption.setHorizontalTextPosition(SwingConstants.CENTER);
		lblcaption.setBounds(135, 57, 496, 16);
		contentPane.add(lblcaption);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			
				private JFrame frmLoginSystem;

				public void actionPerformed(ActionEvent arg0) {
			
					frmLoginSystem = new JFrame("Exit");
					if (JOptionPane.showConfirmDialog(frmLoginSystem,"Are you sure you want to exit ?", "Home Page", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
					System.exit(0);
					}}
		});
		btnExit.setBounds(335, 214, 117, 29);
		contentPane.add(btnExit);
		
		
	}
}
