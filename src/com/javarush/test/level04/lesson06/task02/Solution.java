package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String i1 = bufferedReader.readLine();
        String i2 = bufferedReader.readLine();
        String i3 = bufferedReader.readLine();
        String i4 = bufferedReader.readLine();

        int a = Integer.parseInt(i1);
        int b = Integer.parseInt(i2);
        int c = Integer.parseInt(i3);
        int d = Integer.parseInt(i4);

        int ab,cd;

        if (a>b)
            ab=a;
        else
            ab=b;
        if (c>d)
            cd = c;
        else
            cd = d;
        if (ab>cd)
            System.out.println(ab);
        else
            System.out.println(cd);
    }
}
