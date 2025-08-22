package Collection_Framework;
import java.util.*;

public class LinkedList_Cloning {
	 public static void main(String[] args) {
	        
	     LinkedList<Integer> LL = new LinkedList<Integer>(List.of(1,2,3,4,5));
         System.out.println("Original Linked List LL = "+LL);
         
         Object LLcopy= LL.clone();
         System.out.println("Cloned Linked List LLcopy = "+LLcopy);
         
         
         
         
         // Creating String type of LinkedList and Converting to ArrayList  
         LinkedList<String> LL1 = new LinkedList<String>(List.of("A","B","C"));
         System.out.println("Original Linked List LL1 = "+LL1);
         
         List<String> AL = new ArrayList<>(LL1);
         System.out.println("Created ArrayList AL  = "+AL);

    }
}