package day_19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		System.out.println("Program started");
		
		/*try {
		FileInputStream file = new FileInputStream("C:\\Users\\VEBHURE\\OneDrive - Capgemini\\Desktop");
		System.out.println(file.read());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}*/
		
		FileInputStream file = new FileInputStream("C:\\Users\\VEBHURE\\OneDrive - Capgemini\\Desktop");
		System.out.println(file.read());
	}

}
