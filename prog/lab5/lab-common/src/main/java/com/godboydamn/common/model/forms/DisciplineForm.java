package com.godboydamn.common.model.forms;

import com.godboydamn.common.exceptions.IncorrectInputInScriptException;
import com.godboydamn.common.exceptions.InvalidFormException;
import com.godboydamn.common.exceptions.MustNotBeEmptyException;
import com.godboydamn.common.model.Discipline;
import com.godboydamn.common.util.Console;
import com.godboydamn.common.util.Dialogist;

import java.util.NoSuchElementException;

public class DisciplineForm extends Form<Discipline> {
    private final Console console;

    public DisciplineForm(Console console) {
        this.console = console;
    }

    @Override
    public Discipline build() throws IncorrectInputInScriptException, InvalidFormException {
        Discipline discipline = new Discipline(askName(), askLectureHours());
        if (!discipline.validate()) {
            throw new InvalidFormException();
        }
        return discipline;
    }

    public String askName() throws IncorrectInputInScriptException {
        String name;
        boolean fileMode = Dialogist.fileMode();
        while (true) {
            try {
                console.println("Введите название дисциплины");
                console.ps2();

                name = Dialogist.getUserScanner().nextLine().trim();
                if (fileMode) {
                    console.println(name);
                }
                if (name.equals("")) {
                    throw new MustNotBeEmptyException();
                }
                break;
            } catch (NoSuchElementException exception) {
                console.printError("Название дисциплины не распознано");
                if (fileMode) {
                    throw new IncorrectInputInScriptException();
                }
            } catch (MustNotBeEmptyException exception) {
                console.printError("Название дисциплины не может быть пустым");
                if (fileMode) {
                    throw new IncorrectInputInScriptException();
                }
            } catch (IllegalStateException exception) {
                console.printError("Непредвиденная ошибка");
                System.exit(0);
            }
        }
        return name;
    }

    public Long askLectureHours() throws IncorrectInputInScriptException {
        Long lectureHours;
        boolean fileMode = Dialogist.fileMode();
        while (true) {
            try { console.println("Введите количество лекционных часов");
            console.ps2();

            String strLectureHours = Dialogist.getUserScanner().nextLine().trim();
            if (fileMode) {
                console.println(strLectureHours);
            }
            lectureHours = Long.parseLong(strLectureHours);
            break;
        } catch (NoSuchElementException exception) {
                console.printError("Количество лекционных часов не распознано");
                if (fileMode) {
                    throw new IncorrectInputInScriptException();
                }
            } catch (NullPointerException exception) {
                console.printError("Количество лекционных часов не может быть null");
                if (fileMode) {
                    throw new IncorrectInputInScriptException();
                }
            } catch (IllegalStateException exception) {
                console.printError("Непредвиденная ошибка");
                System.exit(0);
            }
    }
        return lectureHours;
    }

}
