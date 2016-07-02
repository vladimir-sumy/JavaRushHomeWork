package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();

        int iA = Integer.parseInt(a);
        int iB = Integer.parseInt(b);
        int iC = Integer.parseInt(c);

        if (iA==iB && iB ==iC)
            System.out.println(iA + " " + iB +" " + iC);
        else if (iA==iB)
            System.out.println(iA + " " + iB);
        else if (iA==iC)
            System.out.println(iA + " " + iC);
        else if (iB==iC)
            System.out.println(iB + " " + iC);

    }
}