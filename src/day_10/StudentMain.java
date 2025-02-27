package day_10;

public class StudentMain {

	public static void main(String[] args) {
		
		/*//Creating object with referance variable
		
		Student ST = new Student();
		ST.RollNo =20;
		ST.Name = "John";
		ST.grade ='A';
		
		ST.printtheStudentData();*/
		
		//Creating Object without referance variable
		
		new Student();
		new Student().RollNo = 24;
		new Student().grade = 'A';
		new Student().Name = "ABCD";
		
		new Student().printtheStudentData();
		
	}

}
