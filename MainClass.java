package project1;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmOperationInterf op=new AtmOperationImpl();
		int atmnumber=12345;
		int atmpin=123;
		Scanner in=new Scanner(System.in);
		System.out.print("Welcome to ATM Machine!");
		System.out.print("Enter ATM Number: ");
		int atmNumber=in.nextInt();
		System.out.print("Enter PIN: ");
		int atmPin=in.nextInt();
		if((atmnumber==atmNumber) && (atmpin==atmPin))
		{
			while(true)
			{
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
				System.out.print("Enter choice: ");
				int ch=in.nextInt();
				if(ch==1)
				{
					op.ViewBalance();
				}
				else if(ch==2)
				{
					System.out.println("Enter Amount to Withdraw ");
					double withdrawAmount=in.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}
				else if(ch==3)
				{
					System.out.println("Enter Amount to Deposit ");
					double depositAmount=in.nextDouble();
					op.depositAmount(depositAmount);
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
				}
				else if(ch==5)
                { 
					System.out.println("Collect your ATM Card\n Thank You ");
					System.exit(0);
				}
				else
				{
					System.out.print("Please enter correct choice ");
				}
			}
			
		}
		else
		{
			System.out.print("Incorrect ATM number or PIN");
			System.exit(0);
		}
		
		in.close();
		

	}

}
