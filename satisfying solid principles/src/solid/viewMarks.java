package solid;

public interface viewMarks {
	
	public void seeMarks(int marksInSubject1,int marksInSubject2,int marksInSubject3);

}

class FailedStudents implements viewMarks
{
	public void seeMarks(int  marksInSubject1,int marksInSubject2,int marksInSubject3)
	{
		System.out.println("The marks of the failed student in 3 subjects are "+ marksInSubject1+" "+marksInSubject2+" "+marksInSubject3);
	}
}
