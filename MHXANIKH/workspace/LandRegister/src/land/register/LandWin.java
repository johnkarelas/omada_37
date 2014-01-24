package land.register;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class LandWin extends JFrame {

	private JPanel contentPane;
	WinProc winp = new WinProc();
	JLabel landLabel = new JLabel();
	
	/**
	 * Create the frame.
	 */
	public LandWin(ArrayList<Land> lands, String owner) {
		setTitle("Land Window");
		
		int lstSize = lands.size();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLandsFor = new JLabel("Land addresses for "+owner);
		lblLandsFor.setBounds(12, 13, 408, 30);
		contentPane.add(lblLandsFor);
		
		for (int i=0; i<lstSize; i++) {
			landLabel = winp.addLand(lands.get(i).getAddress(), i);
			contentPane.add(landLabel);
		};
	}

}
