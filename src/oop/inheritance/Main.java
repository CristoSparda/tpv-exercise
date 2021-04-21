package oop.inheritance;

import oop.inheritance.data.SupportedTerminal;

public class Main {

    public static void main(String[] args) {
        Application application;
        application = new Application(SupportedTerminal.INGENICO);
        int counter = 0;
        while ( counter < 6) {
            application.clearScreen();
            application.showMenu();

            String key = application.readKey();

            switch (key) {
                case "1" -> application.doSale();
                case "2" -> application.doRefund();
                case "3" -> application.printReport();
                case "4" -> application.showConfiguration();
            }
            counter++;
        }
    }

}
