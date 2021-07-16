public class PA1 {

    /**
     * Calculates the average crown measurements.
     * 
     * @retuen average crown measurement 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String treeName;
        String scientificName;
        double circumference;
        double height;
        double largestCrown;
        double smallestCrown;
        double  avgCrown;
        double totalPoints;
        
       
        Scanner input;
        
        input = new Scanner(System.in);
        
        System.out.print("Enter the Common Name: ");
        treeName = input.nextLine();
                
        System.out.print("Enter the Scientific Name: ");
        scientificName = input.nextLine();
        
        System.out.print("Enter the Circumference in inches: ");
        circumference = input.nextDouble();
       
        System.out.print("Enter the Height in feet: ");
        height = input.nextDouble(); 
        
        System.out.print("Enter the largest spread in feet: ");
        largestCrown = input.nextDouble();
        
        System.out.print("Enter the smallest spread in feet: ");
        smallestCrown = input.nextDouble();
        
        System.out.print("\n");
        
            // Equations
        avgCrown = (smallestCrown + largestCrown) / 2.0;
        
        totalPoints = circumference + height + .25 * avgCrown;
        
        
        
       
            // Report
        System.out.print("Big Tree Report:\n");
        System.out.print("\n");
        System.out.println("    Common Name: " + treeName);
        System.out.println("Scientific Name: " + scientificName);
        System.out.print("\n");
        System.out.println("  Circumference: " + circumference);
        System.out.println("         Height: " + height);
        System.out.println("  Average Crown: " + (Math.floor(avgCrown)));
        System.out.print("\n");
        System.out.print("   Total Points: " + (Math.floor(totalPoints)));
        
        
    
    }
    
}
