// Name: Filip Milicevic
// Date : 10/16/25
// This program gives a pet the user may like based on how their name is spelled,
// what season they like, and what color they like (Red, Green, Blue)
import java.util.*;

// Petselector Class gets input for three variables (Season, color, and pet) and decides a pet for them based on the input
public class Petselector{
    
    
    public static void main (String []args){
        //ask the user for input (name, season and color)
        Scanner input = new Scanner(System.in);
    
        System.out.println("What is your favorite season?");
        String season = input.nextLine().toLowerCase().trim();
        
        if(!(season.equals("fall")|| season.equals("spring")|| season.equals("winter")|| season.equals("summer"))){
            System.out.println("not a real season, try again (run again)");
            return;
        }

        
        System.out.println("What is your favorite color?");
        String color = input.nextLine().toLowerCase().trim();
        
         if(!(color.equals("red")|| color.equals("green")|| color.equals("blue"))){
            System.out.println("not applicable try red, blue, or green (run again)");
            return;
        }
        
        System.out.println("What is your Name?");
        String name = input.nextLine().toLowerCase().trim();
        
    
        if(color.equals("blue") && season.equals ("fall"))
        {
            System.out.println("\nYour perfect pet is: Aligator \n");
            return;
        }

        else if (color.equals("blue") && season.equals ("spring"))
        {
            System.out.println("\nYour perfect pet is: Ostrich \n");
            return;
        }

        else if ( color.equals ("blue") && season.equals("winter") && "aeiouAEIOU".indexOf(name.charAt(0)) == -1)
        {
            System.out.println("\nYour perfect pet is: Axolotl \n");
            return;
        }

        else if ( color.equals ("green") && season.equals("winter") && "aeiouAEIOU".indexOf(name.charAt(0)) == -1)
        {
            System.out.println("\nYour perfect pet is: Giraffe \n");
            return;
        }
        else if ( color.equals ("green") && (season.equals("spring")||season.equals("summer")))
        {
            System.out.println("\nYour perfect pet is: Dog \n");
            return;
        }
        else if ( color.equals ("red")  && "aeiouAEIOU".indexOf(name.charAt(0)) == -1)
        {
            System.out.println("\nYour perfect pet is: Panda \n");
            return;
        }
        else if ( color.equals ("red")  && "aeiouAEIOU".indexOf(name.charAt(0)) == 0)
        {
            System.out.println("\nYour perfect pet is: Porcupine \n");
            return;
        }
        else if ( season.equals("summer"))
        {
            System.out.println("\nYour perfect pet is: Pony \n");
            return;
        }
        else
        {
          System.out.println("\nYour perfect pet is: Rock \n");
            return;  
        } 
 

}
}
