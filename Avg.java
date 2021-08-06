/*3. Write a program to calculate the average height of all the students of a class. 
The number of students and their heights are entered by the user.*/

import java.util.Scanner;
class Avg{
	public static void main(String[]args)
	{
	 float total=0,avg;

	Scanner s1=new Scanner(System.in);
	System.out.println("enter number of student");
	int n=s1.nextInt();
	System.out.print("enter height of student");
	for(int i=0;i<n;i++)
	{
	System.out.println("Student"+ (i+1) +":");
	float height=s1.nextFloat();
	total=height+total;

	}
	avg=total/n;
	System.out.println("average height of all students:"+avg);
 }
}	