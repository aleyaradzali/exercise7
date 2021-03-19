package exercise7;
import java.util.Scanner;


public class Calculate {

	public static void main(String[] args) {
		
		double weight;
		KiraBerat berat = new KiraBerat();
		Scanner print = new Scanner(System.in);
		
		System.out.println("<< Difference between human weight on Earth and on Mars. >>");
		
		System.out.println("\nPlease enter your weight: (kg)"); 
		weight = print.nextDouble(); 
		berat.setBerat(weight); 
		
		weight = berat.getBerat();
		System.out.println("\n" + weight + "kg");
	}
	
	

}
