import java.util.Scanner;

public class CarShopping
{
    private static Scanner in = new Scanner (System.in);
    
    static int totalCost = 0;
    
    public static void main (String[] args)
    {
        
        totalCost += base ();
        totalCost += automaticWindows ();
        totalCost += keylessEntry();
        totalCost += onStarSystem();
        totalCost += antiLockBrakes();
        totalCost += telescopingWheel();
        totalCost += sunroof();
        totalCost += weatherPack();
        totalCost += navigation();   
       
    }

    public static int base()
    {
        System.out.println("Our inventory:");
        System.out.println("Model 1 - $15,000");
        System.out.println("Model 2 - $24,000");
        System.out.println("Model 3 - $40,000");
        System.out.println("Which base model did the customer choose? " + "(enter full model name)");
        String model = in.nextLine();
        if(model.equalsIgnoreCase("Model 1"))
            return 15000;
        else if(model.equalsIgnoreCase("Model 2"))
            return 24000;
        else if(model.equalsIgnoreCase("Model 3"))
            return 40000;
        else{
            System.out.println("Invalid entry. Please try again.");
            return 0;
            // I attempted to include do/while statements to restart the selection, but couldn't figure it out. May add in later.
        }

    }
    public static int automaticWindows()
    {
        System.out.println("Automatic Windows for $500? (y/n)");
        String windows = in.nextLine();
        if (windows.equalsIgnoreCase("y"))
            return 500;
        else return 0;
        
    }

public static int keylessEntry()
{
    System.out.println("Remote keyless entry for $1,000? (y/n)");
    String keyless = in.nextLine();
    if (keyless.equalsIgnoreCase("y"))
        return 1000;
    else return 0;
    
}
    
public static int onStarSystem()
{
    System.out.println("OnStar System for $1,000? (y/n)");
    String onStar = in.nextLine();
    if (onStar.equalsIgnoreCase("y"))
        return 1000;
    else return 0;
    
}

public static int antiLockBrakes()
{
    System.out.println("Anti-lock brakes for $500? (y/n)");
    String abs = in.nextLine();
    if (abs.equalsIgnoreCase("y"))
        return 500;
    else return 0;
    
}

public static int telescopingWheel()
{
    System.out.println("Telescoping steering wheel for $1,000? (y/n)");
    String telescoping = in.nextLine();
    if (telescoping.equalsIgnoreCase("y"))
        return 1000;
    else return 0;
    
}

public static int sunroof()
{
    System.out.println("Sunroof for $800? (y/n)");
    String roof = in.nextLine();
    if (roof.equalsIgnoreCase("y"))
        return 800;
    else return 0;
    
}

public static int weatherPack()
{
    System.out.println("Cold weather package (includes heated seats, windshield heater) for $1,500? (y/n)");
    String cold = in.nextLine();
    if (cold.equalsIgnoreCase("y"))
        return 1000;
    else return 0;
    
}

public static int navigation()
{
    System.out.println("GPS navigation system for $750? (y/n)");
    String keyless = in.nextLine();
    if (keyless.equalsIgnoreCase("y"))
        return 1000;
    else return 0;


    
}

public static void finalCost ()
{
    System.out.println("Thank you for shopping with us. Your total cost is $" + totalCost);

}


}