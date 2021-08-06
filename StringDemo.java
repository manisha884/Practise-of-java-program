class StringDemo{

public void MonetorString(String s){

	String temp= s;
	System.out.println("Original String: "+temp);
	System.out.println("Length of String: "+temp.length());

	if(temp != null){
		System.out.println("String Content: "+temp);

	}
	if(temp.equals(s)){
			System.out.println("String Content: "+temp);
	}
	}
	public static void main(String args[]){
	StringDemo sd = new StringDemo();
	sd.MonetorString("Techrel ");

	}
}