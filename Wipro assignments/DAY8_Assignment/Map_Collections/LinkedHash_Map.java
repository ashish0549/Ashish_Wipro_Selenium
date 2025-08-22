package Map_Collections;
import java.util.LinkedHashMap;
import java.util.Map;

//Unordered
//Keys must be unique but values of different keys can be same 
//Store Null(only One Null as key allowed)
//Keys Follow Insertion Order
public class LinkedHash_Map {
		public static void main(String[] args) 
		{
			Map<String,Integer> m = new LinkedHashMap<>();
			m.put("one",1 );
			m.put("three",3 );
			m.put("four",4 );
			m.put("two",2 );
			m.put("five",5 );
			System.out.println(m);
			
			Map<String,String> m1= new LinkedHashMap<String,String>();
			m1.put("one","Apple" );
			m1.put("three","CustardApple" );
			m1.put("two", "Banana");
			m1.put("five","Mango" );
			m1.put("four","Kiwi" );
			m1.put(null,"Nothing");
			m1.put(null, null);
			System.out.println(m1);
			System.out.println(m1.get("TWO"));
			m1.replace("one", "Avacado");//Replaces that key's value
			System.out.println(m1);
			System.out.println(m1.keySet());
			System.out.println(m1.values());
			System.out.println(m1.entrySet());
			
			
		}

	}
