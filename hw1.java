package inheritance;

class Worker
{
	
	String  Sname;
	int  Sage ;
	int Sphone;
	String Saddress;
	int salary;
	public Worker(String sname, int sage, int sphone, String saddress, int salary) {
		super();
		Sname = sname;
		Sage = sage;
		Sphone = sphone;
		Saddress = saddress;
		this.salary = salary;
	}
	void displaySalary()
	{
		System.out.println(salary);
	}


}
class Empoyee extends Worker
{

	public Empoyee(String sname, int sage, int sphone, String saddress, int salary) {
		super(sname, sage, sphone, saddress, salary);
		
	}
	
}
class Maneger extends Worker
{

	public Maneger(String sname, int sage, int sphone, String saddress, int salary) {
		super(sname, sage, sphone, saddress, salary);
		
	}

}
public class hw1 {

	public static void main(String[] args)
	{
		Empoyee emo =new Empoyee("shubham ", 23,6753765,"malkapur",50000);
		emo.displaySalary();
	}

}
