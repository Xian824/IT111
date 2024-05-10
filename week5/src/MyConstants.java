import java.util.Scanner;

public class MyConstants {

    public static void main(String []args) {

        final int touchdown = 6;
        final int conversion = 1;
        final int fieldgoal = 3;

        int td , con , fg;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of touchdown! ");
        td = input.nextInt() * touchdown;
        System.out.println("Please enter the number of conversion! ");
        con = input.nextInt() * conversion;
        System.out.println("Please enter the number of fieldgoal! ");
        fg = input.nextInt() * fieldgoal;

        System.out.println(td);
        System.out.println(con);
        System.out.println(fg);

        System.out.print("Our total score is ");
        System.out.println(td + con + fg);

    }
}
