import java.util.Scanner;

/**
 * Write a description of class gradeevaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gradeevaluator
{
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        int grade= input.nextInt();
        
        String isValid= (grade >= 40)? "pass" : "fail";
        System.out.println(isValid);
}
}