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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Martin_Bradd_Assignment_6_Revised {
    
        
    
    
        //write file code!
        /*
	public static void main(String[] args) throws IOException {


		File file = new File("C:\\Users\\tec435-student\\Documents\\csc151el\\src\\week7\\tacoFile.txt");
		Scanner scan = new Scanner(file);

		String fileContent = "";
		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}

		FileWriter writer = new FileWriter("C:\\Users\\tec435-student\\Documents\\csc151el\\src\\week7\\tacoFile.txt");
		writer.write(fileContent);
		writer.close();
	}
        */
        
        private Scanner x;
        
        public void openFile(){
            try{
                x = new Scanner(new File("B:\\Documents\\NetBeansProjects\\Martin_Bradd_Variable_declaration_and_simple_input_and_output\\src\\main\\java\\ADVJavaProgramming\\newpackage\\tacoFile.txt"));
            }
            catch(FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(null,"File not found!");
            }
        }
        
       public void readFile() throws IOException
       {
           while(x.hasNext()) {
               String a = x.next();
               
               System.out.printf("%s", a);
               
               
                a = a.replace(" ", "");
		
		String reverse = "";
		for(int i = a.length() - 1; i >= 0; i--) {
			reverse += a.charAt(i);
			System.out.println(reverse);
		}
		
		boolean palindrome = true;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
                    
			String b = "Palindrome!";
                        try (FileWriter writer = new FileWriter("B:\\Documents\\NetBeansProjects\\Martin_Bradd_Variable_declaration_and_simple_input_and_output\\src\\main\\java\\ADVJavaProgramming\\newpackage\\tacoFile.txt")) {
                       writer.write(b);
                   }
		} else {
                        String c = "Not a palindrome!";
                   try (FileWriter writer = new FileWriter("B:\\Documents\\NetBeansProjects\\Martin_Bradd_Variable_declaration_and_simple_input_and_output\\src\\main\\java\\ADVJavaProgramming\\newpackage\\tacoFile.txt")) {
                       writer.write(c);
                   }
		}   
           }
           
           
           
           
           
       }
       
       public void closeFile(){
           x.close();
       }
       
}