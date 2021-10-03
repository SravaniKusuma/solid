package zemoso;

public class Main {

	public static void main(String[] args) {
		
		
		StudentDetails s=new StudentDetails("Sravani",530,90,80,89);
		s.saveData();
		Payment p =new Payment(90000,"VISA");
		p.pay();
		results r = new  StudentsPassedInExam();
		r.viewMarks(90,78,89);
		r.calPercentage(90, 78, 89);
		results d = new  StudentsFailedInExam();
		d.viewMarks(90, 35, 26);
		PassedStudents passed = new PassedStudents();
		passed.payRegularFee();
		FailedStudents failed = new FailedStudents();
		failed.payRegularFee();
		failed.paySupplyFee();
		

	}

}
