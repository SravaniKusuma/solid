package solid;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetails s =  new StudentDetails("Sravani",530,new AutonomousCollege());
		s.printDetails();
		Payment p =new Payment();
		p.payMoney(new payWithVisa());
		viewMarks v =new FailedStudents();
		v.seeMarks(35, 24, 89);;
		PassedStudents a = new PassedStudents();
		a.seeMarks(89, 98, 78);
		a.percentage(89,78,98);
		PassedStudentsInExam passed = new PassedStudentsInExam();
		passed.payRegularFee();
		FailedStudentsInExam failed = new FailedStudentsInExam();
		failed.payRegularFee();
		failed.paySupplyFee();
		
		
		

	}

}
