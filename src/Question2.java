
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask user for distance for conversion
        System.out.println("Convert inches to centimetres:");
        int inches = input.nextInt();
        //convert inches to centimetres
        double cm = (inches * 2.54);
        //tell the user
        System.out.println(inches + " inches is " + cm + " centimetres.");
    }
}
