import java.util.Random;

public class Task3 {

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

		int row1 = 3;
		int row2 = 5;
		int el = 0;

		for (int j = 0; j < x[1].length; j++) {
			el = x[row1][j];
			x[row1][j] = x[row2][j];
			x[row2][j] = el;
		}

		System.out.println("Ёлементы нового массива:");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
