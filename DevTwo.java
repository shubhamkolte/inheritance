package inheritance;

public class DevTwo extends Devone 
{

	void multi()
	{
		System.out.println("Multiplication");
	}
	void Division()
	{
		System.out.println("Division");
	}
	DevTwo()
	{
		super(4); // its excute the parent class constuctor
		System.out.println(" it DevTwo constructor");
	}
}
