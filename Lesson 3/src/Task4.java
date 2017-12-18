import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество строк массива: ");
		int n = in.nextInt();
		// System.out.println("");

		System.out.print("Введите количество столбцов массива: ");
		int m = in.nextInt();
		System.out.println("");

		int[][] x = new int[n][m];

		Random ran = new Random();

		int r = ran.nextInt();
		System.out.println("Элементы массива:");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				r = ran.nextInt(100);
				x[i][j] = r;
				System.out.print(x[i][j] + " ");
			}
			System.out.println("");
		}

		int max = 0;

		for (int j = 0; j < m; j++) {

			for (int i = 0; i < x.length; i++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
			System.out.println("Максимальный элемент для " + (j + 1) + " столбца массива: " + max);
			max = 0;
		}

	}

}
