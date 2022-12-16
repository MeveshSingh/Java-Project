package Tutorial1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo888 {

	public static void main(String[] args) {
		
		
		HashMap hs = new HashMap();
		
		hs.put(1, "Aditya");
		hs.put(2, "Abhishek");
		hs.put(3, "Nirmal");
		hs.put(4, "Rohit");
		
		Set s = hs.entrySet();
		
		System.out.println(s);
		
		Iterator it = s.iterator();
		
		
		
		
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			
			
			System.out.println( me.getKey());
			
			System.out.println( me.getValue());
			
		}

	}
}