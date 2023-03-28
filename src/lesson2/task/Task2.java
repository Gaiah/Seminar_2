//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет
//        эту строку в простой текстовый файл, обработайте исключения.

package lesson2.task;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void writeInFile() {
        String str = buildString();
//        String str1 = buildString();
//        System.out.println("links:" + str1 == str);
//        System.out.println(("strings: " + str1.equals(str)));
        try(FileWriter in = new FileWriter("text.txt")) {
            in.append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public static String buildString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++){
            builder.append("TEST");

        }

        return builder.toString();
    //    return "TEST".repeat(100); короткая запись
    }


}
