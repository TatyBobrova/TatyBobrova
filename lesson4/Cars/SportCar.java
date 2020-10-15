package Cars;

public class SportCar extends Car{

    int maxSpeed;

    public SportCar(String modelCar, String ClassCar, int weigth, int power,  String manufacturer, int maxSpeed) {
        super(modelCar, ClassCar, weigth, power, manufacturer);
        this.maxSpeed=maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(new Lorry(getModelCar(),getClassCar(),getWeigth(), getEngine().getPower(), getEngine().getManufacturer(), getMaxSpeed()));
    }
}
