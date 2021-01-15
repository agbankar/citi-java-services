package oops.constructor;

public class Child extends Parent {
String name="ashish";
	public Child() {
	
	System.out.println("Child defaul");
	}
	public Child(String name) {
		this.name = name;
		System.out.println(name);
	}
	public static void main(String[] args) {
		Parent p= new Child("test");
	}
	
	

}
