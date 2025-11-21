
/**
 * Write a description of class mathoperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathoperation
{
    int a,b,c,d,e,f; //instance variable
    static int qty; // static variable
    public static void main (String[] args){
    int a=10;
    int b=20;
    //local variable
    
    //airthematic
    int c=a+b;
    int d=a-b;
    int e=a*b;
    int f=a/b;
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
   
    
    //urinary
    int post=a++;
    int pre=++a;
    System.out.println(post);
    System.out.println(pre);
    
    //relational
     System.out.println(a==b);
     System.out.println(a!=b);
     System.out.println(a>b);
     System.out.println(a<b);
     
     
     //logical
     System.out.println((a==10) && (b==20));
     System.out.println((a==10) || (b==20));
     
     
     //ternary
int time = 20;
String greeting = (time < 18) ? "Good day." : "Good evening.";
System.out.println(greeting);
     

    
    // <className> <variable>=new <className>();
    
    mathoperation w1=new mathoperation ();
    
    
}
}
    
