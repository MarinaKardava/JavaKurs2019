//Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны
//
// в соответствующие переменные. Вывести на экран строку с наибольшей длинной.

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

        System.out.print("Введите строку 1: ");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        System.out.print("Введите строку 2: ");
        String str2 = in.nextLine();

        int length1 = str1.length();
        int length2 = str2.length();
        System.out.println("Длинна 1-ой строки = "+length1 + "\nДлина 2-ой строки = "+length2);
        if (length1 > length2) System.out.println(str1);
        else if (length1 == length2) System.out.println(str1 +"\n" + str2);
        else System.out.println(str2);

    }
}
