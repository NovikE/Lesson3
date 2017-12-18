import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] x = new double[20];
		double[] y = new double[20];

		Random ran = new Random();

		int r = ran.nextInt();
		System.out.println("Ёлементы массива:");
		for (int i = 0; i < x.length; i++) {
			r = ran.nextInt(100) - 50;
			x[i] = r;
			System.out.print(x[i] + " ");

		}
		System.out.println("");
		int j = 0;
		for (int i = 1; i < x.length; i = i + 2) {
			if (x[i] > 0) {
				y[j] = x[i];
				j++;

			}
		}
		
		double sum = 0;
		System.out.println("Ёлементы нового массива:");
		for (int k = 0; k < j; k++) {
			System.out.print(y[k] + " ");
			sum = sum + (y[k] * y[k]);
			}
		System.out.println("");
		System.out.println("Cумма квадратов элементов нового массива: " + sum);
	}

}
