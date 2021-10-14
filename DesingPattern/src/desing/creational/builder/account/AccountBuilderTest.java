package desing.creational.builder.account;

public class AccountBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account.Builder(123L).
				atBranch("Manizales").
				openingBalance(100).
				Owner("Rocha").
				maintanceCostExonorated(true).
				amountExonorared(5000).
				timeExonerated(365).
				build();
		
		System.out.println("The account is "+a.getAccountNumber());

	}

}
