package day_11;

public class studentMain {

	public static void main(String [] args) {
		
		
		//Approach 1 assigning the data by using object reference
		
		/*student s = new student();
		 s.sid= 100;
		 s.sname = "CAP";
		 s.grade = 'A';
		*/ 
		 //s.printStuData();
		 
		 //Approach 2 assigning the data by using user defined method
		 
		/* s.SETStuData(101, "John", 'B');
		 
		 s.printStuData();*/
		
		student stu = new student(102, "John", 'A');
		
		stu.printStuData();
	}
}
