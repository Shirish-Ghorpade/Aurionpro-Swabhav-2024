import java.util.Scanner;

public class MatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = new int[3][3];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the matrix elements :");
		
		createRows(scanner, matrix);
		
		printRows(matrix);

	}
	private static  void createRows(Scanner scanner, int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			rowElements(scanner, matrix, i);
		}
	}
	private static void rowElements(Scanner scanner, int matrix[][], int row) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[row][i] =  scanner.nextInt();
		}
	}
	private static  void printRows(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			printRowElements(matrix, i);
		}
	}
	private static void printRowElements(int matrix[][], int row) {
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.println(matrix[row][i]);
		}
	}

}
