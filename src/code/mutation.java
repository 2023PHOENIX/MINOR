package code;

import java.util.ArrayList;
import java.util.Random;

class Mutation {
    static Random rn = new Random();

    static ArrayList<ArrayList<Integer>> mutationChoice(ArrayList<ArrayList<Integer>> childrens,ArrayList<Integer> target,int choice){


        if(choice==1){
            return swapMutation(childrens);
        }else if(choice==2){
            return onePointMutation(childrens);
        }else if(choice==3){
            return controlGeneticMutation(childrens,target);
        }else if(choice==4){
            return controlGeneticMutation2(childrens,target);
        }
        else{
            System.out.println("enter valid choice....!!");
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            return  result;
        }
    }
    static ArrayList<ArrayList<Integer>> swapMutation(ArrayList<ArrayList<Integer>> childrens){

        for (ArrayList<Integer> children : childrens) {
//            Random rn = new Random();
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
//            Random rn = new Random();
            int x= rn.nextInt(10);
            int temp_x = rn.nextInt(10);
            childrens.get(i).set(x,temp_x);
        }

        return childrens;
    }

    static ArrayList<ArrayList<Integer>> controlGeneticMutation(ArrayList<ArrayList<Integer>> childrens,ArrayList<Integer> target){
        for(int i= 0; i<childrens.size() ; i++) {

            int X = rn.nextInt(10);
//            for triggering the gene values
            int g_idx_1 = (X + 3) % 10;
            int g_idx_2 = (X + 6) % 10;
            int g_idx_3 = (X + 9) % 10;

            System.out.println("these gene are triggered " + g_idx_1 + " " + g_idx_2 + " " + g_idx_3);
            int gene1 = rn.nextInt(10);
            int gene2 = rn.nextInt(10);
            int gene3 = rn.nextInt(10);

            int new_gene1 = (target.get(g_idx_1) + gene1) / 2;
            int new_gene2 = (target.get(g_idx_2) + gene2) / 2;
            int new_gene3 = (target.get(g_idx_3) + gene3) / 2;
            childrens.get(i).set(g_idx_1, new_gene1);
            childrens.get(i).set(g_idx_2, new_gene2);
            childrens.get(i).set(g_idx_3, new_gene3);
        }
        return childrens;

    }

    static ArrayList<ArrayList<Integer>> controlGeneticMutation2(ArrayList<ArrayList<Integer>> childrens,ArrayList<Integer> target){

        for(int i = 0; i<childrens.size();i++){

            int j = 0;

            while(childrens.get(i).get(j)==target.get(j) && childrens.get(i).get(j+1)==target.get(j+1) && j<childrens.get(i).size()){
                j+=2;
            }
            // getting index
            if(childrens.get(i).get(j) > target.get(j)){
                int newGene = childrens.get(i).get(j)-1;
                childrens.get(i).set(j,newGene);
            }else if(childrens.get(i).get(j) < target.get(j)){
                int  newGene = childrens.get(i).get(j) + 1;
                childrens.get(i).set(j,newGene);
            }

            if(childrens.get(i).get(j+1) > target.get(j+1)){
                int newGene = childrens.get(i).get(j+1)-1;
                childrens.get(i).set(j+1,newGene);
            }else if(childrens.get(i).get(j+1) < target.get(j+1)){
                int  newGene = childrens.get(i).get(j + 1) + 1;
                childrens.get(i).set(j+1,newGene);
            }
        }
        return childrens;
    }
}
