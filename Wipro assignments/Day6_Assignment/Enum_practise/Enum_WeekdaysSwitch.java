package Enum_practise;

public class Enum_WeekdaysSwitch {
enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
	public static void main(String[] args) {
	
	    Day today= Day.Wednesday;
	    switch(today) 
	    {
	    case Monday:System.out.println("Monday");
	    break;
	    case Tuesday:System.out.println("Tuesday");
	    break;
	    case Wednesday:System.out.println("Wednesday");
	    break;
	    case Thursday:System.out.println("Thursday");
	    break;
	    case Friday:System.out.println("Friday");
	    break;
	    case Saturday:System.out.println("Saturday");
	    break;
	    case Sunday:System.out.println("Sunday");
	    break;
	
	   }
	   if(today==Day.Saturday || today== Day.Sunday) 
	   {
	      System.out.println("Weekend");
	   }
	   else { System.out.println("Weekday");}
}
}
