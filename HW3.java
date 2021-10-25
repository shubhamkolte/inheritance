package inheritance;

class square
{
	int side;
	void Area()
	{
		System.out.println("Square area"+(side*side));
	}
	square(int num1)
	{
		side=num1;
	}
}
class Rectangle extends square
{
	int len,breadth;
	 Rectangle(int length,int breadth)
	 {
		 super(10);
		len=length;
		this.breadth=breadth;
	 }
	 void Area()
	 {
		 System.out.println("Area "+len*breadth);
	 }
}
class Triangle extends Rectangle
{
	int side1;
	int side2;
	int side3;
	public Triangle(int side1,int side2,int side3)
	{
		super(10,29);
		this.side1=side1;
		this. side2=side2;
		this. side3=side3;
	}
	void Area()
	{
		double D=side1+side2+side3/2;
		double a=Math.sqrt(D*(D-side1)*(D-side2)*(D-side3));
		System.out.println("Trinagle area : "+D);
	}
}

public class HW3 
{
		public static void main(String[] args)
	{
			Triangle t=new Triangle(3, 4, 5);
			t.Area();
			Rectangle r=new Rectangle(29,39);
			r.Area();
			 square s=new  square(5);
			 s.Area();
	}

}
