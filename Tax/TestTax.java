package calculatetax;

import java.util.Scanner;

public class TestTax {

	private static Scanner sc;

	public static void main(String[] args) {

		System.out.println("Enter employee's CTC:");
		sc = new Scanner(System.in);
		long ctc = sc.nextInt();
		TaxCalculator tc = new TaxCalculator();
		tc.calculate(ctc);

	}
}
