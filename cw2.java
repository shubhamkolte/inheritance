package inheritance;


public class cw2
{
	public static void main(String[] args) 
	{
		Rcord1 R=new Rcord1();
		R.getData(913, "Shubham");
		R.Dpartment1("Computer Sci");
		R.diaplay();
	}

}

class student
{
	int no;
	String name;
	void getData(int n,String name1)
	{
		no=n;
		name=name1;
	}
}
class Dpartment extends student
{
	String nameD;
	void Dpartment1(String n)
	{
		nameD=n;
	}
}
class Rcord1 extends Dpartment
{
	void diaplay()
	{
		System.out.println("Roll Number : "+no+"name : "+name+" DpartMent name : "+nameD);
	}
}


