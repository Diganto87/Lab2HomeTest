import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		int length = 0  ;
        int width = 0 ;
        int area = 0 ; 
        int  perimeter = 0 ;
        
        System.out.println("enter the length of rectangle : ");
		length=scanner.nextInt();
		
		System.out.println("enter the width of rectangle : ");
		width=scanner.nextInt();
		
		area=length * width;
		perimeter = 2 * (length + width);
		System.out.println("The area of Rectangle is: " + area);
		System.out.println("The area of  perimeter is: " +  perimeter);
		
		
	}

}
