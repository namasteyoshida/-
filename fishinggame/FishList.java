package enshuA6;

import java.util.Random;

public class FishList {
    private Fish[] fishes ={
    new Fish("本マグロ", 130),
    new Fish("カンパチ", 90),
    new Fish("サーモン", 80),
    new Fish("アジ", 70),
    new Fish("さば", 55),
    new Fish("イカ", 25),
    new Fish("あさり", 15),
    new Fish("海藻", 4),
    new Fish("小銭", 1),
    new Fish("ゴミ", -30)
    };
    public Fish getRandomFish(){
        Random rand = new Random();
        int index = rand.nextInt(fishes.length);

        return fishes[index];
    }

}
