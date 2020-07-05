/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADVJavaProgramming.newpackage;

import java.io.IOException;

/**
 *
 * @author tec435-student
 */
public class Assignment_6_Start {
    public static void main(String[] args) throws IOException{
        Martin_Bradd_Assignment_6_Revised r = new Martin_Bradd_Assignment_6_Revised();
        r.openFile(); 
        r.readFile();
        r.closeFile();
    }
    
}
