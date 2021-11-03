package code;

import java.util.ArrayList;
import java.util.Random;

class Mutation {

    static ArrayList<ArrayList<Integer>> mutationChoice(ArrayList<ArrayList<Integer>> childrens,int choice){


        if(choice==1){
            return swapMutation(childrens);
        }else if(choice==2){
            return onePointMutation(childrens);
        }else{
            System.out.println("enter valid choice....!!");
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            return  result;
        }
    }
    static ArrayList<ArrayList<Integer>> swapMutation(ArrayList<ArrayList<Integer>> childrens){

        for (ArrayList<Integer> children : childrens) {
            Random rn = new Random();
            int x = rn.nextInt(10);
            int y = rn.nextInt(10);

            int temp_x = rn.nextInt(10);
            int temp_y = rn.nextInt(10);

            children.set(x, temp_x);
            children.set(y, temp_y);

        }


        return childrens;

    }

    static ArrayList<ArrayList<Integer>> onePointMutation(ArrayList<ArrayList<Integer>> childrens){


        for(int i = 0; i<childrens.size();i++){

//            System.out.println(childrens.get(i));
            Random rn = new Random();
            int x= rn.nextInt(10);
            int temp_x = rn.nextInt(10);
            childrens.get(i).set(x,temp_x);
        }

        return childrens;
    }
}
