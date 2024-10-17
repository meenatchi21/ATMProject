package project1;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{
	ATM atm=new ATM();
	Map<Double,String> ministmt=new HashMap<>();
	@Override
	public void ViewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is: "+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount%500==0)
		{
			if(withdrawAmount<=atm.getBalance())
			{
				ministmt.put(withdrawAmount," Amount Withdrawn");
				System.out.println("Collect the cash "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				ViewBalance();
			}
			else
			{
				System.out.println("Insufficient Balance!");
			}
		}
		else
		{
			System.out.println("Please enter the amount in multiple of 500");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		ministmt.put(depositAmount," Amount Deposited");
		System.out.println(depositAmount+" Deposited Successfully!");
		atm.setBalance(atm.getBalance()+depositAmount);
		ViewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String> m:ministmt.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
