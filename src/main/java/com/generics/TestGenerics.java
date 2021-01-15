package com.generics;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class TestGenerics {

	public static void main(String[] args) {
		TestGenerics testGenerics = new TestGenerics();
		List upperBoundList = new ArrayList();
		upperBoundList.add(1.0d);

		//upperBoundList.add(new Object());
		upperBoundTest(upperBoundList);

		List<Apple> lowerBoundList = new ArrayList();
		lowerBoundList.add(new Apple());
		lowerBoundTest(lowerBoundList);

		boundedType(1.0d);
		boundedType(new RuntimeException());

	}
public static <T extends Number>  void upperBoundTest(List<? extends Number> list) {

	//public static void upperBoundTest(List<? extends Number> list) {

		for (Number number : list) {
			System.out.println(number);

		}

	}

	public static void lowerBoundTest(List<? super Apple> list) {
		for (Object object : list) {
			System.out.println(object.getClass());

		}
	}

	public static <E extends Number> void boundedType(E e) {
		System.out.println("E extends Number");

	}

	public static <E extends Exception> void boundedType(E e) {
		System.out.println("simply E");

	}

	
	 void wildcardError(List<?> i) {
	        //i.add(0, element);
	    }
	 
	 void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
	      Number temp = l1.get(0);
	     // l1.set(0, l2.get(0)); // expected a CAP#1 extends Number,
	                            // got a CAP#2 extends Number;
	                            // same bound, but different types
	      //l2.set(0, temp);	    // expected a CAP#1 extends Number,
	                            // got a Number
	    }
	 
	 
	  void foo(List<?> i) {
	        fooHelper(i);
	    }


	    // Helper method created so that the wildcard can be captured
	    // through type inference.
	    private <T> void fooHelper(List<T> l) {
	        l.set(0, l.get(0));
	    }

}