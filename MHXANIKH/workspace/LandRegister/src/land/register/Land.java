package land.register;

public class Land {
	String size;
	String type;
	String owner;
	String boarders;
	String address;
	public Land(String s, String t, String o, String b, String a){
		size = s;
		type = t;
		owner = o;
		boarders = b;
		address = a;
	}
	public String getAddress(){
		return address;
	}
	
	public String getSize(){
		return size;
	}
	
	public String getType(){
		return type;
	}
	
	public String getOwner(){
		return owner;
	}
	
	public String getBoarders(){
		return boarders;
	}
}
