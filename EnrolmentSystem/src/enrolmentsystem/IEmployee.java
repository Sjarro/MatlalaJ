/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrolmentsystem;

/**
 *
 * @author A210187
 */
public interface IEmployee {
   public void displayEmpoyee();
   public void activateEmployee();
   public void deactivateEmployee();
   
   int MANAGER = 10;
   int DEVELOPER = 20;
   int EXEC = 30;
    
}
