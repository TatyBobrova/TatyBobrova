//создать класс
public class Phone {
  private   String  number;
   private String model;
   private int weight;

   //добавлены методы
//имя звонящего
public void receiveCall(String name)
{
    System.out.println("Вам звонит"+name);
}

//вернуть номер телефона
public String getNumber()
{
    return number;
}

//добавить конструктор в класс Phone
public Phone (String number, String model, int weight)
{
    this.number=number;
    this.model=model;
    this.weight=weight;
}

//добавить конструктор с двумя параметрами
public Phone(String number, String model)
{    this.number=number;
    this.model=model;
}

//добавить конструктор без параметров
 public    Phone()
    {}

//вызвать из конструктра с тремя параметрами конструктор с двумя
public Phone (String number, String model, int weight)
{
    this(number,model);
    this.weight=weight;
}






}
