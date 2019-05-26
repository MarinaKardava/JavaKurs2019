//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Пользователь программы должен, задавать размер массива и наполнять его числами.

import java.util.Scanner;

public class itogTask2 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: " );
        n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите чисо " + i + ": ");
            arr[i] = in.nextInt();
        }
        System.out.print("Введенный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nОтсортированный массив: ");
        for (int i =n-1; i>=0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;

                }
            }
            System.out.print(arr[i] + " ");
        }

    }
}
