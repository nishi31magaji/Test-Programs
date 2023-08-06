package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeLister {
	   final static long INCREMENT_SALARY = 10000;

public static void main(String args[]) {
	List<Employee>empList = new ArrayList<Employee>();

	
	Employee emp1 = new Employee(1,2000,"john");
	Employee emp2 = new Employee(2,40000,"mark");
	Employee emp3 = new Employee(3,1000,"siya");
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp3);
	
	empList.stream().filter(x->x.getSalary()<20000)
	.map(e -> {
		e.setSalary(e.getSalary()+INCREMENT_SALARY);
		return e;
	}).collect(Collectors.toList())
	.
	forEach(System.out::println);

}

}
