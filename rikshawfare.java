import java.util.Scanner;

/**
 * Write a description of class rikshawfare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rikshawfare
{

    public static void main(String[] args) {

        double baseFare = 20;             // Base fare
        double perKm = 25;                // Per kilometer charge
        double perMinute = 2;             // Per minute charge
        double localDiscount = 0.10;      // 10% discount for locals on long distance
        double nightSurcharge = 0.20;     // 20% surcharge for night travel

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter time (in minutes): ");
        double time = sc.nextDouble();
        System.out.print("Is the customer a local? (yes/no): ");
        String isLocal = sc.next().toLowerCase();
        System.out.print("Is it night-time travel? (yes/no): ");
        String isNight = sc.next().toLowerCase();

     
        double fare = baseFare + (distance * perKm) + (time * perMinute);

   
        fare -= (isLocal.equals("yes") && distance > 10) ? (fare * localDiscount) : 0;

        
        fare += (isNight.equals("yes")) ? (fare * nightSurcharge) : 0;

       
        System.out.println("Total Fare: Rs. " + Math.round(fare));
       

  
    }
}

    
