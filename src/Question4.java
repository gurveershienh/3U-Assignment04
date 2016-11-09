
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask user for costs of prom
        //food cost
        System.out.println("Food costs: ");
        int food = input.nextInt();
        //dj costs
        System.out.println("DJ's price: ");
        int dj = input.nextInt();
        //hall rental costs
        System.out.println("Hall rental cost: ");
        int rental = input.nextInt();
        //decoration cost
        System.out.println("Decoration expenses: ");
        int decoration = input.nextInt();
        //staff costs
        System.out.println("Payment for staff: ");
        int staff = input.nextInt();
        //misc
        System.out.println("Any extra expenses?");
        int misc = input.nextInt();
        //calculate total cost

        int total = food + dj + rental + decoration + staff + misc;
        //tickets needed to break even
        int tickets = total / 35 + 1;

        //tell user tickets needed to break even
        System.out.println("If the total cost is " + total + " then " + tickets + " tickets will need to be sold to break even.");

    }
}
