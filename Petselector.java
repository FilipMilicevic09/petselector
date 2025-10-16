import java.util.*;

public class Petselector{
    public static void main (String []args){
        //ask the user for input (name, season and color)
        Scanner input = new Scanner(System.in);
        System.out.println("what is your favorite season?");
        String season = input.nextLine().toLowerCase().trim();
        
        if(!(season.equals("fall")|| season.equals("spring")|| season.equals("winter")|| season.equals("summer"))){
            System.out.println("not a real season, try again");
            return;
        }

        
        System.out.println("what is your favorite color?");
        String color = input.nextLine().toLowerCase().trim();
        
         if(!(color.equals("red")|| color.equals("green")|| color.equals("blue"))){
            System.out.println("not applicable try red, blue, or green");
            return;
        }

        
        System.out.println("what is your Name?");
        String name = input.nextLine().toLowerCase().trim();
        
        //make sure the input is valid (Idiot proof!)
        //make a decision
        //tell the user what they get!
        if(color.equals("blue") && season.equals ("fall"))
        {
            System.out.println("\nYour perfect pet is: Aligator \n");
            return;
        }
}
}
