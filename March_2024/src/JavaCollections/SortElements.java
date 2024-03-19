package JavaCollections;
//Create a class representing an employee with attributes: name, age, and salary. Sort a collection of
//these employees based on their salaries in ascending order.

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    private String name;
    private int age;
    private int salary;
public Employee(String name, int age, int salary) {
    this.age = age;
    this.name = name;
    this.salary = salary;
}
    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age){
        this.age = age;
    }

    public int getSalary () {
        return salary;
    }

    public void setSalary ( int salary){
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class SortElements {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Swetha",24,200000));
        employeeList.add(new Employee("Teja",22,275000));
        employeeList.add(new Employee("Rithu",19,255000));
        employeeList.add(new Employee("Prudhvi",2,290000));

        Collections.sort(employeeList, Comparator.comparingDouble(Employee::getSalary));

        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
