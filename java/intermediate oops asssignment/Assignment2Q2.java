import java.util.ArrayList;

class manager extends Assignment2Q2
{ 
	int incentive =5000;
	static int a;
	public int getSalary(int salary)
	{
		a=salary+incentive;
		return a;
	}
}
class labour extends Assignment2Q2
{
	int overtime =500;
     static int b;
	public int getSalary(int salary)
	{
		b=salary+overtime;
		return b;
	}
}
public class Assignment2Q2 {
	static int salary =10000;
	int total=0;
	public int getSalary(int salary)
	{
		return salary;
	}
	public int totalEmployeesSalary(ArrayList<Integer> employSalary)
	{
		for (int x:employSalary)
		total=total+x;
		return total;
	}

	public static void main(String[] args) {
		Assignment2Q2 A=new Assignment2Q2();
		// TODO Auto-generated method stub
         Assignment2Q2 l1=new labour();
         Assignment2Q2 l2=new labour();
         Assignment2Q2 l3=new labour();
         Assignment2Q2 l4=new labour();
         Assignment2Q2 m1=new manager();
         Assignment2Q2 m2=new manager();
         Assignment2Q2 m3=new manager();
         Assignment2Q2 m4=new manager();
         ArrayList<Integer> employSalary =new ArrayList<Integer>();
         employSalary.add(l1.getSalary(salary));
         employSalary.add(l2.getSalary(salary));
         employSalary.add(l3.getSalary(salary));
         employSalary.add(l4.getSalary(salary));
         employSalary.add(m1.getSalary(salary));
         employSalary.add(m2.getSalary(salary));
         employSalary.add(m3.getSalary(salary));
         employSalary.add(m4.getSalary(salary));
         System.out.println(employSalary);    
         System.out.println(A.totalEmployeesSalary(employSalary));
         }

}
