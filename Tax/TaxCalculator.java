package calculatetax;

public class TaxCalculator implements TaxCalculatorInterface {

	private static float netSalary;
	private static float pf;
	private static float pt;
	private static double tax;
	private static float esi = 0;
	private float takeHomeSalary;

	// pfCalculation method calculates the pf from salary

	public void pfCalculation(float salary) {
		pf = (float) (salary * 0.12);
		System.out.println("Employee PF :" + pf + "\n");
		takeHomeSalary = takeHomeSalary - pf;
	}

	public void ptCalculation(float salary) {
		if (salary < 15000) {
			pt = 0;
		}
		if (salary > 15000 && salary < 20000) {
			pt = 150;
		}
		if (salary > 20000) {
			pt = 200;

		}
		System.out.println("Employee PT:" + pt + "\n");

		takeHomeSalary = takeHomeSalary - pt;
	}

	public void incometaxCalculation(long ctc) {
		if (ctc < 250000) {
			tax = 0;
		} else if (ctc > 250000 && ctc <= 500000) {
			tax = (ctc) * 0.05;
		} else if (ctc > 500000 && ctc <= 1000000) {
			tax = 12500 + (ctc * 0.20);
		} else {
			tax = 12500 + 100000 + (ctc * 0.20);
		}
		System.out.println("Income Tax is:" + (tax / 12) + "\n");

		takeHomeSalary = (float) (takeHomeSalary - (tax / 12));
	}

	public void rebate(long ctc) {
		int rebate = 0;
		if(ctc<=350000) {
			rebate=1500;
		}
		
		
		if(ctc>350000 && ctc<500000) {
			rebate = 5000;
			
		}
		System.out.println("Rebate amount is"+rebate+"\n");

	}

	

	public void esiCalculation(float salary) {
		if (salary > 21000)
			esi = (float) (salary * 0.0075);
		System.out.println("ESI: " + esi + "\n");
		takeHomeSalary = takeHomeSalary - esi;
	}

	public void calculate(long ctc) {
		netSalary = ctc / 12;
		takeHomeSalary = netSalary;
		pfCalculation(netSalary);
		ptCalculation(netSalary);
		incometaxCalculation(ctc);
		rebate(ctc);
		esiCalculation(netSalary);
		System.out.println("Take Home Salary:" + takeHomeSalary + "\n");
	}

}