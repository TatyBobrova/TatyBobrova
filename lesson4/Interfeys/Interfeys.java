package Interfeys;

public class Interfeys {

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(5,4);
        shape[1] = new Circle(6);
        shape[2] = new Rectangle(7,5);
        for (Shape sh: shape){
            System.out.println("Площадь фигуры: "+sh.square());
        }
    }



}
