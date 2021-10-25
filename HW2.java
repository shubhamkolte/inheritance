package inheritance;


class Vehicle
{
	String vname1;
	int mno1;
	int vprice1;
	String StationName1;
	public Vehicle(String vname,	int mno ,	int vprice,	String StationName) 
	{
		vname1=vname;
		mno1=mno;
		vprice1=vprice;
		StationName1=StationName;
	}
	 void Display()
	{
		System.out.println(vname1+ " ----"+ mno1 +"____"+vname1+" ______"+StationName1);
	}
}
class Bike extends Vehicle
{
	int discountRate;
	String bname;
	int bick_price;
	void Display()
	{
		System.out.println(" Name : "+bname+ " Model_no " + mno1+" Bick Price : "+bick_price+"Service station name"+StationName1+" discount rate"+discountRate);
	}
	Bike(int discount,String name,int bprice)
	{
		super("palyatina",123,50000,"pune");
		discountRate=discount;
		bname=name;
		bick_price=bprice;
	}
	void Discount()
	{
		discountRate=bick_price-discountRate;
		
		System.out.println("Discount rate : "+discountRate);
	}
}



public class HW2 {

	public static void main(String[] args)
	{
		Bike b=new Bike(500,"honda",40000);
		b.Display();
		b.Discount();
		

	}

}
