public class VetClinic {

    public static void main(String[] args) {
Veterinar veterinar = new Veterinar();

        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Мясо", "Во дворе", 15,30);
        animals[1] = new Cat("Рыба", "В доме", "рыжий");
        animals[2] = new Horse("Сено", "В конюшне", "Орлик");

        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
        }
    }
}
