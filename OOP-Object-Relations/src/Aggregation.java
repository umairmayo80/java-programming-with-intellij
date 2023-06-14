
import java.util.ArrayList;
import java.util.List;

/*
 * Aggregation:
Aggregation is a weaker form of association where one class has a reference to another class, but the referenced object can exist independently. It is a "has-a" relationship, where the associated class can exist without the main class.
 */


class Department{
    private List<Employee> employees;

    public Department(){
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
}


class Employee{

}

public class Aggregation {

    public static void main(String[] args){
        Department dept = new Department();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        dept.addEmployee(emp1);
        dept.addEmployee(emp2);

        /*
         * In the example above, the Department class has an aggregation relationship with the Employee class. The Department class maintains a list of Employee objects, but the Employee objects can exist independently outside the Department class.
         */
    }
}
