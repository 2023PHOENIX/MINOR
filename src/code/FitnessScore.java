package code;

import java.util.ArrayList;
import java.util.Objects;

class Fitness {
    public
    ArrayList<Integer> chromosome;
    int matches;

    Fitness(ArrayList<Integer> chromosome, int matches) {
        this.chromosome = chromosome;
        this.matches = matches;
    }
}
public class FitnessScore {
// TODO: convert it into constant

    public
    static ArrayList<Fitness> CalculateFitness(ArrayList<ArrayList<Integer>> population, ArrayList<Integer> target){

        ArrayList<Fitness> ft = new ArrayList<Fitness>();

        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> chromosome = population.get(i);

            int Matches = 0;
            for (int j = 0; j < 10; j++) {
                if (target.get(j).equals(chromosome.get(j))) {
                    Matches = Matches + 1;
                }
            }
            Fitness f = new Fitness(chromosome, Matches);


            ft.add(f);
        }
        return ft;
    }

}
