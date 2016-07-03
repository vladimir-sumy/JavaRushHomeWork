package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String slovo = bufferedReader.readLine();
        String chislo = bufferedReader.readLine();

        int i = Integer.parseInt(chislo);

        int counter = 1;

        while (counter <=i) {
            System.out.println(slovo);
            counter++;
        }
    }
}
