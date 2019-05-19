//Произведите ввод данных с клавиатуры в массив, а после этого произведите
// вывод массива на экран, где каждый элемент массива умножается на 2.

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            System.out.println("Введите чисо "+i+": ");
            arr [i] = in.nextInt();
        }
        System.out.print("Введенный массив: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nПолученный массив: ");
        for (int i=0; i<arr.length; i++){
            int c= arr[i]*2;
            System.out.print(c+" ");
        }
    }
}
