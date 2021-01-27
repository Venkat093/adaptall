package collecframe4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


class DateClass
{
	Integer date;
	Integer month;
	Integer year;
	
	public DateClass(Integer date, Integer month, Integer year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public Integer getDate() {
		return date;
	}
	public Integer getMonth() {
		return month;
	}
	public Integer getYear() {
		return year;
	}
	public String toString()
	{
		return "Dob :"+date +"-" +month+"-"+year;
	}
	
}
class employee
{
	String name;

	public employee(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString()
	{
		return"employee name: " +name;
	}
}

public class Assignment3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		DateClass d1=new DateClass(27,6,1999);
		DateClass d2=new DateClass(21,10,2000);
		DateClass d3=new DateClass(23,8,1997);
		DateClass d4=new DateClass(2,7,1996);
		 
		employee e1=new employee("venkat");
		employee e2=new employee("poki");
		employee e3=new employee("sai");
		employee e4=new employee("kumar");
		
		Map<DateClass,employee> object=new HashMap<DateClass,employee>();
		object.put(d1, e1);
		object.put(d2, e2);
		object.put(d3, e3);
		object.put(d4, e4);
		 Set<Entry<DateClass,employee>>entryset=object.entrySet();
		    for (Entry<DateClass,employee> entry :entryset)
		    {
		    	System.out.println(entry.getKey());
		    	System.out.println(entry.getValue());
		    }
	}

}
