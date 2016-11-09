
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask for speed limit
        System.out.println("Speed limit:");
        int limit = input.nextInt();
        //ask for driver's speed
        System.out.println("Driver's speed:");
        int speed = input.nextInt();
        //determine whether driver is over limit
        if (speed <= limit) {
            System.out.println("Vehicle is within speed limit.");
        }
        //$100 fine
        while (speed - 1 >= limit) {
            System.out.println("Vehicle is over speed limit; $100 fine.");
            break;
        }
         //270$ fine
        while (speed - 21 > limit) {
            System.out.println("Vehicle is over speed limit; $270 fine."); 
            break;
        }
        while (speed - 31 > limit) {
            System.out.println("Vehicle is over speed limit; $500 fine."); 
            break;
        }       
       
               




            

        

    }
}