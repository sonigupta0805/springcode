package beans;


import java.util.Hashtable;

import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


public class Demo{
	  private Vector fruits;
	  private TreeSet Cricketers;
	  private Hashtable countrycap;

	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	
	public void setCricketers(TreeSet cricketers) {
		this.Cricketers = cricketers;
	}
	
	public void setCountrycap(Hashtable countrycap) {
		this.countrycap = countrycap;
	}
	
	public void printData(){
		System.out.println("Fruits.............");
		
		for(Object f : fruits){
			System.out.println(f);
		}
		System.out.println("Cricketers.............");
		for(Object s : Cricketers){
			System.out.println(s);
		}
		System.out.println("country capital.............");
		Set keys=countrycap.keySet();
		for(Object key: keys){
			System.out.println("Country="+ key + ":" + "Capital=" + countrycap.get(key));
					
		}
	}

	}