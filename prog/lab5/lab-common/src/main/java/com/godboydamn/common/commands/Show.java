package com.godboydamn.common.commands;

import com.godboydamn.common.managers.CollectionManager;
import com.godboydamn.common.util.Console;

public class Show extends Command {
    private final Console console;
    private final CollectionManager collectionManager;

    public Show(Console console, CollectionManager collectionManager) {
        super("show", "вывести все элементы коллекции");
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

            console.println(collectionManager);
            return true;
    }
}
