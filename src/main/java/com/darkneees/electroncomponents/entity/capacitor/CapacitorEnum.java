package com.darkneees.electroncomponents.entity.capacitor;

public enum CapacitorEnum {
    NUMBER("№"),
    NAME("Наименование"),
    CAPACITOR_VALUE("Номинал"),
    VOLTAGE("Напряжение"),
    PACKAGE_FRAME("Типоразмер"),
    AMOUNT("Количество"),
    NOTE("Примечание"),
    BOX("Секция");

    private String title;
    CapacitorEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
