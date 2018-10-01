
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A206345
 */
public class EnrollEmployee extends BankEmployee {

    public static void main(String[] args) {
        BankEmployee a = new BankEmployee("Bob", MANAGER, 30, 30000);
        a.displayEmployee();
        BankEmployee b = new BankEmployee("Jerry", DEVELOPER, 20, 20000);
        b.displayEmployee();
        BankEmployee c = new BankEmployee("Tom", EXEC, 40, 50000);
        c.displayEmployee();
        
        a.deactivateEmployee();
        BankEmployee newOne = new BankEmployee("bob", MANAGER, 30,30000);
        
        System.out.println("Is newOne equals to bob? " + newOne.equals(a));
        
        try {
            newOne.setSalary(10000);
            c.setSalary(40000);
            b.setSalary(50000);
            b.setSalary(1000);
            c.setSalary(200000);
        } catch (IOException ex) {
            Logger.getLogger(EnrollEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(newOne);
    }

    @Override
    public void activateEmployee() {
        super.activateEmployee(); 
    }

    public EnrollEmployee(String name, int employeeType, int salary, int age) {
        super(name, employeeType, salary, age);
    }

    @Override
    public void displayEmployee() {
        super.displayEmployee(); 
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
        
    }

}
