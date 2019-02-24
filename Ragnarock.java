import java.io.*;
import java.util.*;


public class Ragnarock{
    public static void main(String[] args) {
        Novice novice = new Novice();
        Scanner input = new Scanner(System.in);
        int choose;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Wellcome to Game");
        System.out.print("Enter your name : ");
		novice.setCharecter();
        while (true){
            System.out.println("===================================");
            System.out.println("What You want to do?");
            System.out.println("1) Info     2) Bag");
            System.out.println("3) Monster  4) Shop");
            System.out.println("5) Disconnect");
            System.out.println("===================================");
            System.out.printf("You want to do : ");
            choose = input.nextInt();
            if (choose == 5){
                System.out.println("");
                System.out.println("See you again.");
                System.out.println("");
                break;
            }
            else if (choose == 4){
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                novice.shop.shopInfo(novice);
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
            }
            else if (choose == 3){
                System.out.println("\n\n\n");
                if(novice.downHP() == 0){
                    while(true){
                        System.out.printf("You want to change to : ");
                        choose = input.nextInt();
                        if(choose == 1){
                            Warrier warrier = new Warrier(novice);
                            novice = warrier;
                            break;
                        }
                        else if(choose == 2){
                            Thief thief = new Thief(novice);
                            novice = thief;
                            break;
                        }
                        else{
                            System.out.println("");
                            System.out.println("Don't have command.");
                            System.out.println("");
                        }
                    }
                    
                }
            }
            else if (choose == 2){
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                novice.bag.info(novice);
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
            }
            else if (choose == 1){
                System.out.println("\n");
                novice.infoC();
            }
            else{
                System.out.println("");
                System.out.println("Don't have command.");
                System.out.println("");
            }
            if (novice.checkStatus() == 0){
                System.out.println("You Dead.");
                break;
            }
        }  
    }
}