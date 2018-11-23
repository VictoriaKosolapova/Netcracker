package com.netcracker.edu.dao;

import com.netcracker.edu.object.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAll();
    void delete(String firstName, String lastName);
    Employee get(String firstName, String lastName);
    void add(String firstName, String lastName, String position, int age);
}
