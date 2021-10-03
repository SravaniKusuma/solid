package zemoso;

public class StudentDetails{
	String name;
	int rollno;
	float percentage;
	int marksInSubject1,marksInSubject2,marksInSubject3;
	JNTUCollege college;
	StudentDetails(String name,int rollno,int marksInSubject1,int marksInSubject2,int marksInSubject3)
	{
		this.name=name;
		this.rollno=rollno;
		this.marksInSubject1=marksInSubject1;
		this.marksInSubject2=marksInSubject2;
		this.marksInSubject3=marksInSubject3;
		this.college= new JNTUCollege();
		college.getadmission();
	}
	void calculatePercentage()
	{
		int marks=marksInSubject1+marksInSubject2+marksInSubject3;
		percentage=marks/3;
		
	}
	void saveData()
	{
		System.out.println("Name of the student is "+name);
		System.out.println("Roll Number  of the student is "+rollno);
	}
	

}

//Dependency Inversion

class JNTUCollege
{
	void getadmission()
	{
		System.out.println("Student has got admission in the college");
	}
}