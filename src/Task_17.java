//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
// Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

import java.io.*;

public class Task_17 {
    public static void main(String[] args) {
        System.out.println("Конец ввода - слово 'стоп'");
        String text ;
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        try(FileWriter w = new FileWriter("C://Users//user//Documents//notes.txt")) {

            do {
                text = f.readLine();
                if (text.compareTo("стоп") == 0) break;

                text = text +"\r\n";
                w.write(text);
            }
            while (text.compareTo("стоп")!=0);


        }
        catch(IOException ex){

            System.out.println("Ошибка чтения");
        }
    }
}