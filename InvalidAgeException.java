class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
	super(s);
	}
}
 class TestCustomException1{
	static void validate(int age)throws InvalidAgeException{
	if(age<18)
	throw new InvalidAgeException("Not Valid");
	else
	System.out.println("Welcome to Vote");
	}

	public static void main(String args[]){
	try{
	validate(19);
	}catch(Exception m)
	{
		System.out.println("Exception occured"+m);
	}
	System.out.println("Rest of the code....");

	}
 } 