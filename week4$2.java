
/**
 * Write a description of class week4$2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4$2
{
    public static void main(String[] args){
        int num=15;
        if(num%3 ==0)
        {
            if(num%5 ==0)
            {
                System.out.println("divisible by both 3 and 5");
            }
            else
            {
                System.out.println("divisible by 3 but not by 5");
            }
        }
        else 
        {
            System.out.println("not divisible by 5");
        }
    }
}