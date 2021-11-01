package code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Selection {




    static Fitness RouletteWheel(ArrayList<Fitness> parent) {

        int sum_of_fitness = 0;

        for (Fitness F : parent) {
            sum_of_fitness += F.matches;
        }


        Random rand = new Random();
        int RandomFitnessScore = rand.nextInt(sum_of_fitness - 0);
        int idx = 0;
        while (RandomFitnessScore < sum_of_fitness) {


            RandomFitnessScore += parent.get(idx).matches;
            idx++;

            idx = idx % parent.size();
        }

        return parent.get(idx);
    }

    static Fitness TournamentSelection(ArrayList<Fitness> parent) {
        Random rand = new Random();

        //  TODO: taking 3 random parent


        ArrayList<Fitness> randomParent = new ArrayList<>();

        for(int i = 0; i<3;i++){

            int r = rand.nextInt(parent.size());
            randomParent.add(parent.get(r));
        }

        Fitness f = randomParent.get(0);

        for(int i = 0; i<randomParent.size();i++){
            if(randomParent.get(i).matches > f.matches){
                f = randomParent.get(i);
            }
        }

        return f;

    }

    static Fitness randomSelection(ArrayList<Fitness> parent){
        Random rand = new Random();

        int idx = rand.nextInt(parent.size() / 2);

        return parent.get(idx);
    }


}
