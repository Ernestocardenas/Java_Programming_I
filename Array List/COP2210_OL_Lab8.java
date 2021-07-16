//******************************************************************************
// Imports
//******************************************************************************

import java.util.ArrayList;
import java.util.Random;

//******************************************************************************
// Code
//******************************************************************************

public class COP2210_OL_Lab8 {

    //**********************************************************************
    public static void main(String[] args) {
        
    // creating an Arraylist
    ArrayList<Integer> data = new ArrayList<>();
    
    fillArray(data ,25);
    displayArray(data);
    
    data = reverseOrderOfArray(data);
    displayArray(data);
    
    System.out.println("Average Number = " + findAverage(data) );
    findMax(data);
    System.out.println("Median Number = " + findMedian(data) );
    //code to print the average and median of the array here
    //write your code here to display max
    
    }
    
    //*************************************************************************
    
    public static ArrayList<Integer> fillArray(ArrayList<Integer> array, int size){
        
      Random randomGenerator = new Random();
      
      for(int i=0; i<size; i++){
          
          int randomNumber = randomGenerator.nextInt(1000);
          Integer randomInteger = new Integer(randomNumber);
          
          array.add(randomInteger);
        }//end for
    
        return array;
      
    }
    
    //******************************************************************

    public static void displayArray(ArrayList<Integer> array){
        
        for(Integer i: array){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static ArrayList<Integer> reverseOrderOfArray(ArrayList<Integer> array){
        
        ArrayList<Integer> reversedArray = new ArrayList<>();
        
        for(int i = array.size()-1; i >= 0; i-- ){
            reversedArray.add( array.get(i) );
            displayArray( reversedArray);
        }//end for
        
        return reversedArray;
    }
    
    public static double findAverage(ArrayList<Integer> array){
        double average;
        double total = 0;
        
        for(int i=0; i < array.size(); i++){
            total = total + array.get(i);
        }//end for
        average = total/array.size();
        
        
        return average;
    }// end average
    
    public static double findMedian(ArrayList<Integer> array){
        double median = 0.0;
        int med;
        int medNext;
        
        if((array.size()%2) == 1){
            med = (array.size() / 2);
            median=array.get(med);
        }else{
            med = (array.size() / 2);
            medNext= med +1;
            median=(array.get(med)+array.get(medNext))/2;
        }
         
        return median;
        
    }//end median
    
    public static void findMax(ArrayList<Integer> array){
        int max = 0;
        
        for(int i=0; i < array.size(); i++){
            if(max < array.get(i)){
              max=array.get(i);
            }//end if
        }//end for
        
         System.out.println("Max Number = " + max );
    }//end max
}
