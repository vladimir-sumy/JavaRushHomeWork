package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandfather1 = new Human("Kent", true, 88, null, null );
        Human grandfather2 = new Human("Kent2",true, 85, null, null);

        Human grandmother1 = new Human("Babka1", false, 82, null, null);
        Human grandmother2 = new Human("Babka2", false, 84, null, null);

        Human father = new Human("Papa", true, 45, grandfather1, grandmother1);
        Human mother = new Human("Mamam", false, 43, grandfather2, grandmother2);
        Human children1 = new Human("Detka1",true, 24, father, mother );
        Human children2 = new Human("Detka2",true, 21, father, mother );
        Human children3 = new Human("Detka3",true, 22, father, mother );

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());

        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, Boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
