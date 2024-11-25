import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<EmployeeDetails> employees = new ArrayList<>() ;


        employees.add(new EmployeeDetails("Amit", "HR", 55000.00, LocalDate.of(1990, 1, 15)));
        employees.add(new EmployeeDetails("Amit", "Finance", 60000.00, LocalDate.of(1992, 3, 22)));
        employees.add(new EmployeeDetails("Amit", "HR", 55000.00, LocalDate.of(1991, 5, 18)));
        employees.add(new EmployeeDetails("Amit", "HR", 55000.00, LocalDate.of(1989, 12, 10))); // Edge case: Same name, dept, salary, earlier DOB
        employees.add(new EmployeeDetails("Ravi", "Finance", 70000.00, LocalDate.of(1988, 11, 25)));
        employees.add(new EmployeeDetails("Ravi", "HR", 60000.00, LocalDate.of(1990, 6, 12)));
        employees.add(new EmployeeDetails("Ravi", "Finance", 70000.00, LocalDate.of(1990, 1, 30))); // Same salary, different DOB
        employees.add(new EmployeeDetails("Chandran", "HR", 60000.00, LocalDate.of(1989, 8, 10)));
        employees.add(new EmployeeDetails("Chandran", "Finance", 75000.00, LocalDate.of(1987, 2, 5)));
        employees.add(new EmployeeDetails("Chandran", "IT", 70000.00, LocalDate.of(1990, 12, 1)));
        employees.add(new EmployeeDetails("Priya", "IT", 62000.00, LocalDate.of(1991, 10, 20)));
        employees.add(new EmployeeDetails("Ravi", "IT", 50000.00, LocalDate.of(1993, 7, 30)));
        employees.add(new EmployeeDetails("Dev", "Finance", 85000.00, LocalDate.of(1985, 4, 4)));
        employees.add(new EmployeeDetails("Dev", "HR", 85000.00, LocalDate.of(1986, 9, 15))); // Same name, salary, different dept
        employees.add(new EmployeeDetails("Dev", "Finance", 90000.00, LocalDate.of(1985, 4, 4))); // Higher salary, same name
        employees.add(new EmployeeDetails("Amit", "HR", 55000.00, LocalDate.of(1990, 1, 15))); // Duplicate for testing stability
        employees.add(new EmployeeDetails("Neha", "HR", 45000.00, LocalDate.of(1995, 7, 7)));
        employees.add(new EmployeeDetails("Neha", "HR", 55000.00, LocalDate.of(1994, 3, 3))); // Higher salary, same dept
        employees.add(new EmployeeDetails("Chandran", "IT", 70000.00, LocalDate.of(1990, 6, 1))); // Same name, dept, salary, earlier DOB
        employees.add(new EmployeeDetails("Chandran", "IT", 70000.00, LocalDate.of(1991, 1, 1))); // Same name, dept, salary, later DOB

// before sorting
        System.out.println("Output Before Sorting /n");
        for (EmployeeDetails e : employees) {
            System.out.println(e);
        }


        Collections.sort(employees);

// after sorting
        System.out.println("Output After Sorting /n");
        for (EmployeeDetails e : employees) {
            System.out.println(e);
        }

    }
}