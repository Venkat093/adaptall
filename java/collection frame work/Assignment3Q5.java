package collecframeQ5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee
{
	Integer id;
	String name;
	String email;
	public Employee(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Override
	public int hashCode() {
	final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String toString()
	{
		return "Employee[ employeeid : "+id +" name" +name +" email "+email ;
		
	}
	
}
class department
{
	String name;
	Integer id;
	public department(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String toString()
	{
		return "department [ department: "+name +" id: " +id ;
	}
	
}


public class Assignment3Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee(1001,"venkat","venkat@gmail.com");
		Employee e2=new Employee(1002,"sai","sai@gmail.com");
		Employee e3=new Employee(1003,"ram","ram@gmail.com");
	 
		department d1=new department("datascience",2001);
		department d2=new department("cloud",2002);
   
		Map <Employee,department> object=new HashMap<>();
		object.put(e1, d2);
		object.put(e3, d1);
		
		Set<Entry<Employee,department>> EntrySet=object.entrySet();
		for(Entry<Employee,department>entry:EntrySet)
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
