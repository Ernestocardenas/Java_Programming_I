//******************************************************************************
//IMPORTS
//******************************************************************************

import java.util.ArrayList;
import java.util.Random;

//******************************************************************************
//Code
//******************************************************************************

public class PA2 {

    
    public static void main(String[] args) {
        
       /*ArrayList<Integer> data = createRandomArray(1)**/
        ArrayList<Integer> unsortedList = new ArrayList<>();
        ArrayList<Integer> sortedList = new ArrayList<>();
        
        
        /*Loop up to 25*/
        for(int i=1;i<=25;i++){
            /* call method , joinArray*/
            System.out.print("Unsorted Size: " + i + " -> " );
           joinArrays(sortedList,unsortedList); 
           /*call method , sortArray*/ 
           System.out.print(" Sorted Size: " + i + " -> " );
            sortArray(sortedList);
            /*call method , average*/
            System.out.printf("  Average Number: %.3f\n ",average(sortedList));
            /*call method , median*/
            System.out.printf("   Median Number: %.3f\n ",median(sortedList));
            System.out.println(" ");
        }
            
       
    }
    /*The method generates a list of the random numbers in a range
   * of 0 to 100 for given size */
    public static ArrayList<Integer> createRandomArray(int size){
        
         ArrayList<Integer> array = new ArrayList<>(size);
         Random randomGenerator = new Random();
            for (int i = 0; i<size;i++){
            int randomNumber = randomGenerator.nextInt(1000);
            Integer randomInteger = randomNumber;
            
             array.add(randomInteger);
            }
        
        return array;                
    }
    /* The method sorts Array moving findMax to end of list*/
    public static void sortArray(ArrayList<Integer> array){
        
         int sorting=0;
         int max;
         
         int n=1;
        
        for(int i=0; i < array.size(); i++){
            max=0;
            
             for(int j=0;j < array.size()-i ;j++){
            
                if(max < array.get(j)){
                    max=array.get(j);
                    sorting=j;
                }else if(j==(array.size()-n)){
                    
                    array.set(sorting,array.get(j));
                    array.set(j,max);
                    n=n+1;
                    
                }
                
              }//end for
        }
        array.forEach((i) -> {
            System.out.print(i + " ");
        });
        
        System.out.println(" ");
    }
       
    public static void joinArrays(ArrayList<Integer> destArray, ArrayList<Integer> sourceArray){
        
        int element=0; 
      sourceArray = createRandomArray(1);
      destArray.add(sourceArray.get(element));
         
      destArray.forEach((i) -> {
          System.out.print(i + " ");
          //System.out.print("Unsorted Size: "+ destArray.size() + " " + i );
        }); //end for
        System.out.println(" ");
    }
    /*The method average that takes an array list
   * as argument and find the average of the array list*/
    public static double average(ArrayList<Integer> array){
        
        double average;
        double total = 0;
        
        for(int i=0; i < array.size(); i++){
            total = total + array.get(i);
        }//end for
        average = total/array.size();
        
        
        return average;
        
    }

    public static double median(ArrayList<Integer> array){
        
        double median;
        int med;
        int medNext;
        
        if((array.size()%2) == 1){
            med = (array.size() / 2);
            median=array.get(med);
        }else{
            med = (array.size() / 2);
            medNext= med - 1;
            median=(array.get(med)+array.get(medNext))/2;
           // middle = (sets.get(sets.size()/2) + sets.get(sets.size()/2 - 1))/2;
        }
         
        return median;
    }
} // end of the class
