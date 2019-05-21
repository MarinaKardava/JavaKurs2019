//Необходимо написать программу для сортировки данных массива по возрастанию.
//       Использовать пузырьковый метод сортировки.

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = in1.nextInt();
        int arr[] = new int[n];
        Scanner in = new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            System.out.println("Введите чисо "+i+": ");
            arr [i] = in.nextInt();
        }
        System.out.print("Введенный массив: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nОтсортированный массив: ");
        for (int i =arr.length-1; i>=0; i--) {
            for (int j = 0; j < i; j++){
                if (arr[j]< arr[j+1])
                {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=a;

                }
            }
            System.out.print(arr[i]+" ");

        }

    }
}