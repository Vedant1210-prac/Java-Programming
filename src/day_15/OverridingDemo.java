package day_15;

class Bank{
	
	double ROI(){
		return 0.0;
	}
}

class AXIS extends Bank{
	
	double ROI(){
		return 10.5;
	}
}

class SBI extends Bank{
	
	double ROI(){
		return 11.5;
	}
}
public class OverridingDemo {
	
	

	public static void main(String[] args) {


		AXIS ax = new AXIS();
		System.out.println(ax.ROI());

	}

}
