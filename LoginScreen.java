package GUIBoxes;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class LoginScreen {

	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen window = new LoginScreen();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(114, 84, 73, 14);
		frmLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(114, 135, 73, 14);
		frmLogin.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(197, 84, 86, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(197, 135, 86, 20);
		frmLogin.getContentPane().add(passwordField);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(10, 212, 46, 14);
		frmLogin.getContentPane().add(lblDate);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(10, 237, 57, 14);
		frmLogin.getContentPane().add(lblLocation);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(194, 185, 89, 23);
		frmLogin.getContentPane().add(btnSubmit);
		
		JButton btnH = new JButton("Help");
		btnH.setBounds(319, 228, 105, 23);
		frmLogin.getContentPane().add(btnH);
		
		JButton btnReportBug = new JButton("Report Bug");
		btnReportBug.setBounds(319, 185, 105, 23);
		frmLogin.getContentPane().add(btnReportBug);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBounds(10, 11, 110, 23);
		frmLogin.getContentPane().add(btnAdminLogin);
	}
}
