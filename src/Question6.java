
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create input for user
        Scanner input = new Scanner(System.in);

        //daytime minutes
        System.out.println("Daytime minutes: ");
        int daytime = input.nextInt();

        //evening minutes
        System.out.println("Evening minutes: ");
        int evening = input.nextInt();

        //weekend minutes
        System.out.println("Weekend minutes: ");
        int weekend = input.nextInt();

        //cost for Plan A
        double daytimeA = (daytime - 100) * 0.25;
        double eveningA = evening * 0.15;
        double weekendA = weekend * 0.20;
        double planA = daytimeA + eveningA + weekendA;
        //cost for plan B
        double daytimeB = (daytime - 250) * 0.45;
        double eveningB = evening * 0.35;
        double weekendB = weekend * 0.25;
        double planB = daytimeB + eveningB + weekendB;
        //which plan costs more?
        if (planA > planB) {
            System.out.println("Plan B is more cheap.");
        }
        if (planA < planB) {
            System.out.println("Plan A is more cheap.");
        }


    }
}
