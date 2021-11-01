package code;

import org.w3c.dom.Text;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        ArrayList<Integer> target = targetGenerator.RandomGenerator();


        ArrayList<ArrayList<Integer>> population = creatingPopulation.population();




        int x = 0,cnt = 0;
        for(x = 0; x<10;x++){



        int generation = 0;
        while(true){

            ArrayList<Fitness> parent = FitnessScore.CalculateFitness(population, target);

//            for(Fitness f : parent){
//                System.out.println(f.chromosome  + "\t" + f.matches);
//            }
//        base condition
            if(parent.get(0).matches == target.size()){
                cnt++;
                break;
            }

            ArrayList<ArrayList<Integer>> childrens = Breeding.childcreate(parent);
            population = mutation.swapMutation(childrens);

            generation++;
            if(generation > 10000){
                break;
            }
        }

        }

        System.out.println("get result " + cnt + " out of " + x);
//

//        for(ArrayList<Integer> x : childrens){
//            System.out.println(x);
//        }
//        TODO : ROULETTE Implementation

//        Fitness parent01 = Selection.RouletteWheel(parent);
//        Fitness parent02 = Selection.RouletteWheel(parent);
//        System.out.println();
//        System.out.println(parent01.matches + "\t" + parent01.chromosome);
//        System.out.println(parent02.matches + "\t" + parent02.chromosome);


//        TODO : tournament selection
//        Fitness parent01 = Selection.RouletteWheel(parent);
//        Fitness parent02 = Selection.RouletteWheel(parent);
//        System.out.println();
//        System.out.println(parent01.chromosome + "\t" + parent01.matches);
//        System.out.println(parent02.chromosome + "\t" + parent02.matches);

//         TODO: Random selection
//        Fitness parent01 = Selection.randomSelection(parent);
//        Fitness parent02 = Selection.randomSelection(parent);
//        System.out.println();
//        System.out.println(parent01.chromosome + "\t" + parent01.matches);
//        System.out.println(parent02.chromosome + "\t" + parent02.matches);


    }
}
