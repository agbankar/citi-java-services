package com.generics;

public class MyGenericClass<E extends Number > {
    private E prop;
 
    public MyGenericClass(E prop) {
        this.prop = prop;
    }
 
    public MyGenericClass() {
		// TODO Auto-generated constructor stub
	}

	public E getProp() {
        return this.prop;
    }
 
    public void printProp() {
 
        //OK, because toString is defined within Object
        System.out.println(this.prop.toString());
        System.out.println(this.prop.getClass());

    }
 
    public int getValue() {
        /**
         * NOT OK, because Object doesn’t have
         * compareTo method. Compile-time Error.
         */
        return this.prop.intValue();
    }
    public static void main(String[] args) {
		MyGenericClass<Integer> g = new MyGenericClass(10);
		g.printProp();
	}
}

