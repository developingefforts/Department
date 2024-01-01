
/**
 * Write a description of class Humanities here.
 *
 * @author (Yeneisy Morocho)
 * @version (April 15 2023)
 */
import java.util.Random;
public class Humanities extends Department
{
    private boolean fifthform; 
    
    //constructor for Humanities department
    public Humanities(String name, int totalCourses, boolean fifthform)
    {
        super(name, totalCourses);
        this.fifthform = fifthform;
    }
    //returns fifthform attribute
    public boolean getfifthform()
    {
        return fifthform;
    }
    //adds humanities elective is random boolean is true
    public void addElective()
    {
        Random rand = new Random();
        boolean approved = rand.nextBoolean();
        if(approved == false)
        {
            System.out.println("Sorry! Electives are competitive for underformers.");
        }
        else
        {
            System.out.println("Congrats! Add your hum elective.");
            addCourse();
        }
    }
    //returns attributes of Humanities class
    public String toString()
    {
        return super.toString() + " --> fifthform: " + fifthform;
    }
}
