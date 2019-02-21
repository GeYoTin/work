import java.io.*;
import java.util.*;

public class Bag{

    int choose;

    public void info(Charecter charecter){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("BAG");
            System.out.println("===================================");
            System.out.println("1) Potion : " + charecter.item.potion);
            System.out.println("2) Superpotion : " + charecter.item.superpotion);
            System.out.println("3) Scoll : " + charecter.item.scoll);
            System.out.println("===================================");
            System.out.println("Use item press item number(Press 0 to Back)");
            System.out.print("Input : ");
            choose = input.nextInt();
            if(choose == 1){
                System.out.println("\n\n\n\n\n\n\n\n");
                charecter.item.usePotion(charecter);  
            }
            else if(choose == 2){
                System.out.println("\n\n\n\n\n\n\n\n");
                charecter.item.useSuperPotion(charecter);
            }
            else if(choose == 3){
                System.out.println("\n\n\n\n\n\n\n\n");
                charecter.item.useScoll(charecter);
            }
            else{
                System.out.println("");
                System.out.println("Don't have command.");
                System.out.println("");
            }
        }while(choose != 0);
        
    }
}