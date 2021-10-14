package desing.creational.builder.account;

import desing.creational.builder.account.AccountExonarateBuilder.AmountExonorared;
import desing.creational.builder.account.AccountExonarateBuilder.TimeExonerated;

public class Account {
	
	 private long accountNumber; //This is important, so we'll pass it to the constructor.
     private String owner;
     private String branch;
     private double balance;
     private boolean maintanceCostExonorated;
     private double amountExonorared;
     private int timeExonerated;
     
	
	public boolean isMaintanceCostExonorated() {
		return maintanceCostExonorated;
	}

	public void setMaintanceCostExonorated(boolean maintanceCostExonorated) {
		this.maintanceCostExonorated = maintanceCostExonorated;
	}

	public double getAmountExonorared() {
		return amountExonorared;
	}

	public void setAmountExonorared(double amountExonorared) {
		this.amountExonorared = amountExonorared;
	}

	public int getTimeExonerated() {
		return timeExonerated;
	}

	public void setTimeExonerated(int timeExonerated) {
		this.timeExonerated = timeExonerated;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	private Account() { }
	
	public static class Builder implements AccountExonarateBuilder.MaintanceCostExonorated, AccountExonarateBuilder.AmountExonorared, AccountExonarateBuilder.TimeExonerated{
		private long accountNumber;
		private String ownerName;
		private String branch;
		private double balance;
		private boolean maintanceCostExonorated;
	    private double amountExonorared;
	    private int timeExonerated;
		
		
		public Builder(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public Builder Owner(String owner) {
			this.ownerName = owner;
			return this;
		}
		
		public Builder atBranch(String branch) {
			this.branch = branch;
			return this;
		}
		
		public Builder openingBalance(double balance) {
			this.balance = balance;
			return this;
		}
		
		@Override
		public Builder timeExonerated(int days) {
			this.timeExonerated = days;
			return this;
		}

		@Override
		public TimeExonerated amountExonorared(double value) {
			this.amountExonorared = value;
			return this;
		}

		@Override
		public AmountExonorared maintanceCostExonorated(boolean isExnorated) {
			this.maintanceCostExonorated = isExnorated;
			return this;
		}
		
		
		public Account build() {
			
			Account a = new Account();
			a.accountNumber = this.accountNumber;
			a.owner = this.ownerName;
			a.branch = this.branch;
			a.balance = this.balance;
		
			return a;
		}

		


		
		
		
		
	}

}
