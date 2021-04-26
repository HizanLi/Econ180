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
		
	annuity = Operations.PtoA(236884,0.06,35);
	System.out.println(annuity);	
	annuity = Operations.GtoA(1575,0.06,35);
	System.out.println(annuity);
	
	// System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
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







