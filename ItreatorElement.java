package priorityQueue;
import java.util.*;

public class ItreatorElement {

	public static void main(String[] args) 
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  System.out.println("Elements of the Priority Queue: ");
		  for(String element:queue)
		  {
			  System.out.println(element);
		  }

	}

}
