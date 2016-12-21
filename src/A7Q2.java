
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int length = 0;
        int height;
        
        //get number of people being measured for the array
        System.out.println("How many students being measured: ");
        int a = input.nextInt();
        int b[] = new int[a];
        
        //ask for height of students
        System.out.println("Enter the heights of the students: ");
        for(int i = 0; i < a ; i++)
        {
            b[i] = input.nextInt();
            length = length + b[i];
            
        }
        //find students abover average height
        height = length/a;
        
        System.out.println("Average height of the group is: " + height);
        if(length > height){
            System.out.println("These stduents are above average height");
  
        }
        
                
    }
    
   
    
    
}
