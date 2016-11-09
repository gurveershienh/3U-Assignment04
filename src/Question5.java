
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask for user name
        System.out.println("What's your name?");
        String name = input.nextLine();
        //ask for tests scores
        //test 1
        System.out.println("What was the first test out of? ");
        double test1 = input.nextDouble();
        System.out.println("Your score? ");
        double score1 = input.nextDouble();
        //calculate test 1 percentage
        double percent1 = score1 / test1 * 100;
        //test 2
        System.out.println("What was the second test out of? ");
        double test2 = input.nextDouble();
        System.out.println("Your score? ");
        double score2 = input.nextDouble();
        //calculate test 1 percentage
        double percent2 = score2 / test2 * 100;
        //test 3
        System.out.println("What was the third test out of? ");
        double test3 = input.nextDouble();
        System.out.println("Your score? ");
        double score3 = input.nextDouble();
        //calculate test 3 percentage
        double percent3 = score3 / test3 * 100;
        //test 4
        System.out.println("What was the fourth test out of? ");
        double test4 = input.nextDouble();
        System.out.println("Your score? ");
        double score4 = input.nextDouble();
        //test 4 percentage
        double percent4 = (score4 / test4) * 100;
        //output test percentages
        System.out.println("Your percentages on the tests were " + percent1 + ", " + percent2 + ", " + percent3 + ", " + percent4 + ".");
        //calculate overall average
        double average = (percent1 + percent2 + percent3 + percent4) / 4;
        //output overall averages
        System.out.println("Your overall average is " + average + ".");

    }
}
