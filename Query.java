package GUIBoxes;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Query extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Query frame = new Query();
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
	public Query() {
		setTitle("Search Database");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReportBug = new JButton("Report Bug");
		btnReportBug.setBounds(319, 194, 105, 23);
		contentPane.add(btnReportBug);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Type...", "Clothing", "TextBook", "Book", "Phone", "Wallet", "ID", "Misc"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(206, 36, 71, 20);
		contentPane.add(comboBox);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(150, 39, 46, 14);
		contentPane.add(lblType);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(150, 83, 46, 14);
		contentPane.add(lblColor);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Color...", "Red", "Orange", "Yellow", "Green", "Blue", "Purple"}));
		comboBox_1.setBounds(206, 80, 71, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblKeywords = new JLabel("Keywords");
		lblKeywords.setBounds(11, 152, 62, 14);
		contentPane.add(lblKeywords);
		
		JTextArea txtrInsertCommasBetween = new JTextArea();
		txtrInsertCommasBetween.setText("Insert commas between words");
		txtrInsertCommasBetween.setWrapStyleWord(true);
		txtrInsertCommasBetween.setLineWrap(true);
		txtrInsertCommasBetween.setBounds(83, 147, 119, 52);
		contentPane.add(txtrInsertCommasBetween);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 228, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(319, 228, 105, 23);
		contentPane.add(btnHelp);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(188, 228, 89, 23);
		contentPane.add(btnSubmit);
	}

}
