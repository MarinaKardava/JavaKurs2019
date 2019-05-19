//Произведите ввод данных с клавиатуры в матрицу, а после этого
// произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                System.out.println("Введите чисо " + i+j + ": ");
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Введенная матрица: ");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Первая строка *3: ");
        for (int j=0; j<3; j++){
            int c= arr[0][j]*3;
            System.out.print(c+" ");
        }

    }
}
