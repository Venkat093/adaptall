abstract class mobile
{
	public void call()
	{
		System.out.println("it helps to talk");
	}
	abstract public void move();
	abstract public void dance();
}
abstract class samsung extends mobile
{
	public void move()
	{
		System.out.println("it can walk");
	}
	abstract public void singing();
}
final class lenovo extends samsung
{
	public void dance()
	{
		System.out.println("it can dance");
	}
	public void singing()
	{
		System.out.println("it can sing");
	}
}
/*class oppo extends lenovo
{
          finall class cannot be extended	
}
*/
public class Assignment2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lenovo s=new lenovo();
				s.call();
		        s.dance();
                s.move();
                s.singing();
	}

}
