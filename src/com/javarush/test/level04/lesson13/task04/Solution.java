package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(8);
        }
        System.out.println();
        for (int j = 1; j <= 10; j++)
        {
            System.out.println(8);
//            System.out.print(j);
        }
    }
}
