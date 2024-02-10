package com.godboydamn.common.managers;

import com.godboydamn.common.model.Discipline;
import com.godboydamn.common.model.LabWork;
import com.godboydamn.common.util.Console;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionManager {
    private LinkedList<LabWork> collection = new LinkedList<LabWork>();
    private final DumpManager dumpManager;
    private LocalDateTime lastInitTime;
    private LocalDateTime lastSaveTime;

    public CollectionManager(DumpManager dumpManager) {
        this.lastInitTime = null;
        this.lastSaveTime = null;
        this.dumpManager = dumpManager;

        loadCollection();
    }

    public void validateAll(Console console) {
        Discipline.allDisciplines().values().forEach(discipline -> {
            if (!discipline.validate()) {
                console.printError("Дисциплина с названием="
                + discipline.getName()
                + " имеет невалидные поля");
            }
        });

        (new ArrayList<>(this.getCollection())).forEach(labwork -> {
            if (!labwork.validate()) {
                console.printError("Лабораторная работа с id="
                + labwork.getId()
                + " имеет невалидные поля");
            }
        });
    }

    public LocalDateTime getLastInitTime() {
        return lastInitTime;
    }

    public LocalDateTime getLastSaveTime() {
        return lastSaveTime;
    }

    public LinkedList<LabWork> getCollection() {
        return collection;
    }

    public void addToColection(LabWork element) {
        collection.add(element);
        LabWork.touchNextId();
    }

    public void clearCollection() {
        collection.clear();
    }

    public String collectionType() {
        return collection.getClass().getName();
    }

    public int collectionSize() {
        return collection.size();
    }

    public void loadCollection() {
        collection = (LinkedList<LabWork>) dumpManager.readCollection();
        lastInitTime = LocalDateTime.now();
    }

    public void saveCollection() {
        dumpManager.writeCollection(collection);
        lastSaveTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        if (collection.isEmpty()) {
            return "Коллекция пуста";
        }

        StringBuilder info = new StringBuilder();
        for (LabWork labWork : collection) {
            info.append(labWork);
        }
        return info.toString();
    }

}
