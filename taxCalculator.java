import java.util.*;
class taxCalculator{

//--------------------------------Clear the Command Line--------------------------------------

 
	public final static void clearConsole() {
try {
final String os = System.getProperty("os.name");
if (os.contains("Windows")) {
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
} else {
System.out.print("\033[H\033[2J");
System.out.flush();
}
} catch (final Exception e) {
e.printStackTrace();
// Handle any exceptions.
}
}
//-------------------------------------------------------------------------------------------

	public static void main (String args[]){
		homePage();
		
		}

//----------------------------------Home Page------------------------------------------------	

	public static void homePage(){
		System.out.println("\t\t\t\t\t\t\t\t -   ----  ----- ------");
		System.out.println("\t\t\t\t\t\t\t\t| \\/     \\|     |      \\");
		System.out.println("\t\t\t\t\t\t\t\t \\$| $$$$$| $$$$ \\$$$$$$");
		System.out.println("\t\t\t\t\t\t\t\t|  |$$  \\$| $$_   | $$");
		System.out.println("\t\t\t\t\t\t\t\t| $|$$    | $$ \\  | $$");
		System.out.println("\t\t\t\t\t\t\t\t| $|$$   _| $$$$  | $$");
		System.out.println("\t\t\t\t\t\t\t\t| $|$$_/  | $$__  | $$");
		System.out.println("\t\t\t\t\t\t\t\t| $$\\    $|$$   \\ | $$");
		System.out.println("\t\t\t\t\t\t\t\t \\$$ \\$$$$ \\$$$$$  \\$$");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("\t\t\t\t\t---   -    -   -  ---   -    /    ---   -   -   /     -   ---   -     --");
		System.out.println("\t\t\t\t\t |   /_\\    \\ /  |     /_\\   |   |      |   |   |    /_\\   |  |   |  |__|");
		System.out.println("\t\t\t\t\t |  /   \\   / \\   ___ /   \\  |__  ___   |___|   |__ /   \\  |  |   |  |  \\");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t-");
		
		
		System.out.println("====================================================================================================================================================");
		
		System.out.println("\t[1] Withholding Tax \n");
		System.out.println("\t[2] Payable Tax \n");
		System.out.println("\t[3] Income Tax \n");
		System.out.println("\t[4] Social Security Contribution Levy (SSCL) Tax \n");
		System.out.println("\t[5] Leasing Payment \n");
		System.out.println("\t[6] Exit \n");
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an option to continue -> ");
		int option = input.nextInt();
		
		clearConsole();
		
		switch (option) {
			
			case 1 : withholdingTax();break;
			case 2 : payableTax();break;
			case 3 : incomeTax();break;
			case 4 : ssclTax();break;
			case 5 : leasingPayment();break;
			case 6 : exit();break;
			default: System.out.println ("Invalid Input..");
			
			}
		
		
		}
		
//--------------------------------Withholding Tax-------------------------------------------------------------	

	public static void withholdingTax(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                               WITHHOLDING TAX                                                |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		
		System.out.println("\n");
		System.out.println("\t[1] Rent Tax \n");
		System.out.println("\t[2] Bank Intrest Tax \n");
		System.out.println("\t[3] Dividend Tax \n");
		System.out.println("\t[4] Exit \n");
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an option to continue -> ");
		int option = input.nextInt();
		clearConsole();
		
		switch (option) {
			
			case 1 : rentTax();break;
			case 2 : bankIntrestTax();break;
			case 3 : dividentTax();break;
			case 4 : homePage();break;
		
		}
	}
//--------------------------------------Rent Tax----------------------------------------------
	public static void rentTax(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                                    Rent TAX                                                  |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		Scanner input = new Scanner (System.in);
		System.out.print(" Enter your rent			: ");
		int rent = input.nextInt();
		System.out.println("");
		
		if(rent>0 && rent<=100000){
			System.out.println(" You don't have to pay rent tax...\n");
			}else if(rent>100000){
				double tax = (rent-100000)/100.0*10;
				System.out.println(" You have to pay rent tax 		: "+tax);
				System.out.println("");
				}else{
					System.out.println(" Invalid input...");
					System.out.println("");
					System.out.print(" Do you want to enter the correct value again ? (Y/N) : ");
					String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						rentTax();
						}else{
							clearConsole();
							homePage();
							}
					}
					System.out.println("\n\n\n");
					System.out.print("Do you want to calculate another rent tax ? (Y/N) : ");
					String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						rentTax();
						}else{
							clearConsole();
							homePage();
							}
		}
