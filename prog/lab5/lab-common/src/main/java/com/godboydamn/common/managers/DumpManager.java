package com.godboydamn.common.managers;

import com.godboydamn.common.model.LabWork;
import com.godboydamn.common.model.LabWorkListWrapper;
import com.godboydamn.common.util.Console;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.LinkedList;

public class DumpManager {
    private final JAXBContext jaxbContext;
    private final String fileName;
    private final Console console;

    public DumpManager(String fileName, Console console) throws JAXBException {
        this.fileName = fileName;
        this.console = console;
        this.jaxbContext = JAXBContext.newInstance(LabWorkListWrapper.class);
    }

    public void writeCollection(LinkedList<LabWork> collection) {
        LabWorkListWrapper wrapper = new LabWorkListWrapper(collection);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(wrapper, writer);
            console.println("Коллекция успешно сохранена в файл!");
        } catch (IOException | JAXBException exception) {
            console.printError("Загрузочный файл не может быть открыт или записан!");
        }
    }

    public LinkedList<LabWork> readCollection() {
        if (fileName != null && !fileName.isEmpty()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                LabWorkListWrapper wrapper = (LabWorkListWrapper) unmarshaller.unmarshal(reader);
                return wrapper.getLabWorks();
            } catch (FileNotFoundException exception) {
                console.printError("Загрузочный файл не найден!");
            } catch (JAXBException exception) {
                console.printError("Ошибка JAXB при чтении файла: " + exception.getMessage());
                exception.printStackTrace();
            } catch (IOException exception) {
                console.printError("Ошибка при чтении файла!");
            }
        } else {
            console.printError("Аргумент командной строки с загрузочным файлом не найден!");
        }
        return new LinkedList<>();
    }
}
