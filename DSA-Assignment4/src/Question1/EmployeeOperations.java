package Question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Question2.NumberOfUniqueCharacter;

public class EmployeeOperations {
    HashMap<Integer, Employee> allEmployee = new HashMap<Integer, Employee>();

    public boolean addEmployee(Employee employee) throws Exception {
        if (allEmployee.containsKey(employee.getEmpid()))
            throw new Exception("Employee Already Exists");

        allEmployee.put(employee.getEmpid(), employee);
        return true;
    }

    public List<Employee> getListOfEmployee() {
        List<Employee> employees = new ArrayList<Employee>(allEmployee.values());
        return employees;
    }


public static void main(String args[]) {


}
}