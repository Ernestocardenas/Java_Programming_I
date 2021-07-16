public class Employee {
    
private static int currentEmployeeID = 1000;
    
private String firstName;
private String lastName;
private double efficiencyLevel;
private int employeeID;
     
    

    

public Employee(String firstName, String lastName, double efficiencyLevel) {
    
   this.firstName = firstName;
   this.lastName = lastName;    
   this.efficiencyLevel = efficiencyLevel;
   this.employeeID = Employee.currentEmployeeID;
   Employee.currentEmployeeID++;

        
}
public static int getCurrentEmployeeID() {
    
return currentEmployeeID;

}
public static void setCurrentEmployeeID(int currentEmployeeID) {
    
Employee.currentEmployeeID = currentEmployeeID;

}

public String getFirstName() {
    
return firstName;

}

public void setFirstName(String firstName) {
    
this.firstName = firstName;

}

public String getLastName() {
    
return lastName;

}

public void setLastName(String lastName) {
    
this.lastName = lastName;

}

public double getEfficiencyLevel() {
    
return efficiencyLevel;

}

public void setEfficiencyLevel(double efficiencyLevel) {
    
this.efficiencyLevel = efficiencyLevel;

}
 
public int getEmployeeID() {
    
return employeeID;

}

public void setEmployeeID(int employeeID) {
    
this.employeeID=employeeID;

}
public void display(){
    
System.out.printf("%-20s %-20s %-10s %10.2f \n", firstName, lastName, employeeID, efficiencyLevel);

}
}
