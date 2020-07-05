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

import java.util.Scanner;


public class Martin_Bradd_Exam_P3 {
    
    public static double powerProblem(int base, int exponent) {
        
        if(exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            
            return base * powerProblem(base, exponent - 1);
            
        } else {
            
            return 1/ powerProblem(base, - exponent);
            
        }
        
        
    }
    
    public static void main(String[] args){
        
        
        
      Scanner input = new Scanner(System.in);
        
      System.out.println("Please enter the base value: ");
      int numValue = input.nextInt();
      
      System.out.println("Please enter the exponent value: ");
      int raiseToPower = input.nextInt();
        
      double result =   powerProblem(numValue, raiseToPower);
      
      System.out.println(result);
        
        
        
        
    }
    
    
    
    
    
    
}
