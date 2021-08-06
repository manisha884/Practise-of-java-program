import java.util.*;
 class TestJavaCollection2{
	public static void main(String args[]){
	LinkedList <String> al=new LinkedList<String>();
		al.add("Tom");
		al.add("Jerry");
		al.add("Patlu");
		al.add("Tom");

		Iterator<String>itr=al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}

	}

}