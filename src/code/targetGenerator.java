package code;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class targetGenerator {
    public
    static ArrayList<Integer> RandomGenerator() throws InterruptedException{
        ArrayList<Integer> target = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {

            int x = (int) (Math.random() * 10);
            target.add(x);
        }

        display(target);
        return target;
    }

    static void display(ArrayList<Integer> target) throws InterruptedException {

        System.out.println("🄳🄴🅂🄸🅁🄴🄳 🅃🅁🄰🄸🅃🅂.");
        for(int x : target){
            System.out.print(x + "\t");
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }
}
