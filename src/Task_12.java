//Для введенной с клавиатуры строки необходимо провести отсев пробелов.
//
// Результат в виде строки без пробелов вывести на экран.

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(str.replaceAll("\\s",""));

    }
}
