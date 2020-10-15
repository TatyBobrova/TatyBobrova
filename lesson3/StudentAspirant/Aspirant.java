public class Aspirant extends Student {
 String  scientificWorkName;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWorkName) {
        super(firstName, lastName, group, averageMark);
        this.scientificWorkName = scientificWorkName;
    }

    public double getScholarship() {
        double scholarship;
        if (averageMark == 5)
            return 200;
         else  return 180;
    }

    public String getScientificWorkName() {
        return scientificWorkName;
    }
    public void setScientificWorkName(String scientificWorkName) {
        this.scientificWorkName = scientificWorkName;
    }

}
