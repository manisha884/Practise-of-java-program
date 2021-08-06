class Exception{
public static void main(String args[]){
public String getUserName(String userId)throws UserNotExistException
	{
	String userName= null;
	try{
		if(userId.equals("123"))
		{
			userName="Tom n Jerry";
		}
		else
		{
			throw new UserNotExistException();
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("Will call at last but sure");
	}
	return userName;
	}
  }
} 