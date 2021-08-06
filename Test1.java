public class Test1{
	public static void main(String args[]){
	String str="Java";
	StringBuffer sbr= new StringBuffer(str);
	sbr.reverse();
	System.out.println(sbr);

	//conversion from String object to StringBuilder

	StringBuilder sbl=new StringBuilder(str);
	sbl.append("Values");
	System.out.println(sbl);
	}
} 
 14  TestHateString.java 
@@ -0,0 +1,14 @@
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