//--------------------------------------Bank Intrest Tax----------------------------------------------
	public static void bankIntrestTax(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                            BANK INTREST TAX                                                  |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		Scanner input = new Scanner (System.in);
		System.out.print(" Enter your Bank Intrest per year			: ");
		int intrest = input.nextInt();
		System.out.println("");
		
		if(intrest>0){
				double tax = intrest/100.0*5;
				System.out.println(" You have to pay Bank Intrest Tax per year 		: "+tax+"\n");
				}else{
					System.out.println(" Invalid input...");
					System.out.print(" Do you want to enter the correct value again ? (Y/N)");
					String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						bankIntrestTax();
						}else{
							clearConsole();
							homePage();
							}
					}
					System.out.println("\n\n\n");
					
					System.out.print(" Do you want to calculate another Bank Intrest Tax ? (Y/N) : ");
					String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						bankIntrestTax();
						}else{
							clearConsole();
							homePage();
							}
		}
//-------------------------------------------Dividend Tax--------------------------------------------------------
	public static void dividentTax(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                                DIVIDEND TAX                                                  |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		Scanner input = new Scanner (System.in);
		System.out.print(" Enter your total divident per year	: ");
		int divident = input.nextInt();
		System.out.println("");
		
		if(divident>0 && divident<=100000){
			System.out.println(" You don't have to pay divident tax...\n");
			}else if(divident>100000){
				int value = divident-100000;
				double tax = value/100.0*14;
				System.out.println(" You have to pay divident tax 		: "+tax);
				System.out.println("");
				}else{
					System.out.println(" Invalid input...");
					System.out.print(" Do you want to enter the correct value again ? (Y/N)");
					String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						dividentTax();
						}else{
							clearConsole();
							homePage();
							}
					}
					System.out.println("\n\n\n");
					
					System.out.print("Do you want to calculate another divident tax ? (Y/N) : ");
					String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						dividentTax();
						}else{
							clearConsole();
							homePage();
							}
		}
//----------------------------------------------------Payable Tax-------------------------------------------------------------------
	public static void payableTax(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                                 PAYABLE TAX                                                  |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your employee payment per month		: ");
		int Payment = input.nextInt();
		System.out.println("");
		
		if(Payment>0 && Payment<=100000){
			System.out.println("You don't have to pay payable tax...\n");
			}else if(Payment>100000 && Payment<=141667){
				int value = Payment-100000;
				double tax = value/100.0*6;
				double roundedTax = Math.round(tax);
				System.out.println("You have to pay Payable tax 	: "+roundedTax);
				System.out.println("");
				}else if(Payment>141667 && Payment<=183333){
					int value = Payment-141667;
					double tax = (value/100.0*12)+2500;
					double roundedTax = Math.round(tax);
					System.out.println("You have to pay Payable tax 	: "+roundedTax);
					System.out.println("");
					} else if(Payment>183333 && Payment<=225000){
						int value = Payment-183333;
						double tax = (value/100.0*18)+7500;
						double roundedTax = Math.round(tax);
						System.out.println("You have to pay Payable tax 	: "+roundedTax);
						System.out.println("");
						} else if(Payment>225000 && Payment<=266667){
							int value = Payment-225000;
							double tax = (value/100.0*24)+15000;
							double roundedTax = Math.round(tax);
						System.out.println("You have to pay Payable tax 	: "+roundedTax);
							System.out.println("");
						} else if(Payment>266667 && Payment<=308333){
							int value = Payment-266667;
							double tax = (value/100.0*30)+25000;
							double roundedTax = Math.round(tax);
							System.out.println("You have to pay Payable tax 	: "+roundedTax);
							System.out.println("");
						} else if(Payment>308333){
							int value = Payment-308333;
							double tax = (value/100.0*36)+37500;
							double roundedTax = Math.round(tax);
							System.out.println("You have to pay Payable tax		 	: "+roundedTax);
							System.out.println("");
						}else {
				
						System.out.println("Invalid input...");
						System.out.print("Do you want to enter the correct value again ? (Y/N)");
						String answer = input.next();
						String option = "Y";
						if(answer.equalsIgnoreCase(option)){
							clearConsole();
							payableTax();
						}else{
							clearConsole();
							homePage();
							}
					}
					System.out.println("\n\n\n");
					
					System.out.print("Do you want to calculate another payable tax ? (Y/N) : ");
					String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						payableTax();
						}else{
							clearConsole();
							homePage();
							}
		
		} 
