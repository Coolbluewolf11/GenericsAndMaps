/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Tim
 */
public class Lab3 {
    public static void main(String[] args) {
        Employee e1= new Employee(1,"Smith","Bob","111-11-1111");
        Employee e2= new Employee(2,"Jones","Bob","222-11-1111");
        Employee e3= new Employee(3,"Smith","Bob","333-11-1111");
        Employee e4= new Employee(4,"Baylee","Bob","444-11-1111");
        Map<String,Employee> employees = new HashMap<>();
        employees.put(e1.getSsn(),e1);
        employees.put(e2.getSsn(),e2);
        employees.put(e3.getSsn(),e3);
        employees.put(e4.getSsn(),e4);
        Employee retrieved = employees.get("444-11-1111");
        System.out.println(retrieved);
        Set<String> keys = employees.keySet();
        for(String key : keys){
            Employee e = employees.get(key);
            System.out.println(retrieved);
        }
    }
}


