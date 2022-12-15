package com.java.project8;

import java.util.*;
public class TreeMapRevise {

	public static void main(String[] args) {
		//Tree Map creation
		TreeMap<Integer,String> tmp = new TreeMap<>();
		//Adding elements to the tee map
		tmp.put(4, "FrontEnd");
		tmp.put(6, "Java");
		tmp.put(3, "Python");
		//Printing the treemap
		System.out.println("The tree map is: " + tmp);
		//Creating another tree map
		TreeMap<Integer,String> tmp1 = new TreeMap<>();
		//adding elements to 2nd tree map
		tmp1.put(5, "PythonFullStack");
		tmp1.put(2, "Backend");
		tmp1.put(1, "Docker");
		//Printing 2nd tree map
		System.out.println("The second tree map elements are: "+ tmp1);
		//A.Copying the first tree map content to second tree map
		tmp.putAll(tmp1);
		//printing all the elements
		System.out.println("The map after copying elemnts is: " +  tmp);
		//B.Searching a key in tree map
		if(tmp.containsKey(3))
		{
			System.out.println("The key is available");
		}
		else
		{
			System.out.println("Key not found");
		}
		//C.searching a value in tree map
		if(tmp.containsValue("Java"))
		{
			System.out.println("the searched value is available");
		}
		else
		{
			System.out.println("Searched value not found");
		}
		//All the keys are already in a sorted format so formating the values
		for(Map.Entry e:tmp.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
