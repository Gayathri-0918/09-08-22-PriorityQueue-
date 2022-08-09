package priorityQueue;
import java.util.*;

public class Comparetwoqueue {

	public static void main(String[] args) 
	{
		PriorityQueue<String> queue1 = new PriorityQueue<String>();  
		  queue1.add("Red");
		  queue1.add("Green");
		  queue1.add("Orange");
		  System.out.println("Priority Queue1: "+queue1);
		  PriorityQueue<String> queue2 = new PriorityQueue<String>();  
		  queue2.add("Pink");
		  queue2.add("White");
		  queue2.add("Orange");
		  System.out.println("Priority Queue2: "+queue2);
		  for(String element:queue1)
		  {
			  System.out.println(queue2.contains(element)?"yes":"no");
		  }

	}

}
