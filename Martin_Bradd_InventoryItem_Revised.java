/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADVJavaProgramming.newpackage;

/**
 *
 * @author Bradd
 */

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Martin_Bradd_InventoryItem_Revised {
    
    
    public static void insertionSort(int[] UPCvalues){
        for ( int next = 1; next < UPCvalues.length; next++) {
            int insert = UPCvalues[next];
            int moveItem = next;
            
            while (moveItem > 0 && UPCvalues[moveItem  -1] > insert) {
                UPCvalues[moveItem] = UPCvalues[moveItem - 1];
                moveItem--;
            }
            
            UPCvalues[moveItem] = insert;
        }
    }
    
    public static int binarySearch(int[] UPCvalues, int UPCSvalue){
        int low = 0;
        int high = UPCvalues.length - 1;
        int middle = (low + high + 1) / 2;
        int location = - 1;
        
        do {
            if (UPCSvalue == UPCvalues[middle]) {
                location = middle;
            }
            else if (UPCSvalue < UPCvalues[middle]) {
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
            
            middle = (low + high + 1) / 2;
        
        } while ((low <= high) && (location == -1));
        return location;
    }
    
    public static int linearSearch(int data[], int searchKey) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == searchKey) {
                return index;
            }
        }
        return -1;
    }
    
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        SecureRandom generator = new SecureRandom();
        
        int[] UPCvalues = new int[5]; //creating array
        for (int i = 0 ; i < UPCvalues.length; i++) {
            UPCvalues[i] = generator.nextInt(999999);
        }
        
        System.out.printf("%s%n%n", Arrays.toString(UPCvalues));
        
        System.out.println("Please enter a UPC ID to search for: ");
        int searchUPC = input.nextInt();
        
        
            int position = linearSearch(UPCvalues, searchUPC);
            
            if (position == -1) {
                System.out.printf("%d was not found%n%n", searchUPC);
            }
            else {
                System.out.printf("%d was found in position %d%n%n", searchUPC, position);
            
        }
            insertionSort(UPCvalues);
            System.out.printf("%n Sorted UPCs: %s%n", Arrays.toString(UPCvalues));
            
        // Now binarySearch
        
        System.out.print("Please enter a UPC ID to search for using the binary: ");
        searchUPC = input.nextInt();
        
        int location = binarySearch(UPCvalues, searchUPC);
        
        if (location == -1){
            System.out.printf("%d was not found%n%n", searchUPC);
        }
        else {
            System.out.printf("%d was found in position %d%n%n", searchUPC, location);
        }
    }
    
    
    
    
}
