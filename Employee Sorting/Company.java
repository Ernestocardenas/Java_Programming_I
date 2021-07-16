import java.util.ArrayList;


public class Company {
    
    private String name;
    private ArrayList<Employee> employees;

 public Company(String name) {
 this.name = name;
 this.employees = new ArrayList<>();
 }

public String getName() {
 return name;
 }

 public void setName(String name) {
 this.name = name;
 }

 public ArrayList<Employee> getEmployees() {
 return employees;
 }

 public void setEmployees(ArrayList<Employee> employees) {
 this.employees = employees;
 }
 
 public void display(String headerInfo){
     System.out.println("===========================================================================");
     System.out.println("Company: " + name + ": " + headerInfo);
     System.out.println("===========================================================================");
     System.out.printf("%10s %18s %20s %20s \n", "First Name", "Last Name", "EmployeeID" , "Efficiency Level");
     System.out.println("===========================================================================");

      for(Employee e:employees){
      
          e.display();
    }

 System.out.println("\n\n");
 }

 public void sortEmployees(){


 for(int i=0; i<employees.size(); i++){
     
 Employee maxEmployee = employees.get(0);
 int index = 0;
 
 for(int j= 0; j<employees.size() - i; j++){
     
 if(maxEmployee.getEfficiencyLevel() >= employees.get(j).getEfficiencyLevel()){
 maxEmployee = employees.get(j);
 index = j;

 }
     }//end for j


Employee temp = employees.get(employees.size() -1 - i);     //old max     
            employees.set(employees.size() -1 - i, maxEmployee);  // new max
            employees.set(index, temp);  //swap old max 


 


 }//end for i
 
 
    

 
 }

 }
