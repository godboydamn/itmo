package com.godboydamn.common.model.forms;

import com.godboydamn.common.exceptions.IncorrectInputInScriptException;
import com.godboydamn.common.model.Difficulty;
import com.godboydamn.common.util.Console;
import com.godboydamn.common.util.Dialogist;

import java.util.NoSuchElementException;

public class DifficultyForm extends Form<Difficulty> {
    private final Console console;

    public DifficultyForm(Console console) {
        this.console = console;
    }

    @Override
    public Difficulty build() throws IncorrectInputInScriptException {
        boolean fileMode = Dialogist.fileMode();

        String strDifficulty;
        Difficulty difficulty;
        while (true) {
            try {
                console.println("Список сложностей - "
                + Difficulty.names());
                console.println("Введите сложность: ");
                console.ps2();

                strDifficulty = Dialogist.getUserScanner().nextLine().trim();
                if (fileMode) {
                    console.println(strDifficulty);
                }

                difficulty = Difficulty.valueOf(strDifficulty.toUpperCase());
                break;
            } catch (NoSuchElementException exception) {
                console.printError("Сложность не распознана");
                if (fileMode) {
                    throw new IncorrectInputInScriptException();
                }
            } catch (IllegalArgumentException exception) {
                console.printError("Сложности нет в списке");
                if (fileMode) {
                    throw new IncorrectInputInScriptException();
                }
            } catch (IllegalStateException exception) {
                console.printError("Непредвиденная ошибка");
                System.exit(0);
            }
        }

        return difficulty;
    }

}
