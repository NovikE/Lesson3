import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = new int[10][10];

		Random ran = new Random();

		int r = ran.nextInt();
		System.out.println("Элементы массива:");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				r = ran.nextInt(199);
				x[i][j] = r;
				System.out.print(x[i][j] + " ");
			}
			System.out.println("");
		}
		int first = 0;
		int second = 0;
		int sum = 0;
		int quant = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				if ((x[i][j] > 9) & (x[i][j] < 100)) {
					first = (x[i][j]) / 10;
					second = (x[i][j]) % 10;
					sum = first + second;
					if (sum % 2 == 0) {
						quant++;}
					}
				}
			}
		System.out.println("Количество всех двузначных чисел, у которых сумма цифр кратна 2: " + quant);
		}

	}
