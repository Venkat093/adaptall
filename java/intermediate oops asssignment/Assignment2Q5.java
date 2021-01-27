abstract class Shape5
{
	abstract public String draw();
}
class Cube5 extends Shape5
{
	public String draw()
	{
		return "draw cube 5";
	}
}
class Line5 extends Shape5
{
	public String draw()
	{
		return "draw line";
	}
}
class Rectangle5 extends Shape5
{
	public String draw()
	{
		return "draw rectangle";
	}
}

public class Assignment2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle5 R=new Rectangle5();
		System.out.println(R.draw());
		Line5 L=new Line5();
		System.out.println(L.draw());
		Cube5 C=new Cube5();
		System.out.println(C.draw());
	}

}
