
/**
 * Write a description of class DepartmentDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DepartmentDriver
{
    //driver for the department class
    public static void main (String []args)
    {
        Mathematics math = new Mathematics("Mathematics", 0, "Algebra 2");
        Humanities humanities = new Humanities("Humanities", 0, false);
        Science science = new Science("Science", 0, 2);
        Language language = new Language("Language", 3, 3);
        
        math.placementtest();
        humanities.addElective();
        science.applyASEP();
        language.applySYA();
        
        System.out.println(math);
        System.out.println(humanities);
        System.out.println(science);
        System.out.println(language);
    }
}
