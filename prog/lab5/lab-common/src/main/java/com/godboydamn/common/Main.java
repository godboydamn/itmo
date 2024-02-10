package com.godboydamn.common;

import com.godboydamn.common.commands.Help;
import com.godboydamn.common.commands.Info;
import com.godboydamn.common.commands.Show;
import com.godboydamn.common.managers.CollectionManager;
import com.godboydamn.common.managers.CommandManager;
import com.godboydamn.common.managers.DumpManager;
import com.godboydamn.common.model.LabWork;
import com.godboydamn.common.util.Dialogist;
import com.godboydamn.common.util.Runner;
import com.godboydamn.common.util.StandardConsole;

import javax.xml.bind.JAXBException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StandardConsole console = new StandardConsole();
        Dialogist.setUserScanner(new Scanner(System.in));

        try {

            if (args.length == 0) {
                console.println("Введите имя загружаемого файла как аргумент командной строки");
                System.exit(1);
            }

            // Создание и инициализация DumpManager
            DumpManager dumpManager = new DumpManager(args[0], console);
            CollectionManager collectionManager = new CollectionManager(dumpManager);

            LabWork.updateNextId(collectionManager);
            collectionManager.validateAll(console);

            CommandManager commandManager = new CommandManager();

                    commandManager.register("help", new Help(console, commandManager));
                    commandManager.register("info", new Info(console, collectionManager));
                    commandManager.register("show", new Show(console, collectionManager));

            new Runner(console, commandManager).interactiveMode();
        } catch (JAXBException e) {
            e.printStackTrace();
            // Обработка ошибки инициализации JAXBContext
            console.println("Ошибка при инициализации JAXBContext: " + e.getMessage());
        }
    }
}
