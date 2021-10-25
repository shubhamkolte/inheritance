package inheritance;

class Department
{
	String departmentName ;
	String HOD_name;
	public Department(String Dname ,String HOD_name1)
	{
		departmentName=Dname;
		HOD_name=HOD_name1;
	}
	void showDepartmentDetails()
	{
		System.out.println("Department Name : "+departmentName+"    Hod_name"+HOD_name);
	}
}
class StaffMember extends Department
{
	String MemberName ;
	String MemberQualification;
	void showstaffMemberDetails()
	{
		System.out.println("Mmber Name : "+MemberName   +"    Member oulification : "+MemberQualification);
	}
	public StaffMember(	String MemberName ,	String MemberQualification)
	{
		super("Computer","Patil");
		this.MemberName=MemberName;
		this.MemberQualification=MemberQualification;
	}
}
public class hw5 {

	public static void main(String[] args) 
	{
		StaffMember s=new StaffMember("Mohan","M.SC");
		s.showstaffMemberDetails();
		s.showDepartmentDetails();

	}

}
