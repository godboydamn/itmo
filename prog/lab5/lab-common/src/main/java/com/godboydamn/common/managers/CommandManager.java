package com.godboydamn.common.managers;

import com.godboydamn.common.commands.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandManager {
    private final Map<String, Command> commands = new HashMap<>();
    private final List<String> commandHistory = new ArrayList<>();

    public void register(String commandName, Command command) {
        commands.put(commandName, command);
    }

    public Map<String, Command> getCommands() {
        return commands;
    }

    public List<String> getCommandHistory() {
        return commandHistory;
    }

    public void addToHistor(String command) {
        commandHistory.add(command);
    }

}
