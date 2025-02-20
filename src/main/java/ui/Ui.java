package ui;

public class Ui {
    private static final String LINE = "---------------------------------------------------------";

    public static String sayHello() {
        String firstMessage = LINE + "\nHello! I'm Hong.\nWhat can I do for you?\n" + LINE + "\n";
        return firstMessage;

    }

    public static String sayBye() {
        String exitMessage = LINE + "\n" + "Bye. Hope to see you again soon!\n" + LINE + "\n";
        return exitMessage;
    }

    public static String print(String printString) {
        return printString + "\n";
    }

    public static String printLine() {
        return LINE + "\n";
    }
}
