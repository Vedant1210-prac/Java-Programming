package day_12;

public class Box {
	
	double width , height, length;
	
	Box(){
		
		width = height = length = 0;
	}

	Box (double w, double h, double l){
		
		width = w;
		height = h;
		length =l;
		
	}
	
	Box(double len){
		
		width = height = length = len;
	}
	
	
	double volume(){
		
		return(width*height*length);
	}
}
