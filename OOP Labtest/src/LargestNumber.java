import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input 1st number");
		int num1 = in.nextInt();
		
		System.out.println("Input 2nt number");
		int num2 = in.nextInt();
		
		System.out.println("Input 3rd number");
		int num3  = in.nextInt();
		
		
		if( num1 >= num2 && num1 >= num3)
	          System.out.println(num1+" is the largest Number");

	      else if (num2 >= num1 && num2 >= num3)
	          System.out.println(num2+" is the largest Number");

	      else
	          System.out.println(num3+" is the largest Number");
		

	}

}
