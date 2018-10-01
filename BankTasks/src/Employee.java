
import java.io.IOException;


public abstract class Employee implements IEmployee{
    String name;
    int employeeType;
    int salary;
    int age;
    private boolean active = false;

    public Employee(String name,int employeeType, int salary, int age) {
        this.name = name;
        this.employeeType = employeeType;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public void displayEmployee() {
        System.out.println("Name: " + name + " " + "employeeType: " + employeeType + "," + "Salary: " + "Age: " + age);
    }

    @Override
    public void activateEmployee() {
        System.out.println("Active status " + (active == true));
    }

    @Override
    public void deactivateEmployee() {
        System.out.println("Active status " + active);
    }

    public void setSalary(int salary) throws IOException {
        this.salary = salary;
        if (salary < 10000){
            throw new IOException("Salary too low");
        }
//        this.salary = salary;
        else if(salary > 100000){
            throw new IOException ("Salary too high");            
        }
        if(employeeType == MANAGER && salary < 20000) {
            throw new IOException("Salary not enough");
        }
         else if(employeeType == DEVELOPER && salary > 20000){
            throw new IOException("Salary not in range"); 
        
        }else if(employeeType == EXEC && salary < 50000){
            throw new IOException("Salary not in range");
             
         }
      }

    @Override
    public String toString() {
        return "Employee{"  + "Name: " + name + "employeeType=" + employeeType + ", salary=" + salary + ", age=" + age + ", active=" + active + '}';
    }

    public boolean equals(Employee obj) {
        if(super.equals(obj)){
            return true;
        }else{
            return false;
        }       
    } 
 }
