package com.java.project8;

import java.util.Iterator;
import java.util.TreeSet;

//creating a tree set dor colors
public class TreeSetColors {

	public static void main(String[] args) {
		//creating tree set
		TreeSet<String> ts = new TreeSet<String>();
		//adding colors to the tree set
		ts.add("Red");
		ts.add("Blue");
		ts.add("Aqua");
		
		//printing elements of tree set
		System.out.println("Colors of current tree set are " + ts);
		
		System.out.println("------------------");
		//Creating another tree set for colors
		TreeSet<String> ts1 = new TreeSet<>();
		//adding colors to the 2nd tree set
		ts1.add("Beige");
		ts1.add("Green");
		ts1.add("Mint Green");
		ts1.add("green");
		//printing 2nd tree set
		System.out.println("second tree set colors are: " + ts1);
		//Iterating elements
//		Iterator itr = ts1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		//Adding the first tree set colors to second tree set
		System.out.println("Adding the 1st tree set colors to 2nd tree set" );
		//System.out.println(ts.addAll(ts1));
		ts.addAll(ts1);
		//Iterating the colors
		Iterator itr = ts.iterator();
		System.out.println("All colors available in both tree sets are: " + "\n");
		while(itr.hasNext())
		{
			System.out.println( itr.next());
		}
		//reversing a tree set
		System.out.println("Reversed tree set is: " + ts.descendingSet());
		
		//Comparing two tree sets
		
		boolean b = ts.equals(ts1);
		System.out.println("Both sets are equal?" + b);
		
		//getting the first element in tree set
		System.out.println("The first element in tree set is " + ts.pollFirst());
		
		//Getting the last element in the tree set
		
		System.out.println("The last element in the set is " + ts.pollLast());
	}

}
