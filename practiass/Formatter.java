
/**
 * Write a description of class Formatter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formatter
{
    public static void main(String[]args)
    {
        Formatter f = new Formatter();
        int num = 12;
        float fnum = 11.3f;
        double dnum = 17.3;
        System.out.println(String.format("%d",num));
        System.out.println(fnum);
        System.out.println(dnum);
    }
}
