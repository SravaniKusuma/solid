package solid;

public class StudentPercentage {

	int marksInSubject1,marksInSubject2,marksInSubject3;
	float percentage;
	StudentPercentage(int marksInSubject1, int marksInSubject2, int marksInSubject3)
	{
		this.marksInSubject1=marksInSubject1;
		this.marksInSubject2=marksInSubject2;
		this.marksInSubject3=marksInSubject3;
	}

	void calculatePercentage()
	{
		int marks=marksInSubject1+marksInSubject2+marksInSubject3;
		percentage=marks/3;
		System.out.println("The percenatge of the student is "+percentage);
	}
}
