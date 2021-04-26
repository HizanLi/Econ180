public interface Function {
	
	public void interestRateConversion(double apr);
	
	public double FtoP(double futureValue, double yearlyRate, int numYears);
	
	public double PtoF(double presenValue, double yearlyRate, int numYears);
	
	public double FtoA(double futureValue, double yearlyRate, int numYears);
	
	public double AtoF(double annuity, double yearlyRate, int numYears);
	
	public double AtoP(double annuity, double yearlyRate, int numYears);
	
	public double PtoA(double presenValue, double yearlyRate, int numYears);
	
	public double GtoA(double gradients, double yearlyRate, int numYears);
	
	public double GrowthadJustedInterestRate(double annualInterest,double annualGrowoth);
	
	public double GGtoP(double annuity,double growthRate,double yearlyRate,int numYears);
}