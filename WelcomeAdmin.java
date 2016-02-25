package GUIBoxes;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class WelcomeAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeAdmin frame = new WelcomeAdmin();
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
	public WelcomeAdmin() {
		setTitle("Welcome #location Admin!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDat = new JLabel("Database");
		lblDat.setBounds(66, 67, 46, 14);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(66, 43, 46, 14);
		
		JButton btnNewButton_1 = new JButton("Log Item");
		btnNewButton_1.setBounds(158, 33, 121, 61);
		contentPane.add(btnNewButton_1);
		
		JLabel lblManage = new JLabel("Manage");
		lblManage.setBounds(327, 43, 46, 14);
		
		JLabel lblUsers = new JLabel("Users");
		lblUsers.setBounds(327, 67, 46, 14);
		
		JButton btnManageUsers = new JButton("");
		btnManageUsers.setLayout(new BorderLayout());
		btnManageUsers.setBounds(289, 33, 121, 61);
		btnManageUsers.add(BorderLayout.NORTH,lblManage);
		btnManageUsers.add(BorderLayout.SOUTH,lblUsers);
		contentPane.add(btnManageUsers);
		
		JLabel lblAccount = new JLabel("Account");
		lblAccount.setBounds(194, 160, 46, 14);
		
		JLabel lblManageA = new JLabel("Manage");
		lblManageA.setBounds(194, 136, 46, 14);
		
		JButton btnManageAccount = new JButton("");
		btnManageAccount.setLayout(new BorderLayout());
		btnManageAccount.setBounds(158, 124, 121, 61);
		btnManageAccount.add(BorderLayout.NORTH,lblManageA);
		btnManageAccount.add(BorderLayout.SOUTH,lblAccount);
		contentPane.add(btnManageAccount);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 228, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(327, 228, 97, 23);
		contentPane.add(btnHelp);
		
		JButton btnReportBug = new JButton("Report Bug");
		btnReportBug.setBounds(327, 194, 97, 23);
		contentPane.add(btnReportBug);
		
		JButton btnQuery = new JButton("");
		btnQuery.setLayout(new BorderLayout());
		btnQuery.setBounds(27, 33, 121, 61);
		btnQuery.add(BorderLayout.NORTH,lblDat);
		btnQuery.add(BorderLayout.SOUTH,lblSearch);
		contentPane.add(btnQuery);
	}
}
