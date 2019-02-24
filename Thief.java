import java.io.*;
import java.util.*;

public class Thief extends Novice{

    public Thief(Novice novice){
        super.job = "Thief";
        super.name = novice.name;
        super.hp = super.maxhp = novice.maxhp;
        super.level = novice.level;
        super.exp = novice.exp;
        super.maxexp = novice.maxexp;
        super.status = novice.status;
        super.coin = novice.coin * 5;
        super.bag = novice.bag;
        super.item = novice.item;
        super.shop = novice.shop;
    }
}