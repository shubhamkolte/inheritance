package inheritance;

public class Cw4MethodOvrriding {
	

		public static void main(String[] args) 
		{
			TestingInheritance1 demo1=new TestingInheritance1();
			demo1.display1();
			demo1.display2();
		
		}

	}
	class Test2
	{
		void display1()
		{
			System.out.println( "GOODMORNING");
		}
		public void display2()
		{
			System.out.println("GOOD AFTERNOON");
		}
	}
	class  TestingInheritance1 extends Test
	{
		 void display1()
		 {
			 System.out.println("GOODEVENING");
		 }

	}
