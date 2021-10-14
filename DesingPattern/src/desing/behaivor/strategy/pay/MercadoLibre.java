 package desing.behaivor.strategy.pay;

import java.util.Scanner;

public class MercadoLibre {
	
	public static void main(String args []) {
		
		
		
		System.out.println("You need to pay $25 for mobile phone");
		System.out.println("Please select payment");
		System.out.println("1: MasterCard");
		System.out.println("2: VisaCard");
		System.out.println("3: PayPal");
		
		Scanner in = new Scanner(System.in);
		
		int code = in.nextInt();
		
		PayManager payManager = null;
		
		if(code==1) {
			payManager = new PayManager(new MasterCad());
		}
		if(code==2) {
			payManager = new PayManager(new VisaCard());
		}
		if(code==3) {
			payManager = new PayManager(new PayPal());
		}
		
		payManager.doPay(25);
		
		
		
	}

}
