package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;
        Boolean isBreak = false;
        while(isBreak==false){
            String newLine = bufferedReader.readLine();
            if (newLine.equals("сумма")){
                System.out.println(summa);

                break;
            } else {
                summa += Integer.parseInt(newLine);
            }
        }
    }
}
