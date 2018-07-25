package Ch09;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class q01 {

	public static void main(String[] args) {
		/* q01 (1) */
		List<Object> v = new ArrayList<>();
		v.add(new Integer(100));
		v.add(new Double(3.14));
		v.add(new Long(21L));
		v.add(new Short("100"));
		v.add("Kitty");
		v.add(new Integer(200));
		v.add(new Object());
		v.add("Snoopy");
		v.add(new BigInteger("1000"));
		
		/* q01 (2) */	
		System.out.println("印出v物件內所有元素");          
		System.out.println(v);	
		
		/* q01 (3) */	
			Iterator<Object> i = v.iterator();
             while(i.hasNext()) {
            	 if(!(i.next() instanceof Number)){ 	 
            		 i.remove(); 	  
            		 }
             }
             /* q01 (4) */
             System.out.println(v);
	}
}
