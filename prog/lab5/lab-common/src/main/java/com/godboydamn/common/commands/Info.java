package com.godboydamn.common.commands;

import com.godboydamn.common.managers.CollectionManager;
import com.godboydamn.common.util.Console;

import java.time.LocalDateTime;

public class Info extends Command {
    private final Console console;
    private final CollectionManager collectionManager;

    public Info(Console console, CollectionManager collectionManager) {
        super("info", "вывести информацию о коллекции");
        this.console = console;
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean apply(String[] arguments) {
        if (!arguments[1].isEmpty()) {
            console.println("Использование: '"
                    + getName()
                    + "'");
            return false;
        }

        LocalDateTime lastInitTime = collectionManager.getLastInitTime();
        String lastInitTimeString = (lastInitTime == null) ? "в данной сессии инициализации еще не происходило"
                : lastInitTime.toLocalDate().toString()
                        + " "
                        + lastInitTime.toLocalTime().toString();

        LocalDateTime lastSaveTime = collectionManager.getLastSaveTime();
        String lastSaveTimeString = (lastSaveTime == null) ? "в данной сессии сохранения еще не происходило"
                : lastSaveTime.toLocalDate().toString()
                        + " "
                        + lastSaveTime.toLocalTime().toString();

        console.println("Сведения о коллекции:");
        console.println(" Тип: "
        + collectionManager.collectionType());
        console.println(" Количество элементов: "
        + collectionManager.collectionSize());
        console.println(" Дата последнего сохранения: "
        + lastSaveTimeString);
        console.println(" Дата последней инициализации: "
        + lastInitTimeString);
        return true;

    }
}
