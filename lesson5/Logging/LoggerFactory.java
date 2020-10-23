package Logging;

public class LoggerFactory {
    public static Logger getLog(TypeLoggers typeLoggers) {
        switch (typeLoggers) {
            case Consolelogger: return new ConsoleLogger();
            case DBlogger:      return new DBLogger();
            case Filelogger:    return new FileLogger();
            default: return null;
        }
    }
}
