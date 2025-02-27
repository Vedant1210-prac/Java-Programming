package day_17;
//default variable and default methods we can not access out side of the package


import day_17.pack1.Test1;

/*public class AccessmodifierDemoOutsideOfPackage {
	
	public static void main(String [] a) {

		//Test1 T1 = new Test1();
		
		
		System.out.println(T1.x);
		
		T1.m1();
		
			
	}

}*/


public class AccessmodifierDemoOutsideOfPackage extends Test1 {
	
	public static void main(String [] a) {

				
		AccessmodifierDemoOutsideOfPackage T1 = new AccessmodifierDemoOutsideOfPackage();
		
       System.out.println(T1.x);
		
		T1.m1();
		
	}

}
