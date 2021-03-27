package ca.uwaterloo.liang;

import java.util.Arrays;
import java.util.List;

public class PayRoll {

    private EmployeeList employeeList;

    private BankService bankService;

    public PayRoll(EmployeeList employeeList, BankService bankService) {
        super();
        this.employeeList = employeeList;
        this.bankService = bankService;
    }
    
    public PayRoll(Employee[] employeeArr, BankService bankService) {
        super();
        this.employeeList = (EmployeeList) convertArrayToList(employeeArr);
        this.bankService = bankService;
    }
    
    public int monthlyPayment() {
        List<Employee> employees = employeeList.getAllEmployees();

        for (Employee employee : employees) {
            bankService.makePayment(employee.getBankId(), employee.getSalary());
        }

        return employees.size();
    }
    
 // Generic function to convert an Array to List
    private static <T> List<T> convertArrayToList(T array[])
    {
  
        // Create the List by passing the Array
        // as parameter in the constructor
        List<T> list = Arrays.asList(array);
  
        // Return the converted List
        return list;
    }
}

