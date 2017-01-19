
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create array for two numbers
        int[] numbers = new int[2];

        //get two integers from user
        System.out.println("Enter first integer: ");
        numbers[0] = input.nextInt();
        System.out.println("Enter second integer: ");
        numbers[1] = input.nextInt();

        //place number in ascdending order
        if (numbers[0] < numbers[1]) {
            System.out.println("The integers in ascending order are: " + numbers[0] + " " + numbers[1]);
            //else other for other number 
        } else if (numbers[0] > numbers[1]) {
            System.out.println("The integers in ascending order are: " + numbers[0] + " " + numbers[1]);

        }





    }
}
