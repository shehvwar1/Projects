package com.java.project8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StudentCourseExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer, String>();
		//adding elements to the tree map
		tm.put(1, "CSE");
		tm.put(4, "ECE");
		System.out.println("Tree Map elements are " + tm);
		//creating another tree map
		TreeMap<Integer,String> tm1 = new TreeMap<Integer,String>();
		//adding elemnets to the next tree map
		tm1.put(2, "EEE");
		tm1.put(3,"Mech");
		System.out.println( "Second tree map elements are" + tm1);
		
		//copying the above tree to to the new tree map
		tm.putAll(tm1);
		System.out.println("copying the first tree map to the secod tree map "+ tm);
		
		//Searching an element by a key in the tree map
		
		System.out.println(tm.containsKey(3));
		
		//seaching an element based on value
		System.out.println(tm.containsValue("CSE"));
		
		//Sorting key based on keys
		for(Map.Entry m:tm.entrySet())
		{
			System.out.println(m.getKey()+ " " + m.getValue());
			//Collections.reverseOrder(map);
		}
		
		//Greatest key
		System.out.println("Greatesr key in the map is: " + tm.firstKey());
		//Last key in the map
		
		System.out.println("Last key in the map is: " + tm.lastKey());
		
		//reverse order view of the map 
		System.out.println("Reverse view of tree map: ");
		  Set<Integer> keySet = tm.descendingKeySet();
		  System.out.println("TreeMap after reverse:");
		  for(Integer i:keySet)
		  {
			 System.out.println(i + "=" + tm.get(i)); 
		  }
		  
		  
		 //Greatest key is
		  int highestKey = tm.lastKey();
		  System.out.println("Highest key in the map is: " + highestKey);
		  //Less than key
		  int lessKey = tm.firstKey();
		  System.out.println("Lowest key in the map is" + lessKey);
	}
	}

