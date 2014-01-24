package land.register;

import javax.swing.JLabel;

public class WinProc {
	public void crUserWin(){
		UserWin userWin = new UserWin();
		userWin.setVisible(true);
	}
	
	public void crAdminWin(){
		AdminWin adminWin = new AdminWin();
		adminWin.setVisible(true);
	}
	
	public JLabel addLand(String review, int k){
		JLabel reviewLabel = new JLabel(review);
		reviewLabel.setBounds(12, (k*50+56), 420, 30);
		return reviewLabel;
	};

}
