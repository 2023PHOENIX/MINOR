package code;

import org.w3c.dom.Text;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        ArrayList<Integer> target = targetGenerator.RandomGenerator();
        ArrayList<ArrayList<Integer>> population = creatingPopulation.population();

        FitnessScore ft = new FitnessScore();
        ArrayList<Fitness> f = ft.CalculateFitness(population,target);
        System.out.println();
        for(Fitness x : f){
            System.out.println(x.chromosome + "\t"  + x.matches);
        }


    }
}
