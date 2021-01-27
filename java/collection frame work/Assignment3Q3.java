import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Person
{
	private String name;
	private Integer height;
	private Double weight;
	public Person(String name, Integer height, Double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public Integer getHeight() {
		return height;
	}

	public Double getWeight() {
		return weight;
	}
	@Override
	public String toString()
	{
		return "Person[Personname :" +name +" weight: "+weight +" height :" +height ;
	}
}
public class Assignment3Q3 {

	public static void main(String[] args) {
		Person p1=new Person("sai",5,56.02);
		Person p2=new Person("saiRam",6,76.02);
		Person p3=new Person("Venkatsai",7,66.02);
		Person p4=new Person("sai kumar",4,36.02);
		Person p5=new Person("vnky",3,26.02);
		
		List<Person> object=new ArrayList<>();
	    object.add(p1);
	    object.add(p2);
	    object.add(p3);
	//    iteratelist(object);
	//	private static void iteratelist(List<Person> object) {
			
	    ListIterator<Person> itr=object.listIterator();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}

}
