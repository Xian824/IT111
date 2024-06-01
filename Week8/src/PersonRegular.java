public class PersonRegular {

    public static void main(String[] args) {

        String firstPersonName = "Cathy Jones";
        String secondPersonName = "Kendall Black";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        String firstPersonCar = "Volkswagon Bug";
        String secondPersonCar = "Mustang";
        int firstPersonCarAge = 2010;
        int secondPersonCarAge = 2019;
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        int firstPersonCreditScore = 690;
        int secondPersonCreditScore = 570;
        double monthlyRate1;
        double monthlyRate2;
        double adjustedRate1;
        double adjustedRate2;




        if(firstPersonViolations == true && firstPersonCreditScore <= 700) {
            monthlyRate1 = 500;
        } else {
            monthlyRate1 = 100;
        }

        if(secondPersonViolations == true && secondPersonCreditScore <= 700) {
            monthlyRate2 = 500;
        } else {
            monthlyRate2 = 100;
        }


        if (firstPersonAge <= 25 && firstPersonGender == 'F'){
            adjustedRate1 = 100;
        } else {
            adjustedRate1 = 0;
        }

        if (secondPersonAge <= 25 && secondPersonGender == 'M'){
            adjustedRate2 = 100;
        } else {
            adjustedRate2 = 0;
        }

        double total1 = monthlyRate1 + adjustedRate1;
        double total2 = monthlyRate2 + adjustedRate2;


        System.out.println("First Person Name: " +firstPersonName);
        System.out.println("First Person Name: " +firstPersonGender);
        System.out.println("First Person Name: " +firstPersonAge);
        System.out.println("First Person Name: " +firstPersonCar);
        System.out.println("First Person Name: " +firstPersonCarAge);
        System.out.println("First Person Name: " +firstPersonViolations);
        System.out.println("First Person Name: " +firstPersonCreditScore);
        System.out.println("First Person Preliminary Rate: " +monthlyRate1);
        System.out.println("First Person Final Monthly Rate(including gender and age): " +total1);
        System.out.println();


        System.out.println("Second Person Name: " +secondPersonName);
        System.out.println("Second Person Name: " +secondPersonGender);
        System.out.println("Second Person Name: " +secondPersonAge);
        System.out.println("Second Person Name: " +secondPersonCar);
        System.out.println("Second Person Name: " +secondPersonCarAge);
        System.out.println("Second Person Name: " +secondPersonViolations);
        System.out.println("Second Person Name: " +secondPersonCreditScore);
        System.out.println("Second Person Preliminary Rate: " +monthlyRate2);
        System.out.println("Second Person Final Monthly Rate(including gender and age): " +total2);



    }
}
