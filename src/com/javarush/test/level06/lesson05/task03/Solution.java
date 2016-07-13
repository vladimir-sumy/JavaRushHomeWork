package com.javarush.test.level06.lesson05.task03;

/* По 50 000 объектов Cat и Dog
Создать в цикле по 50 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Cat[] c = new Cat[50000];
        Dog[] d = new Dog[50000];
        int i = 0;
        for (i = 0; i < 50000; i++)
        {
            c[i] = new Cat();

            d[i] = new Dog();
            c[i] = null;
            d[i] = null;

        }


    }
}
class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}