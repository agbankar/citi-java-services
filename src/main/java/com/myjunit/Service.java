package com.myjunit;

public class Service {
	ServiceDao serviceDao = new ServiceDao();

	public int testData(int i) throws MyException {
		
		if (i==0) {
			throw new MyException("test");
		}
		int data = serviceDao.getdata();
		return data * data;

	}
}
