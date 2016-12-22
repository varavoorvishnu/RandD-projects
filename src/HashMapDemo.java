import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapDemo {

   public static void main(String args[]) {
      // Create a hash map
      HashMap<String,Object> hm = new HashMap();
      // Put elements to the map
      hm.put("Zara", new Double(3434.34));
      hm.put("Mahnaz", new Double(123.22));
      hm.put("Ayan", new Double(1378.00));
      hm.put("Daisy", new Double(99.22));
      hm.put("Qadir", new Double(-19.08));
      System.out.println("Hash Map : "+hm);
      // Get a set of the entries
      
      System.out.println("Set values :"+hm.entrySet());
      // Get an iterator
      //Iterator i = hm.entrySet().iterator();
      //Iterator i = hm.entrySet().iterator();
      // Display elements
      //while(i.hasNext()) {
       /*  Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());*/
      //}
      for(int i=0;i<hm.size();i++){
    	  System.out.println(hm.get(i));
      }
      System.out.println();
      // Deposit 1000 into Zara's account
      double balance = ((Double)hm.get("Zara")).doubleValue();
      hm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " +
      hm.get("Zara"));
   }
}