package inheritance;


	class ABC
	{
	   public void methodA()
	   {
	      System.out.println("method of Class A");
	   }
	}
	class BCD extends ABC
	{
	   public void methodB()
	   {
	      System.out.println("method of Class B");
	   }
	}
	class CDE extends ABC
	{
	  public void methodC()
	  {
	     System.out.println("method of Class C");
	  }
	}
	class DEF extends ABC
	{
	  public void methodD()
	  {
	     System.out.println("method of Class D");
	  }
	}
public class Hw6 
{
	
	  public static void main(String args[])
	  {
	     BCD obj1 = new BCD();
	     CDE obj2 = new CDE();
	     DEF obj3 = new DEF();
	     
	     obj1.methodA();
	     obj2.methodA();
	     obj3.methodD();
	  }
	
}
