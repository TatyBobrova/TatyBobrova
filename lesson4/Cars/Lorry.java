package Cars;

public class Lorry extends Car{
    int carrying;

    public Lorry(String modelCar, String ClassCar, int weigth, int power,  String manufacturer, int carrying) {
        super(modelCar, ClassCar, weigth, power, manufacturer);
        this.carrying=carrying;
    }

    public int getCarrying(){
        return carrying;
    }

    public void setCarrying(int carrying){
        this.carrying=carrying;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(new Lorry(getModelCar(),getClassCar(),getWeigth(), getEngine().getPower(), getEngine().getManufacturer(), getCarrying()));
    }
}
