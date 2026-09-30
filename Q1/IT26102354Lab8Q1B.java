import java.util.Scanner;
public class IT26102354Lab8Q1B{
	public static void main(String[] args){
	
	Scanner input  = new Scanner(System.in);
	
	int [] myArray = new int [5];
	int [] evenArray = new int [5];
	int num1 = 0;
	
	System.out.println("Enter 5 Numbers :");
	
	for (int count = 0;count < myArray.length; count++){
		 System.out.print("Enter Numbers " + (count + 1) + ": ");
		 myArray[count] = input.nextInt();
		 
		 int evennum = myArray[count] % 2;
		 
			if (evennum == 0){
				
				evenArray[num1] = myArray[count];
				num1++;
			}
	}
	
	System.out.println(" ");
	System.out.println("myArray Contents :");
	
	for (int count2 = 4;count2 >= 0 ; count2--){
		System.out.print(myArray[count2] + " ");
	}
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("evenArray Contents :");
	
	for (int num2 = 0;num2 < myArray.length; num2++){
		System.out.print(evenArray[num2] + " ");
	}
	
	
	
	}
	}