package zemoso;

public interface results 
{
	public void viewMarks(int marksInSubject1,int marksInSubject2,int marksInSubject3);
	public void calPercentage(int marksInSubject1,int marksInSubject2,int marksInSubject3);

}
class StudentsPassedInExam implements results
{
	public void viewMarks(int marksInSubject1,int marksInSubject2,int marksInSubject3)
	{
		System.out.println("The marks of the passed student are"+marksInSubject1+" "+marksInSubject2+" "+marksInSubject3);
	}
	public void calPercentage(int marksInSubject1,int marksInSubject2,int marksInSubject3)
	{
		int total;
		total=marksInSubject1+marksInSubject2+marksInSubject3;
		float perc=total/3;
		System.out.println("The percenatge of the  passed student is "+perc);
		
	}
}
class StudentsFailedInExam implements results
{
	public void viewMarks(int marksInSubject1,int marksInSubject2,int marksInSubject3)
	{
		System.out.println("The marks of the failed student are"+marksInSubject1+" "+marksInSubject2+" "+marksInSubject3);
	}
	
	//Forced to be implemented as the students are failed
	
	public void calPercentage(int marksInSubject1,int marksInSubject2,int marksInSubject3)
	{
		int total;
		total=marksInSubject1+marksInSubject2+marksInSubject3;
		float perc=total/3;
		System.out.println("The percenatge of the student is "+perc);
		
	}
}


