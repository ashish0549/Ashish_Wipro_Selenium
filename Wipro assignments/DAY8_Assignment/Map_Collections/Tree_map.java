package Map_Collections;
import java.util.TreeMap;
import java.util.Map;

//Keys must be unique but values of different keys can be same 
//No Null is allowed
//Keys Follow Increasing Order(Alphabetical Order)
public class Tree_map {
		public static void main(String[] args) 
		{
			Map<String,Integer> m = new TreeMap<>();
			m.put("one",1 );
			m.put("three",3 );
			m.put("four",4 );
			m.put("two",2 );
			m.put("five",5 );
			System.out.println(m);
			
			Map<String,String> m1= new TreeMap<String,String>();
			m1.put("one","Apple" );
			m1.put("three","CustardApple" );
			m1.put("two", "Banana");
			m1.put("five","Mango" );
			m1.put("four","Kiwi" );

			System.out.println(m1);
			System.out.println(m1.get("TWO"));
			m1.replace("one", "Avacado");//Replaces that key's value
			System.out.println(m1);
			System.out.println(m1.keySet());
			System.out.println(m1.values());
			System.out.println(m1.entrySet());
			
			
			Map<Integer,String> m2 = new TreeMap<>();
			m2.put(1,"one");
			m2.put(5,"five");
			m2.put(3,"three");
			m2.put(4,"four");
			m2.put(2,"two");
			
			System.out.println(m2);
			
			
			
			
		}

	}