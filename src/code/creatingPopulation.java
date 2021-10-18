package code;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class creatingPopulation {


    static ArrayList<ArrayList<Integer>> population() throws InterruptedException {

        System.out.println("\nCreating Population");
        for (int i = 0; i <= 30; i++) {
            System.out.print("=");
            TimeUnit.MILLISECONDS.sleep(50);

        }
        System.out.println();

        ArrayList<ArrayList<Integer>> population = PopulationGenerator();

        for (ArrayList<Integer> p : population) {
            System.out.println(p);
            TimeUnit.MILLISECONDS.sleep(50);

        }

        for (int i = 0; i <= 30; i++) {
            System.out.print("=");
            TimeUnit.MILLISECONDS.sleep(50);

        }


        return population;
    }

    //    TODO: change the constant variable
    static ArrayList<ArrayList<Integer>> PopulationGenerator() {
        ArrayList<ArrayList<Integer>> population = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> Chromosome = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                int rnd = (int) (Math.random() * 10);
                Chromosome.add(rnd);
            }

            population.add(Chromosome);
        }
        return population;
    }
}
