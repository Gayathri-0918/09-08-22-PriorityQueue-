package priorityQueue;
import java.util.*;

public class offergivenElement {

	public static void main(String[] args)
	{
		  PriorityQueue<String> queue1 = new PriorityQueue<String>();  
		  queue1.add("Red");
		  queue1.add("Green");
		  queue1.add("Orange");
		  System.out.println("Queue1: "+queue1);
		  queue1.offer("blue");
		  queue1.offer("yellow");
		  System.out.println("After offering element"+queue1);
		 
		 }

	}


