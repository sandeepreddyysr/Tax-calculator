package calculatetax;

public interface TaxCalculatorInterface {
	public void esiCalculation(float salary);
	public void pfCalculation(float salary);
	public void ptCalculation(float salary);
	public void incometaxCalculation(long ctc);
	public void rebate(long ctc);
	public void calculate(long ctc);

}
