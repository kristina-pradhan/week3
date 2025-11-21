
/**
 * Write a description of class workshop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop
{
    int age; //instance variable
    static int qty; // static variable
    public static void main (String[] args){
    int agr=10; //local variable
    System.out.println(agr);
    
    // <className> <variable>=new <className>();
    
    workshop w1=new workshop();
    
    
    System.out.println(w1.age);
    System.out.println(qty);
}
}