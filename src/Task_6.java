//Написать программу, которая будет выполнять следующие действия:
//
//1. Ввод трех чисел с клавиатуры X,Y,Z
//
//2. Нахождение и вывод на экран среднего арифметического чисел X,Y,Z
//
//3. Деление среднего арифметического на 2 без остатка
//
//4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
import java.util.*;
public class Task_6 {

    public static void main(String[] args) {
        System.out.println("Введите чисо X: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Введите чисо Y: ");
        Scanner in2 = new Scanner(System.in);
        int y = in.nextInt();
        System.out.println("Введите чисо Z: ");
        Scanner in3 = new Scanner(System.in);
        int z = in.nextInt();
        int avg;
        avg = (x+y+z)/3;
        System.out.println("Среднее арифметическое числел (" + x +" + "+y+" + "+z+") = " + avg);
        if ((avg/2) > 3) System.out.println("Программа выполнена корректно");
    }
}