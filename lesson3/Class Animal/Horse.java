public class Horse extends Animal{

    String name;

    public Horse(){}

    public Horse(String food, String location, String name)
    {
        super(food, location);
        this.name=name;
                    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест мясо!");
    }

    @Override
    public String makeNoise() {
        return "Игогооо!!!!";
    }
}
