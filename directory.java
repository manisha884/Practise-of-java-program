/*5. Write a program to create a directory that contains the following information.
(a) Name of a person
(b) Address
(c) Telephone Number (if available with STD code)
(d) Mobile Number (if available)
(e) Head of the family*/

class directory
{

	directory(String arrname[],String arradd[],int arrtell[],int arrMobile[],String arrhead[])
	{


	System.out.println("name:   "+"address:    "+"telephone:   "+"mobile:    "+"head of family   ");
	for(int i=0;i<3;i++)
	{
	System.out.println(arrname[i]+" "+arradd[i]+"    "+arrtell[i]+" "+arrMobile[i]+"    "+arrhead[i]);
	}
   }
}
public class direct
{
	public static void main(String[]args)
	{

	String arrname[]={"Tom","sunny","jerry"};
	String arradd[]={" pune"," thane","karad"};
	int arrtell[]={  273787, 12345, 45678};
	int arrMobile[]={823426, 918871,78675};
	String arrhead[]={"father of Tom","mother of sunny","Grandfather of jerry"};
	directory d1=new directory(arrname,arradd,arrtell,arrMobile,arrhead);

	}	
} 