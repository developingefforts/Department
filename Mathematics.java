
/**
 * Write a description of class Math here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Mathematics extends Department
{
    private String placement;
    private String prediction;
    
    //Mathematics class constructor
    public Mathematics(String name, int totalCourses, String prediction)
    {
        super(name, totalCourses);
        this.prediction = prediction;
    }
    //returns prediction attribute
    public String getPrediction()
    {
        return prediction;
    }
    //returns math placement based on random num from 1-5
    public void placementtest()
    {
        int output = (int)(Math.random() * 5) + 1;
        if(output == 1)
        {
            placement = "Algebra 1";
        }
        
        if(output == 2)
        {
            placement = "Algebra 2";
        }
        
        if(output == 3)
        {
            placement = "Pre-Calc";
        }
        
        if(output == 4)
        {
            placement = "Calc 1";
        }
        
        if(output == 5)
        {
            placement = "Calc 1-2H";
        }
        System.out.println(placement);
        addCourse();
    }
    //returns attributes of Mathematics class
    public String toString()
    {
        return super.toString() + " --> placement: " + placement;
    }
    
}
