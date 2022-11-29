package com.java.project6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FruitBasket {

	public static void main(String[] args) {
		//creating a collection for array list
		ArrayList<String> al = new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("custurdApple");
		al.add("Mango");
		al.add("Melon");
		al.add("WaterMelon");
		al.add("cherry");
		al.add("grapes");
		al.add("kiwi");
		al.add("DragonFruit");
		//iterating and displaying elements
		System.out.println("Before adding 2nd array list");
		System.out.println("**********************************");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		//creating one more arraylist
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Guavava");
		al2.add("chikoo");
		al2.add("orange");
		//Adding all 2nd arraylist items to 1st list using addAll
		al.addAll(al2);
		System.out.println("After adding 2nd array list");
		System.out.println("**********************************");
		Iterator itr1 = al.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		//removing an element
		System.out.println("list after removing an element");
		al2.remove(2);
		Iterator itr2 = al.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("replacing cherry with guavava");
		Collections.replaceAll(al, "cherry", "guavava");
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
