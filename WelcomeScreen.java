package GUIBoxes;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class WelcomeScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen frame = new WelcomeScreen();
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
	public WelcomeScreen() {
		setTitle("Welcome #User");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(32, 41, 107, 64);
		contentPane.add(btnNewButton);
		
		JButton btnLogItem = new JButton("Log Item");
		btnLogItem.setBounds(162, 41, 107, 64);
		contentPane.add(btnLogItem);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(297, 41, 107, 64);
		contentPane.add(btnLogout);
		
		JButton btnMyTickets = new JButton("My Tickets");
		btnMyTickets.setBounds(32, 135, 107, 64);
		contentPane.add(btnMyTickets);
		
		JLabel lblManage = new JLabel("Manage");
		lblManage.setBounds(193, 146, 46, 14);
		
		JLabel lblAccount = new JLabel("Account");
		lblAccount.setBounds(193, 171, 76, 14);
		
		JButton btnManageAccount = new JButton("");
		btnManageAccount.setLayout(new BorderLayout());
		btnManageAccount.setBounds(162, 135, 107, 64);
		contentPane.add(btnManageAccount);
		btnManageAccount.add(BorderLayout.NORTH,lblManage);
		btnManageAccount.add(BorderLayout.SOUTH,lblAccount);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(311, 228, 113, 23);
		contentPane.add(btnHelp);
		
		JButton btnReportBug = new JButton("Report Bug");
		btnReportBug.setBounds(311, 194, 113, 23);
		contentPane.add(btnReportBug);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(10, 220, 46, 14);
		contentPane.add(lblDate);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(10, 237, 64, 14);
		contentPane.add(lblLocation);
	}

}
