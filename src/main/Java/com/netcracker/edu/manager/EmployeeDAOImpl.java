package com.netcracker.edu.manager;

import com.netcracker.edu.dao.EmployeeDAO;
import com.netcracker.edu.object.Employee;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeDAOImpl implements EmployeeDAO {
    List<Employee> list;

    EmployeeDAOImpl(){ this.list = null; }

    public List<Employee> getAll() { return list; }

    public void delete(String firstName, String lastName) {
        for(Iterator i = list.iterator(); i.hasNext(); ) {
            Object o = i.next();
            if(((Employee)o).getFirstName().compareTo(firstName)==1 && ((Employee)o).getLastName().compareTo(lastName)==1){
                list.remove(o);
            }
        }
    }

    public Employee get(String firstName, String lastName) {
        Employee result = null;
        for(Employee employee: list ) {
            if(employee.getFirstName().compareTo(firstName) == 1 && employee.getLastName().compareTo(lastName) == 1){
                result=employee;
            }
        }
        return result;
    }

    public void add(String firstName, String lastName, String position, int age) {
        Employee employee = new Employee();
        String name = "^[A-Z][a-z]+";
        Pattern p = Pattern.compile(name);
        Matcher mfirst = p.matcher(firstName);
        if (mfirst.matches()) {
            employee.setFirstName(firstName);
        }
        Matcher mlast = p.matcher(lastName);
        if (mlast.matches()) {
            employee.setLastName(lastName);
        }
        employee.setPosition(position);
        employee.setAge(age);
        if (employee.getFirstName() != null && employee.getLastName() != null) {
            list.add(employee);
        }
    }
}
