package inheritance;

public class TestingDemocw3 {

	public static void main(String[] args) 
	{
		TestingInheritance demo1=new TestingInheritance();
		demo1.display1();
		demo1.display2();
		demo1.display3();
	}

}
class Test
{
	void display1()
	{
		System.out.println( "GOODMORNING");
	}
	void display2()
	{
		System.out.println("GOOD AFTERNOON");
	}
}
class  TestingInheritance extends Test
{
	 void display3()
	 {
		 System.out.println("GOODEVENING");
	 }
}