
public class Condition {

	public static void main(String[] args) {
		
		boolean isInternetConnected = true;
		boolean isGpsConnected = false;
		
		if(isInternetConnected){
			
			    System.out.println("You can browse Internet");
			
		if(isGpsConnected){
				
				System.out.println("You can Use Google Maps to Navigate");
				
		}else{
				
				System.out.println("Please Connect to GPS and try Again !!");
			}
		}else{
			
			    System.out.println("Please Connect to Internet and try Again !!");
		}
		

	        	System.out.println();
		
		if( isInternetConnected && isGpsConnected){
			
			    System.out.println("You can browse Internet and Use Maps to Navigate");
		}else{
			
			    System.out.println("Please check you Internet or GPS and Try Again");
		}

		int num1 = 100;
		int num2 = 100;
		int num3 = 100;
		
		// Complete the Logic with all the use cases which you can think of !!
		
		if(num1 > num2){
			if(num1 > num3){
				
				System.out.println("num1 is greatest");
				
		}else{
				System.out.println("num3 is greatest");
			}
		}else{
			
		if(num2 > num3){
				
				System.out.println("num2 is greatest");
				
		}else{
				
				System.out.println("num3 is greatest");
			}
		}
		
		int apple = 1;
		int redmi = 2;
		int samsung = 3;
		int vivo = 4;
		int sony = 5;
		
		int userchoice = 2;
		
		System.out.println();
		
//		if else lader
		
		if(userchoice == apple){
			
			System.out.println("apple mobile is booked");
			
		}else if(userchoice == redmi) {
			System.out.println("redmi mobile is booked");
			
		}else if(userchoice == samsung){
			System.out.println("samsung mobile is booked");
				
		}else if(userchoice == vivo) {
				System.out.println("vivo mobile is booked");
				
		}else if(userchoice == sony) {
			System.out.println("sony mobile is booked");
			
			}
		System.out.println();
		
//		switch case
		
		switch (userchoice = 1) {
		case 1:
			System.out.println("apple mobile is booked");
			break;
		case 2:
			System.out.println("redmi mobile is booked");
			break;
		case 3:
			System.out.println("samsung mobile is booked");
			break;
		case 4:
			System.out.println("vivo mobile is booked");
			break;
		case 5:
			System.out.println("sony mobile is booked");
			break;
		default:
			System.out.println("valid mobile is booked");
			break;
			
				}
			}
}
