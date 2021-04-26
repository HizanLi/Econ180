public class Operations implements Function {
	
	private static double presenValue =0;
	private static double futureValue =0;
	private static double annuity =0;
	private static double gradients = 0;
	
	private static double APR =0;
	private static double dailyInterestRAte=0;
	private static double weeklyInterestRAte=0;
	private static double monthlyInterestRAte=0;
	private static double yearlynterestRAte=0;
	private static double GrowthAdjustedRate=0;

	public void interestRateConversion(double apr){
		// result valid only when interest compound daily
		double valueHolder=1;
		APR=apr;
		dailyInterestRAte = APR/365;
		
		for(int i=0;i<7;i++){
			valueHolder *= (1+dailyInterestRAte);
		}
		weeklyInterestRAte = valueHolder-1;
		
		for(int i=0;i<30;i++){
			valueHolder *= (1+dailyInterestRAte);
		}
		monthlyInterestRAte = valueHolder-1;
		
		for(int i=0;i<365;i++){
			valueHolder *= (1+dailyInterestRAte);
		}
		yearlynterestRAte = valueHolder-1;
		
		System.out.println(dailyInterestRAte*100+"%");	
		System.out.println(weeklyInterestRAte*100+"%");
		System.out.println(monthlyInterestRAte*100+"%");
		System.out.println(yearlynterestRAte*100+"%");
	}

	public double FtoP(double futureValue, double yearlyRate, int numYears){
		double valueHolder=1;
		
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		
		presenValue=futureValue/valueHolder;
		
		return presenValue;
		
	}
	
	public double PtoF(double presenValue, double yearlyRate, int numYears){
		double valueHolder=1;
		
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		
		futureValue=presenValue*valueHolder;
		
		return futureValue;
		
	}

	public double FtoA(double futureValue, double yearlyRate, int numYears){
		double valueHolder=1;
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		annuity = futureValue*yearlyRate/(valueHolder-1);
		return annuity;
	}

	public double AtoF(double annuity, double yearlyRate, int numYears){
		double valueHolder=1;	
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		futureValue = annuity*(valueHolder-1)/yearlyRate;
		return futureValue;
	}

	public double AtoP(double annuity, double yearlyRate, int numYears){
		double valueHolder=1;
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		presenValue = annuity*(valueHolder-1)/(yearlyRate*valueHolder);
		return presenValue;
	}

	public double PtoA(double presenValue, double yearlyRate, int numYears){
		double valueHolder=1;
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		annuity = presenValue*(yearlyRate*valueHolder)/(valueHolder-1);
		return annuity;
	}

	public double GtoA(double gradients, double yearlyRate, int numYears){
		double valueHolder=1;
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		annuity = gradients*((1/yearlyRate) - numYears/(valueHolder-1));
		return annuity;
	}

	public double GrowthadJustedInterestRate(double yearlyRate,double growthRate){
		GrowthAdjustedRate = (1+yearlyRate)/(1+growthRate);
		return GrowthAdjustedRate;
	}

	public double GGtoP(double annuity,double growthRate,double yearlyRate,int numYears){
		double valueHolder1=1;
		for(int i=0;i<numYears;i++){
			valueHolder1 *= (1+growthRate)/(1+yearlyRate);
		}	
		presenValue = annuity*valueHolder1/(yearlyRate-growthRate);
		return presenValue;
		
		
	}


}