package com.darkneees.electroncomponents.entity.resistor;

public enum ResistorEnum {

    NUMBER("№"),
    NAME("Наименование"),
    RESISTOR_VALUE("Номинал"),
    PACKAGE_FRAME("Типоразмер"),
    AMOUNT("Количество"),
    NOTE("Примечание"),
    BOX("Секция");

    private String title;

    ResistorEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
