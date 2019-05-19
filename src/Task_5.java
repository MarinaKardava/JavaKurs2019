//Необходимо вывести на экран таблицу умножения для введённого пользователем числа. Использовать циклы запрещено.
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите чисо: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i =1;
        System.out.println("Таблица умножения для числа "+a+":");
        System.out.println(a+"*"+i+"="+a*i++);
        System.out.println(a+"*"+i+"="+a*i++);
        System.out.println(a+"*"+i+"="+a*i++);
        System.out.println(a+"*"+i+"="+a*i++);
        System.out.println(a+"*"+i+"="+a*i++);
        System.out.println(a+"*"+i+"="+a*i++);
        System.out.println(a+"*"+i+"="+a*i++);
        System.out.println(a+"*"+i+"="+a*i++);
        System.out.println(a+"*"+i+"="+a*i++);
        System.out.println(a+"*"+i+"="+a*i);
    }
}
