package collframe;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;

class Person
{
	private String name;
	private Integer height;
	private Double weight;
	public Person(String name, Integer height, Double weight) {
		//super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}
	public String toString()
	{
		return "Person[Personname :" +name +"weight: "+weight +" height :" +height ;
	}
	
}
class department
{
	private Integer deptId;
	private String deptname;
	private String deptloc;
	public department(Integer deptId, String deptname, String deptloc) {
		super();
		this.deptId = deptId;
		this.deptname = deptname;
		this.deptloc = deptloc;
	}
	public String toString()
	{
		return "Department[ departmentname:" +deptname +"deptId: " +deptId +"depatloc: "+deptloc ;
	}
	
}

public class Assignment3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("sai",5,56.02);
		Person p2=new Person("saiRam",6,76.02);
		Person p3=new Person("Venkatsai",7,66.02);
		Person p4=new Person("sai kumar",4,36.02);
		Person p5=new Person("vnky",3,26.02);
		
		department d1=new department(1001,"datascience","india");
		department d2=new department(1002,"cloud","france");

	//	Map<Person,department> object=new HashMap<>();
		Map<Person,department> object=new LinkedHashMap<>();
		object.put(p1, d1);
	    object.put(p2, d1);
	    object.put(p3, d2);
	    Set<Entry<Person,department>>entryset=object.entrySet();
	    for (Entry<Person,department> entry :entryset)
	    {
	    	System.out.println(entry.getKey());
	    	System.out.println(entry.getValue());
	    }

	}

}
