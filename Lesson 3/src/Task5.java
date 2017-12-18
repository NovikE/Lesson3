import java.util.Random;
import java.util.Scanner;


public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] x = new int[10][10];

		Random ran = new Random();

		int r = ran.nextInt();
		System.out.println("Ёлементы массива:");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				r = ran.nextInt(100);
				x[i][j] = r;
				System.out.print(x[i][j] + " ");
			}
			System.out.println("");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите целое число: ");
		int value = in.nextInt();
		System.out.println("");
		
		int quant = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				if (x[i][j] == value) {
					quant++;
				}
				
			}
		}
		System.out.println(" оличество повторений числа " + value + " в массиве: " + quant);	
	}

}
