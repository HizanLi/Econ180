public class ECON180{
	
	public static double presenValue;
	public static double futureValue;
	public static double annuity;
	public static double gradients;;
	public static int numYears;
	public static double APR;
	public static double dailyInterestRAte;
	public static double weeklyInterestRAte;
	public static double monthlyInterestRAte;
	public static double yearlynterestRAte;
	public static double GrowthAdjustedRate;

	public static int testPassCount = 0;
	public static int testCount = 0;


	public static void main(String[] args) {
	
	/*
	double foodCost=-126.6;
	double sumfoodCost=Operations.GGtoP(foodCost,0.00064,0.0017,52*10-1);
	System.out.println("sumfoodCost "+sumfoodCost);
	
	double rentcost=-289497;

	double Salary=82000;
	double sumSalary=Operations.AtoP(Salary,0.094,9)+Operations.FtoP((Salary/2),0.094,9)+1.5*Salary;
	System.out.println("sumSalary "+sumSalary);
	System.out.println(sumSalary+rentcost+foodCost);
	

	double foodCost=144.715;
	double sumfoodCost=Operations.GGtoP(foodCost,0.00064,0.0017,52*40-1);
	System.out.println("sumfoodCost "+sumfoodCost);
	*/
	double MonthlyCarPayment = 685.54;
	double PWcar = 42853.38;
	
	double DownPayment = PWcar*0.15;
	double CarPayment=8226.5;
	double Insurance=2478.9;
	double fuel = 2090.74;
	double Licence =72;
	
	double Maintenance = 1169.99;
	double MaintenanceGrediant =1099.4;
	
	double Addition =Licence+fuel+Insurance;
	

	int n=4;
	double sum = 6767.95;
	annuity = Operations.PtoA(sum,0.05,n);
	System.out.println(annuity);

	
	
	
	
	
	}
	
	public static void displayResults (boolean passed, String testName) {
       /* There is some magic going on here getting the line number
        * Borrowed from:
        * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
        */
        
        testCount++;
        if (passed)
        {
            System.out.println ("Passed test: " + testName);
            testPassCount++;
        }
        else
        {
            System.out.println ("Failed test: " + testName + " at line "
                                + Thread.currentThread().getStackTrace()[2].getLineNumber());
        }
    }
	
	
	
	
	
	
}







