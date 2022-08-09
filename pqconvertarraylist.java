package priorityQueue;
import java.util.*;

public class pqconvertarraylist {

	public static void main(String[] args) 
	{
		PriorityQueue<String> queue1 = new PriorityQueue<String>();  
		  queue1.add("Red");
		  queue1.add("Green");
		  queue1.add("Orange");
		  System.out.println("Priority Queue1: "+queue1);
		  ArrayList<String> arraylist = new ArrayList<String>(queue1);
		  System.out.println("Arraylist:"+arraylist);
		  

	}

}
