/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADVJavaProgramming.newpackage;

/**
 *
 * @author tec435-student
 */
public class InventoryItemHelper {
    
   private String UPC; // instance variable 
   private String Description; // instance variable 
   private double Price; // instance variable
    
   public InventoryItemHelper(String UPC, String Description, double Price)
   {
       this.UPC = UPC; 
       this.Description = Description;
       this.Price = Price; 
   }

   public String getUPC() {
      return UPC; 
   } 
   public double getPrice() {
      return Price; 
   }

   // method that returns the name
   public String getDescription() {
      return Description; 
   } 
    
    
    
    @Override
    public String toString() {
        return String.format("UPC: %s\nDescription: %s\nPrice: $%f", this.UPC, this.Description, this.Price);
    }
    
    
    
    
    
    
    
    
}
