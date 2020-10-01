public class Main {
    public static void main(String [ ] args)
    {
        Phone phone= new Phone();
        phone.number="8-495-777-77-7";
        phone.model="Samsung";
        phone.weight=100;

        for (int i = 0; i < 3; i++)
        {
               System.out.println("Номер телефона "+phone.number+i+" "+phone.model+i+" "+phone.weight+i);
            System.out.println("Номер телефона "+phone.getNumber());

            }
Phone ph1=new Phone();
        String name = "Vikki";

        ph1.receiveCall(name);
        ph1.sendMessage("8-888-111-44-44");

        ph1.receiveCall(name, ph1.number ="888");

}
}