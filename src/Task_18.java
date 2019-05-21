//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
// а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
// Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

import java.io.*;

public class Task_18 {
    public static void main(String[] args) {
        String text_f;
        String text_w;
        BufferedReader fw = new BufferedReader(new InputStreamReader(System.in));

        try(BufferedReader f=new BufferedReader(new FileReader("C://Users//user//Documents//notes.txt"))            )
           {
               int lineNumber = 0; //Флаг для подсчёта количества строк в файле
            while ((text_f = f.readLine())!=null)
            {
                System.out.println(text_f);
                lineNumber++; // подсчёт кол-ва строк в файле
            }

            System.out.println("Количество строк = " + lineNumber+". Введите текст");
            try(FileWriter w = new FileWriter("C://Users//user//Documents//notes.txt")){
                int flag = 0; // флаг для подсчёта количества введенных слов
               do {
                   if (lineNumber == 0) break;
                   text_w = fw.readLine();

                   text_w = text_w + "\r\n";
                   w.write(text_w);
                   flag++;//подсчет кол-ва ввдененных строк
               }
               while (flag != lineNumber);
           }
        }

        catch(IOException ex){

            System.out.println("Ошибка чтения");
        }
    }
}