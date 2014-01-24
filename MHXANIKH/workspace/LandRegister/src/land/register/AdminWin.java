package land.register;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AdminWin extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AdminWin() {
		setTitle("Administrator's Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHelloAdministrator = new JLabel("Hello administrator!");
		lblHelloAdministrator.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloAdministrator.setBounds(12, 13, 408, 56);
		contentPane.add(lblHelloAdministrator);
	}
}
