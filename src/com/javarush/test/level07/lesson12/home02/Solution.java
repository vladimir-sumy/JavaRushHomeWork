package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            list.add(reader.readLine());
        }

        ArrayList<String> tmpList = new ArrayList<>();

        for (int i = 0; i < m; i++)
        {
            tmpList.add(list.get(i));
        }
        for (int i = 0; i < m; i++)
        {
            list.remove(0);
        }
        for (int i = 0; i < m; i++)
        {
            list.add(tmpList.get(i));
        }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }


    }
}
