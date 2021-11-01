package code;

import java.util.ArrayList;
import java.util.Random;

public class Breeding {

    //    creating child
    static ArrayList<ArrayList<Integer>> childcreate(ArrayList<Fitness> parent) {

        ArrayList<ArrayList<Integer>> children = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Fitness p1 = Selection.randomSelection(parent);
            Fitness p2 = Selection.randomSelection(parent);

//            System.out.println("parent\t" + p1.chromosome);
//            System.out.println("parent\t" + p2.chromosome);
//            System.out.print("children->");
            children.add(MultiPointCrossOver(p1, p2));
        }

        return children;
    }

    static ArrayList<Integer> OnePointCrossOver(Fitness f1, Fitness f2) {
        ArrayList<Integer> child = new ArrayList<>();

        for (int i = 0; i < f1.chromosome.size(); i++) {
            if (i < f1.chromosome.size() / 2) {
                child.add(f1.chromosome.get(i));

            } else {
                child.add(f2.chromosome.get(i));
            }
        }
        System.out.println(child);
        return child;
    }

    static ArrayList<Integer> MultiPointCrossOver(Fitness p1, Fitness p2) {
        ArrayList<Integer> child = new ArrayList<Integer>();
        int a = (int) (Math.random() * 2);
        int b = (int) (Math.random() * 8);

        int L_Limit = Math.min(a, b);
        int R_Limit = Math.max(a, b);

        for (int i = 0; i < p1.chromosome.size(); i++) {
            if (L_Limit <= i && i <= R_Limit) {
                child.add(p1.chromosome.get(i));
            } else {
                child.add(p2.chromosome.get(i));
            }
        }
//        System.out.println(child);

        return child;
    }

    static ArrayList<Integer> UniformCrossOver(Fitness p1,Fitness p2){
        ArrayList<Integer> child = new ArrayList<>();

        for(int i = 0; i<p1.chromosome.size();i++){
            Random rn = new Random();
            Boolean Toss = rn.nextBoolean();


            if(Toss){
                child.add(p1.chromosome.get(i));
            }else{
                child.add(p2.chromosome.get(i));
            }
        }

//        System.out.println(child);

        return child;
    }

}
