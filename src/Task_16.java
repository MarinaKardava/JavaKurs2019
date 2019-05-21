//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

import java.io.*;

public class Task_16 {
    public static void main(String[] args) {
        String text ;
        try(BufferedReader f=new BufferedReader(new FileReader("C://Users//user//Documents//notes.txt"))) {

            while ((text = f.readLine())!=null)
            {
                System.out.println(text);
            }
        }
        catch(IOException ex){

            System.out.println("Ошибка чтения");
        }
    }
}