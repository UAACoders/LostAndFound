package GUIBoxes;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(114, 81, 60, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(114, 118, 60, 14);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setBounds(15, 184, 23, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Location");
		lblNewLabel_1.setBounds(15, 210, 40, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(15, 235, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(327, 234, 103, 23);
		contentPane.add(btnHelp);
		
		JButton btnReportBug = new JButton("Report Bug");
		btnReportBug.setBounds(327, 205, 103, 23);
		contentPane.add(btnReportBug);
		
		textField = new JTextField();
		textField.setBounds(174, 75, 135, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setBounds(183, 16, 57, 14);
		contentPane.add(lblAdminLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(174, 184, 57, 23);
		contentPane.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 109, 135, 23);
		contentPane.add(passwordField);
	}

}
