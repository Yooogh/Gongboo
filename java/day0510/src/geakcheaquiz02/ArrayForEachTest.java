package geakcheaquiz02;

public class ArrayForEachTest {

	public static void main(String[] args) {
		double[][] interests = {{3.2, 3.1, 3.2, 3.0},
								{2.9, 2.8, 2.7, 2.6},
								{2.7, 2.6, 2.0, 1.7}};
		double[] sum1 = {0.0, 0.0, 0.0};
		double sum2 = 0.0;
		
		int i = 0;
		for (double[] d1 :interests) {
			for (double d2 : d1) {
				sum1[i] += d2;
			}
			System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", i + 1, sum1[i] / 4);
			sum2 += sum1[i];
			i++;
		}
		System.out.printf("3년간 평균 이자율 = %.2f%%\n", sum2 / 3);
	}
}
