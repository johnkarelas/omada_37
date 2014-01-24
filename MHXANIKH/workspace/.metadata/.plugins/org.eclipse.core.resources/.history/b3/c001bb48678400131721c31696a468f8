package land.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Conn2DB {
	private String dbhost = "jdbc:mysql://localhost:3306/landreg";
	private String dbuser = "root";
	private String dbpass = "5123";
	WinProc winp = new WinProc();
	
	public void login(String usr, String pss){
		String user = usr;
		String pass = pss;
		boolean passed = false;
		String admin = "no";
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(dbhost, dbuser, dbpass); 
			Statement stm = conn.createStatement(); 
			String query = "select * from users where username='"+user+"'";
			ResultSet result = stm.executeQuery(query); 
			while(result.next()){
				String corpass = result.getString("password");
				if (pass.equals(corpass)){
					passed = true;
					if (result.getString("administrator")=="yes"){
						admin = "yes";
					}
				}
			}
			if (passed){
					if (admin=="yes"){
						winp.crAdminWin();
					}else{
						winp.crUserWin();
					}
			}else{
				System.out.println("Wrong username/password");
			}
			if(result!=null) result.close();
			if(stm!=null) stm.close();
			if(conn!=null) conn.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	};
	
	public ArrayList<Land> srchByOwner(String owner){
		ArrayList<Land> lands = new ArrayList<Land>();
		String type;
		String size;
		String boarders;
		String address;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(dbhost, dbuser, dbpass); 
			Statement stm = conn.createStatement(); 
			String query = "select * from lands where owner='"+owner+"'";
			ResultSet result = stm.executeQuery(query); 
			while(result.next()){
				type = result.getString("type");
				size = result.getString("size");
				boarders = result.getString("boarders");
				address = result.getString("address");
				Land land = new Land(size, type, owner, boarders, address); 
				lands.add(land);
			}
			if(result!=null) result.close();
			if(stm!=null) stm.close();
			if(conn!=null) conn.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return lands;
	};
	
	public boolean submitLand(Land land){
		boolean ok = false;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(dbhost, dbuser, dbpass); 
			Statement stm = conn.createStatement(); 
			String query = "insert into lands (size, owner, boarders, type, address) values ('"+land.getSize()+"', '"+land.getOwner()+"', '"+land.getBoarders()+"', '"+land.getType()+"', '"+land.getAddress()+"')";
			stm.executeUpdate(query);
			ok = true;
			if(stm!=null) stm.close();
			if(conn!=null) conn.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return ok;
	}
	
}
