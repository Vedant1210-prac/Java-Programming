package day_13;

public class ThisKeyword {
	
	int x,y;     //class variable or instance variable we can use in any where with in a class
	
	void setData(int a, int b) { // a, b are local variables we can use in particular method only
		
		x=a;
		y=b;
		
	}
	
	void setData1(int x, int y) {     // we can not use x=x it will not recognize in main class and print the 0 value, So for this we are using this keyword
		
	/*class variable*/	this.x=x /*local variable*/;
		this.y=y;
	}
	
	ThisKeyword(int x, int y){
		this.x = x;
		this.y = y;
	}

	void printData() {
		
		System.out.println(x+ "   " +y);
	}
	
void printData2() {
		
		System.out.println(x+ "   " +y);
	}
	public static void main(String[] args) {


		ThisKeyword th = new ThisKeyword(60, 10);
		
		/*th.setData(10, 20);
		
		th.printData();
		
		th.setData1(30, 40);*/
		
		th.printData2();

	}

}
