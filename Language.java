
/**
 * Write a description of class Language here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Language extends Department
{
    private int standing;
    
    //Language class constructor
    public Language(String name, int totalCourses, int standing)
    {
        super(name, totalCourses);
        this.standing = standing;
    }
    //returns standing attribute
    public int getstanding()
    {
        return standing;
    }
    //adds SYA course if standing and random output is greater than 5
    public void applySYA()
    {
        int output = (int)(Math.random() * 5) + 1;
        if(standing + output > 5)
        {
            System.out.println("Congrats! You have been accepted to SYA, add your course.");
            addCourse();
        }
        else
        {
            System.out.println("Sorry! You were not accepted.");
        }
    }
    //returns attributes of Language class
    public String toString()
    {
        return super.toString() + " --> standing " + standing;
    }
    
}
