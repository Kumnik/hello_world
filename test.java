import java.util.*;

class InvalidCustomerException extends Exception
{
	public String getMessage()
	{
		return " Invalid details..";
	}
} 


class ATM
{
	private int acc_num=2222;
	private int pass_wrd=9999;
	int ac,ps;
	
	public void acceptinput()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account details:");
		ac=sc.nextInt();
		System.out.println("Enter Password:");
		ps=sc.nextInt();	
	}
	public void verify()		throws Exception
	{
		if(ac==acc_num && ps==pass_wrd)
		{
			System.out.println("Collect your money");
		}
		else
		{
			InvalidCustomerException ice=new InvalidCustomerException();
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
}
			

class Bank
{
	public void initiate()
	{
		ATM atm=new ATM();
		
		try
		{
			atm.acceptinput();
			atm.verify();
		}
		catch(Exception e)
		{
			try
			{
				atm.acceptinput();
				atm.verify();
			}
			catch(Exception f)
			{
				try
				{
					atm.acceptinput();
					atm.verify();
				}
				catch(Exception g)
				{
					System.out.println("card blocked");
					System.exit(0);	
				}

			}	
		}
	}
}

class Test
{
	public static void main(String args[])
	{
		Bank b=new Bank();
		b.initiate();
	}
} 					