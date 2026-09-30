public class IT26102354Lab8Q2{
	public static void main(String[] args){
	
	
	int A [] = {10,20,30,40,50};
	int B [] = {34,67,12,89,12};
	int C [] = new int [5];
	
	System.out.println(" ");
	System.out.println("A Array Contents :");
	
	for (int count1 = 0;count1 < A.length; count1++){
		System.out.print(A[count1] + " ");
	}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("B Array Contents :");
	
	for (int count2 = 0;count2 < A.length; count2++){
		System.out.print(B[count2] + " ");
	}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("C Array Contents (A + B):");
	
	for (int count3 = 0;count3 < C.length; count3++){
		 C[count3] = A[count3] + B[count3];
	}
	
	for (int count4 = 0;count4 < A.length; count4++){
		System.out.print(C[count4] + " ");
	}
	}
}