package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
        String b1 = bufferedReader.readLine();
        String c1 = bufferedReader.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);

        int avg = 0;

        if ((a<b) && (b<c)) avg = b;
        if ((b<c) && (c<a)) avg = c;
        if ((c<a) && (a<b)) avg = a;


        System.out.println(avg);
    }

}
