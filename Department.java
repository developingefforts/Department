
/**
 * Write a description of class Department here.
 *
 * @author (Yeneisy Morocho)
 * @version (April 15 2023)
 */
import java.util.Random;
import java.util.Scanner;
public class Department
{
    private String name;
    private int totalCourses;
    private String input;

    //constructor for Department class
    public Department(String name, int totalCourses)
    {
        this.name = name;
        this.totalCourses = totalCourses;
    }
    //returns name attribute
    public String getName()
    {
        return name;
    }
    //returns totalCourses attribute
    public int gettotalCourses()
    {
        return totalCourses;
    }
    //adds a course to display
    public String addCourse()
    {
        totalCourses++;
        Scanner scan = new Scanner(System.in);
        System.out.println("Name your course: ");
        input = scan.nextLine();
        return input + " --> Course added!";
    }
    //returns attributes of the Department class
    public String toString()
    {
        return name + " Department --> Total Courses: " + totalCourses;
    }
}
