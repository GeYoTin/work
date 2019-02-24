import java.io.*;
import java.util.*;

public class Warrier extends Novice{
    
    public Warrier(Novice novice){
        super.job = "Warrier";
        super.name = novice.name;
        super.hp = super.maxhp = novice.maxhp * 2;
        super.level = novice.level;
        super.exp = novice.exp;
        super.maxexp = novice.maxexp;
        super.status = novice.status;
        super.coin = novice.coin;
        super.bag = novice.bag;
        super.item = novice.item;
        super.shop = novice.shop;
    }
}