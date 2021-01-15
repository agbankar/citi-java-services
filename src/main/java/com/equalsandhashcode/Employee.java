package com.equalsandhashcode;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	String empName;
	int empId;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public Employee(Employee e) {
		this.empId = e.getEmpId();
		this.empName = e.getEmpName();

	}

	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	public Employee() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

	public static void main(String[] args) {

		Employee e = new Employee("ashish", 1);
		Employee e1 = new Employee("ashish", 1);

		Map<Employee, String> map = new HashMap();
		map.put(e, "ashish");
		map.put(e1, "ashish");

	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}

}
