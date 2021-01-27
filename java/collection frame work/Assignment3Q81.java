import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class Assignment3Q81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("ongole");
		String s2=new String("vij");
		
		String s3=new String("praksam");
		String s4=new String("krishna");
		Map<String,String> v=new HashMap<String,String>();
	//	ConcurrentMap<String,String> v=new ConcurrentHashMap<String,String>();
		v.put(s1, s3);
		v.put(s2, s4);
		Set<Entry<String,String>> entryset=v.entrySet();
		Iterator<Entry<String,String>> itr=entryset.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> entry=(Map.Entry<String,String>) itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
      //        v.put(s3, s4);		
		}
		
	}

}
