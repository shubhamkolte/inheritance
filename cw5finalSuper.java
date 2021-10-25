package inheritance;

class finaldemo
{
	
	int num3=10;
	int num1,num2;
	finaldemo(int num1,int num2) 
	{
		this.num1=num1;
		this.num2=num2;
		
		num3=this.num1+this.num2;
		System.out.println(num3);
	}
}
 class superKey extends finaldemo
{
	public superKey(int a,int b) 
	{
		super(a,b);
		
	}
}

public class cw5finalSuper {

	public static void main(String[] args) {
		superKey key=new superKey(10,20);
		
	}

}
