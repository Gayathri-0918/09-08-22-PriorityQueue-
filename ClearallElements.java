package priorityQueue;
import java.util.*;

public class ClearallElements {

	public static void main(String[] args) 
	{
		  PriorityQueue<String> queue1 = new PriorityQueue<String>();  
		  queue1.add("Red");
		  queue1.add("Green");
		  queue1.add("Orange");
		  System.out.println("Priority Queue1: "+queue1);
		  queue1.clear();
		  System.out.println("After clear elements"+queue1);

	}

}
