import java.io.*;
import java.util.*;

public class Charecter{

    private int hp;
    private int maxhp;
    private int exp;
    private int maxexp;
    private int level;
    private String name;
    private int status;
    public int coin;
    Bag bag = new Bag();
    Item item = new Item();
    Shop shop = new Shop();

    public void setCharecter(){
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        maxhp = 100;
        hp = 100;
        level = 1;
        exp = 0;
        maxexp = 8;
        status = 1;
        coin = 100;
        item.potion = 5;
        item.scoll =  0;
        item.superpotion = 1;
    }

    public void infoC(){
        System.out.println("===================================");
        System.out.println("Name  : " + name);
        System.out.println("Lavel : " + level);
        System.out.println("HP    : " + hp + "/" + maxhp);
        System.out.println("EXP   : " + exp + "/" + maxexp);
        System.out.println("COIN   : " + coin);
    }
    
    public void downHP(){
        hp = hp - (level * 15);
        exp = exp + (level * 5);
        coin = coin + 10;
        if (hp <= 0){
            status = 0;
        }
        else{
            System.out.println("===================================");
            System.out.println("HP    : " + hp + "/" + maxhp);
            System.out.println("EXP   : " + exp + "/" + maxexp);
            System.out.println("COIN   : " + coin);
        }
        if (exp >= maxexp){
            level = level + 1;
            maxexp = maxexp + (level * 100 / 5 );
            exp = 0;
            maxhp = maxhp + (level * 100);
            hp = maxhp;
            System.out.println("\n\n\n");
            System.out.println("Level up!!!");
            System.out.println("===================================");
            System.out.println("Lavel : " + level);
            System.out.println("HP    : " + hp + "/" + maxhp);
            System.out.println("EXP   : " + exp + "/" + maxexp);
        }
    }

    public int healing(int heal){
        hp = hp + heal;
        if(hp >= maxhp){
            System.out.println("===================================");
            System.out.println("Your Hp Full");
            System.out.println("===================================");
            return 0;
        }
        else{
            System.out.println("===================================");
            System.out.println("HP    : " + hp + "/" + maxhp);
            System.out.println("===================================");
            return 1;
        }
    }

    public int checkStatus(){
        if (status == 0){
            System.out.println("You Dead.");
            return 0;
        }
        else{
            return 1;
        }
    }
}