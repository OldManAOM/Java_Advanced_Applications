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
public class ExamHelper2 {
    
   private String LicensePlate; // instance variable 
   private String CustomerName; // instance variable 
   private int Days; // instance variable
    
   public ExamHelper2(String LicensePlate, String CustomerName, int Days)
   {
       this.LicensePlate = LicensePlate; 
       this.CustomerName = CustomerName;
       this.Days = Days; 
   }

   public String getLicensePlate() {
      return LicensePlate; 
   } 
   public double getDays() {
      return Days; 
   }

   // method that returns the name
   public String getCustomerName() {
      return CustomerName; 
   } 
    
    
    
    @Override
    public String toString() {
        return String.format("%s\n%s\n%s", this.LicensePlate, this.CustomerName, this.Days);
    }
    
    
    
    
    
    
    
    
}
