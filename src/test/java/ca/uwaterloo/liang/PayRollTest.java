package ca.uwaterloo.liang;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;

public class PayRollTest {

    private PayRoll payRoll;

    private EmployeeList employeeList;

    private BankService bankService;

    private List<Employee> employees;

    @Before
    public void init() {
        employees = new ArrayList<Employee>();

        employeeList = mock(EmployeeList.class);
        bankService = mock(BankService.class);

        when(employeeList.getAllEmployees()).thenReturn(employees);

        payRoll = new PayRoll(employeeList, bankService);
    }

    @Test
    public void testNoEmployees() {
        assertNumberOfPayments(0);
    }
    
    @Test
    public void testNoEmployeesIntra() {
        List<Employee> employees_intra = new ArrayList<Employee>();

        EmployeeList employeeList_intra = mock(EmployeeList.class);
        BankService bankService_intra = mock(BankService.class);

        when(employeeList_intra.getAllEmployees()).thenReturn(employees_intra);

        PayRoll payRoll_intra = new PayRoll(employeeList_intra, bankService_intra);
        
        int numberOfPayments = payRoll_intra.monthlyPayment();
        assertEquals(0, numberOfPayments);
    }
    
    @Test
    public void testSingleEmployee() {
        employees.add(createTestEmployee("Test Employee", "ID1", 1000));

        assertNumberOfPayments(1);
    }

    @Test
    public void testEmployeeIsPaid() {
        String employeeId = "ID0";
        int salary = 1000;

        employees.add(createTestEmployee("Test Employee", employeeId, salary));

        assertNumberOfPayments(1);

        verify(bankService, times(1)).makePayment(employeeId, salary);
    }

    @Test
    public void testAllEmployeesArePaid() {
        employees.add(createTestEmployee("Test Employee1", "ID0", 1000));
        employees.add(createTestEmployee("Test Employee2", "ID1", 2000));

        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        assertEquals("ID0", idCaptor.getAllValues().get(0));
        assertEquals("ID1", idCaptor.getAllValues().get(1));
        assertEquals(1000, salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(2000, salaryCaptor.getAllValues().get(1).intValue());
    }
    
    @Test
    public void testAllEmployeesArePaidArray() {
        Employee[] employee_arr = createEmployees();
        employees.add(employee_arr[1]);
        employees.add(employee_arr[2]);

        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        assertEquals("ID0", idCaptor.getAllValues().get(0));
        assertEquals("ID1", idCaptor.getAllValues().get(1));
        assertEquals(1000, salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(2000, salaryCaptor.getAllValues().get(1).intValue());
    }
    
    
    @Test
    public void testInteractionOrder() {
        String employeeId = "ID0";
        int salary = 1000;

        employees.add(createTestEmployee("Test Employee", employeeId, salary));

        assertNumberOfPayments(1);
        
        InOrder inOrder = inOrder(employeeList, bankService);
        inOrder.verify(employeeList).getAllEmployees();
        inOrder.verify(bankService).makePayment(employeeId, salary);
    }

    private void assertNumberOfPayments(int expected) {
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }

    private Employee createTestEmployee(String name, String id, int salary) {
        return new Employee(name, id, salary);
    }
    
    /**
     * creates an array of four Node instances, mocked by EasyMock.
     */
    private Employee[] createEmployees() {
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
        
        return new Employee[]{employee1, employee2};
    }
}
