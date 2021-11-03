package code;

import org.w3c.dom.Text;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> target = targetGenerator.RandomGenerator();
        ArrayList<ArrayList<Integer>> population = creatingPopulation.population();


        System.out.println("calculating fitness for random population");


        for(int x = 0; x<10;x++) {


            System.out.println("\nChoose your Breeding process");
            System.out.println("1. One point CrossOver");
            System.out.println("2. Multi Point CrossOver");
            System.out.println("3. Uniform CrossOver");
            int breeding = sc.nextInt();
            System.out.println("Enter your mutation process");
            System.out.println("1. onePointMutation");
            System.out.println("2. swapMutation");
            int mutation = sc.nextInt();

            int generation = 0;
            ArrayList<ArrayList<Integer>> p = population;
            while (true) {
                ArrayList<Fitness> parentFitness = FitnessScore.CalculateFitness(p, target);


                if (parentFitness.get(0).matches == target.size()) {
                    System.out.println("get the desired output");
                    System.out.println(generation);
                    break;
                }


                ArrayList<ArrayList<Integer>> children = Breeding.childcreate(parentFitness, breeding);
                p = Mutation.mutationChoice(children, mutation);

                generation++;
                if (generation > 1000) {
                    System.out.println(generation);
                    System.out.println("Unable to get desired result");
                    break;
                }
            }
        }





    }
}
