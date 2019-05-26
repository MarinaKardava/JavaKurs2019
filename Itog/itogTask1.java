//Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран.
// Необходимо использовать циклы, нельзя использования готовые методы языка Java,
// для перевода числа из одной системы счисления в другую.

import java.util.*;

public class itogTask1 {
    public static void main(String[] args) {
        int sum = 0, a;
        char c;
        System.out.print("Введите число в бинарном формате: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length()-1-i);

            if (c == '1' || c == '0')
            {
                if (c == '1') a = 1;
                else a = 0;
            }
            else {
                System.out.println("Неверное число");
                break;
            }
            sum += (a * Math.pow(2,i));
        }

        System.out.println(str + " -> " + sum);

    }
}
