package core;

import java.time.LocalDate;

public class Bank {
	//TransactionDate,Narration,WithdrawalAmount,DepositAmount
	private LocalDate TransactionDate;
	private String Narration;
	private double WithdrawalAmount;
	private double DepositAmount;
	
	public Bank(LocalDate transactionDate, String narration, double withdrawalAmount, double depositAmount) {
		super();
		TransactionDate = transactionDate;
		Narration = narration;
		WithdrawalAmount = withdrawalAmount;
		DepositAmount = depositAmount;
	}
	
	

	public double getDepositAmount() {
		return DepositAmount;
	}



	@Override
	public String toString() {
		return "Bank [TransactionDate=" + TransactionDate + ", Narration=" + Narration + ", WithdrawalAmount="
				+ WithdrawalAmount + ", DepositAmount=" + DepositAmount + "]";
	}
	
	
	
}
