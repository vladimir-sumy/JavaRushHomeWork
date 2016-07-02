package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String first = bufferedReader.readLine();
        String second = bufferedReader.readLine();

        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);

        if (a>b) {
            System.out.println(b);
        }
        else
            System.out.println(a);

    }
}