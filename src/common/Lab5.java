/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Tim
 */
public class Lab5 {
    public static void main(String[] args) {
        Employee e1= new Employee(1,"Smith","Bob","111-11-1111");
        Employee e2= new Employee(2,"Jones","Bob","222-11-1111");
        Employee e3= new Employee(3,"Smith","Bob","333-11-1111");
        Employee e4= new Employee(4,"Baylee","Bob","444-11-1111");
        Set<Employee> employees = new TreeSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        for(Employee emp: employees){
            System.out.println(emp);
        }
    }
   
}