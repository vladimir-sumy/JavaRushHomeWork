package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String denNedeli = bufferedReader.readLine();
        int iDenNedeli = Integer.parseInt(denNedeli);
        if (iDenNedeli==1)
            System.out.println("понедельник");
        else if (iDenNedeli==2)
            System.out.println("вторник");
        else if (iDenNedeli==3)
            System.out.println("среда");
        else if (iDenNedeli==4)
            System.out.println("четверг");
        else if (iDenNedeli==5)
            System.out.println("пятница");
        else if (iDenNedeli==6)
            System.out.println("суббота");
        else if (iDenNedeli==7)
            System.out.println("воскресение");
        else
            System.out.println("такого дня недели не существует");
    }

}