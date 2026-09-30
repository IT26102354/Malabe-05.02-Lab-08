import java.util.Scanner;
public class IT26102354Lab8Q3{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int [] numbers =new int[6];
	int count = 0;
	int max;
	
	while ( count < numbers.length ){
		System.out.print("Enter a positive number ("+ (count+1)+"/6) : ");
		int value = input.nextInt();


		if (value <= 0 ){
			System.out.println("Error : Please Enter ONLY Positive Numbers");
		}
		else {
		numbers[count] = value;
		count++;
		}
	}
		max = numbers[0];
		
		for(int dot = 1; dot <= 5;dot++){
			if( max < numbers[dot]){
				max = numbers[dot];
			}
		}
		
	System.out.println("");
	System.out.println("Array Constant :");
	
	for (int a = 0;a < numbers.length;a++){
		System.out.print(numbers[a] + " ");

	}
	System.out.println(" ");
	System.out.println("The Maximum Number Entered : "+ max );
		
	
}
}