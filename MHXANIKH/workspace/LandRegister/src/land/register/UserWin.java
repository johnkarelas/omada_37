package land.register;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class UserWin extends JFrame {

	private JPanel contentPane;
	Conn2DB conne = new Conn2DB();
	LandWin landWin;

	/**
	 * Create the frame.
	 */
	public UserWin() {
		setTitle("User's Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Owner's name:");
		lblNewLabel.setBounds(12, 13, 100, 25);
		contentPane.add(lblNewLabel);
		
		final JTextField nameField = new JTextField();
		nameField.setBounds(124, 13, 370, 25);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String owner = (String)nameField.getText();
				ArrayList<Land> lands = conne.srchByOwner(owner);
				landWin = new LandWin (lands, owner);
				landWin.setVisible(true);
			}
		});
		btnSearch.setBounds(506, 13, 97, 25);
		contentPane.add(btnSearch);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 51, 612, 2);
		contentPane.add(separator);
		
		JLabel lblNewEntry = new JLabel("New entry");
		lblNewEntry.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewEntry.setBounds(12, 66, 612, 25);
		contentPane.add(lblNewEntry);
		
		JLabel lblOwner = new JLabel("Owner:");
		lblOwner.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOwner.setBounds(12, 104, 100, 25);
		contentPane.add(lblOwner);
		
		final JTextField ownerTxt = new JTextField();
		ownerTxt.setBounds(124, 105, 479, 22);
		contentPane.add(ownerTxt);
		ownerTxt.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setBounds(12, 142, 100, 25);
		contentPane.add(lblAddress);
		
		final JTextField addressTxt = new JTextField();
		addressTxt.setColumns(10);
		addressTxt.setBounds(124, 143, 479, 22);
		contentPane.add(addressTxt);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSize.setBounds(12, 180, 100, 25);
		contentPane.add(lblSize);
		
		final JTextField sizeTxt = new JTextField();
		sizeTxt.setColumns(10);
		sizeTxt.setBounds(124, 181, 479, 22);
		contentPane.add(sizeTxt);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setHorizontalAlignment(SwingConstants.RIGHT);
		lblType.setBounds(12, 218, 100, 25);
		contentPane.add(lblType);
		
		final JTextField typeTxt = new JTextField();
		typeTxt.setColumns(10);
		typeTxt.setBounds(124, 219, 479, 22);
		contentPane.add(typeTxt);
		
		JLabel lblBoarders = new JLabel("Boarders:");
		lblBoarders.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBoarders.setBounds(12, 256, 100, 25);
		contentPane.add(lblBoarders);
		
		final JTextField boardersTxt = new JTextField();
		boardersTxt.setColumns(10);
		boardersTxt.setBounds(124, 257, 479, 22);
		contentPane.add(boardersTxt);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String owner = (String)ownerTxt.getText();
				String size = (String)sizeTxt.getText();
				String type = (String)typeTxt.getText();
				String address = (String)addressTxt.getText();
				String boarders = (String)boardersTxt.getText();
				Land newLand = new Land(size, type, owner, boarders, address);
				if(conne.submitLand(newLand)) System.out.println("Submitted!");
			}
		});
		btnSubmit.setBounds(274, 318, 97, 25);
		contentPane.add(btnSubmit);
	}
}
