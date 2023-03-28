//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.


public class Seminar2 {
    public static StringBuilder printString(int n, char a, char b) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            str.append(a);
            str.append(b);

        }


        return str;
    }
}
