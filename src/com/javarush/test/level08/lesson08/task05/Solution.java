package com.javarush.test.level08.lesson08.task05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Лысакq", "Владимир");
        hashMap.put("Лысакw", "Владимирв");
        hashMap.put("Лысакe", "Владимиру");
        hashMap.put("Лысакr", "Владимирц");
        hashMap.put("Лысакt", "Владимир");
        hashMap.put("Лысакy", "Владимир");
        hashMap.put("Лысакu", "Владимир");
        hashMap.put("Лысакa", "Владимир");
        hashMap.put("Лысакs", "Владимир");
        hashMap.put("Лысакx", "Владимир");

        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String value : copy.values())
            if (Collections.frequency(copy.values(), value) > 1)
                removeItemFromMapByValue(map, value);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
