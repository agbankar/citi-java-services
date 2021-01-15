package com.lambda;
@FunctionalInterface
public interface IFace {
	void print();
	default String test() {
		return "ashish";
	}

}
