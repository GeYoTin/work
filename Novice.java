import java.io.*;
import java.util.*;

public class Novice{

    protected int hp;
    protected int maxhp;
    protected int exp;
    protected int maxexp;
    protected int level;
    protected String name;
    protected int status;
    protected String job;
    public int coin;
    Bag bag = new Bag();
    Item item = new Item();
    Shop shop = new Shop();

    public void setCharecter(){
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        job = "Novice"; 
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

    public int getHP(){
        return hp;
    }

    public void setHP(int value){
        hp = hp + value;
    }

    public int getEXP(){
        return exp;
    }

    public void setEXP(int value){
        exp = exp + value;
    }

    public int getLevel(){
        return level;
    }

    public int getMAXHP(){
        return maxhp;
    }

    public int getMAXEXP(){
        return maxexp;
    }

    public String getName(){
        return name;
    }

    public void infoC(){
        System.out.println("===================================");
        System.out.println("Name  : " + name);
        System.out.println("Lavel : " + level);
        System.out.println("Job   : " + job);
        System.out.println("HP    : " + hp + "/" + maxhp);
        System.out.println("EXP   : " + exp + "/" + maxexp);
        System.out.println("COIN  : " + coin);
    }
    
    public int downHP(){
        if(level < 10 || !job.equals("Novice")){
            hp = hp - (level * 15);
            exp = exp + (level * 20);
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
            return 1;
        }
        else{
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("Your can change class");
            System.out.println("===================================");
            System.out.println("1\tWarrier");
            System.out.println("2\tThief");
            System.out.println("===================================");
            return 0;
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