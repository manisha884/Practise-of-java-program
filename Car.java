enum Car{
	lamborgini(900),tata(40),audi(80),honda(60);   //enum datatype
	private int price;
	Car(int p){
	price=p;
	}

	int getPrice(){
	return price;
	}
}
public class Main{
	public static void main(String args[]){
	System.out.println("All Car Prices: ");
	for(Car c:Car.values())
	System.out.println(c +" costs  " + c.getPrice() + " Thousand Dollars ");
	}

} 