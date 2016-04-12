/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import common.Employee;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tim
 */
public class Test1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Smith","Bob","111-11-1111");
        Employee e2 = new Employee(2,"Neo","Anderson","333-33-3333");
        Employee e3 = new Employee(3,"John","Anderson","222-22-2222");
        Map employees = new HashMap();
        employees.put(e3, args);
    }
}
