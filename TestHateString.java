class TestHateString { 
	public static void main(String args[]){
	String input="invalid inpiut";
	try{
	if(input.equals("invalid input")){
	throw new HateStringExp();
	}
		System.out.println("Accept String.");
	}catch(HateStringExp e)
	{
		System.out.println("Hate String");
	}
	}
} 