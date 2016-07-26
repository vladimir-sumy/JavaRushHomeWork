package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int[] myArray = new int[20];
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = myArray[0];
        int minimum = myArray[0];
        for (int i = 1; i < myArray.length; i++)
        {
            if (myArray[i] > maximum) maximum = myArray[i];
            if (myArray[i] < minimum) minimum = myArray[i];

        }
        System.out.println(maximum);
//        System.out.print(" ");
        System.out.println(minimum);
    }
}
