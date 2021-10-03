package zemoso;

public class ExamFee
{
	int regularmoney = 750;
	int supplymoney=1000;
	void payRegularFee()
	{
		System.out.println("All the students have to pay Regualr Fee");
	}
	void paySupplyFee()
	{
		System.out.println("Failed students have to pay supply fee");
		
	}
}
class PassedStudents extends ExamFee
{
	
	void payRegularFee()
	{
		System.out.println("Passed Students have to pay regular Fee "+regularmoney);
	}
	void paySupplyFee()
	{
		
		throw new Error("Passed students can't pay supply fee");
		
	}
	
}
class FailedStudents extends ExamFee
{
	
	void payRegularFee()
	{
		System.out.println("Failed Students have to pay regular fee "+regularmoney);
	}
	void paySupplyFee()
	{
		
		System.out.println(" Failed have to pay supply  Fee of "+supplymoney+" in addition to regualr fee");
		
	}
	
}



