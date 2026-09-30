import java.util.Scanner;
public class IT26102354Lab8Q1A{
	public static void main(String[] args){
	
	Scanner input  = new Scanner(System.in);
	
	int [] myArray = new int [5];
	
	System.out.println("Enter 5 Numbers :");
	
	for (int count = 0;count < myArray.length; count++){
		 System.out.print("Enter Numbers " + (count + 1) + ": ");
		 myArray[count] = input.nextInt();
	}
	
	System.out.println(" ");
	System.out.println("Array in Reverse Order :");
	
	for (int count2 = 4;count2 >= 0 ; count2--){
		System.out.print(myArray[count2] + " ");
	}
	
	}
	}