package code;

import java.util.ArrayList;
import java.util.Random;

public class mutation {


    static ArrayList<ArrayList<Integer>> swapMutation(ArrayList<ArrayList<Integer>> childrens){



        for(int i = 0; i<childrens.size();i++){
            System.out.println(childrens.get(i));
            Random rn = new Random();
            int x= rn.nextInt(10);
            int y = rn.nextInt(10);

            int temp_x = rn.nextInt(10);
            int temp_y = rn.nextInt(10);

            childrens.get(i).set(x,temp_x);
            childrens.get(i).set(y,temp_y);

//            System.out.println(childrens.get(i));
        }


        return childrens;

    }
}
