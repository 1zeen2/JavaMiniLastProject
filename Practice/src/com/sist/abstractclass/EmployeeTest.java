package com.sist.abstractclass;
/*
 * 추상 클래스 Employee:
 * name (직원의 이름)
	employee_id (직원의 ID)
	calculate_salary() 메서드 (추상 메서드): 각 직원의 급여를 계산하여 반환
 * 정규직 직원 클래스 FullTimeEmployee:
 * monthly_salary (월급)
	calculate_salary() 메서드 구현: 월급을 반환
 * 시간제 직원 클래스 PartTimeEmployee:
 * hourly_wage (시간당 임금)
	hours_worked (일한 시간)
	calculate_salary() 메서드 구현: hourly_wage와 hours_worked를 곱한 값을 반환
 * 계약직 직원 클래스 ContractEmployee:
 * contract_amount (계약된 금액)
	calculate_salary() 메서드 구현: 계약된 금액을 반환

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 추상 클래스 Employee
abstract class Employee {
    protected String name;
    protected String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();
}

// FullTimeEmployee 클래스
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, String employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// PartTimeEmployee 클래스
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, String employeeId, double hourlyWage, int hoursWorked) {
        super(name, employeeId);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

// ContractEmployee 클래스
class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(String name, String employeeId, double contractAmount) {
        super(name, employeeId);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}

// 테스트 클래스
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Alice", "FT123", 5000));
        employees.add(new PartTimeEmployee("Bob", "PT456", 20, 120));
        employees.add(new ContractEmployee("Charlie", "CT789", 3000));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the employee you want to see the salary of: ");
        String employeeName = scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.name.equals(employeeName)) {
                System.out.println("Employee: " + employee.name + ", Salary: " + employee.calculateSalary());
            }
        }

        scanner.close();
    }
}
