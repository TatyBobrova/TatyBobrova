package Cars;

public abstract class Car {
    private String modelCar;
    private String classCar;
    private int weight;
    private Engine engine;

    public Car(String modelCar, String classCar, int weigth, int power, String manufacturer) {
        this.modelCar = modelCar;
        this.classCar = classCar;
        this.weight = weigth;
        this.engine = new Engine(power, manufacturer);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setclassCar(String classCar) {
        this.classCar = classCar;
    }

    public int getWeigth() {
        return weight;
    }

    public void setWeigth(int weigth) {
        this.weight = weigth;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
