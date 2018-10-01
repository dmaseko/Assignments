/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A206345
 */
public class BankEmployee extends Employee {

    public String bankName;

    public BankEmployee(String name, int employeeType, int salary, int age) {
        super(name, employeeType, salary, age);
        this.bankName = bankName;
        
    }

   
    @Override
    public void displayEmployee() {
        super.displayEmployee(); //To change body of generated methods, choose Tools | Templates.
    
    }
    public String toString(){
        return(name + " " + employeeType + " " + salary + " " + age + " " + bankName);
    }
}
