package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Kot1",10,12,25);
        Cat cat2 = new Cat("Kot2",8,10,19);
        Cat cat3 = new Cat("Kot3",9,9,13);
        if (cat1.fight(cat2))
            System.out.println(cat1.name + " won the " + cat2.name);
        else
            System.out.println(cat1.name + " lost to " + cat2.name);

        if (cat1.fight(cat3))
            System.out.println(cat1.name + " won the " + cat3.name);
        else
            System.out.println(cat1.name + " lost to " + cat3.name);

        if (cat2.fight(cat3))
            System.out.println(cat2.name + " won the " + cat3.name);
        else
            System.out.println(cat2.name + " lost to " + cat3.name);
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
