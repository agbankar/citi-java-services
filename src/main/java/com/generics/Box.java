package com.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Box<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
	      this.t = t;
	    }

	    public T get() {
	        return t;
	    }

	    public <U extends Number   & List & Iterable > void inspect(U u){
	    	Map<String, List<String>> myMap = new HashMap();
	        System.out.println("U: " + u.getClass().getName());
	    }

	    public static void main(String[] args) {
	    	ArrayList<Number> l= new ArrayList<>();
	    	List<Number> l1=new LinkedList();


	    	Box integerBox = new Box();
	        integerBox.set(new Double(10));
	    }
	
}
