package com.javarush.test.level09.lesson11.home01;

/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/

import java.io.IOException;

public class Solution {

    public static void main(String[] args) {
        divisionByZero();
    }

    public static void divisionByZero() {

        try
        {
            int resultat;
            int a = 100;
            int b = 0;
            System.out.println(a / b);
        }
        catch(Exception e)
        {

        }

    }
}
