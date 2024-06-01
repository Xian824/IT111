package package_person_homwork;

public class person {

    String name;
    int age;
    int carYear;
    boolean violations;
    double creditScore;

    public void display() {
        System.out.println("Customer name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CarAge: " + carYear);
        System.out.println("Violations: " + violations);
        System.out.println("Credit Score " + creditScore);

    }

    public double getRate(double monthlyRate) {
        if (violations == true && creditScore <= 700) {
            monthlyRate = 600.0;
        } else {
            monthlyRate = 200.0;
        }
        return monthlyRate;
    }

    public double carAge(double adjustedRate) {
        if (carYear >= 2019 && age <= 25) {
            adjustedRate = 200;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;


    }
}
