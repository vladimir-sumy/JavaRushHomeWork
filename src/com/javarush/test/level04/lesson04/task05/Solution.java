package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        //System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int iNumber = Integer.parseInt(number);
        if (iNumber>0)
            iNumber *=2;
        if (iNumber<0)
            iNumber++;
        System.out.println(iNumber);

    }

}