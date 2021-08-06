import java.util.*;
 class TestJavaCollection3{
	public static void main(String args[]){
	Stack <String> st=new Stack<String>();
		st.push("Tom");
		st.push("Jerry");
		st.push("Patlu");
		st.push("Tom");

		//st.pop();
		Iterator<String>itr=st.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}

	}

} 