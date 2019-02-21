import java.io.*;
import java.util.*;

public class Shop{

    private int choose;
    private int notEnoughMoney = 0; 

    public void shopInfo(Charecter charecter){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("SHOP");
            System.out.println("===================================");
            System.out.println("1) Potion : 30 Coin");
            System.out.println("2) Superpotoin : 100 Coin");
            System.out.println("3) Scoll : 500 Coin");
            System.out.println("===================================");
            System.out.printf("You want to buy(Press 0 to Back) : ");
            choose = input.nextInt();
            if(choose == 1){
                if(charecter.coin >= 30){
                    charecter.coin = charecter.coin - 30;
                    charecter.item.potion = charecter.item.potion + 1;
                    System.out.println("\n\n\n\n\n\n\n\n");
                    System.out.println("Buy compele");
                    System.out.println("===================================");
                    System.out.println("Potion : " + charecter.item.potion);
                    System.out.println("COIN   : " + charecter.coin);
                    System.out.println("===================================");
                }
                else{
                    notEnoughMoney = 1;
                }
            }
            else if(choose == 2){
                if(charecter.coin >= 100){
                    charecter.coin = charecter.coin - 100;
                    charecter.item.superpotion = charecter.item.superpotion + 1;
                    System.out.println("\n\n\n\n\n\n\n\n");
                    System.out.println("Buy compele");
                    System.out.println("===================================");
                    System.out.println("Superpotion : " + charecter.item.superpotion);
                    System.out.println("COIN   : " + charecter.coin);
                    System.out.println("===================================");
                }
                else{
                    notEnoughMoney = 1;
                }
            }
            else if(choose == 3){
                if(charecter.coin >= 500){
                    charecter.coin = charecter.coin - 500;
                    charecter.item.scoll = charecter.item.scoll + 1;
                    System.out.println("\n\n\n\n\n\n\n\n");
                    System.out.println("Buy compele");
                    System.out.println("===================================");
                    System.out.println("Scoll : " + charecter.item.scoll);
                    System.out.println("COIN   : " + charecter.coin);
                    System.out.println("===================================");
                }
                else{
                    notEnoughMoney = 1;
                }
            }
            else{
                System.out.println("");
                System.out.println("Don't have command.");
                System.out.println("");
            }
            if (notEnoughMoney == 1){
                System.out.println("\n\n\n\n\n\n\n\n");
                System.out.println("Not enough money!!!!");
                System.out.println();
            }
        }while(choose != 0); 
    }
}