//---------------------------------------------Income Tax------------------------------------------------------
		public static void incomeTax(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                                 INCOME TAX                                                   |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your total income per year	: ");
		int income = input.nextInt();
		System.out.println("");
		
		if(income>0 && income<=1200000){
			System.out.println("You don't have to pay Income tax...\n");
			}else if(income>1200000 && income<=1700000){
				int value = income-1200000;
				double tax = value/100.0*6;
				double roundedTax = Math.round(tax);
				System.out.println("You have to pay Income tax 	 	: "+roundedTax);
				System.out.println("");
				}else if(income>1700000 && income<=2200000){
					int value = income-1700000;
					double tax = (value/100.0*12)+30000;
					double roundedTax = Math.round(tax);
					System.out.println("You have to pay Income tax 	 : "+roundedTax);
					System.out.println("");
					} else if(income>2200000 && income<=2700000){
						int value = income-2200000;
						double tax = (value/100.0*18)+90000;
						double roundedTax = Math.round(tax);
						System.out.println("You have to pay Income tax 		: "+roundedTax);
						System.out.println("");
						} else if(income>2700000 && income<=3200000){
							int value = income-2700000;
							double tax = (value/100.0*24)+180000;
							double roundedTax = Math.round(tax);
						System.out.println("You have to pay Income tax 	 : "+roundedTax);
							System.out.println("");
						} else if(income>3200000 && income<=3700000){
							int value = income-3200000;
							double tax = (value/100.0*30)+300000;
							double roundedTax = Math.round(tax);
							System.out.println("You have to pay Income tax 		: "+roundedTax);
							System.out.println("");
						} else if(income>3700000){
							int value = income-3700000;
							double tax = (value/100.0*36)+450000;
							double roundedTax = Math.round(tax);
							System.out.println("You have to pay Income tax 		: "+roundedTax);
							System.out.println("");
						}else {
				
						System.out.println("Invalid input...");
						System.out.print("Do you want to enter the correct value again ? (Y/N)");
						String answer = input.next();
						String option = "Y";
						if(answer.equalsIgnoreCase(option)){
						incomeTax();
						}else{
							clearConsole();
							homePage();
							}
					}
					
					System.out.println("\n\n\n");
					System.out.print("Do you want to calculate another income tax ? (Y/N) : ");
					String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						incomeTax();
						}else{
							clearConsole();
							homePage();
							}
		
		} 
//--------------------------------------------SSCL Tax----------------------------------------------------
		public static void ssclTax(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                                   SSCL TAX                                                   |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		System.out.println("");
		Scanner input = new Scanner (System.in);
		System.out.print("Enter value of good of service	: ");
		int amount = input.nextInt();
		System.out.println("");
		
		double saleTax	= amount/100*2.5;
		double value	= amount+saleTax;
		
		double vat		= value/100*15;
		double totalTax	= saleTax+vat;
		System.out.print("You have to pay SSCL tax	: "+ totalTax +"\n\n");
		
		System.out.println("\n\n\n");
		
		
		System.out.print("Do you want to calculate another SSCL tax ? (Y/N) : ");
					String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						ssclTax();
						}else{
							clearConsole();
							homePage();
							}
	}
//-----------------------------------Leasing Payment---------------------------------------------
		public static void leasingPayment(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                             Leasing Payment                                                  |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		System.out.println("\t[1] Calculate Monthly Installment \n");
		System.out.println("\t[2] Search Leasing Category \n");
		System.out.println("\t[3] Find Leasing Amount \n");
		System.out.println("\t[4] Exit \n");
		
		Scanner input = new Scanner (System.in);
		System.out.print(" Enter an option to continue -> ");
		int option = input.nextInt();
		clearConsole();
		
		switch (option) {
			
			case 1 : calMonthlyInstallment();break;
			case 2 : searchLeasingCatagory();break;
			case 3 : findLeasingAmount();break;
			case 4 : homePage();break;
		}
	}
//--------------------------Calculate Monthly Installment--------------------------------------		
	public static void calMonthlyInstallment(){	
		clearConsole();
		
		
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                       Calculate Monthly Installment                                          |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		System.out.println("");
		Scanner input = new Scanner (System.in);
		System.out.print(" Enter the lease amount		: ");
		double amount = input.nextDouble();
		System.out.println("");
		
		if(amount<=0){
		System.out.println(" Invalid input...");
				System.out.print(" Do you want to enter the correct value again ? (Y/N)");
				String answer = input.next();
				String option = "Y";
				if(answer.equalsIgnoreCase(option)){
				calMonthlyInstallment();
				}else{
				clearConsole();
				homePage();}
			}
		
		System.out.print(" Input the annual intrest rate	: ");
		double intrest = input.nextDouble();
		System.out.println("");
		if(intrest<=0){
			do{
		System.out.println(" Invalid input... Enter the correct value again : ");
		System.out.print(" Input the annual intrest rate	: ");
		 intrest = input.nextDouble();
			}while(intrest<=0);
			}
		
		System.out.print(" Input the number of years	: ");
		int years = input.nextInt();
			if(years>5){
			do{
		System.out.println(" Invalid input... Enter the correct value again... ");
		System.out.println("");
		System.out.print(" Input the number of years	: ");
		 years = input.nextInt();
			}while(years>5);
			}
		
		double A = amount;
		double i = (intrest/100.0)/12.0;
		int n = years*12;
		
		
		double installment = (A * i) / (1 - (1/ Math.pow((1 + i), n)));
		
			System.out.println("");
			double roundedNumber = Math.round(installment * 100.00) / 100.00;
			System.out.println(" Your monthly installment	: "+roundedNumber);
			System.out.println("\n\n\n");
			
			System.out.print(" Do you want to calculate another monthly installment ? (Y/N) : ");
					String Answer = input.next();
					String Option = "Y";
					if(Answer.equalsIgnoreCase(Option)){
						clearConsole();
						calMonthlyInstallment();
						}else{
							clearConsole();
							homePage();
							}
		
		
	}
