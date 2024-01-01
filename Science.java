
/**
 * Write a description of class Science here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Science extends Department
{
    int guess;
    
    //constructor for the Science class
    public Science(String name, int totalCourses, int guess)
    {
        super(name, totalCourses);
        this.guess = guess;
    }
    //returns attribute guess
    public int getGuess()
    {
        return guess;
    }
    //returns attributes of Science class
    public String toString()
    {
        return super.toString() + " --> guess: " + guess;
    }
    //adds ASEP course if guess is the same as random int generated
    public void applyASEP()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a num from 1-3");
        int output = scan.nextInt();
        if(output == guess)
        {
            System.out.println("You have been accepted for ASEP!");
            addCourse();
        }
        else
        {
            System.out.println("Sorry, you have not been accepted to ASEP");
        }
    }
}
