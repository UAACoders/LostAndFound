package GUIBoxes;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ManageUsers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageUsers frame = new ManageUsers();
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
	public ManageUsers() {
		setTitle("Managing #locations Users");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFindUser = new JButton("Find User");
		btnFindUser.setBounds(25, 41, 121, 75);
		contentPane.add(btnFindUser);
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.setBounds(156, 41, 121, 75);
		contentPane.add(btnAddUser);
		
		JButton btnAddAdmin = new JButton("Add Admin");
		btnAddAdmin.setBounds(287, 41, 121, 75);
		contentPane.add(btnAddAdmin);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 228, 99, 23);
		contentPane.add(btnBack);
		
		JButton btnReportBug = new JButton("Report Bug");
		btnReportBug.setBounds(325, 194, 99, 23);
		contentPane.add(btnReportBug);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(325, 228, 99, 23);
		contentPane.add(btnHelp);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(137, 212, 46, 14);
		contentPane.add(lblDate);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(137, 232, 63, 14);
		contentPane.add(lblLocation);
	}

}
