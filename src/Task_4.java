//Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите чисо: ");
        Scanner in = new Scanner(System.in);
        String bin = in.nextLine();
        int binNum = Integer.parseInt(bin,2);
        System.out.println(binNum);
    }
}
