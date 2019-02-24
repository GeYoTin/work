import java.io.*;
import java.util.*;

public class Bag{

    private int choose;

    public void info(Novice novice){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("BAG");
            System.out.println("===================================");
            System.out.println("1) Potion : " + novice.item.potion);
            System.out.println("2) Superpotion : " + novice.item.superpotion);
            System.out.println("3) Scoll : " + novice.item.scoll);
            System.out.println("===================================");
            System.out.println("Use item press item number(Press 0 to Back)");
            System.out.print("Input : ");
            choose = input.nextInt();
            if(choose == 1){
                System.out.println("\n\n\n\n\n\n\n\n");
                novice.item.usePotion(novice);  
            }
            else if(choose == 2){
                System.out.println("\n\n\n\n\n\n\n\n");
                novice.item.useSuperPotion(novice);
            }
            else if(choose == 3){
                System.out.println("\n\n\n\n\n\n\n\n");
                novice.item.useScoll(novice);
            }
            else{
                System.out.println("");
                System.out.println("Don't have command.");
                System.out.println("");
            }
        }while(choose != 0);
        
    }
}