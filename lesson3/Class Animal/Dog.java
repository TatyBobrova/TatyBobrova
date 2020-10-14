public class Dog extends Animal{

        int weight;
        int height;

        public Dog(){}

        public Dog(String food, String location, int weight, int height)
        {
            super(food, location);
            this.weight=weight;
            this.height=height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public void eat() {
            System.out.println("Собака ест мясо!");
        }

        @Override
        public String makeNoise() {
            return "Гав-гав, Ррррр!!!!";
        }

    }


