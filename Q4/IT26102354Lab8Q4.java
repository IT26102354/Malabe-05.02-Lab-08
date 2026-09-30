import java.util.Scanner;
public class IT26102354Lab8Q4{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int [] studentsArray = new int[8];
	int count = 0;
	
	while ( count < studentsArray.length ){
		System.out.print("Enter student ID for students " + (count+1) +" : ");
		int value = input.nextInt();
		if (value <= 0 ){
			System.out.println("Error : Please Enter ONLY Positive Numbers");
		}
		else {
		studentsArray[count] = value;
		count++;
		}
	}
	System.out.println("" );
	System.out.print("Enter student ID to Search : " );
	int id = input.nextInt();

	boolean found = false ;
	for (int a = 0; a < studentsArray.length; a++){
		if (studentsArray[a] == id){
			found = true;
			break;
		}
	
	}
	System.out.println("" );
	if (found){
		System.out.println("Student is Available" );
	}
	else{
		System.out.println("Student is Not Available" );
	}
	
	}	
}