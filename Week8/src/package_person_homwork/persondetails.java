package package_person_homwork;

public class persondetails {

    public static void main(String []args) {

        person firstperson;
        person secondperson;
        firstperson = new person();
        secondperson = new person();

        firstperson.name = "Cathy Jones";
        firstperson.age = 33;
        firstperson.carYear = 2010;
        firstperson.violations = false;
        firstperson.creditScore = 690.0;

        secondperson.name = "Kendall Black";
        secondperson.age = 22;
        secondperson.carYear = 2019;
        secondperson.violations = true;
        secondperson.creditScore = 570.0;

        double monthlyRate = 0;
        double adjustedRate = 0;

        firstperson.display();
        System.out.println(firstperson.carAge(adjustedRate) + firstperson.getRate(monthlyRate) + " dollars");
        System.out.println();

        secondperson.display();
        System.out.println(secondperson.carAge(adjustedRate) + secondperson.getRate(monthlyRate) + " dollars");






    }
}
