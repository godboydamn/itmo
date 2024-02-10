package com.godboydamn.common.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;

@XmlRootElement(name = "labWorks")
public class LabWorkListWrapper {

    private LinkedList<LabWork> labWorks;

    public LabWorkListWrapper() {
        labWorks = new LinkedList<>();
    }

    public LabWorkListWrapper(LinkedList<LabWork> labWorks) {
        this.labWorks = labWorks;
    }

    @XmlElement(name = "labWork")
    public LinkedList<LabWork> getLabWorks() {
        return labWorks;
    }

    public void setLabWorks(LinkedList<LabWork> labWorks) {
        this.labWorks = labWorks;
    }
}
