package solid;

public class ExamFee {
	
	int regularmoney = 750;
	void payRegularFee()
	{
		System.out.println("All the students have to pay Regualr Fee");
	}

}


class PassedStudentsInExam extends ExamFee
{
	
	void payRegularFee()
	{
		System.out.println("Passed Students have to pay regular Fee "+regularmoney);
	}
	
	
}
