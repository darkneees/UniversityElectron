package com.darkneees.electroncomponents.entity;

import java.util.HashMap;

public class ComponentMap {

    public static HashMap<String, String> map = new HashMap<>();

    static {
        map.put("id", "№");
        map.put("name", "Наименование");
        map.put("amount", "Количество");
        map.put("note", "Примечание");
        map.put("box", "Секция");
        map.put("value", "Номинал");
        map.put("package", "Типоразмер");
        map.put("voltage", "Напряжение");
        map.put("current", "Ток");
        map.put("forward_voltage", "Прямое напряжение");
        map.put("back_voltage", "Обратное напряжение");
        map.put("channel", "Тип канала");
        map.put("type", "Тип объекта");
    }

}
