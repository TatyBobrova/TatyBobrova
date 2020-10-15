public class University {
    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student("Рыжов", "Николай", "1145", 4.3);
        students[1] = new Student("Соколов", "Дмитрий", "1146", 5);
        students[2] = new Aspirant("Мурашов", "Иван", "6102", 3, "Автоматизированная система контроля посещений здания офисного центра");
        students[3] = new Aspirant("Козина", "Анна", "6102", 5, "Криптографические методы защиты информации");

        for (int i = 0; i < 4; i++) {
            System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + ": " + students[i].getScholarship());
        }
    }
}
