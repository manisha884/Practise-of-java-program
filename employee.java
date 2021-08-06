/*Write a program to print the name, salary and date of joining of 10 employees in a company. Use array of objects.*/
class employee
{

 	employee(String name,int arr[])
	{
	for(int i=0;i<2;i++)
	{
	System.out.println("salary:"+"date:"+arr[i]);

	}
	System.out.println("name: "+name);
    }
}
public class employee1
{
	public static void main(String []args)
	{
	int arr[]={200,5};
	employee n=new employee("lily",arr);
	int arr1[]={200,5};
	employee n1=new employee("tom",arr1);
	int arr2[]={700,8};
	employee n2=new employee("poonam",arr2);
	int arr3[]={600,7};
	employee n3=new employee("arjun",arr3);
	int arr4[]={600,5};
	employee n4=new employee("karan",arr4);
	int arr5[]={270,20};
	employee m=new employee("jerry",arr5);
	int arr6[]={550,4};
	employee s=new employee("singh",arr6);
	int arr7[]={239,25};
	employee h=new employee("palak",arr7);
	int arr8[]={865,5};
	employee o=new employee("john",arr8);
	int arr9[]={200,10};
	employee p=new employee("sunny",arr9);
	}
} 