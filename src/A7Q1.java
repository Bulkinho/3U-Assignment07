
import java.util.Scanner;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create an interger array with known values
        int[] myNums = {76, 68, 83};

        //multiply 2 spots together into a variable
        int product = myNums[0] * myNums[1];
        //sets spot 2 equal the product
        myNums[2] = product;

        //create an array to store 3 marks
        double[] marks = new double[3];
        //get the user to fill the array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Please enter in your mark " + (i + 1));
            marks[i] = input.nextDouble();
        }

        //add all the number using a loop
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            //add the number into total
            total = total + marks[i];
        }

        //calculate the average
        double avg = total / marks.length;
        System.out.println("The class average: " + avg);
    }
}
