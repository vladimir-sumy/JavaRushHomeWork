package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String chislo1 = bufferedReader.readLine();
        String chislo2 = bufferedReader.readLine();
        String chislo3 = bufferedReader.readLine();

        int a = Integer.parseInt(chislo1);
        int b = Integer.parseInt(chislo2);
        int c = Integer.parseInt(chislo3);

        int i = 0;
        if (a>0)
            i++;
        if (b>0)
            i++;
        if (c>0)
            i++;
        System.out.println(i);
    }
}
