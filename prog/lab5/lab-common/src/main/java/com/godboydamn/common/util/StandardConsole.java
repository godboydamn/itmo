package com.godboydamn.common.util;

public class StandardConsole implements Console {
    private static final String PS1 = "$ ";
    private static final String PS2 = "> ";

    public void print(Object o) {
        System.out.println(o);
    }

    public void println(Object o) {
        System.out.println(o);
    }

    public void printError(Object o) {
        System.out.println("ошибка: "
        + o);
    }

    public void printTable(Object elementLeft, Object elementRight) {
        System.out.printf(" %-35s%-1s%n", elementLeft, elementRight);
    }

    public void ps1() {
        print(PS1);
    }

    public void ps2() {
        print(PS2);
    }

    public String getPS1() {
        return PS1;
    }

    public String getPS2() {
        return PS2;
    }

}
