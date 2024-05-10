import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");

        specials = input.next();



        String coffee;
        double price;
        int amount;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }


        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");
                amount = input.nextInt();

                if (amount == 0){
                    System.out.println("Looks like you don't like " + coffee + "s So sad!!!");
                } else if (amount == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else {
                    System.out.printf(amount + " " + coffee + "s have been ordered  totalling $");
                    System.out.printf("%.2f", amount * price);
                    System.out.println(" dollars.");
                }

            }
            case "Tuesday" -> {
                coffee = "Frapp";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");
                amount = input.nextInt();

                if (amount == 0){
                    System.out.println("Looks like you don't like " + coffee + "s So sad!!!");
                } else if (amount == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else {
                    System.out.printf(amount + " " + coffee + "s have been ordered  totalling $");
                    System.out.printf("%.2f", amount * price);
                    System.out.println(" dollars.");
                }
            }

            case "Wednesday" -> {
                coffee = "Cappucino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");
                amount = input.nextInt();

                if (amount == 0){
                    System.out.println("Looks like you don't like " + coffee + "s So sad!!!");
                } else if (amount == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else {
                    System.out.printf(amount + " " + coffee + "s have been ordered  totalling $");
                    System.out.printf("%.2f", amount * price);
                    System.out.println(" dollars.");
                }
            }

            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");
                amount = input.nextInt();

                if (amount == 0){
                    System.out.println("Looks like you don't like " + coffee + "s So sad!!!");
                } else if (amount == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else {
                    System.out.printf(amount + " " + coffee + "s have been ordered  totalling $");
                    System.out.printf("%.2f", amount * price);
                    System.out.println(" dollars.");
                }
            }

            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");
                amount = input.nextInt();

                if (amount == 0){
                    System.out.println("Looks like you don't like " + coffee + "s So sad!!!");
                } else if (amount == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else {
                    System.out.printf(amount + " " + coffee + "s have been ordered  totalling $");
                    System.out.printf("%.2f", amount * price);
                    System.out.println(" dollars.");
                }
            }
            default -> System.out.println("Problem!!!");
        }
    }
}

