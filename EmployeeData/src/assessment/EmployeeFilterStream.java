package assessment;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
public class EmployeeFilterStream {
	int empId;
	String empName;
	double Salary;
	
	
	public EmployeeFilterStream(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		Salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "[empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	
	public static void main(String[] args) {
        List<EmployeeFilterStream> employees = Arrays.asList(
                new EmployeeFilterStream(1001, "AppaReddy", 30000),
                new EmployeeFilterStream(1002, "SaiRaj", 28000),
                new EmployeeFilterStream(1003, "Gokula", 26000),
                new EmployeeFilterStream(1004, "David", 31000),
                new EmployeeFilterStream(1005, "Kiran", 27000)
        );
 
        
        System.out.println("Employees whose name starts with 'A':");
        employees.stream()
                .filter(employee -> employee.getEmpName().startsWith("A"))
                .forEach(System.out::println);
 
  
        System.out.println("\nEmployees whose salary > 25000:");
        employees.stream()
                .filter(employee -> employee.getSalary() > 25000)
                .forEach(System.out::println);
 
        
        System.out.println("\nEmployee with maximum salary:");
        employees.stream()
                .max(Comparator.comparingDouble(EmployeeFilterStream::getSalary))
                .ifPresent(System.out::println);
 
        System.out.println("\nEmployee with minimum salary:");
        employees.stream()
                .min(Comparator.comparingDouble(EmployeeFilterStream::getSalary))
                .ifPresent(System.out::println);
 
       
        System.out.println("\nEmployee with empid = 1005:");
        employees.stream()
                .filter(employee -> employee.getEmpId() == 1005)
                .findFirst()
                .ifPresent(System.out::println);
    }
	
	
 
}