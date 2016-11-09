
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask user for numbers
        System.out.println("Enter 4 different numbers on 4 different lines.");
        //user enters numbers
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int fourth = input.nextInt();
        //display users entered numbers
        System.out.println(first + ", " + second + ", " + third + ", and " + fourth + " were your numbers.");


    }
}
