import java.util.Scanner;

public final class EvenOddCheker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		 int number = scanner.nextInt();
		 
		 if(number%2==0) {
			 System.out.println("Even");
			 return;
		 }
		 System.out.println("odd");

	}

}
