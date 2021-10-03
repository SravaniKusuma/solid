package solid;

public class StudentDetails{
	String name;
	int rollno;
	float percentage;
	College college;
	StudentDetails(String name,int rollno,College college)
	{
		this.name=name;
		this.rollno=rollno;
		this.college=college;
		college.getAdmission();
	}
	void printDetails()
	{
		System.out.println("Name of the student is "+name);
		System.out.println("Roll Number  of the student is "+rollno);
	}
	

}

// dependency inversion

interface College
{
	public void getAdmission();
}
class AutonomousCollege implements College
{
	public void getAdmission()
	{
		System.out.println("The student has got admitted in Autonomous College");
	}
}
class JntuhAffiliated implements College
{
	public void getAdmission()
	{
		System.out.println("The student got admission in JNTUH Affiliated college");
	}
}