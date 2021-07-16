import java.util.Scanner;


/**
 *
 * 
 * 
 */
public class Seconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int seconds;
        int minutes;
        int hours;
        
        System.out.print("Enter the number of seconds: ");
        seconds = input.nextInt();
            
            // Equations
        hours = seconds / 3600;
        minutes = (seconds%3600)/60;
        int seconds2 = (seconds% 3600)%60;
        
        System.out.print('\n');
        System.out.println(seconds + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds2 + " seconds");
        System.out.print('\n');
        
                
       
        //
    }
    
}
