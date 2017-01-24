package xtras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	
	public Employee(int empid,String empname){
		this.empId=empid;
		this.empName=empname;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public static List<Employee> getEmployeList(){
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(5, "Joe"));
		list.add(new Employee(2, "Mat"));
		list.add(new Employee(4, "Jain"));
		list.add(new Employee(1, "Paru"));
		list.add(new Employee(3, "Adi"));
				
		return list;
	}

	@Override
	public int compareTo(Employee e) {
		return (this.empId-e.getEmpId());
	}	
	
	public String toString(){
		return this.empId+","+this.empName;
	}
	
}

class SortEmployeeByName implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2){
		return e1.getEmpName().compareTo(e2.getEmpName());
	}
}

public class ComparableComparatorApp {
	
	public static void main(String args[]){
		System.out.println("Before Sorting");
		List<Employee> eList = Employee.getEmployeList();
		for(Employee e: eList){
			System.out.println(e);
		}
		
		Collections.sort(eList);
		System.out.println("After Sorting");
		for(Employee e: eList){
			System.out.println(e);
		}
		
		Collections.sort(eList,new SortEmployeeByName());
		
		System.out.println("After Sorting by Name");
		for(Employee e: eList){
			System.out.println(e);
		}
		
	}

}
