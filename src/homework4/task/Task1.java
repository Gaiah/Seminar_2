// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёт «перевёрнутый» список.

package homework4.task;

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    public static void reverseList() {
        LinkedList<Integer> ll = createList();

        System.out.println("Reversed using Collections.reverse() method");
        Collections.reverse(ll);
        System.out.println(ll);
    }

    public static void reverseListWithFor() {
        LinkedList<Integer> ll = createList();
        LinkedList<Integer> ll1 = new LinkedList<>();

        for (int i = ll.size() - 1; i >= 0; i--) {
            ll1.add(ll.get(i));
        }
        System.out.println("Reversed by using 'for' cycle");
        System.out.println(ll);
        System.out.println(ll1);
    }



    public static LinkedList<Integer> createList() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(2);
        ll.add(6);
        ll.add(1);
        System.out.println(ll);

        return ll;
    }
}
