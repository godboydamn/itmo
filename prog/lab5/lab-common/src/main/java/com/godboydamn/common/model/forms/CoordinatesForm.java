package com.godboydamn.common.model.forms;

import com.godboydamn.common.exceptions.IncorrectInputInScriptException;
import com.godboydamn.common.exceptions.InvalidFormException;
import com.godboydamn.common.model.Coordinates;
import com.godboydamn.common.util.Console;
import com.godboydamn.common.util.Dialogist;

import java.util.NoSuchElementException;

public class CoordinatesForm extends Form<Coordinates> {
    private final Console console;

    public CoordinatesForm(Console console) {
        this.console = console;
    }

    @Override
    public Coordinates build() throws IncorrectInputInScriptException, InvalidFormException {
        Coordinates coordinates = new Coordinates(askX(), askY());
        if (!coordinates.validate()) {
            throw new InvalidFormException();
        }
        return coordinates;
    }

    public Float askX() throws IncorrectInputInScriptException {
        boolean fileMode = Dialogist.fileMode();
        float x;
        while (true) {
            try {
                console.println("Введите координату X: ");
                console.ps2();
                String strX = Dialogist.getUserScanner().nextLine().trim();
                if (fileMode) console.println(strX);

                x = Float.parseFloat(strX);
                break;
            } catch (NoSuchElementException exception) {
                console.printError("Координата X не распознана!");
                if (fileMode) {
                    throw new IncorrectInputInScriptException();
                }
            } catch (NumberFormatException exception) {
                console.printError("Координата X должна быть представлена числом!");
                if (fileMode) {
                    throw new IncorrectInputInScriptException();
                }
            } catch (NullPointerException | IllegalStateException exception) {
                console.printError("Непредвиденная ошибка!");
                System.exit(0);
            }
        }
        return x;
    }

    public Float askY() throws IncorrectInputInScriptException {
        boolean fileMode = Dialogist.fileMode();
        float y;
        while (true) {
            try {
                console.println("Введите координату Y:");
                console.ps2();
                String strY = Dialogist.getUserScanner().nextLine().trim();
                if (fileMode) console.println(strY);

                y = Float.parseFloat(strY);
                break;
            } catch (NoSuchElementException exception) {
                console.printError("Координата Y не распознана!");
                if (fileMode) throw new IncorrectInputInScriptException();
            } catch (NumberFormatException exception) {
                console.printError("Координата Y должна быть представлена числом!");
                if (fileMode) throw new IncorrectInputInScriptException();
            } catch (NullPointerException | IllegalStateException exception) {
                console.printError("Непредвиденная ошибка!");
                System.exit(0);
            }
        }
        return y;
    }
}
