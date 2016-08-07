package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stalloned", new Date("April 1 1980"));
        map.put("Stallones", new Date("DECEMBER 1 1980"));
        map.put("Stallonea", new Date("JUNE 1 1980"));
        map.put("Stallonew", new Date("JUNE 1 1980"));
        map.put("Stalloner", new Date("JUNE 1 1980"));
        map.put("Stalloneg", new Date("JUNE 1 1980"));
        map.put("Stalloneb", new Date("JUNE 1 1980"));
        map.put("Stallonec", new Date("JUNE 1 1980"));
        map.put("Stallonex", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String,Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if(rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }
    }
}
