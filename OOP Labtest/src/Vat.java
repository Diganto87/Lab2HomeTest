import java.util.Scanner;


public class Vat {
	static Scanner T = new Scanner(System.in);
	public static void main(String[] args) {
		double item;
		double tax ;
		
		double Tax = 0.15 ;
		
		System.out.println("Enter item price:  ");
		item = T.nextDouble();
		tax = item*Tax;
		
		System.out.println("the tax item is: " +tax );
	

	}

}
