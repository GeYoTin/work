import java.io.*;
import java.util.*;

public class Item{
    public int potion;
    public int scoll;
    public int superpotion;

    public void usePotion(Charecter charecter){
        if (potion != 0){
            if (charecter.healing(20) == 1){
                    potion = potion - 1;
            } 
        }
        else{
            System.out.println("===================================");
            System.out.println("You don't have potion");
            System.out.println("===================================");
        }
    }

    public void useSuperPotion(Charecter charecter){
        if (superpotion != 0){
            if (charecter.healing(100) == 1){
                superpotion = superpotion - 1;
            } 
        }
        else{
            System.out.println("===================================");
            System.out.println("You don't have Superpotion");
            System.out.println("===================================");
        }
    }

    public void useScoll(Charecter charecter){
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