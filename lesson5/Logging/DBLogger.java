package Logging;

public class DBLogger extends Logger {

    @Override
    public void log(String message) {
        System.out.println("Выводим в базу данных: "+ message);
    }
}
