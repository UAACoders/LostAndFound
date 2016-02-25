package GUIBoxes;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class NewItem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewItem frame = new NewItem();
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
	public NewItem() {
		setTitle("New Item");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxHighValue = new JCheckBox("High Value");
		chckbxHighValue.setBounds(327, 11, 97, 23);
		contentPane.add(chckbxHighValue);
		
		JCheckBox chckbxIdentifiable = new JCheckBox("Identifiable");
		chckbxIdentifiable.setBounds(327, 48, 97, 23);
		contentPane.add(chckbxIdentifiable);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 11, 97, 22);
		contentPane.add(comboBox);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(10, 14, 46, 14);
		contentPane.add(lblType);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(10, 52, 46, 14);
		contentPane.add(lblColor);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(66, 49, 97, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(10, 90, 57, 14);
		contentPane.add(lblDescription);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(327, 228, 97, 23);
		contentPane.add(btnHelp);
		
		JButton btnReportBug = new JButton("Report Bug");
		btnReportBug.setBounds(327, 194, 97, 23);
		contentPane.add(btnReportBug);
		
		JButton btnHelp_1 = new JButton("Help");
		btnHelp_1.setBounds(10, 228, 89, 23);
		contentPane.add(btnHelp_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(165, 214, 113, 37);
		contentPane.add(btnSubmit);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(95, 85, 171, 91);
		contentPane.add(textArea);
	}
}
