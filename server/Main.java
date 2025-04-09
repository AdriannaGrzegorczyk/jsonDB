package server;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CommandDB commandDB = new CommandDB();


        while (true) {
            String input = scanner.nextLine();
            String[] commands = input.split(" ");
            switch (commands[0]) {
                case "set": {
                    boolean result = commandDB.setCommand(Integer.parseInt(commands[1]), input.substring(5 + commands[1].length()));
                    if (result) {
                        System.out.println("OK");
                    } else {
                        System.out.println("ERROR");
                    }
                    break;
                }
                case "get": {
                    boolean result = commandDB.getCommand(Integer.parseInt(commands[1]));
                    if (result) {
                        System.out.println(commandDB.DB.get(Integer.parseInt(commands[1])));
                    } else {
                        System.out.println("ERROR");
                    }
                    break;
                }

                case "delete": {
                    boolean result = commandDB.deleteCommand(Integer.parseInt(commands[1]));
                    if (result) {
                        commandDB.DB.remove(Integer.parseInt(commands[1]));
                        System.out.println("OK");
                    } else {
                        System.out.println("ERROR");
                    }
                    break;
                }
                case "exit": {
                    System.exit(1);

                }
            }

        }

    }
}

