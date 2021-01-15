package com.lambda;

public class IFaceImpl implements IFace {
public static void main(String[] args) {
	
	IFace face=()->{
		System.out.println("print");
	};
	face.print();
	
	IFace f= new IFaceImpl();
	System.out.println(f.test());
}

@Override
public void print() {
	// TODO Auto-generated method stub
	
}
	

	
	

}
