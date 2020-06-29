package com.appl;

import java.util.ArrayList;

import com.appl.DetailsPrinter;
import com.appl.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee("Name");
		Manager manager =  new Manager("Manager name");
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee);
        employeeList.add(manager);

        DetailsPrinter printer = new DetailsPrinter(employeeList);
        printer.printDetails();
	}

}
