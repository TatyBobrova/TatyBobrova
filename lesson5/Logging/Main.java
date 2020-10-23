package Logging;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Calculator cl = new Calculator(TypeLoggers.Consolelogger);

        cl.addition(5,3);
        cl.subtraction(5,3);
        cl.multiplication(5,3);
        cl.division(5,3);
    }
}
