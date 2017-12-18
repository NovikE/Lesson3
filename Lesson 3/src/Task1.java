import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] x = new double[10];
		double[] y = new double[10];
		
		Random ran = new Random();

		int r = ran.nextInt();
		System.out.println("Ёлементы массива:");
		for (int i = 0; i < x.length; i++) {
			r = ran.nextInt(160);
			x[i] = r;
			System.out.print(x[i] + " ");
			
		}

		double max = 0;
		for (int i = 0; i < x.length; i++) {
			if(x[i] > max) {
				max = x[i];
			}
			
		}
		double el = 0;
		System.out.println("");
		System.out.println("Ёлементы нового массива:");
		for (int i = 0; i < x.length; i++) {
			y[i] = x[i] / max;
			el = y[i] * 100;
			el = Math.round(el);
			System.out.print((el / 100) + " ");
	}

}
}
