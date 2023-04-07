//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package homework3.Task;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void generateIntList() {

        ArrayList<Integer> numList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numList.add(rand.nextInt(20));
        }

        System.out.println(numList);

        for (int j = 0; j < numList.size(); j++) {
            if (numList.get(j) % 2 == 0) {
                numList.remove(j);
            }
        }

        System.out.println(numList);

    }
}
