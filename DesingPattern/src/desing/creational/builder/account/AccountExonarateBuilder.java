package desing.creational.builder.account;

import desing.creational.builder.account.Account.Builder;

public interface AccountExonarateBuilder {
	
	interface MaintanceCostExonorated {
		AmountExonorared maintanceCostExonorated(boolean isExnorated);
	}
	
	interface AmountExonorared {
		TimeExonerated amountExonorared(double value);
	}
	
	interface TimeExonerated {
		Builder timeExonerated(int days);
	}
}
