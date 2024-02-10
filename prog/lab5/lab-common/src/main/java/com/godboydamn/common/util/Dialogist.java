package com.godboydamn.common.util;

import java.util.Scanner;

public final class Dialogist {
    private static Scanner userScanner;
    private static boolean fileMode = false;

    // Приватный конструктор, чтобы скрыть создание экземпляра утилиты
    private Dialogist() {
        throw new IllegalStateException("Utility class");
    }

    public static Scanner getUserScanner() {
        return userScanner;
    }

    public static void setUserScanner(Scanner userScanner) {
        Dialogist.userScanner = userScanner;
    }

    public static boolean fileMode() {
        return fileMode;
    }

    public static void setUserMode() {
        Dialogist.fileMode = false;
    }

    public static void setFileMode() {
        Dialogist.fileMode = true;
    }
}
