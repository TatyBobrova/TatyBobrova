package Logging;

public class Calculator {

    private Logger logger;
    public Calculator(TypeLoggers typeLoggers) {
        this.logger = LoggerFactory.getLog(typeLoggers);
    }

    public double addition(double i, double y) {
        double result = i + y;
        logger.log("addition result is " + result);
        return result;
    }

    public double subtraction(double i, double y) {
        double result = i - y;
        logger.log("subtraction result is " + result);
        return result;
    }

    public double multiplication(double i, double y) {
        double result = i * y;
        logger.log("multiplication result is " + result);
        return result;
    }

    public double division(double i, double y) {
        double result = i / y;
        logger.log("division result is " + result);
        return result;
    }
}
