package com.javarush.test.level04.lesson13.task02;

import java.io.*;
import java.util.Scanner;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String chislo1 = bufferedReader.readLine();
        String chislo2 = bufferedReader.readLine();

        int m = Integer.parseInt(chislo1);
        int n = Integer.parseInt(chislo2);

        for (int i = 1; i<=m;i++) {
        for (int j = 1; j<=n;j++) {
            System.out.print(8);
        }
            System.out.println();
        }


    }
}
