package com.generics;

import java.util.List;

interface PayloadList<S, U > extends List{
	  void setPayload(int index, U val);
	  public static void main(String[] args) {
		  PayloadList<String,Exception> p;
	}
}