//---------------------------------Search Leasing Category------------------------------------------

 	public static void searchLeasingCatagory(){	
		clearConsole();
		
		
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                        Search Leasing Category                                               |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");

		System.out.println("");
		Scanner input = new Scanner (System.in);
		System.out.print(" Enter the lease amount		: ");
		double amount = input.nextDouble();
		if(amount<=0){
		System.out.println(" Invalid input...");
				System.out.print(" Do you want to enter the correct value again ? (Y/N)");
				String answer = input.next();
				String option = "Y";
				if(answer.equalsIgnoreCase(option)){
				calMonthlyInstallment();
				}else{
				clearConsole();
				homePage();}
			}
		System.out.println("");
		
		System.out.print(" Enter annual intrest rate	: ");
		double intrest = input.nextDouble();
		if(intrest<=0){
			do{
		System.out.println(" Invalid input... Enter the correct value again : ");
		System.out.println("");
		System.out.print(" Input the annual intrest rate	: ");
		 intrest = input.nextDouble();
			}while(intrest<=0);
			}
		System.out.println("");
			
			int years = 3;
		do{	
		double A 	= amount;
		double i	= (intrest/100.0)/12.0;
		int n 	 	= years*12;
		
			double installment = (A * i) / (1.0 - (1.0/ Math.pow((1 + i), n)));
			System.out.println("\n");
			double roundedNumber = Math.round(installment * 100.00) / 100.00;
			System.out.print(" Your monthly installment for "+years+" year installment plan : "+roundedNumber);
			
			
		years++;
		}while(years<=5);
		
		System.out.println("\n\n\n");
		System.out.print("Do you want to calculate another leasing category ? (Y/N) : ");
					String Answer = input.next();
					String Option = "Y";
					if(Answer.equalsIgnoreCase(Option)){
						searchLeasingCatagory();
						}else{
							clearConsole();
							homePage();
							}
		
	}
//-----------------------------------Find leasing amount---------------------------------------
	
	public static void findLeasingAmount(){	
		clearConsole();
		
		
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                         Find Leasing Amount                                                  |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		
		System.out.println("");
		Scanner input = new Scanner (System.in);
		System.out.print(" Enter the monthly lease payment amount you can afford	: ");
		double monthlyPaymentAmount = input.nextDouble();
		System.out.println("");
		
		System.out.print(" Input the number of years				: ");
		int years = input.nextInt();
			if(years>5){
			do{
		System.out.println(" Invalid input... Enter the correct value again...");
		System.out.println("");
		System.out.print(" Input the number of years				: ");
		 years = input.nextInt();
			}while(years>5);
			}
		System.out.println("");
			
		System.out.print(" Enter annual intrest rate				: ");
		double intrest = input.nextDouble();
		if(intrest<=0){
			do{
		System.out.println(" Invalid input... Enter the correct value again......  ");
		System.out.println("");
		System.out.print(" Input the annual intrest rate				: ");
		 intrest = input.nextDouble();
			}while(intrest<=0);
			}
		System.out.println("");
			
			double i	= (intrest/100)/12.0;
			int n 	 	= years*12;
			
		double leaseAmount = (monthlyPaymentAmount * (1 - (1/ Math.pow((1 + i), n))))/i;
		double roundedNumber = Math.round(leaseAmount);
		System.out.print(" You can get lease amount				: "+roundedNumber);
		System.out.println("\n");
		
		System.out.println("\n\n\n");
		System.out.print("Do you want to calculate another monthly installment ? (Y/N) : ");
					String Answer = input.next();
					String Option = "Y";
					if(Answer.equalsIgnoreCase(Option)){
						findLeasingAmount();
						}else{
							clearConsole();
							homePage();
							}
		}
		
//-----------------------------------------exit----------------------------------------------	
		public static void exit(){
			
			
			}

}
