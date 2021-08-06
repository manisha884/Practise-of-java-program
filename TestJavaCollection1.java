import java.util.*;
class TestJavaCollection1{
	public static void main(String args[]){
	ArrayList<String> list=new ArrayList<String>();

	list.add("Tom");
	list.add("Jerry");
	list.add("Motu");
	list.add("Patlu");

	Iterator itr=list.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
		}
	}
}