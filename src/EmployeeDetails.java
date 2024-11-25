import java.time.LocalDate;

public class EmployeeDetails implements Comparable<EmployeeDetails> {

    private String empName;
    private String empDepartment;
    private Double empSalary;
    private LocalDate empDOB;


    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpDepartment() {
        return empDepartment;
    }
    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }
    public Double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }
    public LocalDate getEmpDOB() {
        return empDOB;
    }
    public void setEmpDOB(LocalDate empDOB) {
        this.empDOB = empDOB;
    }
    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", empDepartment=" + empDepartment + ", empSalary=" + empSalary
                + ", empDOB=" + empDOB + "]";
    }
    public EmployeeDetails(String empName, String empDepartment, Double empSalary, LocalDate empDOB) {
        super();
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
        this.empDOB = empDOB;
    }
    public EmployeeDetails() {
        super();
    }
    @Override
    public int compareTo(EmployeeDetails o) {
        // TODO Auto-generated method stub
        int cmp = this.empName.compareTo(o.empName);
        if (cmp != 0) return cmp;

        cmp = this.empDepartment.compareTo(o.empDepartment);
        if (cmp != 0) return cmp;

        cmp = Double.compare(this.empSalary, o.empSalary);
        if (cmp != 0) return cmp;

        return this.empDOB.compareTo(o.empDOB);

    }
}
