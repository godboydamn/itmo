package com.godboydamn.common.model;

import com.godboydamn.common.managers.CollectionManager;
import com.godboydamn.common.util.Validatable;
import com.godboydamn.common.util.ZonedDateTimeAdapter;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.ZonedDateTime;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LabWork implements Validatable {
    private static int nextId = 1;

    private final Integer id;
    private float personalQualitiesMinimum;
    private String name;
    private Coordinates coordinates;
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    private ZonedDateTime creationDate;
    private double minimalPoint;
    private String description;
    private Difficulty difficulty;
    private Discipline discipline;

    // Необходим для JAXB
    public LabWork() {
        this.id = nextId++;
    }

    public LabWork(String name, Coordinates coordinates, ZonedDateTime creationDate, double minimalPoint, float personalQualitiesMinimum, String description, Difficulty difficulty, Discipline discipline) {
        this.id = nextId;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.minimalPoint = minimalPoint;
        this.personalQualitiesMinimum = personalQualitiesMinimum;
        this.description = description;
        this.difficulty = difficulty;
        this.discipline =  discipline;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public double getMinimalPoint() {
        return minimalPoint;
    }

    public float getPersonalQualitiesMinimum() {
        return personalQualitiesMinimum;
    }

    public String getDescription() {
        return description;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public static void updateNextId(CollectionManager collectionManager) {
        int maxId = collectionManager
                .getCollection()
                .stream().filter(Objects::nonNull)
                .map(LabWork::getId)
                .mapToInt(Integer::intValue).max().orElse(0);
        nextId = maxId + 1;
    }

    public void update(LabWork labWork) {
        this.name = labWork.name;
        this.description = labWork.description;
        this.difficulty = labWork.difficulty;
        this.discipline = labWork.discipline;
        this.creationDate = labWork.creationDate;
        this.coordinates = labWork.coordinates;
    }

    public static void touchNextId() {
        nextId++;
    }


    @Override
    public boolean validate() {
        if (id <= 0) {
            return false;
        }
        if (name == null || name.isEmpty()) {
            return false;
        }
        if (coordinates == null) {
            return false;
        }
        if (creationDate == null) {
            return false;
        }
        if (minimalPoint <= 0) {
            return false;
        }
        if (personalQualitiesMinimum <= 0) {
            return false;
        }
        if (description.length() > 6503) {
            return false;
        }
        return true;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabWork labWork = (LabWork) o;
        return Objects.equals(id, labWork.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LabWork{"
                + "id="
                + id
                + ", name='"
                + name
                + '\''
                + ", coordinates="
                + coordinates
                + ", creationDate="
                + creationDate
                + ", minimalPoint="
                + minimalPoint
                + ", personalQualitiesMinimum="
                + personalQualitiesMinimum
                + ", description='"
                + description
                + '\''
                + ", difficulty="
                + difficulty
                + ", discipline="
                + discipline
                + '}';
    }
}
