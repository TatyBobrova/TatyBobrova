public class Cat extends Animal
{
  String color;

  public Cat(){}

  public Cat(String food, String location, String color)
  {
      super(food, location);
     this.color=color;
  }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу!");
    }

    @Override
    public String makeNoise() {
        return "Мяяу, Мяяу!!!!";
    }

}
