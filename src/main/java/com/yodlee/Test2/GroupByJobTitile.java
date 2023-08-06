package com.yodlee.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByJobTitile {
	public double calculateAverage1(List<Employee> employeeList) {  
		  int sum = 0;
		  int count = 0;
		  for (int i = 0; i < employeeList.size(); i++) {
		      Employee employee = employeeList.get(i);
		      sum += employee.getSalary();
		     count++;
		  }
		  return (double) sum / count;
		}
	public double calculateAverage2(List<Employee> employeeList) {  
	    return employeeList.stream().mapToInt(salary->salary.getSalary()).average().getAsDouble();
	}
}
