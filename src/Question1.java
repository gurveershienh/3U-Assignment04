
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask user for name
        System.out.println("What's your name?");
        String name = input.nextLine();
        //greet user
        System.out.println(name + ", what a lovely name!");
    }
}
