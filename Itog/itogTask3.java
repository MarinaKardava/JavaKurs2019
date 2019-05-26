//Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей.
// Итоговое значение должно быть округлено до двух знаков после запятой.

import java.math.*;
import java.util.Scanner;

public class itogTask3 {
    public static void main(String[] args) {
        double kurs, rub, dollar;
        double result;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите курс: " );
        kurs = in.nextDouble();
        System.out.println("Введите количество рублей:");
        rub = in.nextDouble();
        dollar = rub*kurs;
        System.out.println(rub + " рублей -> "+String.format("%(.2f", dollar)+" долларов");
    }
}
