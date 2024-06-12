import java.util.Scanner;

public class dailySpecialsOriginal {


    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        String coffee ;
        double price ;
        int amount;

        boolean weekend = true;

        while (weekend) {
            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");
            specials = input.next();

            switch (specials) {
                case "Monday" -> {
                    coffee = "Latte";
                    price = 5.95;
                    weekend = false;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    amount = input.nextInt();


                    if (amount == 0) {
                        System.out.println("Looks like you don't like " + coffee + "s So sad!!!");
                    } else if (amount < 5) {
                        System.out.printf(amount + " " + coffee + "s have been ordered  totalling $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                    } else if (amount < 10) {
                        System.out.print("Looks like your qualify for a group discount! Your regular price is $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                        System.out.printf("You hava ordered " + amount + " " + coffee + "s but still be only charged  $");
                        System.out.printf("%.2f", amount * price * 0.9);
                        System.out.println(" dollars!");
                    } else {
                        System.out.print("A bigger group discount! Your Regular price is $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                        System.out.printf("You hava ordered " + amount + " " + coffee + "s but still be only charged  $");
                        System.out.printf("%.2f", amount * price * 0.8);
                        System.out.println(" dollars!");

                    }

                }
                case "Tuesday" -> {
                    coffee = "Frapp";
                    price = 4.95;
                    weekend = false;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    amount = input.nextInt();

                    if (amount == 0) {
                        System.out.println("Looks like you don't like " + coffee + "s So sad!!!");
                    } else if (amount < 5) {
                        System.out.printf(amount + " " + coffee + "s have been ordered  totalling $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                    } else if (amount < 10) {
                        System.out.print("Looks like your qualify for a group discount! Your regular price is $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                        System.out.printf("You hava ordered " + amount + " " + coffee + "s but still be only charged  $");
                        System.out.printf("%.2f", amount * price * 0.9);
                        System.out.println(" dollars!");
                    } else {
                        System.out.print("A bigger group discount! Your Regular price is $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                        System.out.printf("You hava ordered " + amount + " " + coffee + "s but still be only charged  $");
                        System.out.printf("%.2f", amount * price * 0.8);
                        System.out.println(" dollars!");
                    }
                }

                case "Wednesday" -> {
                    coffee = "Cappucino";
                    price = 4.35;
                    weekend = false;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    amount = input.nextInt();

                    if (amount == 0) {
                        System.out.println("Looks like you don't like " + coffee + "s So sad!!!");
                    } else if (amount < 5) {
                        System.out.printf(amount + " " + coffee + "s have been ordered  totalling $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                    } else if (amount < 10) {
                        System.out.print("Looks like your qualify for a group discount! Your regular price is $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                        System.out.printf("You hava ordered " + amount + " " + coffee + "s but still be only charged  $");
                        System.out.printf("%.2f", amount * price * 0.9);
                        System.out.println(" dollars!");
                    } else {
                        System.out.print("A bigger group discount! Your Regular price is $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                        System.out.printf("You hava ordered " + amount + " " + coffee + "s but still be only charged  $");
                        System.out.printf("%.2f", amount * price * 0.8);
                        System.out.println(" dollars!");
                    }
                }

                case "Thursday" -> {
                    coffee = "Regular Joe";
                    price = 2.95;
                    weekend = false;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    amount = input.nextInt();

                    if (amount == 0) {
                        System.out.println("Looks like you don't like " + coffee + "s So sad!!!");
                    } else if (amount < 5) {
                        System.out.printf(amount + " " + coffee + "s have been ordered  totalling $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                    } else if (amount < 10) {
                        System.out.print("Looks like your qualify for a group discount! Your regular price is $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                        System.out.printf("You hava ordered " + amount + " " + coffee + "s but still be only charged  $");
                        System.out.printf("%.2f", amount * price * 0.9);
                        System.out.println(" dollars!");
                    } else {
                        System.out.print("A bigger group discount! Your Regular price is $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                        System.out.printf("You hava ordered " + amount + " " + coffee + "s but still be only charged  $");
                        System.out.printf("%.2f", amount * price * 0.8);
                        System.out.println(" dollars!");
                    }
                }

                case "Friday" -> {
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    weekend = false;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    amount = input.nextInt();

                    if (amount == 0) {
                        System.out.println("Looks like you don't like " + coffee + "s So sad!!!");
                    } else if (amount < 5) {
                        System.out.printf(amount + " " + coffee + "s have been ordered  totalling $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                    } else if (amount < 10) {
                        System.out.print("Looks like your qualify for a group discount! Your regular price is $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                        System.out.printf("You hava ordered " + amount + " " + coffee + "s but still be only charged  $");
                        System.out.printf("%.2f", amount * price * 0.9);
                        System.out.println(" dollars!");
                    } else {
                        System.out.print("A bigger group discount! Your Regular price is $");
                        System.out.printf("%.2f", amount * price);
                        System.out.println(" dollars.");
                        System.out.printf("You hava ordered " + amount + " " + coffee + "s but still be only charged  $");
                        System.out.printf("%.2f", amount * price * 0.8);
                        System.out.println(" dollars!");
                    }
                }
            }
        }
    }
}
