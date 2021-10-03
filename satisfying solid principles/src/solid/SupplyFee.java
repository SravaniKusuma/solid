package solid;

public class SupplyFee extends ExamFee {
		
		int supplymoney=1000;
		
		void paySupplyFee()
		{
			System.out.println("Failed students have to pay supply fee");
			
		}

}

class FailedStudentsInExam extends SupplyFee
{
	
	void payRegularFee()
	{
		
		System.out.println(" Failed have to pay regular fee of "+regularmoney);
		
	}
	void paySupplyFee()
	{
		System.out.println("Failed students have to pay supply fee of "+supplymoney);
		
	}

	
	
}

