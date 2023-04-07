// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

package homework3.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void minMax() {

        ArrayList<Integer> intList = new ArrayList<>();
        Random rand = new Random();

        double sum = 0;

        for (int i = 0; i < 5; i++) {
            intList.add(rand.nextInt(30));
            sum += intList.get(i);
        }
        double arithmeticMean = sum / intList.size();

        System.out.println(intList);
        System.out.println("\n" + "Min number is: " + Collections.min(intList) + "\n" + "Arithmetic mean is: " +
                arithmeticMean + "\n" + "Max number is: " + Collections.max(intList));

    }
}
