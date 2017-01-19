
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many marks would you like to put in the array? ");
        int a = input.nextInt();
        //creating integer array
        int[] mark = new int[a];
        int b = a;
        while (b > 0) {
            b = b - 1;
            mark[b] = input.nextInt();

        }
        //find biggest number in array
        boolean c = false;
        int x = 0;
        int y = 0;
        while (c == false);
        c = true;
        b = 10;
//while loop if value is bigger
        while (b > 1) {
            b = b - 1;
            //check in array
            if (mark[b] > mark[b - 1]) {
                x = mark[b];
                y = mark[b - 1];
                mark[b] = y;
                mark[b - 1] = x;
                c = false;

            }
        }
        //show user output
        System.out.println("The marks in order from lowest to highest are: ");
        b = 10;
        while (b > 0) {
            b = b - 1;
            System.out.println(mark[b]);
        }
    }
}
