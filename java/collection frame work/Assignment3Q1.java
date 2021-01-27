import java.util.Iterator;
import java.util.TreeSet;
class Person 
{
	private String name;
	private int height;
	private double weight;
	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	@Override
	public String toString()
	{
		return "Person[person name:"+ name +"height:" +height +"weight:" +weight ;
	}
	
		
} 
public class Assignment3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("sai",5,56.02);
		Person p2=new Person("saiRam",6,76.02);
		Person p3=new Person("Venkatsai",7,66.02);
		Person p4=new Person("sai kumar",4,36.02);
		Person p5=new Person("vnky",3,26.02);
		
		TreeSet<Person> person=new TreeSet<Person>();
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		person.add(p5);
		
		Iterator<Person> itr=person.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
