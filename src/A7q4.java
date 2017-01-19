
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A7q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ask for 10 marks from user
        System.out.println("Enter in 10 marks: ");

        //10 numbers to be in the array
        int[] sort = new int[10];
        int s = 10;
        //check the numbers in the array
        while (s > 0) {
            s = s - 1;
            sort[s] = input.nextInt();
        }
        //find biggest number in array
        boolean a = false;
        int x = 0;
        int y = 0;
        while (a == false);
        a = true;
        s = 10;
//while loop if value is bigger
        while (s > 1) {
            s = s - 1;
            //check in array
            if (sort[s] > sort[s - 1]) {
                x = sort[s];
                y = sort[s - 1];
                sort[s] = y;
                sort[s - 1] = x;
                a = false;
            }
        }
        System.out.println("The marks in order from lowest to highest are: ");
        s = 10;
        while (s > 0) {
            s = s - 1;
            System.out.println(sort[s]);
        }

    }
}
