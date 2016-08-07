package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human rebenok1 = new Human("Вася", true, 9, new ArrayList<Human>() );
        Human rebenok2 = new Human("Лена", false, 10, new ArrayList<Human>() );
        Human rebenok3 = new Human("Данила", true, 8, new ArrayList<Human>() );

        ArrayList<Human> children = new ArrayList<>();
        children.add(rebenok1);
        children.add(rebenok2);
        children.add(rebenok3);

        Human papa = new Human("Тима", true, 28, children);
        Human mama = new Human("Наташа", false, 25, children);


        ArrayList<Human> dochka = new ArrayList<>();
        dochka.add(mama);
        ArrayList<Human> syn = new ArrayList<>();
        syn.add(papa);

        Human ded1 = new Human("Федор", true, 99, dochka);
        Human babka1 = new Human("Аня", false, 95, dochka);

        Human ded2 = new Human("Тимофей", true, 95, syn);
        Human babka2 = new Human("Ганна", false, 93, syn);


        System.out.println(rebenok1.toString());
        System.out.println(rebenok2.toString());
        System.out.println(rebenok3.toString());

        System.out.println(mama.toString());
        System.out.println(papa.toString());

        System.out.println(ded1.toString());
        System.out.println(babka1.toString());

        System.out.println(ded2.toString());
        System.out.println(babka2.toString());

    }

    public static class Human
    {
        //напишите тут ваш код

        private String name;
        private boolean sex;
        private int age;
        private List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, List<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
