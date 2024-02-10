package com.godboydamn.common.model;

import com.godboydamn.common.util.Validatable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Coordinates implements Validatable {
    private static final float MIN_COORDINATE_VALUE = -175.0f;

    @XmlElement
    private Float x;

    @XmlElement
    private Float y;

    public Coordinates() {
    }

    public Coordinates(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean validate() {
        if (x == null || x < MIN_COORDINATE_VALUE) {
            return false;
        }
        return y != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Coordinates coordinates = (Coordinates) o;
        return Objects.equals(x, coordinates.x) && Objects.equals(y, coordinates.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + (x != null ? x : "null") +  ", " + (y != null ? y : "null") + ")";
    }
}
