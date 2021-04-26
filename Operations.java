public class Operations {
	
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

	public static void interestRateConversion(double apr){
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

	public static double FtoP(double futureValue, double yearlyRate, int numYears){
		double valueHolder=1;
		
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		
		presenValue=futureValue/valueHolder;
		
		return presenValue;
		
	}
	
	public static double PtoF(double presenValue, double yearlyRate, int numYears){
		double valueHolder=1;
		
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		
		futureValue=presenValue*valueHolder;
		
		return futureValue;
		
	}

	public static double FtoA(double futureValue, double yearlyRate, int numYears){
		double valueHolder=1;
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		annuity = futureValue*yearlyRate/(valueHolder-1);
		return annuity;
	}

	public static double AtoF(double annuity, double yearlyRate, int numYears){
		double valueHolder=1;	
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		futureValue = annuity*(valueHolder-1)/yearlyRate;
		return futureValue;
	}

	public static double AtoP(double annuity, double yearlyRate, int numYears){
		double valueHolder=1;
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		presenValue = annuity*(valueHolder-1)/(yearlyRate*valueHolder);
		return presenValue;
	}

	public static double PtoA(double presenValue, double yearlyRate, int numYears){
		double valueHolder=1;
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		annuity = presenValue*(yearlyRate*valueHolder)/(valueHolder-1);
		return annuity;
	}

	public static double GtoA(double gradients, double yearlyRate, int numYears){
		double valueHolder=1;
		for(int i=0;i<numYears;i++){
			valueHolder *= (1+yearlyRate);
		}
		annuity = gradients*((1/yearlyRate) - numYears/(valueHolder-1));
		return annuity;
	}

	public static double GrowthadJustedInterestRate(double yearlyRate,double growthRate){
		GrowthAdjustedRate = (1+yearlyRate)/(1+growthRate)-1;
		return GrowthAdjustedRate;
	}

	public static double GGtoP(double annuity,double growthRate,double yearlyRate,int numYears){
		
		GrowthAdjustedRate = GrowthadJustedInterestRate(yearlyRate,growthRate);
		double valueHolder1=AtoP(annuity,GrowthAdjustedRate,numYears);
		presenValue = valueHolder1/(1+GrowthAdjustedRate);
		return presenValue;
		
		
	}

	public static void NPV(double presenValue, double annuity, double salvage, double MARR,int numYears){
		
	}
}