//*******************************************************************************
//Import
//*******************************************************************************
import java.util.Comparator;

//*******************************************************************************
//Code
//*******************************************************************************
public class DirectoryComparator implements Comparator<String> {
   
    @Override
    public int compare(String dir1, String dir2)
    {
        int intOfDir1;    
        int intOfDir2;      
        
        //holds directory name
        String charOfDir1;
        String charOfDir2;
        
        //calls a method to get directory name
        charOfDir1 = getCharOfDir(dir1);  
        charOfDir2 = getCharOfDir(dir2);
        
        //calls a method to get the numbers of directory name
        intOfDir1 = getIntOfDir(dir1);
        intOfDir2 = getIntOfDir(dir2);
        
        //if directories are the same...
        if(charOfDir1.equalsIgnoreCase(charOfDir2))
        {
           
           return intOfDir1 - intOfDir2;
        }
        
        
        return dir1.compareToIgnoreCase(dir2);
    }
    /**
     * A method that gets the characters of a directory name
     * @param dir a directory name
     * @return the characters of that directory
     */
    public String getCharOfDir(String dir)
    {
        //removes all integers
        String charPart = dir.replaceAll("\\d", "");
              
        //Return the character part
        return charPart;
    }
    /**
     * A method that gets the integers of a directory name
     * @param dir a directory name
     * @return the integers of that directory
     */
    public int getIntOfDir(String dir)
    {
        // removes all characters
        String intPart = dir.replaceAll("\\D", "");
              
        //Directory name does not contain integers
        if(intPart.length() == 0)
        {
            
            return 0;
        }
        else
        {
            //Return converted to an integer 
            return Integer.parseInt(intPart);
        }              
    }
}
