package solid;

public interface PassedCalculatePercentage {
	
	public void percentage(int marksInSubject1,int marksInSubject2,int marksInSubject3);
}

class PassedStudents implements viewMarks,PassedCalculatePercentage
{
	public void seeMarks(int marksInSubject1,int marksInSubject2,int marksInSubject3)
	{
		System.out.println("The marks of the passed student in 3 subjects  are "+marksInSubject1+" "+marksInSubject2+" "+marksInSubject3);
	}
	public void percentage(int marksInSubject1,int marksInSubject2,int marksInSubject3)
	{
		int total;
		total=marksInSubject1+marksInSubject2+marksInSubject3;
		float perc=total/3;
		System.out.println("The percenatge of the  passed student is "+perc);
	}
}