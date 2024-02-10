package com.godboydamn.common.model;

import com.godboydamn.common.util.Validatable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Discipline implements Validatable {
    private static transient Map<Integer, Discipline> disciplines = new HashMap<>();

    @XmlElement
    private final String name;

    @XmlElement
    private final Long lectureHours;

    // Обязательный конструктор по умолчанию для JAXB
    public Discipline() {
        this.name = null;
        this.lectureHours = null;
    }

    public Discipline(String name, Long lectureHours) {
        this.name = name;
        this.lectureHours = lectureHours;
    }

    public String getName() {
        return name;
    }

    public Long getLectureHours() {
        return lectureHours;
    }

    public static Map<Integer, Discipline> allDisciplines() {
        return disciplines;
    }

    @Override
    public boolean validate() {
        if (name == null || name.isEmpty()) {
            return false;
        }
        return (lectureHours != null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Discipline discipline = (Discipline) o;
        return Objects.equals(name, discipline.name) && Objects.equals(lectureHours, discipline.lectureHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lectureHours);
    }

    @Override
    public String toString() {
        return name;
    }
}
