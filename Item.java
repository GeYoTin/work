import java.io.*;
import java.util.*;

public class Item{
    public int potion;
    public int scoll;
    public int superpotion;

    public void usePotion(Novice novice){
        if (potion != 0){
            if (novice.healing(20) == 1){
                    potion = potion - 1;
            } 
        }
        else{
            System.out.println("===================================");
            System.out.println("You don't have potion");
            System.out.println("===================================");
        }
    }

    public void useSuperPotion(Novice novice){
        if (superpotion != 0){
            if (novice.healing(100) == 1){
                superpotion = superpotion - 1;
            } 
        }
        else{
            System.out.println("===================================");
            System.out.println("You don't have Superpotion");
            System.out.println("===================================");
        }
    }

    public void useScoll(Novice novice){
        if (scoll != 0){
            scoll = scoll - 1;
        }
        else{
            System.out.println("===================================");
            System.out.println("You don't have Scoll");
            System.out.println("===================================");
        }
    }
}