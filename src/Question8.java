
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //create player
        int position = 1;
        //welcome player
        System.out.println("Welcome To Snakes & Ladders!");
        //rules
        while (100 != position) {
            System.out.println("Number rolled between 2-12: ");
            int moves = input.nextInt();
            if (moves < 2) {
                System.out.println("You quit!");
                break;
            }
            if (moves > 12) {
                System.out.println("You quit!");
                break;

            }

            //movement
            position = position + moves;
            //create ladders
             if (position == 40) {
                position = 64;
                System.out.println("Way, way, way up!");
            }
            if (position == 9) {
                position = 34;
                System.out.println("Climb!!");
            }
            if (position == 67) {
                position = 86;
                System.out.println("All the way up!");
            }
            //create snakes
            if (position == 54) {
                position = 19;
                System.out.println("You got caught by a snake!");
            }
            if (position == 90) {
                position = 48;
                System.out.println("You've been consumed!");
            }
            if (position == 99) {
                position = 77;
                System.out.println("Hissssss! A snake got you!");
            }
             //victory!
            if (position >= 100) {
                System.out.println("You have moved to block 100! You win!");
                break;
            }
            //inform user on position
            System.out.println("You have moved to block " + position + ".");
           

        }

    }
}
