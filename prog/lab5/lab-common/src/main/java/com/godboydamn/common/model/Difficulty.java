package com.godboydamn.common.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "difficulty")
@XmlEnum
public enum Difficulty {
    @XmlEnumValue("VERY_EASY")
    VERY_EASY,
    HARD,
    @XmlEnumValue("VERY_HARD")
    VERY_HARD,
    HOPELESS;

    public static String names() {
        StringBuilder nameList = new StringBuilder();
        for (Difficulty difficulty : values()) {
            nameList.append(difficulty.name()).append(", ");
        }
        // Удаляем последнюю запятую и пробел
        if (nameList.length() > 0) {
            nameList.deleteCharAt(nameList.length() - 1); // удалить последний символ (запятую)
            nameList.deleteCharAt(nameList.length() - 1); // удалить предпоследний символ (пробел)
        }
        return nameList.toString();
    }
}
