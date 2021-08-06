/*2. Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). 
The marks are entered by the user and the roll numbers are automatically assigned.*/
class Marks
{

	int arr[];
	Marks(int rollno,int mark[])

		{	
			int total=0,average;
			for(int i=0;i<3;i++) 
			{
			total=mark[i]+total;

			}
			average=total/3;
			System.out.println("rollno:"+rollno+ "average:"+average);

		}



}
public class Mark1
 {
	public static void main(String[]args)
	{
	int arr[]={60,55,90};


	Marks m=new Marks(1,arr);
	int arr2[]={64,50,96};
	Marks m1=new Marks(2,arr2);
	Marks m2=new Marks(3,arr);
	Marks m3=new Marks(4,arr);
	Marks m4=new Marks(5,arr);
	Marks m5=new Marks(6,arr);
	Marks m7=new Marks(7,arr);
	Marks m6=new Marks(8,arr);

	}
}
