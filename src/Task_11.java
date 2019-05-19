//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.print("\nВведенная строка: "+str);
    }
}