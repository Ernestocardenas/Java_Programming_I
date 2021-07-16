//******************************************************************************
// Imports
//******************************************************************************


import java.util.Random;


//******************************************************************************
// Code
//******************************************************************************

public class Controller {

    public static void main(String[] args) {
        
        
        //-------------------------------------------------------------------------------------------------------------
        int efficiencyMin = 0;
        int efficiencyMax = 10;
        
        
        
        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", 
                              "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", 
                              "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", 
                              "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", 
                              "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell", "Perez", 
                              "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins", 
                              "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", 
                              "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", 
                              "Peterson", "Gray", "Ramirez"};
        
        String[] firstNames = {"James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Thomas", 
                               "Charles", "Christopher", "Daniel", "Matthew", "Anthony", "Donald", "Mark", "Paul", 
                               "Steven", "Andrew", "Kenneth", "Joshua", "George", "Kevin", "Brian", "Edward", "Ronald", 
                               "Timothy", "Jason", "Jeffrey", "Ryan", "Lisa", "Betty", "Dorothy", "Sandra", "Ashley", 
                               "Kimberly", "Donna", "Emily", "Michelle", "Carol", "Amanda", "Melissa", "Deborah", 
                               "Stephanie", "Rebecca", "Laura", "Sharon", "Cynthia", "Kathleen", "Helen", "Amy", 
                               "Shirley", "Angela", "Anna", "Brenda", "Pamela", "Nicole", "Ruth", "Samantha", "Christine", 
                               "Emma", "Catherine", "Debra", "Virginia", "Rachel", "Carolyn", "Janet", "Maria", 
                               "Heather", "Diane"};
        
        
        //-------------------------------------------------------------------------------------------------------------
        // DO NOT CHANGE THE CODE ABOVE
        
        // hint for cal the efficiencyLevel
 // double efficiencyLevel = efficiencyMin + (efficiencyMax - efficiencyMin) * rndGen.nextDouble();

Company company1 = new Company("Google");
 Company company2 = new Company("Volkswagen");
 Company company3 = new Company("Verizon");
Random rndGen = new Random();


 for(int j= 1; j <= 3; j++){

 int numberOfEmployees = rndGen.nextInt(15);
 if(numberOfEmployees < 5)
 numberOfEmployees = 5;

 for(int i = 0; i < numberOfEmployees; i++){
     
 int firstNameIndex = rndGen.nextInt(firstNames.length);
 int lastNameIndex = rndGen.nextInt(lastNames.length);

 String firstName = firstNames[firstNameIndex];
 String lastName = lastNames[lastNameIndex];

 double efficiencyLevel = efficiencyMin + (efficiencyMax - efficiencyMin) * rndGen.nextDouble();

 Employee employee = new Employee(firstName, lastName, efficiencyLevel);
 
     switch (j) {
         case 1:
             company1.getEmployees().add(employee);
             break;
         case 2:
             company2.getEmployees().add(employee);
             break;             
         default:
             company3.getEmployees().add(employee);
             break;
     }

}//end for i
 }//end for j


 company1.display("");
 company2.display("");
 company3.display("");


 company1.sortEmployees();
 company2.sortEmployees();
 company3.sortEmployees();

 company1.display("Sorted");
 company2.display("Sorted");
 company3.display("Sorted");



      }//end main()
    
}//end Controller
