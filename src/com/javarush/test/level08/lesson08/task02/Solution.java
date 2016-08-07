package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/


public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();

        //заносим 20 чисел
        for (int i = 0; i < 20; i++) set.add(i);
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //вызываем итератор
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            //если значение больше 10, то удаляем и переходим к следующему
            if (iterator.next() > 10) iterator.remove();
        }


        return set;
    }

}