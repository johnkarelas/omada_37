package land.register;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginWin extends JFrame {

	private JPanel contentPane;
	Conn2DB conne = new Conn2DB();
	
	/**
	 * Create the frame.
	 */
	public LoginWin() {
		setTitle("Log In Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(12, 13, 190, 38);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(12, 64, 190, 38);
		contentPane.add(lblPassword);
		
		final JTextField usrnmTxt = new JTextField();
		usrnmTxt.setBounds(214, 13, 190, 38);
		contentPane.add(usrnmTxt);
		usrnmTxt.setColumns(10);
		
		final JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(214, 64, 190, 38);
		contentPane.add(passwordField);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton loginbtn = (JButton)e.getSource();
				LoginWin login = (LoginWin)SwingUtilities.getRoot(loginbtn);
				login.dispose();
				conne.login((String)usrnmTxt.getText(), String.valueOf(passwordField.getPassword()));
			}
		});
		btnLogIn.setBounds(163, 132, 97, 25);
		contentPane.add(btnLogIn);
	}
}
