package com.netcracker.edu.manager;

import com.netcracker.edu.dao.*;

//import java.util.Iterator;

public class Manager {

    public static void main(String[] args){
        EmployeeDAOImpl newEmployee = new EmployeeDAOImpl();
//        for(Iterator i = list.iterator(); i.hasNext(); ) {
//            Object o = i.next();
//        }
        newEmployee.add("Ivan","Ivanov","manager",30);


    }
}
