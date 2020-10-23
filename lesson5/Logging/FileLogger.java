package Logging;

public class FileLogger
    extends Logger {

        @Override
        public void log(String message) {
            System.out.println("Выводим на консоль: "+ message);
        }
    }

