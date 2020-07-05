/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADVJavaProgramming.newpackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tec435-student
 */
public class Martin_Bradd_InventoryItem {
    
    private static void checkBinary(String[] anArray, String toCheckStringBinary) 
    { 
        Arrays.sort(anArray); 

        int res = Arrays.binarySearch(anArray, toCheckStringBinary); 
  
        boolean test = res > 0; 
        
        if(test == true){
            System.out.println(toCheckStringBinary + " is present in the inventory.");
        }
        else if(test == false){
            System.out.println(toCheckStringBinary + " is not present in the inventory.");
        }
    } 
    
    
    
    private static void check(String[] anArray, String toCheckString) 
    { 
        // check if the specified element 
        // is present in the array or not 
        // using Linear Search method 
        boolean test = false; 
        for (String element : anArray) { 
            if (element.equals(toCheckString)) { 
                test = true; 
                
            } 
        }        
        if(test == true){
            System.out.println(toCheckString + " is present in the inventory.");
        }
        else if(test == false){
            System.out.println(toCheckString + " is not present in the inventory.");
        }
  
    } 
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the UPC of the inventory item that you'd like to search for: ");
        String UPC = input.nextLine(); 
        
     // Get the array 
        String anArray[] = {"443543", "3253255", "546546", "211212", "434321"};
  
        // Get the value to be checked 
        String toCheckString = UPC; 
  
        // Print the array 
        for(int x = 0; x < anArray.length; x++){
            System.out.println(anArray[x]);
        }
  
        // Check if this value is 
        // present in the array or not 
        check(anArray, toCheckString);    
        
    
    String Description;
    
    double Price = 0;   
        
        
    
    
    Arrays.sort(anArray);
    for(int i=0;i<=anArray.length-1;i++)
    {
        System.out.println(anArray[i]);
    }
     
    
    System.out.println("Please enter another UPC inventory item that you'd like to search for: ");
    UPC = input.nextLine(); 
  
        String toCheckStringBinary = UPC;  

        checkBinary(anArray, toCheckStringBinary);
        
        
        
} 
    
    
    }
