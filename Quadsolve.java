public class Main {

	private static double[] solvequadeq(double a, double b, double c) {
		double D = Math.pow(b, 2) - 4 * a * c;
		if (D < 0)
			return new double[0];
		if (D == 0) {
			return new double[] { -b / (2 * a)};
		} else {
			double x1 = (-b - Math.sqrt(D)) / (2 * a);
			double x2 = (-b + Math.sqrt(D)) / (2 * a);
			return new double[] {x1, x2};
		}
	}

	public static void main(String[] args) {
		double a = 1;
		double b = -4;
		double c = 3;
		System.out.printf("Equation: %f*x^2 + %f*x + %f = 0\n", a, b, c);
		double[] ret = solvequadeq(a, b, c);
		System.out.println(ret.length + " solution(s) found");
		if (ret.length > 0)
			System.out.println("x1 = " + ret[0]);
		if (ret.length > 1)
			System.out.println("x2 = " + ret[1]);
	}
}
