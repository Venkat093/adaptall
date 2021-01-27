import java.util.ArrayList;

class SavingsAccount extends Assignment2Q3
{
	int totalDeposits=10000;
	int fixedDeposits=5000;
	public int getCash()
	{
		return totalDeposits+fixedDeposits;
	}
}
class CurrentAccount extends Assignment2Q3
{
	int totalDeposits=10000;
	int creditLimit=2000;
	public int getCash()
	{
		return totalDeposits+creditLimit;
	}
}
public class Assignment2Q3 {
	static int cash;
	int total=0;
	public int getCash()
	{
		return cash;
	}
        public int totalCashinBank(ArrayList<Integer> cash)
        {
        	for(int c:cash)
        	{
        		total=total+c;
        	}
        	return total;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2Q3 S1=new SavingsAccount();
		Assignment2Q3 S2=new SavingsAccount();
		Assignment2Q3 S3=new SavingsAccount();
		Assignment2Q3 C1=new CurrentAccount();
		Assignment2Q3 C2=new CurrentAccount();
		Assignment2Q3 C3=new CurrentAccount();
		ArrayList<Integer> cash=new ArrayList<Integer>();
		cash.add(S1.getCash());
		cash.add(S2.getCash());
		cash.add(S3.getCash());
		cash.add(C1.getCash());
		cash.add(C2.getCash());
		cash.add(C3.getCash());
		System.out.println(cash);
		Assignment2Q3 A=new Assignment2Q3();
		System.out.println(A.totalCashinBank(cash));
		
		


				
           
	}

}
