package day_11;

public class student {
	
	int sid;
	String sname;
	char grade;
	
	
	void printStuData() {
		
		System.out.println(sid + "  " +sname+ "  " +grade);
	}
	
	
	void SETStuData(int id, String name, char g) {
		
		sid = id;
		sname = name;
		grade = g;
	}
	
	student(int id, String name, char g){

		sid = id;
		sname = name;
		grade = g;
	}

}
